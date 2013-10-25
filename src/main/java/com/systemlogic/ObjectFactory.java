
package com.systemlogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.systemlogic package. 
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

    private final static QName _Adding_QNAME = new QName("http://systemlogic.com/", "adding");
    private final static QName _ReturnAddResult_QNAME = new QName("http://systemlogic.com/", "returnAddResult");
    private final static QName _ReturnAddResultResponse_QNAME = new QName("http://systemlogic.com/", "returnAddResultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.systemlogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnAddResultResponse }
     * 
     */
    public ReturnAddResultResponse createReturnAddResultResponse() {
        return new ReturnAddResultResponse();
    }

    /**
     * Create an instance of {@link ReturnAddResult }
     * 
     */
    public ReturnAddResult createReturnAddResult() {
        return new ReturnAddResult();
    }

    /**
     * Create an instance of {@link Adding }
     * 
     */
    public Adding createAdding() {
        return new Adding();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://systemlogic.com/", name = "adding")
    public JAXBElement<Adding> createAdding(Adding value) {
        return new JAXBElement<Adding>(_Adding_QNAME, Adding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://systemlogic.com/", name = "returnAddResult")
    public JAXBElement<ReturnAddResult> createReturnAddResult(ReturnAddResult value) {
        return new JAXBElement<ReturnAddResult>(_ReturnAddResult_QNAME, ReturnAddResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://systemlogic.com/", name = "returnAddResultResponse")
    public JAXBElement<ReturnAddResultResponse> createReturnAddResultResponse(ReturnAddResultResponse value) {
        return new JAXBElement<ReturnAddResultResponse>(_ReturnAddResultResponse_QNAME, ReturnAddResultResponse.class, null, value);
    }

}
