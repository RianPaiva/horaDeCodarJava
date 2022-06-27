package entities;

public class Calculadora {

	public static double quadrado(double lado) {
		
		return lado*2;
		
	}
	
	public static double retangulo(double base, double altura) {
		
		return base*altura;
		
	}
	
	public static double losango(double dMaior, double dMenor) {
		
		return (dMaior * dMenor)/2;
	}
	
	public static double trapezio(double bMaior, double bMenor, double altura) {
		
		return ((bMaior + bMenor)*altura) / 2;
		
	}
	
	public static double paralelogramo(double base, double altura) {
		
		return base*altura;
		
	}
	
	public static double triangulo(double base, double altura) {
		return (base * altura)/2;
	}
	
	public static double circulo(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}
