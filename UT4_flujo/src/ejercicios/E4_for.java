package ejercicios;

import java.util.Scanner;

public class E4_for {

	public E4_for() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero,i,resultado;
		 resultado=0;
		 System.out.println("Dame 6 numeros:");
		 for(i=0;i<6;i++);{
		 numero=teclado.nextInt();
		 resultado+=numero;
		 
		 }
		 System.out.println("la suma es " + resultado );
		 

	}

}
