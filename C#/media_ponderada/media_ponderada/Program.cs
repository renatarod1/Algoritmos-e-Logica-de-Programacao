using System.Globalization;

namespace media_ponderada {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int n;
            double n1, n2, n3, media;

            Console.Write("Quantos casos voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++) {
                Console.WriteLine("Digite tres numeros:");
                n1 = double.Parse(Console.ReadLine(), CI);
                n2 = double.Parse(Console.ReadLine(), CI);
                n3 = double.Parse(Console.ReadLine(), CI);

                media = (2 * n1 + 3 * n2 + 5 * n3) / 10.0;
                Console.WriteLine("MEDIA = " + media.ToString("F1", CI));
            }
        }
    }
}