import java.util.Scanner;

public class soma_imparesII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, troca, soma;

		System.out.println("Digite dois numeros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			troca = num1;
			num1 = num2;
			num2 = troca;
		}

		soma = 0;

		for (int i = num1 + 1; i < num2; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}

		System.out.println("SOMA DOS IMPARES = " + soma);
		sc.close();
	}
}
