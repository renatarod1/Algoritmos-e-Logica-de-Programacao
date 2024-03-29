﻿using System.Globalization;

namespace operadora {
    internal class Program {
        static void Main(string[] args) {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int minutos;
            double valor;

            Console.Write("Digite a quantidade de minutos: ");
            minutos = int.Parse(Console.ReadLine());

            valor = 50.0;
            if (minutos > 100) {                
                valor = valor + (minutos - 100) * 2.0;                
            } 

            Console.Write("Valor a pagar: " + valor.ToString("F2", CI));
        }
    }
}