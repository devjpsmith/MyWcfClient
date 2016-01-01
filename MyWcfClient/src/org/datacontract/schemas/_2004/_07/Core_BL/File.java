/**
 * File.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Core_BL;

public class File  implements java.io.Serializable {
    private java.lang.String BLOBType;

    private java.lang.String description;

    private java.util.Calendar effectiveDate;

    private java.lang.String fileGUID;

    private java.lang.Integer fileID;

    private java.util.Calendar fileModifiedDate;

    private java.lang.String filesystemFileName;

    private java.lang.String filesystemFolder;

    private java.util.Calendar JPGDatePictureTaken;

    private java.lang.Integer JPGHeight;

    private java.lang.Integer JPGWidth;

    private java.util.Calendar modifiedDate;

    private java.lang.String origFileName;

    private java.lang.Boolean requiresUpload;

    private java.lang.String status;

    public File() {
    }

    public File(
           java.lang.String BLOBType,
           java.lang.String description,
           java.util.Calendar effectiveDate,
           java.lang.String fileGUID,
           java.lang.Integer fileID,
           java.util.Calendar fileModifiedDate,
           java.lang.String filesystemFileName,
           java.lang.String filesystemFolder,
           java.util.Calendar JPGDatePictureTaken,
           java.lang.Integer JPGHeight,
           java.lang.Integer JPGWidth,
           java.util.Calendar modifiedDate,
           java.lang.String origFileName,
           java.lang.Boolean requiresUpload,
           java.lang.String status) {
           this.BLOBType = BLOBType;
           this.description = description;
           this.effectiveDate = effectiveDate;
           this.fileGUID = fileGUID;
           this.fileID = fileID;
           this.fileModifiedDate = fileModifiedDate;
           this.filesystemFileName = filesystemFileName;
           this.filesystemFolder = filesystemFolder;
           this.JPGDatePictureTaken = JPGDatePictureTaken;
           this.JPGHeight = JPGHeight;
           this.JPGWidth = JPGWidth;
           this.modifiedDate = modifiedDate;
           this.origFileName = origFileName;
           this.requiresUpload = requiresUpload;
           this.status = status;
    }


    /**
     * Gets the BLOBType value for this File.
     * 
     * @return BLOBType
     */
    public java.lang.String getBLOBType() {
        return BLOBType;
    }


    /**
     * Sets the BLOBType value for this File.
     * 
     * @param BLOBType
     */
    public void setBLOBType(java.lang.String BLOBType) {
        this.BLOBType = BLOBType;
    }


    /**
     * Gets the description value for this File.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this File.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the effectiveDate value for this File.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this File.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the fileGUID value for this File.
     * 
     * @return fileGUID
     */
    public java.lang.String getFileGUID() {
        return fileGUID;
    }


    /**
     * Sets the fileGUID value for this File.
     * 
     * @param fileGUID
     */
    public void setFileGUID(java.lang.String fileGUID) {
        this.fileGUID = fileGUID;
    }


    /**
     * Gets the fileID value for this File.
     * 
     * @return fileID
     */
    public java.lang.Integer getFileID() {
        return fileID;
    }


    /**
     * Sets the fileID value for this File.
     * 
     * @param fileID
     */
    public void setFileID(java.lang.Integer fileID) {
        this.fileID = fileID;
    }


    /**
     * Gets the fileModifiedDate value for this File.
     * 
     * @return fileModifiedDate
     */
    public java.util.Calendar getFileModifiedDate() {
        return fileModifiedDate;
    }


    /**
     * Sets the fileModifiedDate value for this File.
     * 
     * @param fileModifiedDate
     */
    public void setFileModifiedDate(java.util.Calendar fileModifiedDate) {
        this.fileModifiedDate = fileModifiedDate;
    }


    /**
     * Gets the filesystemFileName value for this File.
     * 
     * @return filesystemFileName
     */
    public java.lang.String getFilesystemFileName() {
        return filesystemFileName;
    }


    /**
     * Sets the filesystemFileName value for this File.
     * 
     * @param filesystemFileName
     */
    public void setFilesystemFileName(java.lang.String filesystemFileName) {
        this.filesystemFileName = filesystemFileName;
    }


    /**
     * Gets the filesystemFolder value for this File.
     * 
     * @return filesystemFolder
     */
    public java.lang.String getFilesystemFolder() {
        return filesystemFolder;
    }


    /**
     * Sets the filesystemFolder value for this File.
     * 
     * @param filesystemFolder
     */
    public void setFilesystemFolder(java.lang.String filesystemFolder) {
        this.filesystemFolder = filesystemFolder;
    }


    /**
     * Gets the JPGDatePictureTaken value for this File.
     * 
     * @return JPGDatePictureTaken
     */
    public java.util.Calendar getJPGDatePictureTaken() {
        return JPGDatePictureTaken;
    }


    /**
     * Sets the JPGDatePictureTaken value for this File.
     * 
     * @param JPGDatePictureTaken
     */
    public void setJPGDatePictureTaken(java.util.Calendar JPGDatePictureTaken) {
        this.JPGDatePictureTaken = JPGDatePictureTaken;
    }


    /**
     * Gets the JPGHeight value for this File.
     * 
     * @return JPGHeight
     */
    public java.lang.Integer getJPGHeight() {
        return JPGHeight;
    }


    /**
     * Sets the JPGHeight value for this File.
     * 
     * @param JPGHeight
     */
    public void setJPGHeight(java.lang.Integer JPGHeight) {
        this.JPGHeight = JPGHeight;
    }


    /**
     * Gets the JPGWidth value for this File.
     * 
     * @return JPGWidth
     */
    public java.lang.Integer getJPGWidth() {
        return JPGWidth;
    }


    /**
     * Sets the JPGWidth value for this File.
     * 
     * @param JPGWidth
     */
    public void setJPGWidth(java.lang.Integer JPGWidth) {
        this.JPGWidth = JPGWidth;
    }


    /**
     * Gets the modifiedDate value for this File.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this File.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the origFileName value for this File.
     * 
     * @return origFileName
     */
    public java.lang.String getOrigFileName() {
        return origFileName;
    }


    /**
     * Sets the origFileName value for this File.
     * 
     * @param origFileName
     */
    public void setOrigFileName(java.lang.String origFileName) {
        this.origFileName = origFileName;
    }


    /**
     * Gets the requiresUpload value for this File.
     * 
     * @return requiresUpload
     */
    public java.lang.Boolean getRequiresUpload() {
        return requiresUpload;
    }


    /**
     * Sets the requiresUpload value for this File.
     * 
     * @param requiresUpload
     */
    public void setRequiresUpload(java.lang.Boolean requiresUpload) {
        this.requiresUpload = requiresUpload;
    }


    /**
     * Gets the status value for this File.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this File.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof File)) return false;
        File other = (File) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BLOBType==null && other.getBLOBType()==null) || 
             (this.BLOBType!=null &&
              this.BLOBType.equals(other.getBLOBType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.fileGUID==null && other.getFileGUID()==null) || 
             (this.fileGUID!=null &&
              this.fileGUID.equals(other.getFileGUID()))) &&
            ((this.fileID==null && other.getFileID()==null) || 
             (this.fileID!=null &&
              this.fileID.equals(other.getFileID()))) &&
            ((this.fileModifiedDate==null && other.getFileModifiedDate()==null) || 
             (this.fileModifiedDate!=null &&
              this.fileModifiedDate.equals(other.getFileModifiedDate()))) &&
            ((this.filesystemFileName==null && other.getFilesystemFileName()==null) || 
             (this.filesystemFileName!=null &&
              this.filesystemFileName.equals(other.getFilesystemFileName()))) &&
            ((this.filesystemFolder==null && other.getFilesystemFolder()==null) || 
             (this.filesystemFolder!=null &&
              this.filesystemFolder.equals(other.getFilesystemFolder()))) &&
            ((this.JPGDatePictureTaken==null && other.getJPGDatePictureTaken()==null) || 
             (this.JPGDatePictureTaken!=null &&
              this.JPGDatePictureTaken.equals(other.getJPGDatePictureTaken()))) &&
            ((this.JPGHeight==null && other.getJPGHeight()==null) || 
             (this.JPGHeight!=null &&
              this.JPGHeight.equals(other.getJPGHeight()))) &&
            ((this.JPGWidth==null && other.getJPGWidth()==null) || 
             (this.JPGWidth!=null &&
              this.JPGWidth.equals(other.getJPGWidth()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.origFileName==null && other.getOrigFileName()==null) || 
             (this.origFileName!=null &&
              this.origFileName.equals(other.getOrigFileName()))) &&
            ((this.requiresUpload==null && other.getRequiresUpload()==null) || 
             (this.requiresUpload!=null &&
              this.requiresUpload.equals(other.getRequiresUpload()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getBLOBType() != null) {
            _hashCode += getBLOBType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getFileGUID() != null) {
            _hashCode += getFileGUID().hashCode();
        }
        if (getFileID() != null) {
            _hashCode += getFileID().hashCode();
        }
        if (getFileModifiedDate() != null) {
            _hashCode += getFileModifiedDate().hashCode();
        }
        if (getFilesystemFileName() != null) {
            _hashCode += getFilesystemFileName().hashCode();
        }
        if (getFilesystemFolder() != null) {
            _hashCode += getFilesystemFolder().hashCode();
        }
        if (getJPGDatePictureTaken() != null) {
            _hashCode += getJPGDatePictureTaken().hashCode();
        }
        if (getJPGHeight() != null) {
            _hashCode += getJPGHeight().hashCode();
        }
        if (getJPGWidth() != null) {
            _hashCode += getJPGWidth().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getOrigFileName() != null) {
            _hashCode += getOrigFileName().hashCode();
        }
        if (getRequiresUpload() != null) {
            _hashCode += getRequiresUpload().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(File.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "File"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BLOBType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "BLOBType"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "FileGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "FileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "FileModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesystemFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "FilesystemFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesystemFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "FilesystemFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPGDatePictureTaken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "JPGDatePictureTaken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPGHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "JPGHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPGWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "JPGWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("origFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "OrigFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiresUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "RequiresUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Core.BL", "Status"));
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
