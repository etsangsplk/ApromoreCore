
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.apromore.data_access.service_canoniser;

import java.io.InputStream;
import java.util.logging.Logger;

import javax.activation.DataHandler;

import org.apromore.anf.AnnotationsType;
import org.apromore.cpf.CanonicalProcessType;
import org.apromore.data_access.dao.ProcessDao;
import org.apromore.data_access.model_canoniser.ProcessSummaryType;
import org.apromore.data_access.model_canoniser.ResultType;
import org.apromore.data_access.model_canoniser.StoreNativeCpfInputMsgType;
import org.apromore.data_access.model_canoniser.StoreNativeCpfOutputMsgType;

/**
 * This class was generated by Apache CXF 2.2.7
 * Fri Apr 23 11:28:38 EST 2010
 * Generated source version: 2.2.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "DACanoniserService",
                      portName = "DACanoniser",
                      targetNamespace = "http://www.apromore.org/data_access/service_canoniser",
                      wsdlLocation = "http://localhost:8080/Apromore-dataAccess/services/DACanoniser?wsdl",
                      endpointInterface = "org.apromore.data_access.service_canoniser.DACanoniserPortType")
                      
public class DACanoniserPortTypeImpl implements DACanoniserPortType {

    private static final Logger LOG = Logger.getLogger(DACanoniserPortTypeImpl.class.getName());

 	/* (non-Javadoc)
     * @see org.apromore.data_access.service_canoniser.DACanoniserPortType#storeNativeCpf(org.apromore.data_access.model_canoniser.StoreNativeCpfInputMsgType  payload )*
     */
    public StoreNativeCpfOutputMsgType storeNativeCpf(StoreNativeCpfInputMsgType payload) { 
        LOG.info("Executing operation storeNativeCpf");
        System.out.println(payload);
        
        StoreNativeCpfOutputMsgType res = new StoreNativeCpfOutputMsgType();
        ResultType result = new ResultType();
        res.setResult(result);
        String username = payload.getUsername();
        String nativeType = payload.getNativeType();
        AnnotationsType anf = payload.getAnf();
        CanonicalProcessType cpf = payload.getCpf();
        String processName = payload.getProcessName();
        
        try {
            DataHandler handler = payload.getNative();
            InputStream process_xml = handler.getInputStream();
        	ProcessSummaryType processSum = 
        		ProcessDao.getInstance().storeNativeCpf(username, processName, nativeType, process_xml, cpf, anf);
        	res.setProcessSummary(processSum);
        	result.setCode(0);
        	result.setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
            result.setCode(-1);
            result.setMessage(ex.getMessage());
        }
        return res;
    }

}
