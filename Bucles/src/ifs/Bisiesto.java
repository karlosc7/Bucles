package ifs;

public class Bisiesto {
	private static void esBisiesto(int year) {
		boolean esBisiesto = (year % 4 == 0 && year % 100 != 0)
				|| year % 400 == 0;
		System.out.println(year + ((esBisiesto) ? "" : " no")
				+ " es bisiesto.\n");
	}

	public static void main(String[] args) {
		// array que almacena la lista de años a comprobar
		int[] years = { 1903, 1904, 1908, 1912, 1916, 2012, 2016 };
		for (int i = 0; i < years.length; i++)
			esBisiesto(years[i]);
	}

}
