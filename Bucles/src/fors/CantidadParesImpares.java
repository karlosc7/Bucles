package fors;

import java.util.Scanner;

public class CantidadParesImpares {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numero, resultado, pares = 0, impares = 0;
		System.out.print("Ingrese la cantidad de numeros a revisar: ");
		numero = scan.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + ") Ingrese un numero: ");
			resultado = scan.nextInt();
			if (resultado % 2 == 0)
				pares++;
			else
				impares++;
		}
		System.out.println("La cantidad de pares son: " + pares);
		System.out.println("La cantidad de impares son: " + impares);
	}
}
