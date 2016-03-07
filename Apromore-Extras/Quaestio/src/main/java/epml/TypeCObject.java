/*
 * Copyright © 2009-2016 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.15 at 11:16:00 AM EST 
//

package epml;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for typeCObject complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="typeCObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="configuration">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="optionality">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="mnd"/>
 *                       &lt;enumeration value="off"/>
 *                       &lt;enumeration value="opt"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="specialization" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="usage">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="use"/>
 *                       &lt;enumeration value="cns"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCObject", propOrder = { "configuration" })
public class TypeCObject {

	protected TypeCObject.Configuration configuration;

	/**
	 * Gets the value of the configuration property.
	 * 
	 * @return possible object is {@link TypeCObject.Configuration }
	 * 
	 */
	public TypeCObject.Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * Sets the value of the configuration property.
	 * 
	 * @param value
	 *            allowed object is {@link TypeCObject.Configuration }
	 * 
	 */
	public void setConfiguration(TypeCObject.Configuration value) {
		this.configuration = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="optionality">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;enumeration value="mnd"/>
	 *             &lt;enumeration value="off"/>
	 *             &lt;enumeration value="opt"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *       &lt;attribute name="specialization" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
	 *       &lt;attribute name="usage">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;enumeration value="use"/>
	 *             &lt;enumeration value="cns"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class Configuration {

		@XmlAttribute
		protected String optionality;
		@XmlAttribute
		@XmlSchemaType(name = "positiveInteger")
		protected BigInteger specialization;
		@XmlAttribute
		protected String usage;

		/**
		 * Gets the value of the optionality property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getOptionality() {
			return optionality;
		}

		/**
		 * Sets the value of the optionality property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setOptionality(String value) {
			this.optionality = value;
		}

		/**
		 * Gets the value of the specialization property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getSpecialization() {
			return specialization;
		}

		/**
		 * Sets the value of the specialization property.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setSpecialization(BigInteger value) {
			this.specialization = value;
		}

		/**
		 * Gets the value of the usage property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getUsage() {
			return usage;
		}

		/**
		 * Sets the value of the usage property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setUsage(String value) {
			this.usage = value;
		}

	}

}
