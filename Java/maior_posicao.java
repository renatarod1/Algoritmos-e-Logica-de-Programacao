import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicaoMaior;
		double maior;

		System.out.print("Quanto numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println();

		posicaoMaior = 0;
		maior = vet[0];
		for (int i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		sc.close();
	}
}