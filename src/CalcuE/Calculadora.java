package CalcuE;

public class Calculadora {
	public double multiplicar(double valor1,double valor2) {
		double resultado;
		resultado = valor1* valor2;
		return resultado;
	}
	public double dividir(double valor1,double valor2) {
		double resultado;
		resultado = valor1 / valor2;
		return resultado;
	}
	public double promediar(double valor1, double valor2, double valor3) {
		double promedio;
		promedio = (valor1+ valor2 + valor3)/3;
		return promedio;
	}
	public void mostrarResultado() {
		System.out.println("Estoy ocupado, vuelvan en 15 min");
	}
}
