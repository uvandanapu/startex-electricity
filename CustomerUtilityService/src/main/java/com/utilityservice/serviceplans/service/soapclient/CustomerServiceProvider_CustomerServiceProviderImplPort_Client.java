
package com.utilityservice.serviceplans.service.soapclient;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-19T11:22:32.072-05:00
 * Generated source version: 3.1.7
 * 
 */
public final class CustomerServiceProvider_CustomerServiceProviderImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.serviceprovider.bootcamp.com/", "ServiceProvider");

    private CustomerServiceProvider_CustomerServiceProviderImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ServiceProvider.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
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
      
        ServiceProvider ss = new ServiceProvider(wsdlURL, SERVICE_NAME);
        CustomerServiceProvider port = ss.getCustomerServiceProviderImplPort();  
        
        {
        System.out.println("Invoking getServiceById...");
        java.util.List<com.utilityservice.serviceplans.service.soapclient.PlanInfo> _getServiceById__return = port.getServiceById();
        System.out.println("getServiceById.result=" + _getServiceById__return);


        }

        System.exit(0);
    }

}
