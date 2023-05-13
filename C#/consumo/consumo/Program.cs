using System.Globalization;

namespace consumo {
    class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int distancia;
            double combustivel, consumoMedio;

            Console.Write("Distancia percorrida: ");
            distancia = int.Parse(Console.ReadLine());
            Console.Write("Combustível gasto: ");
            combustivel = double.Parse(Console.ReadLine(), CI);

            consumoMedio = distancia / combustivel;
            Console.WriteLine("Consumo medio = " + consumoMedio.ToString("F3", CI));
        }
    }
}