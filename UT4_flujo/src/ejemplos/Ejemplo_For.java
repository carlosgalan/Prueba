package ejemplos;

import java.util.Scanner;

public class Ejemplo_For {

	public Ejemplo_For() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int i;
		String leido;
		for(i=0;i<5;i++){
			leido=teclado.nextLine();
			System.out.println(leido);
			
		}
		

	}

}
