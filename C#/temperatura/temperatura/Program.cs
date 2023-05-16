using System.Globalization;

namespace temperatura {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            char opc;
            double f, c;

            Console.Write("Voce vai digitar a temperatura em qual escala (C/F)? ");
            opc = char.Parse(Console.ReadLine());

            if (opc == 'F') {
                Console.Write("Digite a temperatura em Fahrenheit: ");
                f = double.Parse(Console.ReadLine(), CI);

                c = 5.0 / 9.0 * (f - 32.0);
                Console.WriteLine("Temperatura equivalente em Celsius: " + c.ToString("F2", CI));
            }
            else {
                Console.Write("Digite a temperatura em Celsius: ");
                c = double.Parse(Console.ReadLine(), CI);

                f = 9.0 * c / 5.0 + 32.0;
                Console.WriteLine("Temperatura equivalente em Fahrenheit: " + f.ToString("F2", CI));
            }
        }
    }
}