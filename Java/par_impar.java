import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, num;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("NULO");
			} else {
				if (num % 2 == 0) {
					if (num < 0) {
						System.out.println("PAR NEGATIVO");
					} else {
						System.out.println("PAR E POSITIVO");
					}
				} else {
					if (num < 0) {
						System.out.println("IMPAR NEGATIVO");
					} else {
						System.out.println("IMPAR POSITIVO");
					}
				}
			}
		}

		sc.close();
	}
}
