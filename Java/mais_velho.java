import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, pessoaMaisVelha, posicao;

		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa:\n");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		pessoaMaisVelha = idades[0];
		posicao = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] > pessoaMaisVelha) {
				pessoaMaisVelha = idades[i];
				posicao = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nomes[posicao]);

		sc.close();
	}
}
