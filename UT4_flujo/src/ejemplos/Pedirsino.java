package ejemplos;

import java.util.Scanner;

public class Pedirsino {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String respuesta;
		do{
				System.out.println("Quieres continuar[s/n]");
				respuesta=scn.nextLine();
				respuesta=respuesta.toLowerCase();
				if(!(respuesta.equals("n") || respuesta.equals("s")))
						System.out.println("Debes introducir 's' o 'n'");
		} while (!(respuesta.equalsIgnoreCase("n")) || respuesta.equalsIgnoreCase("s"));
		
		while(true){
				System.out.println("Quieres continuar [s/n]?");
				respuesta=scn.nextLine();
				respuesta=respuesta.toLowerCase();
				if((respuesta.equals("n")|| respuesta.equals("s")))//NO PONER ; DESPUES DE IF
					System.out.println("Debes introducr 's' o 'n'");
					else
						break;
		}
		
		boolean esCorrecta;
		esCorrecta=false;
			while(!esCorrecta){
				System.out.println("Quieres continuar [s/n]");
				respuesta=respuesta.toLowerCase();
				if (respuesta.equals("n") || respuesta.equals("s"))
					esCorrecta=true;
					else
						System.out.println("Debes introducir 's' o 'n'");
			}
	
	
	}

}
