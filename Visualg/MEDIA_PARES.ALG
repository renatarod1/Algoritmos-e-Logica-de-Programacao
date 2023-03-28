Algoritmo "media_pares"

Var
   N, i, qtdPar, soma : inteiro
   vet : vetor [0..99] de inteiro
   media : real

Inicio
   soma <- 0
   qtdPar <- 0

   escreva("Quantos elementos vai ter o vetor? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
   fimpara

   para i de 0 ate N-1 faca
      se vet[i] % 2 = 0 entao
         soma <- soma + vet[i]
         qtdPar <- qtdPar + 1
      fimse
   fimpara

   se qtdPar = 0 entao
      escreva("NENHUM NUMERO PAR")
   senao
      media <- soma / qtdPar
      escreval
      escreval("MEDIA DOS PARES = ", media:3:1)
   fimse

Fimalgoritmo