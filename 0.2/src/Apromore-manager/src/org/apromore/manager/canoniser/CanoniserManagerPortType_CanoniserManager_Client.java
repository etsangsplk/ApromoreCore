
package org.apromore.manager.canoniser;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Tue May 24 18:38:44 CEST 2011
 * Generated source version: 2.2.9
 * 
 */

public final class CanoniserManagerPortType_CanoniserManager_Client {

    private static final QName SERVICE_NAME = new QName("http://www.apromore.org/canoniser/service_manager", "CanoniserManagerService");

    private CanoniserManagerPortType_CanoniserManager_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CanoniserManagerService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CanoniserManagerService ss = new CanoniserManagerService(wsdlURL, SERVICE_NAME);
        CanoniserManagerPortType port = ss.getCanoniserManager();  
        
        {
        System.out.println("Invoking generateAnnotation...");
        org.apromore.manager.model_canoniser.GenerateAnnotationInputMsgType _generateAnnotation_payload = new org.apromore.manager.model_canoniser.GenerateAnnotationInputMsgType();
        javax.activation.DataHandler _generateAnnotation_payloadNative = null;
        _generateAnnotation_payload.setNative(_generateAnnotation_payloadNative);
        _generateAnnotation_payload.setEditSessionCode(Integer.valueOf(-448499265));
        _generateAnnotation_payload.setAnnotationName("AnnotationName-2012156854");
        _generateAnnotation_payload.setIsNew(Boolean.valueOf(false));
        _generateAnnotation_payload.setProcessId(Integer.valueOf(1656800209));
        _generateAnnotation_payload.setVersion("Version-970674315");
        _generateAnnotation_payload.setNativeType("NativeType-1043096134");
        org.apromore.manager.model_canoniser.GenerateAnnotationOutputMsgType _generateAnnotation__return = port.generateAnnotation(_generateAnnotation_payload);
        System.out.println("generateAnnotation.result=" + _generateAnnotation__return);


        }
        {
        System.out.println("Invoking canoniseProcess...");
        org.apromore.manager.model_canoniser.CanoniseProcessInputMsgType _canoniseProcess_payload = new org.apromore.manager.model_canoniser.CanoniseProcessInputMsgType();
        javax.activation.DataHandler _canoniseProcess_payloadProcessDescription = null;
        _canoniseProcess_payload.setProcessDescription(_canoniseProcess_payloadProcessDescription);
        org.apromore.manager.model_canoniser.CanoniseProcessOutputMsgType _canoniseProcess__return = port.canoniseProcess(_canoniseProcess_payload);
        System.out.println("canoniseProcess.result=" + _canoniseProcess__return);


        }
        {
        System.out.println("Invoking deCanoniseProcess...");
        org.apromore.manager.model_canoniser.DeCanoniseProcessInputMsgType _deCanoniseProcess_payload = new org.apromore.manager.model_canoniser.DeCanoniseProcessInputMsgType();
        _deCanoniseProcess_payload.setProcessId(-576954901);
        _deCanoniseProcess_payload.setVersion("Version1265356624");
        _deCanoniseProcess_payload.setNativeType("NativeType757992501");
        javax.activation.DataHandler _deCanoniseProcess_payloadCpf = null;
        _deCanoniseProcess_payload.setCpf(_deCanoniseProcess_payloadCpf);
        javax.activation.DataHandler _deCanoniseProcess_payloadAnf = null;
        _deCanoniseProcess_payload.setAnf(_deCanoniseProcess_payloadAnf);
        org.apromore.manager.model_canoniser.DeCanoniseProcessOutputMsgType _deCanoniseProcess__return = port.deCanoniseProcess(_deCanoniseProcess_payload);
        System.out.println("deCanoniseProcess.result=" + _deCanoniseProcess__return);


        }
        {
        System.out.println("Invoking canoniseVersion...");
        org.apromore.manager.model_canoniser.CanoniseVersionInputMsgType _canoniseVersion_payload = new org.apromore.manager.model_canoniser.CanoniseVersionInputMsgType();
        javax.activation.DataHandler _canoniseVersion_payloadNative = null;
        _canoniseVersion_payload.setNative(_canoniseVersion_payloadNative);
        _canoniseVersion_payload.setEditSessionCode(Integer.valueOf(-1442109017));
        org.apromore.manager.model_canoniser.CanoniseVersionOutputMsgType _canoniseVersion__return = port.canoniseVersion(_canoniseVersion_payload);
        System.out.println("canoniseVersion.result=" + _canoniseVersion__return);


        }

        System.exit(0);
    }

}
