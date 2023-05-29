namespace combustivel {
    internal class Program {
        static void Main(string[] args) {
            int cod, qtdAlcool, qtdGasolina, qtdDiesel;

            Console.Write("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            cod = int.Parse(Console.ReadLine());

            qtdAlcool = 0;
            qtdGasolina = 0;
            qtdDiesel = 0;

            while (cod != 4) {
                switch (cod) {
                    case 1:
                        qtdAlcool++;
                        break;
                    case 2:
                        qtdGasolina++;
                        break;

                    case 3:
                        qtdDiesel++;
                        break;
                }
                Console.Write("Informe um codigo (1, 2, 3) ou 4 para parar: ");
                cod = int.Parse(Console.ReadLine());
            }

            Console.WriteLine("MUITO OBRIGADO");
            Console.WriteLine("Alcool: " + qtdAlcool);
            Console.WriteLine("Gasolina: " + qtdGasolina);
            Console.WriteLine("Diesel: " + qtdDiesel);
        }
    }
}