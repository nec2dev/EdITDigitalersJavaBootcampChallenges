import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un número del 1 al 12");
		int mes = scanner.nextInt();
		
		if(mes == 1) {
			System.out.println("Enero");
		}else if(mes == 2) {
			System.out.println("Febrero");
		}else if(mes == 3) {
			System.out.println("Marzo");
		}else if(mes == 4) {
			System.out.println("Abril");
		}else if(mes == 5) {
			System.out.println("Mayo");
		}else if(mes == 6) {
			System.out.println("Junio");
		}else if(mes == 7) {
			System.out.println("Julio");
		}else if(mes == 8) {
			System.out.println("Agosto");
		}else if(mes == 9) {
			System.out.println("Septiembre/Setiembre");
		}else if(mes == 10) {
			System.out.println("Octubre");
		}else if(mes == 11) {
			System.out.println("Noviembre");
		}else if(mes == 12) {
			System.out.println("Diciembre");
		}else {
			System.out.println("No has ingresado lo que se te pidió!!!");
		}
		scanner.close();
	}
}
