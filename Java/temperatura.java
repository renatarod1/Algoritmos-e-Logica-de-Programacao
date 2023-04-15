import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String opc;
		double tempRes, tempInfo;

		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		opc = sc.nextLine();

		switch (opc) {
		case "C":
			System.out.print("Digite a temperatura em Celsius: ");
			tempInfo = sc.nextDouble();
			tempRes = 9 * tempInfo / 5 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", tempRes);
			break;

		case "F":
			System.out.print("Digite a temperatura em Fahrenheit: ");
			tempInfo = sc.nextDouble();
			tempRes = 5 / 9 * (tempInfo - 32);
			System.out.printf("Temperatura equivalente em Celsius: %.2f", tempRes);
			break;
		}

		sc.close();
	}
}
