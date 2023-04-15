import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qtd;
		double valorTotal;

		valorTotal = 0;

		System.out.print("Codigo do produto comprado: ");
		cod = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();

		switch (cod) {
		case 1:
			valorTotal = qtd * 5.0;
			break;

		case 2:
			valorTotal = qtd * 3.5;
			break;

		case 3:
			valorTotal = qtd * 4.8;
			break;

		case 4:
			valorTotal = qtd * 8.9;
			break;

		case 5:
			valorTotal = qtd * 7.32;
			break;
		}

		System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		sc.close();
	}
}
