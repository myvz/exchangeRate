
package com.myavuz.projects.exchangerate;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CurrencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Isim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForexBuying" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForexSelling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BanknoteBuying" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BanknoteSelling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CrossRateUSD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CrossRateOther">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="1.1278"/>
 *               &lt;enumeration value="1.543"/>
 *               &lt;enumeration value="3.3106"/>
 *               &lt;enumeration value="1.40866"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CrossOrder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Kod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyType", propOrder = {
    "unit",
    "isim",
    "currencyName",
    "forexBuying",
    "forexSelling",
    "banknoteBuying",
    "banknoteSelling",
    "crossRateUSD",
    "crossRateOther"
})
@XmlRootElement
public class CurrencyType {

    @XmlElement(name = "Unit", required = true)
    protected String unit;
    @XmlElement(name = "Isim", required = true)
    protected String isim;
    @XmlElement(name = "CurrencyName", required = true)
    protected String currencyName;
    @XmlElement(name = "ForexBuying", required = true)
    protected String forexBuying;
    @XmlElement(name = "ForexSelling", required = true)
    protected String forexSelling;
    @XmlElement(name = "BanknoteBuying", required = true)
    protected String banknoteBuying;
    @XmlElement(name = "BanknoteSelling", required = true)
    protected String banknoteSelling;
    @XmlElement(name = "CrossRateUSD", required = true)
    protected String crossRateUSD;
    @XmlElement(name = "CrossRateOther", required = true)
    protected String crossRateOther;
    @XmlAttribute(name = "CrossOrder")
    protected String crossOrder;
    @XmlAttribute(name = "Kod")
    protected String kod;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the isim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsim() {
        return isim;
    }

    /**
     * Sets the value of the isim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsim(String value) {
        this.isim = value;
    }

    /**
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * Gets the value of the forexBuying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForexBuying() {
        return forexBuying;
    }

    /**
     * Sets the value of the forexBuying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForexBuying(String value) {
        this.forexBuying = value;
    }

    /**
     * Gets the value of the forexSelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForexSelling() {
        return forexSelling;
    }

    /**
     * Sets the value of the forexSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForexSelling(String value) {
        this.forexSelling = value;
    }

    /**
     * Gets the value of the banknoteBuying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknoteBuying() {
        return banknoteBuying;
    }

    /**
     * Sets the value of the banknoteBuying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknoteBuying(String value) {
        this.banknoteBuying = value;
    }

    /**
     * Gets the value of the banknoteSelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknoteSelling() {
        return banknoteSelling;
    }

    /**
     * Sets the value of the banknoteSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknoteSelling(String value) {
        this.banknoteSelling = value;
    }

    /**
     * Gets the value of the crossRateUSD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossRateUSD() {
        return crossRateUSD;
    }

    /**
     * Sets the value of the crossRateUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossRateUSD(String value) {
        this.crossRateUSD = value;
    }

    /**
     * Gets the value of the crossRateOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossRateOther() {
        return crossRateOther;
    }

    /**
     * Sets the value of the crossRateOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossRateOther(String value) {
        this.crossRateOther = value;
    }

    /**
     * Gets the value of the crossOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossOrder() {
        return crossOrder;
    }

    /**
     * Sets the value of the crossOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossOrder(String value) {
        this.crossOrder = value;
    }

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
