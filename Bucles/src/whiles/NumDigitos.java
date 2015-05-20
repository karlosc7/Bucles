package whiles;

public class NumDigitos {
	// Métod que sirve para contar el número de dígitos de un entero
	public static void main(String[] args) {
		// número sobre el que vamos a operar
		int numero = 25444;
		// varible contador de dígitos inicializada a 0
		int digitos = 0;
		do {
			// numero = numero / 10 (le quitamos el dígito de la derecha)
			numero /= 10;
			digitos++;
			// Si dividimos un número entero < 10 entre 10, da 0 y saldremos
		} while (numero > 0);
		// Al terminar el bucle tendremos en digitos el número total
		System.out.println("El número de dígitos es: " + digitos);
	}

}
