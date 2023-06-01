namespace pares_consecutivos {
    internal class Program {
        static void Main(string[] args) {
            int x, somaPares;

            Console.Write("Digite um numero inteiro: ");
            x = int.Parse(Console.ReadLine());

            while (x != 0) {
                somaPares = 0;
                if (x % 2 != 0) {
                    x++;
                }
                for (int i = 0; i < 5; i++) {
                    somaPares = somaPares + x;
                    x = x + 2;
                }
                Console.WriteLine("SOMA = " + somaPares);

                Console.Write("Digite um numero inteiro: ");
                x = int.Parse(Console.ReadLine());
            }
        }
    }
}