package com.educacionit.jse.integrador.utils;

public class StringUtils {
	
	public static String wordToCamelCase(String palabra) {
		String primeraLetra = palabra.substring(0, 1).toUpperCase();
		String resto = palabra.substring(1).toLowerCase();
		return primeraLetra + resto;
	}

}
