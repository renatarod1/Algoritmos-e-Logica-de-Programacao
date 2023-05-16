using System.Globalization;

namespace troco_verificado {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            double precoProd, valorRecebido, troco;
            int qtd;

            Console.Write("Preço unitário do produto: ");
            precoProd = double.Parse(Console.ReadLine(), CI);

            Console.Write("Quantidade comprada: ");
            qtd = int.Parse(Console.ReadLine());

            Console.Write("Dinheiro recebido: ");
            valorRecebido = double.Parse(Console.ReadLine(), CI);

            troco = valorRecebido - (precoProd * qtd);

            if (troco < 0) {
                Console.WriteLine("DINHEIRO INSUFICIENTE. FALTAM " + Math.Abs(troco).ToString("F2", CI) + " REAIS");
            }
            else {
                Console.WriteLine("TROCO = " + troco.ToString("F2", CI));
            }
        }
    }
}