package com.educacionit.web.webServices.persona;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/Persona", new PersonaService());
	}

}
