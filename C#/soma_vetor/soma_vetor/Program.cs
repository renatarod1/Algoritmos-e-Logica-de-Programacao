using System.Globalization;

namespace soma_vetor {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n;
            double soma, media;

            soma = 0;
            media = 0;

            Console.Write("Quantos numeros voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            double[] vet = new double[n];
            for (int i = 0; i < n; i++) {
                Console.Write("Digite um numero: ");
                vet[i] = double.Parse(Console.ReadLine(), CI);
            }

            Console.WriteLine();
            Console.Write("VALORES = ");
            for (int i = 0; i < n; i++) {
                Console.Write(vet[i].ToString("F1", CI) + " ");
            }
            Console.WriteLine();

            for (int i = 0; i < n; i++) {
                soma = soma + vet[i];
            }

            media = soma / n;

            Console.WriteLine("SOMA = " + soma.ToString("F2", CI));
            Console.WriteLine("MEDIA = " + media.ToString("F2", CI));
        }
    }
}