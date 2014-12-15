package ejercicios;

import javax.swing.JOptionPane;

public class Ej_condicionales {

	public Ej_condicionales() {
		
	}

	public static void main(String[] args) {
		String numero;
		int oculto;
		
		oculto=5;
		
		numero=JOptionPane.showInputDialog("Introduce un numero entre 1 y 10");
				int num=Integer.parseInt(numero);
				{ if(num==oculto);
				JOptionPane.showMessageDialog(null, "has acertado!");}
				else {
					JOptionPane.showMessageDialog(null, "Has fallado!");
						
	}

}
}