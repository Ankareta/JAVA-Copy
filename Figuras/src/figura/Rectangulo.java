package figura;

public class Rectangulo extends Figura {

	//Parametros
	double base;
	double altura;
	
	//Constructor
	Rectangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}//constructor
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//metodo calcularArea

}//class figura

