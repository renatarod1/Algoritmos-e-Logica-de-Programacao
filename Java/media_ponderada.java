import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double vl1, vl2, vl3, media;

		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite tres numeros: ");
			vl1 = sc.nextDouble();
			vl2 = sc.nextDouble();
			vl3 = sc.nextDouble();

			media = (2.0 * vl1 + 3.0 * vl2 + 5.0 * vl3) / 10.0;
			System.out.printf("MEDIA = %.1f\n", media);
		}

		sc.close();
	}
}
