import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, numMulheres, numHomens;
		double menorAltura, maiorAltura, somaAlturaMulheres, mediaAlturaMulheres;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);
		}

		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		for (int i = 0; i < n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}

		numHomens = 0;
		numMulheres = 0;
		somaAlturaMulheres = 0.0;
		mediaAlturaMulheres = 0.0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				numHomens++;
			} else {
				somaAlturaMulheres = somaAlturaMulheres + alturas[i];
				numMulheres++;
			}
		}
		mediaAlturaMulheres = somaAlturaMulheres / numMulheres;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + numHomens);

		sc.close();
	}
}
