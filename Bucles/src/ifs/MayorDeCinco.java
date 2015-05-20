package ifs;

public class MayorDeCinco {
	private static int comparar(int x, int y) {
		return Integer.compare(x, y);
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 61;
		int num3 = 24;
		int num4 = 57;
		int num5 = 34;
		// Inicializo el máximo como el primer número de la serie
		int maximo = num1;
		if (comparar(maximo, num2) < 0)
			maximo = num2;
		if (comparar(maximo, num3) < 0)
			maximo = num3;
		if (comparar(maximo, num4) < 0)
			maximo = num4;
		if (comparar(maximo, num5) < 0)
			maximo = num5;
		System.out.println("El mayor número de la serie es: " + maximo);
	}

}
