package ejercicios;

import java.util.Scanner;

public class E07_Laborables {

	public E07_Laborables() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime un numero del 1 al 7");
		int numero=teclado.nextInt();
		
		
		
		switch (numero){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Laborable");
			break;
		case 6:
		case 7:
			System.out.println("Es festivo");
			break;
			
			
		}
		
		
			
	}
}

