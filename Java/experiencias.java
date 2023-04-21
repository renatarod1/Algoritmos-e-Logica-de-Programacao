import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtd, c, r, s, totalCobaias;
		char tipoCobaia;
		double porcentagemC, porcentagemR, porcentagemS;

		c = 0;
		r = 0;
		s = 0;

		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);

			switch (tipoCobaia) {
			case 'C':
				c = c + qtd;
				break;

			case 'S':
				s = s + qtd;
				break;

			case 'R':
				r = r + qtd;
				break;
			}
		}

		totalCobaias = c + s + r;
		porcentagemC = (double) c / totalCobaias * 100;
		porcentagemR = (double) r / totalCobaias * 100;
		porcentagemS = (double) s / totalCobaias * 100;

		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f\n", porcentagemC);
		System.out.printf("Percentual de ratos: %.2f\n", porcentagemR);
		System.out.printf("Percentual de sapos: %.2f\n", porcentagemS);

		sc.close();
	}
}
