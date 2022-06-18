
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inflacion={0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9};
		int mes_min=0,mes_max=0, n;
		double total=0,maximo=inflacion[0], minimo=inflacion[0];
		for (n = 0; n < inflacion.length; n++){
		total = total + inflacion[n];
		 if (inflacion[n] > maximo){
		maximo = inflacion[n];
		 mes_max=n+1;
		 }
		 if (inflacion[n] < minimo){ 
		minimo = inflacion[n];
		 mes_min=n+1;
		 }
		}
		System.out.println("Promedio: " + total/12 + "%");
		System.out.println("Minima inflacion: " + minimo +"% mes:"+mes_min);
		System.out.println("Maxima inflacion: " + maximo +"% mes:"+mes_max);
	}
}
