import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int vet[] = new int[9];

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		sc.close();
	}
}
