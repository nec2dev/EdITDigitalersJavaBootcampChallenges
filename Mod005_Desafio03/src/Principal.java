
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inflacion={0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9}; 
		String[]mes={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
				String mes_min="",mes_max="";
				int n;
				double total=0,maximo=inflacion[0], minimo=inflacion[0];
				for (n = 0; n < inflacion.length; n++){
				total = total + inflacion[n];
				if (inflacion[n] > maximo){ 
				maximo = inflacion[n];
				mes_max=mes[n];
				}
				if (inflacion[n] < minimo){ 
					minimo = inflacion[n];
					mes_min=mes[n];
					}
					}
					System.out.println("Promedio: " + total/12 + "%");
					System.out.println("Minima inflacion: " + minimo +"% mes: "+ mes_min);
					System.out.println("Maxima inflacion: " + maximo +"% mes: "+ mes_max);
	}
}
