package ejercicios;

import java.util.Scanner;

public class E1_while {

	public E1_while() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero;
		int contador=1;
		System.out.println("Elige que tabla de multiplicar quieres hacer: ");
		numero=input.nextInt();
		
		while(contador<=10){

			System.out.println(numero+" * "+contador+" = "+(numero*contador));
			contador++;
		}

	}



	}


