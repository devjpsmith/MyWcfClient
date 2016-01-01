/**
 * OpResultSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Core_BL;

public class OpResultSummary  extends org.datacontract.schemas._2004._07.Core_BL_Contracts.BusinessEntityBase  implements java.io.Serializable {
    private java.lang.String alert;

    private java.lang.String chip;

    private java.lang.String date;

    private java.lang.String description;

    private java.lang.Integer itemUID;

    private java.lang.Integer operationID;

    private java.lang.String performedBy;

    private java.lang.String result;

    public OpResultSummary() {
    }

    public OpResultSummary(
           java.lang.Integer ID,
           java.lang.String alert,
           java.lang.String chip,
           java.lang.String date,
           java.lang.String description,
           java.lang.Integer itemUID,
           java.lang.Integer operationID,
           java.lang.String performedBy,
           java.lang.String result) {
        super(
            ID);
        this.alert = alert;
        this.chip = chip;
        this.date = date;
        this.description = description;
        this.itemUID = itemUID;
        this.operationID = operationID;
        this.performedBy = performedBy;
        this.result = result;
    }


    /**
     * Gets the alert value for this OpResultSummary.
     * 
     * @return alert
     */
    public java.lang.String getAlert() {
        return alert;
    }


    /**
     * Sets the alert value for this OpResultSummary.
     * 
     * @param alert
     */
    public void setAlert(java.lang.String alert) {
        this.alert = alert;
    }


    /**
     * Gets the chip value for this OpResultSummary.
     * 
     * @return chip
     */
    public java.lang.String getChip() {
        return chip;
    }


    /**
     * Sets the chip value for this OpResultSummary.
     * 
     * @param chip
     */
    public void setChip(java.lang.String chip) {
        this.chip = chip;
    }


    /**
     * Gets the date value for this OpResultSummary.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OpResultSummary.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the description value for this OpResultSummary.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OpResultSummary.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the itemUID value for this OpResultSummary.
     * 
     * @return itemUID
     */
    public java.lang.Integer getItemUID() {
        return itemUID;
    }


    /**
     * Sets the itemUID value for this OpResultSummary.
     * 
     * @param itemUID
     */
    public void setItemUID(java.lang.Integer itemUID) {
        this.itemUID = itemUID;
    }


    /**
     * Gets the operationID value for this OpResultSummary.
     * 
     * @return operationID
     */
    public java.lang.Integer getOperationID() {
        return operationID;
    }


    /**
     * Sets the operationID value for this OpResultSummary.
     * 
     * @param operationID
     */
    public void setOperationID(java.lang.Integer operationID) {
        this.operationID = operationID;
    }


    /**
     * Gets the performedBy value for this OpResultSummary.
     * 
     * @return performedBy
     */
    public java.lang.String getPerformedBy() {
        return performedBy;
    }


    /**
     * Sets the performedBy value for this OpResultSummary.
     * 
     * @param performedBy
     */
    public void setPerformedBy(java.lang.String performedBy) {
        this.performedBy = performedBy;
    }


    /**
     * Gets the result value for this OpResultSummary.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this OpResultSummary.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpResultSummary)) return false;
        OpResultSummary other = (OpResultSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alert==null && other.getAlert()==null) || 
             (this.alert!=null &&
              this.alert.equals(other.getAlert()))) &&
            ((this.chip==null && other.getChip()==null) || 
             (this.chip!=null &&
              this.chip.equals(other.getChip()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.itemUID==null && other.getItemUID()==null) || 
             (this.itemUID!=null &&
              this.itemUID.equals(other.getItemUID()))) &&
            ((this.operationID==null && other.getOperationID()==null) || 
             (this.operationID!=null &&
              this.operationID.equals(other.getOperationID()))) &&
            ((this.performedBy==null && other.getPerformedBy()==null) || 
             (this.performedBy!=null &&
              this.performedBy.equals(other.getPerformedBy()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getAlert() != null) {
            _hashCode += getAlert().hashCode();
        }
        if (getChip() != null) {
            _hashCode += getChip().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getItemUID() != null) {
            _hashCode += getItemUID().hashCode();
        }
        if (getOperationID() != null) {
            _hashCode += getOperationID().hashCode();
        }
        if (getPerformedBy() != null) {
            _hashCode += getPerformedBy().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpResultSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "OpResultSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Alert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Chip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Description"));
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
        elemField.setFieldName("operationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "OperationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "PerformedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Result"));
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
