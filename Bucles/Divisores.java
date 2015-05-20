package fors;

import java.util.Scanner;

public class Divisores {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.print("Ingrese un número :");
			num = in.nextInt();
		} while (num <= 0);
		int divisor;
		System.out.println("Los divisores del numero son :");
		for (divisor = 1; divisor <= num; divisor++)
			if (num % divisor == 0)
				System.out.print(divisor + " ");
		System.out.println();
	}
}
