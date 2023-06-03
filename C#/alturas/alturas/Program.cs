using System.Globalization;

namespace alturas {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n, qtdMenor16;
            double somaAlturas, alturaMedia, percentMenores16;

            Console.Write("Quantas pessoas serao digitadas? ");
            n = int.Parse(Console.ReadLine());

            string[] nomes = new string[n];
            int[] idades = new int[n];
            double[] alturas = new double[n];

            somaAlturas = 0;
            qtdMenor16 = 0;

            for (int i = 0; i < n; i++) {
                Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
                Console.Write("Nome: ");
                nomes[i] = Console.ReadLine();
                Console.Write("Idade: ");
                idades[i] = int.Parse(Console.ReadLine());
                Console.Write("Altura: ");
                alturas[i] = double.Parse(Console.ReadLine(), CI);
            }

            for (int i = 0; i < n; i++) {
                somaAlturas = somaAlturas + alturas[i];
            }
            alturaMedia = somaAlturas / n;

            Console.WriteLine();
            Console.WriteLine("Altura média: " + alturaMedia.ToString("F2", CI));

            for (int i = 0; i < n; i++) {
                if (idades[i] < 16) {
                    qtdMenor16++;
                }
            }
            
            percentMenores16 = qtdMenor16 * 100.0 / n;
            Console.WriteLine("Pessoas com menos de 16 anos: " + percentMenores16.ToString("F1", CI) + "%");

            for (int i = 0; i < n; i++) {
                if (idades[i] < 16) {
                    Console.WriteLine(nomes[i]); ;
                }
            }
        }
    }
}