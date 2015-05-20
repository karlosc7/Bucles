package ifs;

public class Pares {
	// Método auxiliar que utilize el operador ternario
	private static String esPar(int num) {
		return (num % 2 == 0) ? "Par" : "Impar";
	}

	public static void main(String[] args) {
		// En esta variable se introduce el número a probar
		int num_prueba = 6;
		System.out.println("El número " + num_prueba + " es "
				+ esPar(num_prueba));
	}

}
