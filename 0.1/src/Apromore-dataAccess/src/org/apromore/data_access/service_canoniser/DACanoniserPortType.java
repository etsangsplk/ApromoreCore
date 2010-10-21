package org.apromore.data_access.service_canoniser;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Thu Oct 21 15:48:04 CEST 2010
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://www.apromore.org/data_access/service_canoniser", name = "DACanoniserPortType")
@XmlSeeAlso({org.apromore.anf.ObjectFactory.class, org.apromore.data_access.model_canoniser.ObjectFactory.class, org.apromore.cpf.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DACanoniserPortType {

    @WebResult(name = "StoreNativeCpfOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreNativeCpf")
    public org.apromore.data_access.model_canoniser.StoreNativeCpfOutputMsgType storeNativeCpf(
        @WebParam(partName = "payload", name = "StoreNativeCpfInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.data_access.model_canoniser.StoreNativeCpfInputMsgType payload
    );

    @WebResult(name = "StoreVersionOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreVersion")
    public org.apromore.data_access.model_canoniser.StoreVersionOutputMsgType storeVersion(
        @WebParam(partName = "payload", name = "StoreVersionInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.data_access.model_canoniser.StoreVersionInputMsgType payload
    );

    @WebResult(name = "StoreNativeOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreNative")
    public org.apromore.data_access.model_canoniser.StoreNativeOutputMsgType storeNative(
        @WebParam(partName = "payload", name = "StoreNativeInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.data_access.model_canoniser.StoreNativeInputMsgType payload
    );

	@WebResult(name = "WriteAnnotationOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "WriteAnnotation")
    public org.apromore.data_access.model_canoniser.WriteAnnotationOutputMsgType writeAnnotation(
        @WebParam(partName = "payload", name = "WriteAnnotationInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.data_access.model_canoniser.WriteAnnotationInputMsgType payload
    );
}
