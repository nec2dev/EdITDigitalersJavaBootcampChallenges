import java.util.List;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		System.out.println("");

		Carrera c0 = new Carrera();
		c0.setNombre("Programación .Net");
		c0.setSede("Lavalle");

		Carrera c1 = new Carrera();
		c1.setNombre("Programación Java");
		c1.setSede("Florida");

		Carrera c2 = new Carrera();
		c2.setNombre("Programación FullStack PHP");
		c2.setSede("Lavalle");

		List<Carrera> listaDeCarreras = new ArrayList<Carrera>();
		listaDeCarreras.add(c0);
		listaDeCarreras.add(c1);
		listaDeCarreras.add(c2);

		System.out.println("Carreras disponibles:");

		for (Carrera carrera : listaDeCarreras) {
			System.out.println("Sede: " + carrera.getSede());
			System.out.println("Nombre: " + carrera.getNombre());
		}

		System.out.println("");

		Asignatura a = new Asignatura();
		a.setNombre("Introducción al Paradigma de objetos");
		a.setTipo("Obligatoria");
		a.setTipoCuatrimestre(2);
		a.setCantHoras(9);
		a.setCarreras(listaDeCarreras);

		System.out.println("Datos de la Asignatura/Materia:");
		System.out.println("Nombre: " + a.getNombre());
		System.out.println("Tipo de cursada: " + a.getTipo());
		System.out.println("Cuatrimestre: " + a.getTipoCuatrimestre());
		System.out.println("Carga horaria: " + a.getCantHoras());

		System.out.println("");

		Asignatura a1 = new Asignatura();
		a1.setNombre("Introducción a C# .Net");

		List<Asignatura> listaDeAsignaturas = new ArrayList<Asignatura>();
		listaDeAsignaturas.add(a);
		listaDeAsignaturas.add(a1);

		Alumno alu = new Alumno();
		alu.setNombre("Ariel Mercado F.");
		alu.setDireccion("Cramer 1653");
		alu.setDni("33444555");
		alu.setId_Alumno("101");
		alu.setMaterias(listaDeAsignaturas);
		alu.setCarrera(c0);

		System.out.println("Datos del alumno: ");
		System.out.println("Nombre: " + alu.getNombre());
		System.out.println("Codigo de alumno: " + alu.getId_Alumno());
		System.out.println("Carrera: " + alu.getCarrera().getNombre());
		System.out.println("Lista de materias: ");
		alu.mostrarDatos(1);
		System.out.println("");

		AsignaturaCursada ac = new AsignaturaCursada();
		ac.setAsignatura(a1);
		ac.setAlumno(alu);
		ac.setNota(7.50);
		ac.setNotaFinal(8);

		System.out.println("Lista de materias cursadas: ");
		System.out.println(ac.getAsignatura().getNombre());
		System.out.println("Nota: " + ac.getNota());
		System.out.println("Nota final: " + ac.getNotaFinal());

		System.out.println("");

		Profesor prof = new Profesor();
		prof.setNombre("Pedro Gomez");
		prof.setDni("11222333");
		prof.setDireccion("Tucuman 633");
		prof.setDepartamento("Ingeniería");
		prof.setId_Profesor("T021");

		System.out.println("Datos del Profesor: ");
		System.out.println("Nombre: " + prof.getNombre());
		System.out.println("Codigo de profesor: " + prof.getId_Profesor());
		System.out.println("Departamento: " + prof.getDepartamento());

		System.out.println("");

		Tramite t = new Tramite();
		t.setAlumno(alu);
		t.setEstado("Pendiente");
		t.setNumero(12345);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		t.setFecha(sdf.parse("10-10-2020"));

		System.out.println("Datos del Tramite: ");
		System.out.println("Alumno: " + t.getAlumno().getNombre());
		System.out.println("Estado: " + t.getEstado());
		System.out.println("Numero: " + t.getNumero());
		System.out.println("Fecha de inicio: " + t.getFecha());

	}

}
