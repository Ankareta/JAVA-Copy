  package persona;

public class AsistenteDental {

	//1Atributos privados
	private String fechaIngreso;
	private double salario;
	
	
	//2Constructor publico (dejo el constructor publico para poder acceder a el de forma sencilla)
	
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}//constructor
	
	
	//Metodo para imprimir informacion
		public void mostrarDatosAsistente() {
			System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
			System.out.println("El salario del asistente es: " + salario);
		}//metodo imprimir informacion GENERALMENTE SIEMPRE VA EN PUBLICO

		//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
		//sin getters, la info aparece en null
		//sin setters, no puedo cambiar la informacion

		/**
		 * @return the fechaIngreso
		 */
		public String getFechaIngreso() {
			return fechaIngreso;
		}


		/**
		 * @param fechaIngreso the fechaIngreso to set
		 */
		public void setFechaIngreso(String fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}


		/**
		 * @return the salario
		 */
		public double getSalario() {
			return salario;
		}


		/**
		 * @param salario the salario to set
		
		public void setSalario(double salario) {
			this.salario = salario;
		} */
		
		//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
	
}//cierre AsistenteDental 
