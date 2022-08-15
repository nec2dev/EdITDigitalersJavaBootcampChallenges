import java.util.List;

public class Alumno extends Persona {
	private String Id_Alumno;
	private List<Asignatura> Materias;
	private Carrera Carrera;

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Código de alumno: " + Id_Alumno);
		System.out.println("Carrera: " + getCarrera());
	}

	public void mostrarDatos(int paramDatosMaterias) {
		for (Asignatura asig : Materias) {
			System.out.println("Materia: " + asig.getNombre());
			System.out.println("Cuatrimestre: " + asig.getTipoCuatrimestre());
		}
	}

	public Carrera getCarrera() {
		return Carrera;
	}

	public void setCarrera(Carrera paramCarrera) {
		Carrera = paramCarrera;
	}
	
	public String getId_Alumno() {
		return Id_Alumno;
	}

	public void setId_Alumno(String id_Alumno) {
		Id_Alumno = id_Alumno;
	}

	public List<Asignatura> getMaterias() {
		return Materias;
	}

	public void setMaterias(List<Asignatura> materias) {
		Materias = materias;
	}

	public void inscribirMateria() {
		//
	}

	public void iniciarTramite() {
		//
	}

	public void inscribirCarrera() {
		//
	}
}
