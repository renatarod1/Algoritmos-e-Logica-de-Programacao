namespace soma_impares {
    internal class Program {
        static void Main(string[] args) {
            int x, y, troca, somaImpares;

            Console.WriteLine("Digite dois numeros:");
            x = int.Parse(Console.ReadLine());
            y = int.Parse(Console.ReadLine());

            if (x > y) {
                troca = y;
                y = x;
                x = troca;
            }

            somaImpares = 0;
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    somaImpares = somaImpares + i;
                }
            }

            Console.WriteLine("SOMA DOS IMPARES = " + somaImpares);
        }
    }
}