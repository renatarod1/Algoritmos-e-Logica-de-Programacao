import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, soma, contador;
		double media;

		soma = 0;
		contador = 0;
		media = 0;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (idade > 0) {
				contador++;
				soma = soma + idade;
				idade = sc.nextInt();
			}

			media = (double) soma / contador;
			System.out.printf("MEDIA = %.2f", media);

		}
		sc.close();
	}
}
