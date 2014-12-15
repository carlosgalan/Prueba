package ejercicios;

import javax.swing.JOptionPane;

public class E05_condicionales {

	public E05_condicionales() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String numero;
		int año,respuesta ;
		
		
		numero=JOptionPane.showInputDialog("Dime un año y te dire si es bisiesto o no");
		año=Integer.parseInt(numero);
		respuesta=año%4;
		if (respuesta==0)
		JOptionPane.showMessageDialog(null, "Es bisiesto!");
		else (respuesta=!0)
		

	}

}
