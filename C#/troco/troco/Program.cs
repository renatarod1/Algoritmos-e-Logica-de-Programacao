using System.Globalization;

namespace troco {
    class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            double preco, troco, vlRecebido;
            int qtd;

            Console.Write("Preço unitário do produto: ");
            preco = double.Parse(Console.ReadLine(), CI);

            Console.Write("Quantidade comprada: ");
            qtd = int.Parse(Console.ReadLine());

            Console.Write("Dinheiro recebido: ");
            vlRecebido = double.Parse(Console.ReadLine(), CI);

            troco = vlRecebido - (qtd * preco);
            Console.WriteLine("TROCO = " + troco.ToString("F2", CI));
        }
    }
}