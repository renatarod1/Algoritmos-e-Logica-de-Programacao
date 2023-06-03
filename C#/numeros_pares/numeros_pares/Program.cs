namespace numeros_pares {
    internal class Program {
        static void Main(string[] args) {
            int n, contPares;

            Console.Write("Quantos numeros voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            int[] vet = new int[n];

            for (int i = 0; i < n; i++) {
                Console.Write("Digite um numero: ");
                vet[i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine();
            Console.WriteLine("NUMEROS PARES:");
            contPares = 0;
            for (int i = 0; i < n; i++) {
                if (vet[i] % 2 == 0) {
                    Console.Write(vet[i] + " ");
                    contPares++;
                }
            }

            Console.WriteLine("\n\nQUANTIDADE DE PARES = " + contPares);
        }
    }
}