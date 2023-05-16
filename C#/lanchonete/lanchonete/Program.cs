using System.Globalization;
using System.Linq.Expressions;

namespace lanchonete {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int codProd, qtdProd;
            double valorTotal;

            Console.Write("Codigo do produto comprado: ");
            codProd = int.Parse(Console.ReadLine());

            Console.Write("Quantidade do produto comprado: ");
            qtdProd = int.Parse(Console.ReadLine());

            valorTotal = 0.0;
            switch (codProd) {
                case 1:
                    valorTotal = qtdProd * 5.0;
                    break;

                case 2:
                    valorTotal = qtdProd * 3.5;
                    break;

                case 3:
                    valorTotal = qtdProd * 4.8;
                    break;

                case 4:
                    valorTotal = qtdProd * 8.9;
                    break;

                case 5:
                    valorTotal = qtdProd * 7.32;
                    break;
            }

            Console.WriteLine("Valor a pagar: R$ " + valorTotal.ToString("F2", CI));
        }
    }
}