import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float numero1, numero2;
		double resultado;
		System.out.print("Indique un primer numero: ");
		numero1 = teclado.nextFloat();
		System.out.print("Indique un primer numero: ");
		numero2 = teclado.nextFloat();

		resultado = numero1 + numero2;
		System.out.println(String.format("La suma con decimales: %.20f ", resultado));
		System.out.println("La suma sin decimales: " + ((int) resultado));

		resultado = numero1 - numero2;
		System.out.println(String.format("La suma con decimales: %.20f ", resultado));
		System.out.println("La suma sin decimales: " + ((int) resultado));

		resultado = numero1 + numero2;
		System.out.println(String.format("La resta con decimales: %.20f ", resultado));
		System.out.println("La resta sin decimales: " + ((int) resultado));

		resultado = numero1 * numero2;
		System.out.println(String.format("La multiplacion con decimales: %.20f ", resultado));
		System.out.println("La multiplicacion sin decimales: " + ((int) resultado));

		resultado = numero1 / numero2;
		System.out.println(String.format("La division con decimales: %.20f ", resultado));
		System.out.println("La division sin decimales: " + ((int) resultado));
		teclado.close();
	}

}