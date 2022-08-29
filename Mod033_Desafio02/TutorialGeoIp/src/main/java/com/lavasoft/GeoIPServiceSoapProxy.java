package com.lavasoft;

public class GeoIPServiceSoapProxy implements com.lavasoft.GeoIPServiceSoap {
  private String _endpoint = null;
  private com.lavasoft.GeoIPServiceSoap geoIPServiceSoap = null;
  
  public GeoIPServiceSoapProxy() {
    _initGeoIPServiceSoapProxy();
  }
  
  public GeoIPServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initGeoIPServiceSoapProxy();
  }
  
  private void _initGeoIPServiceSoapProxy() {
    try {
      geoIPServiceSoap = (new com.lavasoft.GeoIPServiceLocator()).getGeoIPServiceSoap();
      if (geoIPServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)geoIPServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)geoIPServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (geoIPServiceSoap != null)
      ((javax.xml.rpc.Stub)geoIPServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lavasoft.GeoIPServiceSoap getGeoIPServiceSoap() {
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap;
  }
  
  public java.lang.String getIpLocation(java.lang.String sIp) throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getIpLocation(sIp);
  }
  
  public java.lang.String getIpLocation_2_0(java.lang.String sIp) throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getIpLocation_2_0(sIp);
  }
  
  public java.lang.String getLocation() throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getLocation();
  }
  
  public java.lang.String getCountryISO2ByName(java.lang.String countryName) throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getCountryISO2ByName(countryName);
  }
  
  public java.lang.String getCountryNameByISO2(java.lang.String iso2Code) throws java.rmi.RemoteException{
    if (geoIPServiceSoap == null)
      _initGeoIPServiceSoapProxy();
    return geoIPServiceSoap.getCountryNameByISO2(iso2Code);
  }
  
  
}