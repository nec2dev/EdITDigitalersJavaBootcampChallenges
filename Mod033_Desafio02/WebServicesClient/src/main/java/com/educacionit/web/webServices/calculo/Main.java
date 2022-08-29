package com.educacionit.web.webServices.calculo;

public class Main {
	public static void main(String[] args) throws Exception {
		Calculadora c = new CalculadoraServiceLocator().getCalculadoraPort();
		System.out.println(c.suma(10, 28));
	}

}
