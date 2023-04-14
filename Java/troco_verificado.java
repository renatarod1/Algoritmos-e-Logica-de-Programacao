import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double precoProd, vlRecebido, troco;
		int qtd; 
		
		System.out.print("Preço unitário do produto: ");
		precoProd = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		vlRecebido = sc.nextDouble();
		
		troco = vlRecebido - (precoProd * qtd);
		
		if (troco < 0) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", Math.abs(troco)); 
		} else {
			System.out.printf("TROCO = %.2f", troco);
		}
		sc.close();
	}
}
