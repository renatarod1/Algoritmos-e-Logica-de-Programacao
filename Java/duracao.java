import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int duracao, horas, resto, minutos, segundos;

		System.out.print("Digite a duraçao em segundos: ");
		duracao = sc.nextInt();

		horas = duracao / 3600;
		resto = duracao % 3600;

		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);
		sc.close();
	}
}
