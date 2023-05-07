import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, linha, coluna;
		double somaPositivos;

		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		System.out.println();

		somaPositivos = 0.0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					somaPositivos = somaPositivos + mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f\n", somaPositivos);
		System.out.println();

		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[linha][i]);
		}
		System.out.println();
		System.out.println();

		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}
		System.out.println();
		System.out.println();

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}

		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
