package loops;

public class ForLoop {

	public static void main(String[] args) {
		//El ciclo for proporciona  una forma compacta de iterar sobre valores. 
		// for (inic)
		
		
		for (int numero = 1; numero <=10; numero++) {
			System.out.println ("Numero igual a " + numero);
			}
		int contador = 1;
		for (contador = 1; contador <=5; contador++) {
			System.out.println ("La cuenta es " + contador);
			}
		
		int filas = 5;
		for(int i =0; i < filas; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print ("*");
			}
			System.out.println ();
			//con la i es el salto de linea y la j los asteriscos
		}

	}

}
