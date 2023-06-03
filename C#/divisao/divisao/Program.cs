using System.Globalization;

namespace divisao {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int n;
            double num, den, result;

            Console.Write("Quantos casos voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++) {
                Console.Write("Entre com o numerador: ");
                num = double.Parse(Console.ReadLine());

                Console.Write("Entre com o numerador: ");
                den = double.Parse(Console.ReadLine());

                result = 0;
                if (den == 0) {
                    Console.WriteLine("DIVISAO IMPOSSIVEL");
                }
                else {
                    result = num / den;
                    Console.WriteLine("DIVISAO = " + result.ToString("F2", CI));
                }
            }
        }
    }
}