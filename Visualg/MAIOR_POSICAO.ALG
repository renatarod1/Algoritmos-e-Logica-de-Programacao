Algoritmo "maior_posicao"

Var
   N, i, maiorPos  : inteiro
   maiorNum : real
   vet: vetor [0..99] de real

Inicio
   escreva("Quanto numeros voce vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
   fimpara

   maiorNum <- vet[0]
   maiorPos <- 0

   para i de 1 ate N-1 faca
      se vet[i] > maiorNUm entao
         maiorNum <- vet[i]
         maiorPos <- i
      fimse
   fimpara

   escreval
   escreval("MAIOR VALOR = ", maiorNum:3:1)
   escreva("POSICAO DO MAIOR VALOR = ", maiorPos)

Fimalgoritmo