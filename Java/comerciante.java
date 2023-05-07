import java.util.Locale;
import java.util.Scanner;

public class comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, lucroAbaixo10, lucroEntre10e20, lucroAcima20;
		double percentualLucro, lucro, vlTotalCompra, vlTotalVenda, lucroTotal;

		System.out.print("Serao digitados dados de quantos produtos? ");
		n = sc.nextInt();

		String[] produto = new String[n];
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			produto[i] = sc.next();
			System.out.print("Preco de compra: ");
			precoCompra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			precoVenda[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("RELATORIO:");

		lucroAbaixo10 = 0;
		lucroEntre10e20 = 0;
		lucroAcima20 = 0;
		for (int i = 0; i < n; i++) {
			lucro = precoVenda[i] - precoCompra[i];
			percentualLucro = lucro * 100 / precoCompra[i];
			if (percentualLucro < 10.0) {
				lucroAbaixo10++;
			} else if (percentualLucro < 20.0) {
				lucroEntre10e20++;
			} else {
				lucroAcima20++;
			}
		}

		vlTotalCompra = 0.0;
		vlTotalVenda = 0.0;
		for (int i = 0; i < n; i++) {
			vlTotalCompra = vlTotalCompra + precoCompra[i];
			vlTotalVenda = vlTotalVenda + precoVenda[i];
		}

		lucroTotal = vlTotalVenda - vlTotalCompra;

		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		System.out.printf("Valor total de compra: %.2f\n", vlTotalCompra);
		System.out.printf("Valor total de venda: %.2f\n", vlTotalVenda);
		System.out.printf("Lucro total: %.2f\n", lucroTotal);

		sc.close();
	}
}
