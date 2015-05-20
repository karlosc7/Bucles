package fors;

public class SumaCuadrados15 {
	public static void main(String[] args) {
		int i, sumacuadrado = 0;
		for (i = 1; i <= 15; i++)
			sumacuadrado = sumacuadrado + i * i;
		System.out
				.println("La suma de los cuadrados de los primeros 15 números es : "
						+ sumacuadrado);
	}
}
