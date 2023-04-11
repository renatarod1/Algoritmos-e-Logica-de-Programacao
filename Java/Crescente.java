import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y;
		
		System.out.println("Digite dois números: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != Y) {					
			if (X < Y) {
				System.out.println("CRESCENTE!");
			} else {
				System.out.println("DECRESCENTE!");
			} 
		
			System.out.println("Digite dois números: ");
			X = sc.nextInt();
			Y = sc.nextInt();
		}	
		
		sc.close();
	}
}
