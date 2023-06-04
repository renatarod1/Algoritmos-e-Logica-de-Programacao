using System.Globalization;

namespace comerciante {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n, abaixo, entre, acima;
            double lucro, porcentagem, vlTotalCompra, vlTotalVenda, lucroTotal;

            Console.Write("Serao digitados dados de quantos produtos? ");
            n = int.Parse(Console.ReadLine());

            string[] produtos = new string[n];
            double[] precosCompra = new double[n];
            double[] precosVenda = new double[n];

            for (int i = 0; i < n; i++) {
                Console.WriteLine("Produto " + (i + 1) + ":");
                Console.Write("Nome: ");
                produtos[i] = Console.ReadLine();
                Console.Write("Preço de compra: ");
                precosCompra[i] = double.Parse(Console.ReadLine(), CI);
                Console.Write("Preço de venda: ");
                precosVenda[i] = double.Parse(Console.ReadLine(), CI);
            }
            Console.WriteLine();
            Console.WriteLine("RELATORIO:");

            abaixo = 0;
            entre = 0;
            acima = 0;
            for (int i = 0; i < n; i++) {
                lucro = precosVenda[i] - precosCompra[i];
                porcentagem = lucro * 100 / precosCompra[i];
                if (porcentagem < 10) {
                    abaixo++;
                }
                else if (porcentagem >= 10 && porcentagem <= 20) {
                    entre++;
                }
                else {
                    acima++;
                }
            }
            Console.WriteLine("Lucro abaixo de 10%: " + abaixo);
            Console.WriteLine("Lucro entre 10% e 20%: " + entre);
            Console.WriteLine("Lucro acima de 20%: " + acima);

            vlTotalCompra = 0;
            vlTotalVenda = 0;
            for (int i = 0; i < n; i++) {
                vlTotalCompra = vlTotalCompra + precosCompra[i];
                vlTotalVenda = vlTotalVenda + precosVenda[i];
            }
            Console.WriteLine("Valor total de compra: " + vlTotalCompra.ToString("F2", CI));
            Console.WriteLine("Valor total de venda: " + vlTotalVenda.ToString("F2", CI));
            lucroTotal = vlTotalVenda - vlTotalCompra;
            Console.WriteLine("Lucro total: " + lucroTotal.ToString("F2", CI));
        }
    }
}