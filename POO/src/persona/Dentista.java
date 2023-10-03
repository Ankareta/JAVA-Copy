package persona;

public class Dentista extends Persona{


		// 1. Atributos
	
	/* Ya no creo valores como nombre, edad, etc, porque estos los voy a heredar de la clase persona*/
	
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	
	//2Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email);
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//cierre constructor dentista
	

	//3 Metodos para calcular salario basado en la experiencia
	//Experiencia  = basico, intermedio, avanzado 
	
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	
	void calcularSalario() {
		if (experiencia == "basico") {
			salario = 30000;
		}else if (experiencia == "intermedio") {
			salario = 40000;
		} else if (experiencia == "avanzado") {
			salario = 50000;
		}		
	}//cierre calc sal
		
void imprimirInfoDentista() {
	System.out.println("La especialidad: " + especialidad);
	System.out.println("El salario es " + salario);

//cierre imprinfodent
	
	
	}
	
	
	
	}//cierre dentista


