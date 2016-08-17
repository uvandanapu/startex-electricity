
package com.utilityservice.serviceplans.service.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.utilityservice.serviceplans.service.soapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetServiceById_QNAME = new QName("http://service.serviceprovider.bootcamp.com/", "getServiceById");
    private final static QName _GetServiceByIdResponse_QNAME = new QName("http://service.serviceprovider.bootcamp.com/", "getServiceByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.utilityservice.serviceplans.service.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceById }
     * 
     */
    public GetServiceById createGetServiceById() {
        return new GetServiceById();
    }

    /**
     * Create an instance of {@link GetServiceByIdResponse }
     * 
     */
    public GetServiceByIdResponse createGetServiceByIdResponse() {
        return new GetServiceByIdResponse();
    }

    /**
     * Create an instance of {@link PlanInfo }
     * 
     */
    public PlanInfo createPlanInfo() {
        return new PlanInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.serviceprovider.bootcamp.com/", name = "getServiceById")
    public JAXBElement<GetServiceById> createGetServiceById(GetServiceById value) {
        return new JAXBElement<GetServiceById>(_GetServiceById_QNAME, GetServiceById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.serviceprovider.bootcamp.com/", name = "getServiceByIdResponse")
    public JAXBElement<GetServiceByIdResponse> createGetServiceByIdResponse(GetServiceByIdResponse value) {
        return new JAXBElement<GetServiceByIdResponse>(_GetServiceByIdResponse_QNAME, GetServiceByIdResponse.class, null, value);
    }

}
