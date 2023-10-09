package figura;


//Herencia de la clase abstracta Figura
public class Circulo extends Figura {

	//Atributos
	double pi;
	double radio;
	
	//Constructor
	Circulo(double pi, double radio){
		this.pi = pi;
		this.radio = radio;
	}//constructor
	
	//Metodos (metodo abstracto heredado de Figura)
	@Override
	public double calcularArea() {
		double areaCirculo = pi * (radio*radio);
		return areaCirculo;
		// TODO Auto-generated method stub
	
	}//metodo calcularArea

}//class circulo



