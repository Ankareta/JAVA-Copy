package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		// byte Vmin y VMax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor minimo de Byte es: " + minByte);
		System.out.println("El valor maximo de Byte es: " + maxByte);
		// short Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor minimo de Short es: " + minShort);
		System.out.println("El valor maximo de Short es: " + maxShort);
		
		//char. Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de Character es: " + minChar);
		System.out.println("El valor maximo de Character es: " + maxChar);
		
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		float salary = 15000f;
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		int minInt = Integer.MIN_VALUE;
		System.out.println("El valor mínimo de Integer es: " + minInt);
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor máximo de Integer es: " + maxInt);
		
		long minLong = Long.MIN_VALUE;
		System.out.println("El valor mínimo de Long es: " + minLong);
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor máximo de Long es: " + maxLong);
		
		float minFloat = Float.MIN_VALUE;
		System.out.println("El valor mínimo de Float es: " + minFloat);
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor máximo de Float es: " + maxFloat);	
		
		double minDouble = Double.MIN_VALUE;
		System.out.println("El valor mínimo de Double es: " + minDouble);
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de Double es: " + maxDouble);
		
		char valorChar1 = 'a';
		char valorChar2 = 'x';
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/* Casteo ( Conversion de tipos en Java).
		 -- Automatico (dato mas pequeño a un dato más grande)
		 -- Manual (tipop de dato más grande a tipo de dato más pequeño)
		  */
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//--Manual
		
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversion
		

	}
}


