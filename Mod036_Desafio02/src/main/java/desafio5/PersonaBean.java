package desafio5;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
@Named
@RequestScoped
public class PersonaBean {
	private String nombre;
	private int edad;
	private String direccion;
	private String genero;
	private List<String> profesionList;
	private List<String> profesionSelecionada;
	public PersonaBean() {
		profesionList = new ArrayList<String>();
		profesionList.add("Tecnico");
		profesionList.add("Profesional");
		profesionList.add("Especialista");
		profesionList.add("Maestría");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<String> getProfesionList() {
		return profesionList;
	}
	public void setProfesionList(List<String> profesionList) {
		this.profesionList = profesionList;
	}
	public List<String> getProfesionSelecionada() {
		return profesionSelecionada;
	}
	public void setProfesionSelecionada(List<String> profesionSelecionada) {
		this.profesionSelecionada = profesionSelecionada;
	}
	
	
}
