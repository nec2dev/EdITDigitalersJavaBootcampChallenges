
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="Nahuel", pass="1234";
		
		if(user.equals("Pepe") & pass.equals("1234")){ 
			System.out.println("Bienvenido Pepe!!"); 
		}
		if(!(user.equals("Pepe")) & pass.equals("1234")){ 
			System.out.println("usuario incorrecto"); 
		}
		if(user.equals("Pepe") & !(pass.equals("1234"))){ 
			System.out.println("Contraseña incorrecta"); 
			}
	}

}
