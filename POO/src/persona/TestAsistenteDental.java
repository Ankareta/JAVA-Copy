package persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Instancia de nuestro asistente
		AsistenteDental Francisca = new AsistenteDental ("05/10/23",870.40d);
		
		//Impresion de la info del Ssistente
		Francisca.mostrarDatosAsistente();
		
		System.out.println(Francisca.getSalario());
		
		
	}
	}
		
		
		//El sueldp no es de 875.4 sino de 87.54
		
	//	Francisca.salario=87.54d;
		//Mostrar solo el sueldo
		//System.out.println(Francisca.salario);


