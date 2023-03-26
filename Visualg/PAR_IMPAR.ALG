Algoritmo "par_impar"

Var
   N, num, i : inteiro
   
Inicio
   escreva("Quantos numeros voce vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Digite um numero: ")
      leia(num)

      se num = 0 entao
         escreval("NULO")
      senao
         se num > 0 entao
            se num % 2 = 0 entao
               escreval("PAR POSITIVO")
            senao
               escreval("IMPAR POSITIVO")
            fimse
         senao
            se num % 2 = 0 entao
               escreval("PAR NEGATIVO")
            senao
               escreval("IMPAR NEGATIVO")
            fimse
         fimse
      fimse
   fimpara
   
Fimalgoritmo