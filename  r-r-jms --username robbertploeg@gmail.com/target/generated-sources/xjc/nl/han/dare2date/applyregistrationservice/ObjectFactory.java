//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 09:25:03 AM CEST 
//


package nl.han.dare2date.applyregistrationservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.han.dare2date.applyregistrationservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.han.dare2date.applyregistrationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link ApplyRegistrationRequest }
     * 
     */
    public ApplyRegistrationRequest createApplyRegistrationRequest() {
        return new ApplyRegistrationRequest();
    }

    /**
     * Create an instance of {@link ApplyRegistrationResponse }
     * 
     */
    public ApplyRegistrationResponse createApplyRegistrationResponse() {
        return new ApplyRegistrationResponse();
    }

    /**
     * Create an instance of {@link Creditcard }
     * 
     */
    public Creditcard createCreditcard() {
        return new Creditcard();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

}