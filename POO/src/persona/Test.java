package persona;

public class Test {
	
	// metodo principal paera instanciar mis clases
	public static void main(String[] args) {
		
		
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe);//imprime lugar de memoria
		Felipe.imprimirInfo();//imprime la info
		Felipe.saludar();//imprime saludo
		
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr.Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "55113344", "Consultorio 500", "intermedio", "matutino", 500);
		System.out.println("*****************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
	}
}
