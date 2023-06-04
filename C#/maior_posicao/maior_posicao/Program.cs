using System.Globalization;

namespace maior_posicao {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n;
            double maior, posicao;

            Console.Write("Quanto numeros voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            double[] vet = new double[n];

            for (int i = 0; i < n; i++) {
                Console.Write("Digite um numero: ");
                vet[i] = double.Parse(Console.ReadLine(), CI);
            }

            maior = 0;
            posicao = 0;
            for (int i = 0; i < n; i++) {
                if (vet[i] > maior) {
                    maior = vet[i];
                    posicao = i;
                }
            }

            Console.WriteLine();
            Console.WriteLine("MAIOR VALOR = " + maior.ToString("F1", CI));
            Console.WriteLine("POSICAO DO MAIOR VALOR = " + posicao);
        }
    }
}