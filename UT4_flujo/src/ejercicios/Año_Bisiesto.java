package ejercicios;

import java.util.Scanner;

public class A�o_Bisiesto {

	public A�o_Bisiesto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int a�o;
        
        
        System.out.println("Introduzca el a�o ");
        a�o = teclado.nextInt();
        
        if (!(a�o%4==0)){
        {System.out.println("El a�o introducido no es bisiesto");}
        } else {
        	if (a�o%100==0) {
        		if (a�o%400==0){
        			System.out.println("El a�o introducido es bisiesto");       			
        		} else 
        			System.out.println("El a�o introducido no es bisiesto");
        	} else {
        		
        	}
        }
     

	}

}
