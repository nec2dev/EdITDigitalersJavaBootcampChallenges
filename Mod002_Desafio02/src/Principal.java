import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int cantidadDecimales;
		float base, exponente;
		double resultado;
		System.out.print("Indique un numero base: ");
		base = teclado.nextFloat();
		System.out.print("Indique un numero exponente: ");
		exponente = teclado.nextFloat();

		System.out.print("Indique cuantos decimales quiere mostrar: ");
		cantidadDecimales = teclado.nextInt();

		resultado = Math.pow(base, exponente);
		System.out.println(String.format(
				"La potencia con " + cantidadDecimales + " decimales: %." + cantidadDecimales + "f ", resultado));

		teclado.close();
	}

}