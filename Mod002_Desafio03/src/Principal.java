import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra1, letra2;
		char caracter1, caracter2;
		int ascii1, ascii2;
		System.out.print("Indique la primera letra: ");
		letra1 = teclado.next();

		System.out.print("Indique la segunda letra: ");
		letra2 = teclado.next();

		caracter1 = letra1.toLowerCase().charAt(0);
		ascii1 = caracter1;
		caracter2 = letra2.toLowerCase().charAt(0);
		ascii2 = caracter2;

		System.out.println("Minusculas...");
		System.out.println("La letra " + caracter1 + " en ascii es " + ascii1);
		System.out.println("La letra " + caracter2 + " en ascii es " + ascii2);

		caracter1 = letra1.toUpperCase().charAt(0);
		ascii1 = caracter1;
		caracter2 = letra2.toUpperCase().charAt(0);
		ascii2 = caracter2;

		System.out.println("Mayusculas...");
		System.out.println("La letra " + caracter1 + " en ascii es " + ascii1);
		System.out.println("La letra " + caracter2 + " en ascii es " + ascii2);

		teclado.close();

	}

}