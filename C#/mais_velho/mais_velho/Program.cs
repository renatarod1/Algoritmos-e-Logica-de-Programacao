namespace mais_velho {
    internal class Program {
        static void Main(string[] args) {
            int n, idadePessoaMaisVelha, posPessoaMaisVelha;

            Console.Write("Quantas pessoas voce vai digitar? ");
            n = int.Parse(Console.ReadLine());

            string[] nomes = new string[n];
            int[] idades = new int[n];

            for (int i = 0; i < n; i++) {
                Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
                Console.Write("Nome: ");
                nomes[i] = Console.ReadLine();
                Console.Write("Idade: ");
                idades[i] = int.Parse(Console.ReadLine());
            }

            idadePessoaMaisVelha = idades[0];
            posPessoaMaisVelha = 0;
            for (int i = 0; i < n; i++) {
                if (idades[i] > idadePessoaMaisVelha) {
                    idadePessoaMaisVelha = idades[i];
                    posPessoaMaisVelha = i;
                }
            }

            Console.WriteLine("PESSOA MAIS VELHA: " + nomes[posPessoaMaisVelha]);
        }
    }
}