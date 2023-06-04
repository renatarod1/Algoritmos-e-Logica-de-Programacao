using System.Globalization;

namespace media_pares {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n;
            double soma, media, qtdPares;

            Console.Write("Quantos elementos vai ter o vetor? ");
            n = int.Parse(Console.ReadLine());

            int[] vet = new int[n];

            for (int i = 0; i < n; i++) {
                Console.Write("Digite um numero: ");
                vet[i] = int.Parse(Console.ReadLine());
            }

            soma = 0;
            qtdPares = 0;
            for (int i = 0; i < n; i++) {
                if (vet[i] % 2 == 0) {
                    soma = soma + vet[i];
                    qtdPares++;
                }
            }

            if (qtdPares == 0) {
                Console.WriteLine("NENHUM NUMERO PAR");
            }
            else {
                media = soma / qtdPares;
                Console.WriteLine("MEDIA DOS PARES = " + media.ToString("F1", CI));
            }
        }
    }
}