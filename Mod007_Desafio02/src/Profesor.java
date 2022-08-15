import java.util.List;

public class Profesor extends Persona {
	private String departamento;
	private List<Asignatura> Materias;
	private String id_Profesor;

	public String getId_Profesor() {
		return id_Profesor;
	}

	public void setId_Profesor(String paramId_Profesor) {
		id_Profesor = paramId_Profesor;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public List<Asignatura> getMaterias() {
		return Materias;
	}

	public void setMaterias(List<Asignatura> materias) {
		Materias = materias;
	}

}
