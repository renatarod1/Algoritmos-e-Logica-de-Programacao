import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m, n;

		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = sc.nextInt();

		double[][] mat = new double[m][n];
		double[] vet = new double[m];

		for (int i = 0; i < m; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < m; i++) {
			vet[i] = 0;
			for (int j = 0; j < n; j++) {
				vet[i] = vet[i] + mat[i][j];
			}
		}

		System.out.println("VETOR GERADO:");
		for (int i = 0; i < m; i++) {
			System.out.printf("%.1f\n", vet[i]);
		}

		sc.close();
	}
}
