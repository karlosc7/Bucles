package whiles;

public class Digitos {
	public static void main(String[] args) {
		int numero = 25444;
		int digitos = 0;
		while (numero > 0) {
			numero /= 10;
			digitos++;
			// Si se llega a 5, se sale del bucle y se deja de contar
			if (digitos == 5)
				// Se rompe el bucle while y se continúa
				break;
		}
		// Sólo si se alcanza la cifra de 5 se muestra el mensaje
		if (digitos == 5)
			System.out.println("El número tiene 5 ó más dígitos");
		// en otro caso, no se imprime nada
	}

}
