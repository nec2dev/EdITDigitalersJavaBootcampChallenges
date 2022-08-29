package com.educacionit.web.webServices.calculo;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/Calculadora", new Calculadora());
	}

}
