package org.apromore.canoniser.da;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Sun Dec 05 10:42:29 CET 2010
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://www.apromore.org/data_access/service_canoniser", name = "DACanoniserPortType")
@XmlSeeAlso({org.apromore.anf.ObjectFactory.class, org.apromore.canoniser.model_da.ObjectFactory.class, org.apromore.cpf.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DACanoniserPortType {

    @WebResult(name = "GetCpfUriOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "GetCpfUri")
    public org.apromore.canoniser.model_da.GetCpfUriOutputMsgType getCpfUri(
        @WebParam(partName = "payload", name = "GetCpfUriInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.canoniser.model_da.GetCpfUriInputMsgType payload
    );

	@WebResult(name = "StoreNativeCpfOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreNativeCpf")
    public org.apromore.canoniser.model_da.StoreNativeCpfOutputMsgType storeNativeCpf(
        @WebParam(partName = "payload", name = "StoreNativeCpfInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.canoniser.model_da.StoreNativeCpfInputMsgType payload
    );

    @WebResult(name = "StoreVersionOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreVersion")
    public org.apromore.canoniser.model_da.StoreVersionOutputMsgType storeVersion(
        @WebParam(partName = "payload", name = "StoreVersionInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.canoniser.model_da.StoreVersionInputMsgType payload
    );

    @WebResult(name = "StoreNativeOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreNative")
    public org.apromore.canoniser.model_da.StoreNativeOutputMsgType storeNative(
        @WebParam(partName = "payload", name = "StoreNativeInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.canoniser.model_da.StoreNativeInputMsgType payload
    );

    @WebResult(name = "WriteAnnotationOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "WriteAnnotation")
    public org.apromore.canoniser.model_da.WriteAnnotationOutputMsgType writeAnnotation(
        @WebParam(partName = "payload", name = "WriteAnnotationInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.canoniser.model_da.WriteAnnotationInputMsgType payload
    );
}
