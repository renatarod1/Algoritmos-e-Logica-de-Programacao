import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double vlHora, pagamento;
		int horasTrab;

		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		vlHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrab = sc.nextInt();

		pagamento = horasTrab * vlHora;

		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);

		sc.close();
	}
}
