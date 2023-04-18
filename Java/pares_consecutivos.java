import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, total;

		total = 0;

		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();

		while (x != 0) {
			if (x % 2 != 0) {
				x = x + 1;
			}

			total = 5 * x + 20;
			System.out.println("SOMA = " + total);

			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
		sc.close();
	}
}
