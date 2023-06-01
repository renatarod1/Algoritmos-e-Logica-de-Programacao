namespace tabuada {
    internal class Program {
        static void Main(string[] args) {
            int n;

            Console.Write("Deseja a tabuada para qual valor? ");
            n = int.Parse(Console.ReadLine());

            for (int i = 1; i <= 10;  i++) {
                Console.WriteLine(n + " X "+ i + " = " + n * i);
            }
        }
    }
}