package ejercicios;

import javax.swing.JOptionPane;

public class E05_condicionales {

	public E05_condicionales() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String numero;
		int a�o,respuesta ;
		
		
		numero=JOptionPane.showInputDialog("Dime un a�o y te dire si es bisiesto o no");
		a�o=Integer.parseInt(numero);
		respuesta=a�o%4;
		if (respuesta==0)
		JOptionPane.showMessageDialog(null, "Es bisiesto!");
		else (respuesta=!0)
		

	}

}
