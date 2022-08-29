package com.educacionit.web.webServices.calculo;

public class CalculadoraProxy implements com.educacionit.web.webServices.calculo.Calculadora {
  private String _endpoint = null;
  private com.educacionit.web.webServices.calculo.Calculadora calculadora = null;
  
  public CalculadoraProxy() {
    _initCalculadoraProxy();
  }
  
  public CalculadoraProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraProxy();
  }
  
  private void _initCalculadoraProxy() {
    try {
      calculadora = (new com.educacionit.web.webServices.calculo.CalculadoraServiceLocator()).getCalculadoraPort();
      if (calculadora != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadora)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadora != null)
      ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.educacionit.web.webServices.calculo.Calculadora getCalculadora() {
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora;
  }
  
  public int suma(int arg0, int arg1) throws java.rmi.RemoteException{
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora.suma(arg0, arg1);
  }
  
  
}