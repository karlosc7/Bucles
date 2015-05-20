package ifs;

public class RealizarOperacion {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 61;
		int resultado;
		char operacion = '-';
		if (operacion == '+')
			resultado = num1 + num2;
		else if (operacion == '-')
			resultado = num1 - num2;
		else if (operacion == '*')
			resultado = num1 * num2;
		else
			resultado = num1 / num2;
		System.out.println(num1 + " " + operacion + " " + num2 + " = "
				+ resultado);
	}

}
