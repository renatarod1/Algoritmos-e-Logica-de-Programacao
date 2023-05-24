namespace tempo_de_jogo {
    internal class Program {
        static void Main(string[] args) {
            int hi, hf, duracao;

            Console.Write("Hora inicial: ");
            hi = int.Parse(Console.ReadLine());


            Console.Write("Hora final: ");
            hf = int.Parse(Console.ReadLine());

            if (hi < hf) {
                duracao = hf - hi;
            }
            else {

                duracao = 24 - (hi - hf);
            }

            Console.WriteLine("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}