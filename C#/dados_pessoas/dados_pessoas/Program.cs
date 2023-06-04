using System.Globalization;

namespace dados_pessoas {
    class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n, qtdMulheres, qtdHomens;
            double maiorAltura, menorAltura, soma, media;

            Console.Write("Quantas pessoas serao digitadas? ");
            n = int.Parse(Console.ReadLine());

            double[] alturas = new double[n];
            char[] genero = new char[n];

            for (int i = 0; i < n; i++) {
                Console.Write("Altura da " + (i + 1) + "a pessoa: ");
                alturas[i] = double.Parse(Console.ReadLine(), CI);
                Console.Write("Genero da " + (i + 1) + "a pessoa: ");
                genero[i] = char.Parse(Console.ReadLine());
            }

            menorAltura = alturas[0];
            maiorAltura = alturas[0];

            for (int i = 0; i < n; i++) {
                if (alturas[i] < menorAltura) {
                    menorAltura = alturas[i];
                }

                if (alturas[i] > maiorAltura) {
                    maiorAltura = alturas[i];
                }
            }
            Console.WriteLine("Menor altura = " + menorAltura.ToString("F2", CI));
            Console.WriteLine("Maior altura = " + maiorAltura.ToString("F2", CI));

            soma = 0;
            qtdMulheres = 0;
            for (int i = 0; i < n; i++) {
                if (genero[i] == 'F') {
                    soma = soma + alturas[i];
                    qtdMulheres++;
                }
            }
            media = soma / qtdMulheres;
            Console.WriteLine("Media das alturas das mulheres = " + media.ToString("F2", CI));
            qtdHomens = n - qtdMulheres;
            Console.WriteLine("Numero de homens = " + qtdHomens);
        }
    }
}