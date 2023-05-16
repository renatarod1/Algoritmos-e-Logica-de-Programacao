using System.Globalization;

namespace dardo {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            double dist1, dist2, dist3, maior;

            Console.WriteLine("Digite as tres distancias: ");
            dist1 = double.Parse(Console.ReadLine(), CI);
            dist2 = double.Parse(Console.ReadLine(), CI);
            dist3 = double.Parse(Console.ReadLine(), CI);

            if (dist1 > dist2 && dist1 > dist3) {
                maior = dist1;
            }
            else if (dist2 > dist3) {
                maior = dist2;
            }
            else {
                maior = dist3;
            }
            Console.WriteLine("MAIOR DISTANCIA = " + maior.ToString("F2", CI));
        }
    }
}