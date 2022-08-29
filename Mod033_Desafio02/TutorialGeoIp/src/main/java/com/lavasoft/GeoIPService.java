/**
 * GeoIPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lavasoft;

public interface GeoIPService extends javax.xml.rpc.Service {

/**
 * <b>A web service which performs GetIpAddress Lookups.</b>
 */
    public java.lang.String getGeoIPServiceSoapAddress();

    public com.lavasoft.GeoIPServiceSoap getGeoIPServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.lavasoft.GeoIPServiceSoap getGeoIPServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
