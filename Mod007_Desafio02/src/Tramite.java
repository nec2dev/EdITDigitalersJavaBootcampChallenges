import java.util.Date;

public class Tramite {
	private int Numero;
	private Date Fecha;
	private String Estado;
	private Alumno Alumno;
	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date paramFec) {
		Fecha = paramFec;
	}
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Alumno getAlumno() {
		return Alumno;
	}

	public void setAlumno(Alumno alumno) {
		Alumno = alumno;
	}

}
