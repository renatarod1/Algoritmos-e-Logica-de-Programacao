import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivel, consumoMedio;

		System.out.print("Distancia percorrida: ");
		distancia = sc.nextInt();
		System.out.print("Combustível gasto: ");
		combustivel = sc.nextDouble();

		consumoMedio = distancia / combustivel;

		System.out.printf("Consumo medio = %.3f", consumoMedio);

		sc.close();
	}
}
