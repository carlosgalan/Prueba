package ejercicios;

import javax.swing.JOptionPane;

public class Ej_condicionales_2 {

	public Ej_condicionales_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  String palabra, respuesta;
	        
	        JOptionPane.showMessageDialog(null, "ADIVINA LA PALABRA QUE ESCONDE EL PROGRAMA");
	        JOptionPane.showMessageDialog(null, "PISTA: Lo haces en este modulo...");
	        respuesta = JOptionPane.showInputDialog("Diga, ¿Que palabra cree que es?");
	        palabra = "programacion";
	        
	        if (palabra.equals(respuesta)){
	            JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA: La palabra es Programacion");}
	            else{
	                JOptionPane.showMessageDialog(null, "ERROR: " + respuesta + " no es la palabra.");

	}

	}
}