Algoritmo "fatorial"

Var
   n, i, res : inteiro

Inicio

   res <- 1
   escreva("Digite o valor de N: ")
   leia(n)

   para i de 1 ate n faca
      res <- res  * i
   fimpara

   escreva("FATORIAL = ", res)

Fimalgoritmo