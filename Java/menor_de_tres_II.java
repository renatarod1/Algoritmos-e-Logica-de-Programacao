import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, menor;
		
		System.out.print("Primeiro valor: ");
		num1 = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		num2 = sc.nextInt();
		
		System.out.print("Terceiro valor: ");
		num3 = sc.nextInt();
				
		if (num1 < num2 && num1 < num3) {
			menor = num1;
		} else if (num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
		System.out.println("MENOR = " + menor);
		
		sc.close();
	}
}
