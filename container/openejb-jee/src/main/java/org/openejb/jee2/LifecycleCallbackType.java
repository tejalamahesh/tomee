//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.08 at 06:01:06 PM PDT 
//


package org.openejb.jee2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The lifecycle-callback type specifies a method on a
 * 	class to be called when a lifecycle event occurs.
 * 	Note that each class may have only one lifecycle callback
 *         method for any given event and that the method may not
 * 	be overloaded.
 * 
 *         If the lifefycle-callback-class element is missing then
 *         the class defining the callback is assumed to be the
 *         component class in scope at the place in the descriptor
 *         in which the callback definition appears.
 * 
 *       
 * 
 * <p>Java class for lifecycle-callbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lifecycle-callbackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lifecycle-callback-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *         &lt;element name="lifecycle-callback-method" type="{http://java.sun.com/xml/ns/javaee}java-identifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lifecycle-callbackType", propOrder = {
    "lifecycleCallbackClass",
    "lifecycleCallbackMethod"
})
public class LifecycleCallbackType {

    @XmlElement(name = "lifecycle-callback-class")
    protected String lifecycleCallbackClass;
    @XmlElement(name = "lifecycle-callback-method", required = true)
    protected String lifecycleCallbackMethod;

    public String getLifecycleCallbackClass() {
        return lifecycleCallbackClass;
    }

    public void setLifecycleCallbackClass(String value) {
        this.lifecycleCallbackClass = value;
    }

    public String getLifecycleCallbackMethod() {
        return lifecycleCallbackMethod;
    }

    public void setLifecycleCallbackMethod(String value) {
        this.lifecycleCallbackMethod = value;
    }

}
