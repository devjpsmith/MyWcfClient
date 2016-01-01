/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Core_BL;

public class Location  implements java.io.Serializable {
    private java.lang.Integer clientUID;

    private java.lang.Integer level;

    private java.lang.Integer locationID;

    private java.lang.Integer locationTypeID;

    private java.lang.String longDescription;

    private java.util.Calendar modifiedDate;

    private java.lang.String notes;

    private java.lang.Integer parentID;

    private java.lang.Boolean requiresUpload;

    private java.lang.String shortDescription;

    private java.lang.String status;

    private java.lang.String valuePath;

    public Location() {
    }

    public Location(
           java.lang.Integer clientUID,
           java.lang.Integer level,
           java.lang.Integer locationID,
           java.lang.Integer locationTypeID,
           java.lang.String longDescription,
           java.util.Calendar modifiedDate,
           java.lang.String notes,
           java.lang.Integer parentID,
           java.lang.Boolean requiresUpload,
           java.lang.String shortDescription,
           java.lang.String status,
           java.lang.String valuePath) {
           this.clientUID = clientUID;
           this.level = level;
           this.locationID = locationID;
           this.locationTypeID = locationTypeID;
           this.longDescription = longDescription;
           this.modifiedDate = modifiedDate;
           this.notes = notes;
           this.parentID = parentID;
           this.requiresUpload = requiresUpload;
           this.shortDescription = shortDescription;
           this.status = status;
           this.valuePath = valuePath;
    }


    /**
     * Gets the clientUID value for this Location.
     * 
     * @return clientUID
     */
    public java.lang.Integer getClientUID() {
        return clientUID;
    }


    /**
     * Sets the clientUID value for this Location.
     * 
     * @param clientUID
     */
    public void setClientUID(java.lang.Integer clientUID) {
        this.clientUID = clientUID;
    }


    /**
     * Gets the level value for this Location.
     * 
     * @return level
     */
    public java.lang.Integer getLevel() {
        return level;
    }


    /**
     * Sets the level value for this Location.
     * 
     * @param level
     */
    public void setLevel(java.lang.Integer level) {
        this.level = level;
    }


    /**
     * Gets the locationID value for this Location.
     * 
     * @return locationID
     */
    public java.lang.Integer getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this Location.
     * 
     * @param locationID
     */
    public void setLocationID(java.lang.Integer locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the locationTypeID value for this Location.
     * 
     * @return locationTypeID
     */
    public java.lang.Integer getLocationTypeID() {
        return locationTypeID;
    }


    /**
     * Sets the locationTypeID value for this Location.
     * 
     * @param locationTypeID
     */
    public void setLocationTypeID(java.lang.Integer locationTypeID) {
        this.locationTypeID = locationTypeID;
    }


    /**
     * Gets the longDescription value for this Location.
     * 
     * @return longDescription
     */
    public java.lang.String getLongDescription() {
        return longDescription;
    }


    /**
     * Sets the longDescription value for this Location.
     * 
     * @param longDescription
     */
    public void setLongDescription(java.lang.String longDescription) {
        this.longDescription = longDescription;
    }


    /**
     * Gets the modifiedDate value for this Location.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Location.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the notes value for this Location.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Location.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the parentID value for this Location.
     * 
     * @return parentID
     */
    public java.lang.Integer getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this Location.
     * 
     * @param parentID
     */
    public void setParentID(java.lang.Integer parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the requiresUpload value for this Location.
     * 
     * @return requiresUpload
     */
    public java.lang.Boolean getRequiresUpload() {
        return requiresUpload;
    }


    /**
     * Sets the requiresUpload value for this Location.
     * 
     * @param requiresUpload
     */
    public void setRequiresUpload(java.lang.Boolean requiresUpload) {
        this.requiresUpload = requiresUpload;
    }


    /**
     * Gets the shortDescription value for this Location.
     * 
     * @return shortDescription
     */
    public java.lang.String getShortDescription() {
        return shortDescription;
    }


    /**
     * Sets the shortDescription value for this Location.
     * 
     * @param shortDescription
     */
    public void setShortDescription(java.lang.String shortDescription) {
        this.shortDescription = shortDescription;
    }


    /**
     * Gets the status value for this Location.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Location.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the valuePath value for this Location.
     * 
     * @return valuePath
     */
    public java.lang.String getValuePath() {
        return valuePath;
    }


    /**
     * Sets the valuePath value for this Location.
     * 
     * @param valuePath
     */
    public void setValuePath(java.lang.String valuePath) {
        this.valuePath = valuePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientUID==null && other.getClientUID()==null) || 
             (this.clientUID!=null &&
              this.clientUID.equals(other.getClientUID()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.locationID==null && other.getLocationID()==null) || 
             (this.locationID!=null &&
              this.locationID.equals(other.getLocationID()))) &&
            ((this.locationTypeID==null && other.getLocationTypeID()==null) || 
             (this.locationTypeID!=null &&
              this.locationTypeID.equals(other.getLocationTypeID()))) &&
            ((this.longDescription==null && other.getLongDescription()==null) || 
             (this.longDescription!=null &&
              this.longDescription.equals(other.getLongDescription()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.requiresUpload==null && other.getRequiresUpload()==null) || 
             (this.requiresUpload!=null &&
              this.requiresUpload.equals(other.getRequiresUpload()))) &&
            ((this.shortDescription==null && other.getShortDescription()==null) || 
             (this.shortDescription!=null &&
              this.shortDescription.equals(other.getShortDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.valuePath==null && other.getValuePath()==null) || 
             (this.valuePath!=null &&
              this.valuePath.equals(other.getValuePath())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getClientUID() != null) {
            _hashCode += getClientUID().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLocationID() != null) {
            _hashCode += getLocationID().hashCode();
        }
        if (getLocationTypeID() != null) {
            _hashCode += getLocationTypeID().hashCode();
        }
        if (getLongDescription() != null) {
            _hashCode += getLongDescription().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getRequiresUpload() != null) {
            _hashCode += getRequiresUpload().hashCode();
        }
        if (getShortDescription() != null) {
            _hashCode += getShortDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getValuePath() != null) {
            _hashCode += getValuePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ClientUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "LocationTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "LongDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ParentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiresUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "RequiresUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ShortDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "ValuePath"));
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
