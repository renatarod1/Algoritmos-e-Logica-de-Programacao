import java.util.Scanner;

public class crescenteII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}

			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}
}
