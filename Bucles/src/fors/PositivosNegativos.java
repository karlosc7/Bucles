package fors;

import java.util.Scanner;

public class PositivosNegativos {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n, x, positivos = 0, negativos = 0, contador = 0;
		System.out.print("Ingrese la cantidad de numeros a revisar: ");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + ") Ingrese un numero: ");
			x = scan.nextInt();
			if (x == 0)
				contador++;
			else {
				if (x > 0)
					positivos++;
				else
					negativos++;

			}
		}
		System.out.println("La cantidad de positivos son: " + positivos);
		System.out.println("La cantidad de negativos son: " + negativos);
		System.out.println("La cantidad de ceros son: " + contador);
	}

}
