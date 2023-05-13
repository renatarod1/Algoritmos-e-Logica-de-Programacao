using System.Globalization;

namespace retangulo {
    class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            double b, h, a, p, d;

            Console.Write("Base do retangulo: ");
            b = double.Parse(Console.ReadLine(), CI);
            Console.Write("Altura do retangulo: ");
            h = double.Parse(Console.ReadLine(), CI);

            a = b * h;
            Console.WriteLine("AREA = " + a.ToString("F4", CI));

            p = 2 * (b + h);
            Console.WriteLine("PERIMETRO = " + p.ToString("F4", CI));

            d = Math.Sqrt(Math.Pow(b, 2) + Math.Pow(h, 2));
            Console.WriteLine("DIAGONAL = " + d.ToString("F4", CI));
        }
    }
}