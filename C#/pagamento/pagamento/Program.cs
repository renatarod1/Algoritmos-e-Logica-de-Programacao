using System.Globalization;

namespace pagamento {
    class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            string nome;
            double vlHora, pagamento;
            int qtdHorasTrab;

            Console.Write("Nome: ");
            nome = Console.ReadLine();
            Console.Write("Valor por hora: ");
            vlHora = double.Parse(Console.ReadLine(), CI);
            Console.Write("Horas Trabalhadas: ");
            qtdHorasTrab = int.Parse(Console.ReadLine());

            pagamento = vlHora * qtdHorasTrab;
            Console.WriteLine("O pagamento para " + nome + " deve ser " + pagamento.ToString("F2", CI));
        }
    }
}