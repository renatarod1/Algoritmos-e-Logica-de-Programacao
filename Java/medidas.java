import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, quadrado, triangulo, trapezio;

		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();

		quadrado = Math.pow(a, 2);
		triangulo = (a * b) / 2;
		trapezio = ((a + b) * c) / 2;

		System.out.printf("AREA DO QUADRADO = %.4f\n", quadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f\n", triangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f\n", trapezio);

		sc.close();
	}
}
