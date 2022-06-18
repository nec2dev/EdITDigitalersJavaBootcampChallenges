
public class Elemento {
	//Atributos
	private String tipoElemento;
	private float ancho;
	private float alto;
	private float peso;
	
	//Metodos
	public Elemento(String tipoElemento, float ancho, float alto, float peso) {
		super();
		this.tipoElemento = tipoElemento;
		this.ancho = ancho;
		this.alto = alto;
		this.peso = peso;
	}

	public String getTipoElemento() {
		return tipoElemento;
	}

	public void setTipoElemento(String tipoElemento) {
		this.tipoElemento = tipoElemento;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
