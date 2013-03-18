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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageEnum">
 *   &lt;restriction base="{http://s-ramp.org/xmlns/2010/s-ramp}derivedArtifactEnum">
 *     &lt;enumeration value="Message"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageEnum")
@XmlEnum(DerivedArtifactEnum.class)
public enum MessageEnum {

    @XmlEnumValue("Message")
    MESSAGE(DerivedArtifactEnum.MESSAGE);
    private final DerivedArtifactEnum value;

    MessageEnum(DerivedArtifactEnum v) {
        value = v;
    }

    public DerivedArtifactEnum value() {
        return value;
    }

    public static MessageEnum fromValue(DerivedArtifactEnum v) {
        for (MessageEnum c: MessageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}