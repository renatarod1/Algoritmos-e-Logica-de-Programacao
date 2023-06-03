using System.Globalization;

namespace experiencias {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n, qtd, totC, totR, totS, total;
            char opc;
            double percentC, percentR, percentS;

            Console.Write("Quantos casos de teste serao digitados? ");
            n = int.Parse(Console.ReadLine());

            totC = 0;
            totR = 0;
            totS = 0;
            total = 0;

            for (int i = 0; i < n; i++) {
                Console.Write("Quantidade de cobaias: ");
                qtd = int.Parse(Console.ReadLine());
                Console.Write("Tipo de cobaia: ");
                opc = char.Parse(Console.ReadLine());

                switch (opc) {
                    case 'C':
                        totC = totC + qtd;
                        break;

                    case 'R':
                        totR = totR + qtd;
                        break;

                    case 'S':
                        totS = totS + qtd;
                        break;
                }
            }

            Console.WriteLine();
            Console.WriteLine("RELATORIO FINAL:");
            total = totC + totR + totS;
            percentC = totC * 100.0 / total;
            percentR = totR * 100.0 / total;
            percentS = totS * 100.0 / total;
            Console.WriteLine("Total: " + total);
            Console.WriteLine("Total de coelhos: " + totC);
            Console.WriteLine("Total de ratos: " + totR);
            Console.WriteLine("Total de sapos: " + totS);
            Console.WriteLine("Percentual de coelhos: " + percentC.ToString("F2", CI));
            Console.WriteLine("Percentual de ratos: " + percentR.ToString("F2", CI));
            Console.WriteLine("Percentual de sapos: " + percentS.ToString("F2", CI));
        }
    }
}