import java.util.List;

public class Asignatura {
	private String nombre;
	private String tipo;
	private int cantHoras;
	private List<Carrera> Carreras;
	

	Asignatura(){
	}
	
	public List<Carrera> getCarreras() {
		return Carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		Carreras = carreras;
	}

	public int getTipoCuatrimestre() {
		return tipoCuatrimestre;
	}

	public void setTipoCuatrimestre(int tipoCuatrimestre) {
		this.tipoCuatrimestre = tipoCuatrimestre;
	}

	private int tipoCuatrimestre;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int paramHoras) {
		cantHoras = paramHoras;
	}
}
