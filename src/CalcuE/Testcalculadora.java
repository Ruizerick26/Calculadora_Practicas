package CalcuE;

public class Testcalculadora {
	public static void main(String[] args) {
		Calculadora MiC = new Calculadora();
		System.out.println("Resultado de multiplicación: "+ MiC.multiplicar(2, 5));
		System.out.println("Resultado de división: "+ MiC.dividir(50, 2));
		System.out.println("El promedio es: "+ MiC.promediar(100, 50, 25));
		MiC.mostrarResultado();
	}
}
