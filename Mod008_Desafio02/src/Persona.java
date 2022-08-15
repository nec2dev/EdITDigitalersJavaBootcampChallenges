
public abstract class Persona {
	private String dni;
	private String nombre;
	private String direccion;

	public String getDni() {
		return dni;
	}

	public void setDni(String paramDni) {
		dni = paramDni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void mostrarDatos() {
		System.out.println("Datos de la Persona:");
		System.out.println("Numero de documento: " + getDni());
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
	}
}
