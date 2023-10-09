package figura;

public class TestFiguras {
public static void main(String[]args) {

//Generar las instancias de nuestras clases



Figura rectangulo = new Rectangulo(5.0, 6.5);

Figura circulo = new Circulo(3.14, 3.0);


	System.out.println(rectangulo.calcularArea());
	System.out.println(circulo.calcularArea());
	
	
}

}
