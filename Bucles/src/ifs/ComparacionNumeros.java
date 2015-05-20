package ifs;

public class ComparacionNumeros {
	private static int comparar(int x, int y) {
		return Integer.compare(x, y);
	}

	public static void main(String[] args) {
		int num_prueba1 = 16;
		int num_prueba2 = 8;
		String mensaje = "Los números son iguales";
		int comparacion = comparar(num_prueba1, num_prueba2);
		if (comparacion == -1)
			mensaje = "El número " + num_prueba2 + " es mayor que "
					+ num_prueba1;
		else if (comparacion == 1)
			mensaje = "El número " + num_prueba1 + " es mayor que "
					+ num_prueba2;
		System.out.println(mensaje);
	}

}
