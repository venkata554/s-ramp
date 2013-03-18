/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.17 at 01:09:37 PM EST 
//


package org.s_ramp.xmlns._2010.s_ramp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://s-ramp.org/xmlns/2010/s-ramp}WsdlExtension">
 *       &lt;attribute name="soapLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapAddress")
public class SoapAddress
    extends WsdlExtension
    implements Serializable
{

    private static final long serialVersionUID = 6573952580271015642L;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String soapLocation;

    /**
     * Gets the value of the soapLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapLocation() {
        return soapLocation;
    }

    /**
     * Sets the value of the soapLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapLocation(String value) {
        this.soapLocation = value;
    }

}