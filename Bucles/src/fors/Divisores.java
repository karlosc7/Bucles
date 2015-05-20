package fors;

import java.util.Scanner;

public class Divisores {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.print("Ingrese numero :");
			num = in.nextInt();
		} while (num <= 0);
		int d;
		System.out.println("Los divisores del numero son :");
		for (d = 1; d <= num; d++)
			if (num % d == 0)
				System.out.print(d + " ");
		System.out.println();
	}
}
