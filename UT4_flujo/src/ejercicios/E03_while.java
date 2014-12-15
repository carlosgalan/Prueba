package ejercicios;

import java.util.Scanner;

public class E03_while {

	public E03_while() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		boolean seguir=true;
		
		do {
			numero=teclado.nextInt();
			seguir=!(numero%2==0);
			if (seguir)
			System.out.println("has insertado un "+numero);
			
		}while(seguir);
		
		System.out.println("Fin del programa");
	}
}	


