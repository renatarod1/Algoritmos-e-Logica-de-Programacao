namespace menor_de_tres {
    internal class Program {
        static void Main(string[] args) {
            int primeiroVl, segundoVl, terceiroVl, menor;

            Console.Write("Primeiro valor: ");
            primeiroVl = int.Parse(Console.ReadLine());

            Console.Write("Segundo valor: ");
            segundoVl = int.Parse(Console.ReadLine());

            Console.Write("Terceiro valor: ");
            terceiroVl = int.Parse(Console.ReadLine());

            if (primeiroVl < segundoVl && primeiroVl < terceiroVl) {
                Console.WriteLine("MENOR = " + primeiroVl);
            }
            else if (segundoVl < terceiroVl) {
                Console.WriteLine("MENOR = " + segundoVl);
            }
            else {
                Console.WriteLine("MENOR = " + terceiroVl);
            }
        }
    }
}