import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, troca, soma;

		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (y < x) {
			troca = x;
			x = y;
			y = troca;
		}

		soma = 0;
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}

		System.out.println("SOMA DOS IMPARES = " + soma);

		sc.close();
	}
}
