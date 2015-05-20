package whiles;

public class NumDigitos {
	// M�tod que sirve para contar el n�mero de d�gitos de un entero
	public static void main(String[] args) {
		// n�mero sobre el que vamos a operar
		int numero = 25444;
		// varible contador de d�gitos inicializada a 0
		int digitos = 0;
		do {
			// numero = numero / 10 (le quitamos el d�gito de la derecha)
			numero /= 10;
			digitos++;
			// Si dividimos un n�mero entero < 10 entre 10, da 0 y saldremos
		} while (numero > 0);
		// Al terminar el bucle tendremos en digitos el n�mero total
		System.out.println("El n�mero de d�gitos es: " + digitos);
	}

}
