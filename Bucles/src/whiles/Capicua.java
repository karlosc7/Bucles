package whiles;

import java.util.Scanner;

public class Capicua {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, invert = 0, aux, digit;
		System.out.print("Ingresa numero : ");
		num = sc.nextInt();
		aux = num;
		while (aux > 0) {
			digit = aux % 10;
			invert = invert * 10 + digit;
			aux = aux / 10;
		}
		if (num == invert)
			System.out.println("El numero es Capicua!!");
		else
			System.out.println("El numero NO es Capicua!!");
	}

}
