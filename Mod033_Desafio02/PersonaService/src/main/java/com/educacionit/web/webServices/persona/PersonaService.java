package com.educacionit.web.webServices.persona;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PersonaService {
	
	   @WebMethod
	   public boolean sosMayorDeEdad(int edad) {
	      return edad >= 18;
	   }

}
