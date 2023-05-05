import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, qtdPares;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NUMEROS PARES:");

		qtdPares = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				qtdPares++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qtdPares);
		sc.close();
	}
}
