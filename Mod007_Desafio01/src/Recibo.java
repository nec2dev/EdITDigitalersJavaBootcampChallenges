
public class Recibo {
	//Atributos
	private String tipoElemento;
	private float valor;
	private int totalDiario;
	
	//Metodos
	public Recibo() {
		
	}
	public Recibo(String tipoElemento, float valor, int totalDiario) {
		super();
		this.tipoElemento = tipoElemento;
		this.valor = valor;
		this.totalDiario = totalDiario;
	}

	public String getTipoElemento() {
		return tipoElemento;
	}

	public void setTipoElemento(String tipoElemento) {
		this.tipoElemento = tipoElemento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getTotalDiario() {
		return totalDiario;
	}

	public void setTotalDiario(int totalDiario) {
		this.totalDiario = totalDiario;
	}
	
}
