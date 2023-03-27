Algoritmo "soma_vetor"

Var
   i, N : inteiro
   vet : vetor [0..9] de real
   soma, media : real
   
Inicio
   escreva("Quantos numeros voce vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
   fimpara
   
   escreval
   escreva("VALORES = ")
   para i de 0 ate N-1 faca
      escreva(vet[i]:3:1 ," ")
      soma <- soma + vet[i]
   fimpara

   escreval
   escreval("SOMA = ", soma:4:2)
   media <- soma / N
   escreva("MEDIA = ", media:4:2)
   
Fimalgoritmo