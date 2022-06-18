
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elemento elemento01 = new Elemento();
		elemento01.setAlto(350.00f);
		elemento01.setAncho(100.00f);
		elemento01.setPeso(200.00f);
		elemento01.setTipoElemento("Envase de gaseosa");

		System.out.println("Datos del elemento:");
		System.out.println("Peso: " + elemento01.getPeso() + " grs.");
		System.out.println("Alto: " + elemento01.getAlto() + " mm.");
		System.out.println("Ancho: " + elemento01.getAncho() + " mm.");
		System.out.println("Tipo: " + elemento01.getTipoElemento());

		System.out.println("");

	        Recibo recibo01 = new Recibo();
	        recibo01.setTipoElemento(elemento01.getTipoElemento());
	        recibo01.setTotalDiario(100);
	        recibo01.setValor(250);

	        System.out.println("Datos del recibo:");
		System.out.println("Tipo de elemento: " + recibo01.getTipoElemento());
		System.out.println("Total: " + recibo01.getTotalDiario() + " un.");
		System.out.println("Valor: $ " + recibo01.getValor());
	}

}
