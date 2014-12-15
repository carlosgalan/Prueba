package ejercicios;

import java.util.Scanner;

public class Año_Bisiesto {

	public Año_Bisiesto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int año;
        
        
        System.out.println("Introduzca el año ");
        año = teclado.nextInt();
        
        if (!(año%4==0)){
        {System.out.println("El año introducido no es bisiesto");}
        } else {
        	if (año%100==0) {
        		if (año%400==0){
        			System.out.println("El año introducido es bisiesto");       			
        		} else 
        			System.out.println("El año introducido no es bisiesto");
        	} else {
        		
        	}
        }
     

	}

}
