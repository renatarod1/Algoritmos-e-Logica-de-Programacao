import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma, qtdPares;
		double mediaVet;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		qtdPares = 0;
		soma = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				qtdPares++;
			}
		}

		if (soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaVet = soma / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaVet);
		}

		sc.close();
	}
}
