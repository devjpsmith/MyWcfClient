/**
 * AttributesByItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Core_BL;

public class AttributesByItem  extends org.datacontract.schemas._2004._07.Core_BL_Contracts.BusinessEntityBase  implements java.io.Serializable {
    private java.lang.String attributeData;

    private java.lang.String attributeDescription;

    private java.lang.Integer attributeID;

    private java.lang.String attributeUnit;

    private java.lang.String categoryDescription;

    private java.lang.Integer categoryID;

    private java.lang.Integer clientUID;

    private java.lang.String itemDescription;

    private java.lang.Integer itemUID;

    private java.lang.String validationType;

    public AttributesByItem() {
    }

    public AttributesByItem(
           java.lang.Integer ID,
           java.lang.String attributeData,
           java.lang.String attributeDescription,
           java.lang.Integer attributeID,
           java.lang.String attributeUnit,
           java.lang.String categoryDescription,
           java.lang.Integer categoryID,
           java.lang.Integer clientUID,
           java.lang.String itemDescription,
           java.lang.Integer itemUID,
           java.lang.String validationType) {
        super(
            ID);
        this.attributeData = attributeData;
        this.attributeDescription = attributeDescription;
        this.attributeID = attributeID;
        this.attributeUnit = attributeUnit;
        this.categoryDescription = categoryDescription;
        this.categoryID = categoryID;
        this.clientUID = clientUID;
        this.itemDescription = itemDescription;
        this.itemUID = itemUID;
        this.validationType = validationType;
    }


    /**
     * Gets the attributeData value for this AttributesByItem.
     * 
     * @return attributeData
     */
    public java.lang.String getAttributeData() {
        return attributeData;
    }


    /**
     * Sets the attributeData value for this AttributesByItem.
     * 
     * @param attributeData
     */
    public void setAttributeData(java.lang.String attributeData) {
        this.attributeData = attributeData;
    }


    /**
     * Gets the attributeDescription value for this AttributesByItem.
     * 
     * @return attributeDescription
     */
    public java.lang.String getAttributeDescription() {
        return attributeDescription;
    }


    /**
     * Sets the attributeDescription value for this AttributesByItem.
     * 
     * @param attributeDescription
     */
    public void setAttributeDescription(java.lang.String attributeDescription) {
        this.attributeDescription = attributeDescription;
    }


    /**
     * Gets the attributeID value for this AttributesByItem.
     * 
     * @return attributeID
     */
    public java.lang.Integer getAttributeID() {
        return attributeID;
    }


    /**
     * Sets the attributeID value for this AttributesByItem.
     * 
     * @param attributeID
     */
    public void setAttributeID(java.lang.Integer attributeID) {
        this.attributeID = attributeID;
    }


    /**
     * Gets the attributeUnit value for this AttributesByItem.
     * 
     * @return attributeUnit
     */
    public java.lang.String getAttributeUnit() {
        return attributeUnit;
    }


    /**
     * Sets the attributeUnit value for this AttributesByItem.
     * 
     * @param attributeUnit
     */
    public void setAttributeUnit(java.lang.String attributeUnit) {
        this.attributeUnit = attributeUnit;
    }


    /**
     * Gets the categoryDescription value for this AttributesByItem.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this AttributesByItem.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the categoryID value for this AttributesByItem.
     * 
     * @return categoryID
     */
    public java.lang.Integer getCategoryID() {
        return categoryID;
    }


    /**
     * Sets the categoryID value for this AttributesByItem.
     * 
     * @param categoryID
     */
    public void setCategoryID(java.lang.Integer categoryID) {
        this.categoryID = categoryID;
    }


    /**
     * Gets the clientUID value for this AttributesByItem.
     * 
     * @return clientUID
     */
    public java.lang.Integer getClientUID() {
        return clientUID;
    }


    /**
     * Sets the clientUID value for this AttributesByItem.
     * 
     * @param clientUID
     */
    public void setClientUID(java.lang.Integer clientUID) {
        this.clientUID = clientUID;
    }


    /**
     * Gets the itemDescription value for this AttributesByItem.
     * 
     * @return itemDescription
     */
    public java.lang.String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this AttributesByItem.
     * 
     * @param itemDescription
     */
    public void setItemDescription(java.lang.String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemUID value for this AttributesByItem.
     * 
     * @return itemUID
     */
    public java.lang.Integer getItemUID() {
        return itemUID;
    }


    /**
     * Sets the itemUID value for this AttributesByItem.
     * 
     * @param itemUID
     */
    public void setItemUID(java.lang.Integer itemUID) {
        this.itemUID = itemUID;
    }


    /**
     * Gets the validationType value for this AttributesByItem.
     * 
     * @return validationType
     */
    public java.lang.String getValidationType() {
        return validationType;
    }


    /**
     * Sets the validationType value for this AttributesByItem.
     * 
     * @param validationType
     */
    public void setValidationType(java.lang.String validationType) {
        this.validationType = validationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributesByItem)) return false;
        AttributesByItem other = (AttributesByItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attributeData==null && other.getAttributeData()==null) || 
             (this.attributeData!=null &&
              this.attributeData.equals(other.getAttributeData()))) &&
            ((this.attributeDescription==null && other.getAttributeDescription()==null) || 
             (this.attributeDescription!=null &&
              this.attributeDescription.equals(other.getAttributeDescription()))) &&
            ((this.attributeID==null && other.getAttributeID()==null) || 
             (this.attributeID!=null &&
              this.attributeID.equals(other.getAttributeID()))) &&
            ((this.attributeUnit==null && other.getAttributeUnit()==null) || 
             (this.attributeUnit!=null &&
              this.attributeUnit.equals(other.getAttributeUnit()))) &&
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              this.categoryDescription.equals(other.getCategoryDescription()))) &&
            ((this.categoryID==null && other.getCategoryID()==null) || 
             (this.categoryID!=null &&
              this.categoryID.equals(other.getCategoryID()))) &&
            ((this.clientUID==null && other.getClientUID()==null) || 
             (this.clientUID!=null &&
              this.clientUID.equals(other.getClientUID()))) &&
            ((this.itemDescription==null && other.getItemDescription()==null) || 
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription()))) &&
            ((this.itemUID==null && other.getItemUID()==null) || 
             (this.itemUID!=null &&
              this.itemUID.equals(other.getItemUID()))) &&
            ((this.validationType==null && other.getValidationType()==null) || 
             (this.validationType!=null &&
              this.validationType.equals(other.getValidationType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttributeData() != null) {
            _hashCode += getAttributeData().hashCode();
        }
        if (getAttributeDescription() != null) {
            _hashCode += getAttributeDescription().hashCode();
        }
        if (getAttributeID() != null) {
            _hashCode += getAttributeID().hashCode();
        }
        if (getAttributeUnit() != null) {
            _hashCode += getAttributeUnit().hashCode();
        }
        if (getCategoryDescription() != null) {
            _hashCode += getCategoryDescription().hashCode();
        }
        if (getCategoryID() != null) {
            _hashCode += getCategoryID().hashCode();
        }
        if (getClientUID() != null) {
            _hashCode += getClientUID().hashCode();
        }
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        if (getItemUID() != null) {
            _hashCode += getItemUID().hashCode();
        }
        if (getValidationType() != null) {
            _hashCode += getValidationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributesByItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "AttributesByItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "AttributeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "AttributeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "AttributeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "AttributeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "CategoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "CategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ClientUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ItemUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ValidationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
