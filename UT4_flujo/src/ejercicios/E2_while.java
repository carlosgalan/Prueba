package ejercicios;

import java.util.Scanner;

public class E2_while {

	public E2_while() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero=1;
		int contador=0;
		int multiplicar=1;
		
		while(numero!=0){
			multiplicar=multiplicar*numero;
			System.out.println("Dame numeros: ");
			numero=input.nextInt();
			contador++;
		};
		
		contador--;
		System.out.println("Has insertado "+contador+" numeros y el resultado de multiplicar todos ellos es: "+multiplicar);
	}
	}


