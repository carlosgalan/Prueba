package ejemplos;

public class Tabla {

	public Tabla() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int numero;
		
		numero=1;
		while (numero<=10) {
			
			System.out.println(numero);
			numero+=1;
		}
		
		numero=1;
		do {
			System.out.println(numero);
			numero+=1;
		}while (numero<=10);

	}

}
