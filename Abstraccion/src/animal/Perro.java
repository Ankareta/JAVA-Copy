package animal;

public class Perro extends Animal{ //Herencia de la clase superior Animal

	
		//Polimorfear o sobreescribir el metodo heredado

@Override // con esto le decimos a Java que el metodo hacerSonido sera sobreescrito
public void hacerSonido() {
	System.out.println("El perrito ladra y hace guau");
}//metodo hacerSonido heredado nde Animal




public static void main(String[]args) {
	//Aqui NO hay polimorfismo, ya que instancio un animal genericos, y utilizo su metodo hacerSonido
	//Animal Generico = new Animal(); // genera un animal generico (abstracto)
	
	
	//Generar instancia de mi perrito
	//SI hay polimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
	//Referenciar primero la clase general, y luego la partticular, permite el polimorfismo
	Animal Chilaquil = new Perro();
	Chilaquil.hacerSonido(); //Poliformisfo en tiempo de ejecucion
}//metodo main 
}//Cierre Perro
