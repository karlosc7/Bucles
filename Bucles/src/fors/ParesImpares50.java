package fors;

public class ParesImpares50 {
	public static void main(String[] args) {
		int i, sp = 0, si = 0;
		for (i = 1; i <= 50; i++)
			if (i % 2 == 0)
				sp = sp + i;
			else
				si = si + i;
		System.out.println("La suma de pares es : " + sp);
		System.out.println("La suma de impares es : " + si);
	}

}
