package switches;

public class Operaciones {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 61;
		int resultado = 0;
		char operacion = '-';
		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		}
		System.out.println(num1 + " " + operacion + " " + num2 + " = "
				+ resultado);
	}

}
