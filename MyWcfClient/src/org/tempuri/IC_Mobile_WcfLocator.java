/**
 * IC_Mobile_WcfLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IC_Mobile_WcfLocator extends org.apache.axis.client.Service implements org.tempuri.IC_Mobile_Wcf {

    public IC_Mobile_WcfLocator() {
    }


    public IC_Mobile_WcfLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IC_Mobile_WcfLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SecureEndpoint
    private java.lang.String SecureEndpoint_address = "https://www.infochipdev.com/IC_Mobile_WCF_V3/IC_Mobile_Wcf.svc";

    public java.lang.String getSecureEndpointAddress() {
        return SecureEndpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SecureEndpointWSDDServiceName = "SecureEndpoint";

    public java.lang.String getSecureEndpointWSDDServiceName() {
        return SecureEndpointWSDDServiceName;
    }

    public void setSecureEndpointWSDDServiceName(java.lang.String name) {
        SecureEndpointWSDDServiceName = name;
    }

    public org.tempuri.MobileWebService getSecureEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SecureEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSecureEndpoint(endpoint);
    }

    public org.tempuri.MobileWebService getSecureEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.SecureEndpointStub _stub = new org.tempuri.SecureEndpointStub(portAddress, this);
            _stub.setPortName(getSecureEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSecureEndpointEndpointAddress(java.lang.String address) {
        SecureEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.MobileWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.SecureEndpointStub _stub = new org.tempuri.SecureEndpointStub(new java.net.URL(SecureEndpoint_address), this);
                _stub.setPortName(getSecureEndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SecureEndpoint".equals(inputPortName)) {
            return getSecureEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "IC_Mobile_Wcf");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "SecureEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SecureEndpoint".equals(portName)) {
            setSecureEndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
