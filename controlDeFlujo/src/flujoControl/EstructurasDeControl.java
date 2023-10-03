package flujoControl;

public class EstructurasDeControl {
//debe coincidir la clase con el nombre del doc 

	public static void main(String[] args) {
		// todo dentro del metodo main

		
		
		//Recordar  que para que algo se ejevute, siempre debe ir dentro del metodo principal
		
		//Primero declaro una variable del tipo String donde almaceno un dato
		
		String citaProgramada = null; //dejamos en null y luego lo cambiamos a una fecha "28/09/23"
		
		// La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("Ya hay cita programada , una disculpa");
		} else {
			System.out.println("puedes registrar la cita");
		}
		
		////////////////////
		
		//Seleccionando una opcion y almacenando la var opcion
		
		int opcion = 5;
		
		//creamos un menu
		
		System.out.println("Servicios del Diente Feliz");
		System.out.println("1. Programae una cita");
		System.out.println("2. Verificar cita");
		System.out.println("3. Cancelar Cita");
		System.out.println("4. Salir");
		System.out.println("Seleccione una opcion 1-4");
		
		switch (opcion) {
		case 1: 
			System.out.println("Seleccionaste programar cita"); 
			break;
		case 2:
			System.out.println("Seleccionaste verificar cita");
			break;
		case 3:
			System.out.println("Seleccionaste cancelar cita");
			break;
		case 4:
			System.out.println("Seleccionaste salir");
			break;
			default:
				System.out.println("No es valido, selecciona la opcion 1-4");
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Verificar de si la edad del paciente es apta para cierto tratamiento
//- Investigar operador ternario ?:
//- Ejemplo de consultorio

//Ingresando una edad del paciente
int edadPaciente = 20;

System.out.println("Evaluando si el paciente es apto para medicamento...");

//Condicion if
if (edadPaciente >= 18){
System.out.println("Podemos otorgar su medicamento respectivo :)");
} else {
System.out.println("Lo sentimos, no podemos otorgarle un medicamento :(");
} 

// - Operador ternario ejercicio

String estado = (edadPaciente >= 60) ? "es de la tercera edad, requiere atencion especial" : "no requiere atencion especial";

System.out.println("El paciente " + estado);
		
		
	}//metodo

	}//class
