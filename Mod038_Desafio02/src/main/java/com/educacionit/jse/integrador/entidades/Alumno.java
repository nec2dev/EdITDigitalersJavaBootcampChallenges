package com.educacionit.jse.integrador.entidades;

public class Alumno {
	private int dni;
	private String nombre;
	private String correo;
	public Alumno(int dni, String nombre, String correo) {
		this.dni = dni;
		this.nombre = nombre;
		this.correo = correo;
	}
	public Alumno() {
		
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + "]";
	}

	

}
