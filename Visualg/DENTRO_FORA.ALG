Algoritmo "dentro_fora"

Var
 qtdN, n,  i, d, f : inteiro

Inicio
   d <- 0
   f <- 0
   
   escreva("Quantos numeros voce vai digitar? ")
   leia(qtdN)
   
   para i de 1 ate qtdN faca
      escreva("Digite um numero: ")
      leia(n)
      se (n >= 10) e (n <= 20) entao
         d <- d + 1
      senao
         f <- f + 1
      fimse
   fimpara

   escreval(d, " DENTRO")
   escreva(f, " FORA")
   
Fimalgoritmo