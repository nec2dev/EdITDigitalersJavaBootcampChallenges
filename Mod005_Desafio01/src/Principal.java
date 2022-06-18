
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec={10,20,5,15,30,20};
		int n, total=0, maximo=vec[0], cont=0;
		for (n = 0; n < vec.length; n++){
		if(n%2==1)System.out.println("PosImp " + n + " " + " valor:" + vec[n]);
		total = total + vec[n];
		if (vec[n] > maximo) maximo = vec[n];
		if (vec[n] == 20) cont++;
		}
		System.out.println("El mayor es: " + maximo);
		System.out.println("El total es: " + total);
		System.out.println("El 20 aparecio: " + cont+" veces");
	}

}
