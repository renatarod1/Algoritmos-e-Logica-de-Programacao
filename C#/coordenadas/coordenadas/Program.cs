using System.Globalization;

namespace coordenadas {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            double x, y;
            string localizacao;

            Console.Write("Valor de X: ");
            x = double.Parse(Console.ReadLine(), CI);

            Console.Write("Valor de Y: ");
            y = double.Parse(Console.ReadLine(), CI);

            if (x > 0 && y > 0) {
                localizacao = "Q1";
            }
            else if (x > 0 && y < 0) {
                localizacao = "Q4";
            }
            else if (x < 0 && y < 0) {
                localizacao = "Q3";
            }
            else if (x < 0 && y > 0) {
                localizacao = "Q2";
            }
            else if (x == 0 && y == 0) {
                localizacao = "Origem";
            }
            else {
                if (x == 0) {
                    localizacao = "Eixo Y";
                }
                else {
                    localizacao = "Eixo X";
                }
            }

            Console.WriteLine(localizacao);
        }
    }
}