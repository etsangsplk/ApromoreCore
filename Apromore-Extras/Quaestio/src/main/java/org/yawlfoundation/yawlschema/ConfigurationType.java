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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.03 at 05:04:23 PM CET 
//

package org.yawlfoundation.yawlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ConfigurationType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="join" type="{http://www.yawlfoundation.org/yawlschema}joinConfigType" minOccurs="0"/>
 *         &lt;element name="nofi" type="{http://www.yawlfoundation.org/yawlschema}nofiConfigType" minOccurs="0"/>
 *         &lt;element name="rem" type="{http://www.yawlfoundation.org/yawlschema}remConfigType" minOccurs="0"/>
 *         &lt;element name="split" type="{http://www.yawlfoundation.org/yawlschema}splitConfigType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", propOrder = { "join", "nofi", "rem",
		"split" })
public class ConfigurationType {

	protected JoinConfigType join;
	protected NofiConfigType nofi;
	protected RemConfigType rem;
	protected SplitConfigType split;

	/**
	 * Gets the value of the join property.
	 * 
	 * @return possible object is {@link JoinConfigType }
	 * 
	 */
	public JoinConfigType getJoin() {
		return join;
	}

	/**
	 * Sets the value of the join property.
	 * 
	 * @param value
	 *            allowed object is {@link JoinConfigType }
	 * 
	 */
	public void setJoin(JoinConfigType value) {
		this.join = value;
	}

	/**
	 * Gets the value of the nofi property.
	 * 
	 * @return possible object is {@link NofiConfigType }
	 * 
	 */
	public NofiConfigType getNofi() {
		return nofi;
	}

	/**
	 * Sets the value of the nofi property.
	 * 
	 * @param value
	 *            allowed object is {@link NofiConfigType }
	 * 
	 */
	public void setNofi(NofiConfigType value) {
		this.nofi = value;
	}

	/**
	 * Gets the value of the rem property.
	 * 
	 * @return possible object is {@link RemConfigType }
	 * 
	 */
	public RemConfigType getRem() {
		return rem;
	}

	/**
	 * Sets the value of the rem property.
	 * 
	 * @param value
	 *            allowed object is {@link RemConfigType }
	 * 
	 */
	public void setRem(RemConfigType value) {
		this.rem = value;
	}

	/**
	 * Gets the value of the split property.
	 * 
	 * @return possible object is {@link SplitConfigType }
	 * 
	 */
	public SplitConfigType getSplit() {
		return split;
	}

	/**
	 * Sets the value of the split property.
	 * 
	 * @param value
	 *            allowed object is {@link SplitConfigType }
	 * 
	 */
	public void setSplit(SplitConfigType value) {
		this.split = value;
	}

}
