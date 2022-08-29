package ar.com.educacionit.webprogramming.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.jse.integrador.baseDeDatos.AlumnoDAO;
import com.educacionit.jse.integrador.entidades.Alumno;
import com.educacionit.jse.integrador.excepciones.CafeStoreException;
import com.educacionit.jse.integrador.excepciones.NegocioException;
@ManagedBean(name = "alumnoBean")
@SessionScoped
public class AlumnoBean {
	private Alumno alumno = new Alumno();
	private int dni;
	
	
	
	public String inserta() {
		try {
			AlumnoDAO.inserta(alumno);
		} catch (NegocioException e) {
			e.printStackTrace();
		} catch (CafeStoreException e) {
			e.printStackTrace();
		}
		return "insertado";
	}
	
	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	


}
