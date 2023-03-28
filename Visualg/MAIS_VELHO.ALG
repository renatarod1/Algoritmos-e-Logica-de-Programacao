Algoritmo "mais_velho"

Var
   N, i, posMaisVelho, maisVelho : inteiro
   pessoas : vetor [0..99] de caractere
   idades : vetor [0..99] de inteiro

Inicio

   maisVelho <- idades[0]
   posMaisVelho <- 0

   escreva("Quantas pessoas voce vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Dados da", i+1, "a pessoa:")
      escreva("Nome: ")
      leia(pessoas[i])
      escreva("Idade: ")
      leia(idades[i])
   fimpara

   para i de 1 ate N-1 faca
      se idades[i] > maisVelho entao
         maisVelho <- idades[i]
         posMaisVelho <- i
      fimse
   fimpara

   escreva("PESSOA MAIS VELHA: ", pessoas[posMaisVelho])

Fimalgoritmo