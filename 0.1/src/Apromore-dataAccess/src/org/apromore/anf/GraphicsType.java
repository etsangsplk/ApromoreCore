//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.22 at 05:45:57 PM CET 
//


package org.apromore.anf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraphicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraphicsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/ANF}AnnotationType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.apromore.org/ANF}positionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.apromore.org/ANF}sizeType" minOccurs="0"/>
 *         &lt;element name="fill" type="{http://www.apromore.org/ANF}fillType" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.apromore.org/ANF}lineType" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.apromore.org/ANF}fontType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphicsType", propOrder = {
    "position",
    "size",
    "fill",
    "line",
    "font"
})
public class GraphicsType
    extends AnnotationType
{

    protected List<PositionType> position;
    protected SizeType size;
    protected FillType fill;
    protected LineType line;
    protected FontType font;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionType }
     * 
     * 
     */
    public List<PositionType> getPosition() {
        if (position == null) {
            position = new ArrayList<PositionType>();
        }
        return this.position;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link FillType }
     *     
     */
    public FillType getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillType }
     *     
     */
    public void setFill(FillType value) {
        this.fill = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLine(LineType value) {
        this.line = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link FontType }
     *     
     */
    public FontType getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontType }
     *     
     */
    public void setFont(FontType value) {
        this.font = value;
    }

}
