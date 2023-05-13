namespace soma {
    class Program {
        static void Main(string[] args) {
            int X, Y, soma;

            Console.Write("Digite o valor de X: ");
            X = int.Parse(Console.ReadLine());

            Console.Write("Digite o valor de Y: ");
            Y = int.Parse(Console.ReadLine());

            soma = X + Y;
            Console.WriteLine("SOMA = " + soma);
        }
    }
}