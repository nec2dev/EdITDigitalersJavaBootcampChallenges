
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dinero=1000;
		int mes=1;
		while (mes<=12){
		dinero = dinero*1.02;
		mes++;
		double roundDinero = Math.round(dinero*100.0)/100.0;
		System.out.println("Mes " + mes + ": $ "+ roundDinero);
		}
	}
}
