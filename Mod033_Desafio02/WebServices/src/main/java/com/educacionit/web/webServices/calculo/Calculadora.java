package com.educacionit.web.webServices.calculo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculadora {
	
	   @WebMethod
	   public int suma(int a, int b) {
	      return a + b;
	   }

}
