package whiles;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		int numero_total = 25;
		int i = 1;
		while (i <= numero_total) {
			if (i % 5 == 0)
				// Si es divisible entre 5 cambiamos de fila
				System.out.println("*");
			else
				// Sino, es que es uno más
				System.out.print("*");
			i++;
		}

	}
}
