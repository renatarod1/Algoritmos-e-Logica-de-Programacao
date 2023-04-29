import java.util.Locale;
import java.util.Scanner;

public class soma_vetorII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double vet[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		System.out.printf("SOMA = %.2f\n", soma);

		media = soma / n;
		System.out.printf("MEDIA = %.2f", media);

		sc.close();
	}
}
