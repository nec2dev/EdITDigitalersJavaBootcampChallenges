package desafio5;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SaludoBean {
	private String mensaje ="Bienvenidos!";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
