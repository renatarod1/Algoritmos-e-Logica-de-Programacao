import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, negativos;

		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat.length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("DIAGONAL PRINCIPAL:");

		for (i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		System.out.print("QUANTIDADE DE NEGATIVOS = ");
		negativos = 0;
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					negativos++;
				}
			}
		}

		System.out.println(negativos);
		sc.close();
	}
}
