import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double l, c, vlMetroQuadrado, area, preco;

		System.out.print("Digite a largura do terreno: ");
		l = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		c = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		vlMetroQuadrado = sc.nextDouble();

		area = l * c;
		System.out.println("Area do terreno = " + String.format("%.2f", area));

		preco = vlMetroQuadrado * area;
		System.out.println("Preco do terreno = " + String.format("%.2f", preco));

		sc.close();
	}
}
