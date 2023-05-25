using System.Globalization;

namespace media_idades {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;
            int idade, soma, cont;
            double media;

            Console.WriteLine("Digite as idades:");
            idade = int.Parse(Console.ReadLine());

            soma = 0;
            cont = 0;

            if (idade < 0) {
                Console.WriteLine("IMPOSSIVEL CALCULAR");
            }
            else {                
                while (idade >= 0) {
                    soma = soma + idade;
                    cont++;
                    idade = int.Parse(Console.ReadLine());
                }

                media = (double)soma / cont;

                Console.WriteLine("MEDIA = " + media.ToString("F2", CI));
            }
        }
    }
}