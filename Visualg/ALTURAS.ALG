Algoritmo "alturas"

Var
   N, i, somaMenor : inteiro
   soma, media,  percentual : real
   nomes : vetor [0..9] de caractere
   idades : vetor [0..9] de inteiro
   alturas : vetor [0..9] de real

Inicio
   escreva("Quantas pessoas serao digitadas? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Dados da", i+1 ,"a pessoa: ")
      escreva("Nome: ")
      leia(nomes[i])
      escreva("Idade: ")
      leia(idades[i])
      escreva("Altura: ")
      leia(alturas[i])
   fimpara

   soma <- 0.0
   media <- 0.0
   para i de 0 ate N-1 faca
      soma <- soma + alturas[i]
   fimpara

   media <- soma / N
   escreval
   escreval("Altura média: ", media:4:2)

   somaMenor <- 0
   para i de 0 ate N-1 faca
      se idades[i] < 16 entao
         somaMenor <- somaMenor + 1
      fimse
   fimpara

   percentual <- somaMenor * 100 / N

   escreval("Pessoas com menos de 16 anos: ", percentual: 3:1, "%")

   para i de 0 ate N-1 faca
      se idades[i] < 16 entao
         escreval(nomes[i])
      fimse
   fimpara

Fimalgoritmo