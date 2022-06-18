
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		int suma=0;
		while (n<=25){
			if(n%2==0){
				suma = suma+n;
			}
		n++;
		}
		System.out.println("La suma de pares del 1 al 25 es " + suma);
	}

}
