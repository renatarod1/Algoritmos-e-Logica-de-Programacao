package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Base do retangulo: ");
		double b = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double h = sc.nextDouble();

		double A = b * h;
		double P = 2 * (b + h);
		double d = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));

		System.out.println("AREA = " + String.format("%.4f", A));
		System.out.println("PERIMETRO = " + String.format("%.4f", P));
		System.out.println("DIAGONAL = " + String.format("%.4f", d));

		sc.close();
	}

}
