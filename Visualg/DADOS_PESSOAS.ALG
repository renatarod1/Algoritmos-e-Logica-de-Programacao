Algoritmo "dados_pessoas"

Var
   N, i, contHomens : inteiro
   maiorAltura, menorAltura, mediaAltura, somaAltura : real
   alturas : vetor [0..9] de real
   generos : vetor [0..9] de caractere

Inicio
   escreva("Quantas pessoas serao digitadas? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Altura da", i+1,"a pessoa: ")
      leia(alturas[i])
      escreva("Genero da", i+1,"a pessoa: ")
      leia(generos[i])
   fimpara

   menorAltura <- alturas[0]
   maiorAltura <- alturas[0]
   para i de 0 ate N-1 faca
      se alturas[i] < menorAltura entao
         menorAltura <- alturas[i]
      fimse
      se alturas[i] > maiorAltura entao
         maiorAltura <- alturas[i]
      fimse
   fimpara
   escreval("Menor altura = ", menorAltura:2:2)
   escreval("Maior altura = ", maiorAltura:2:2)

   somaAltura <- 0
   contHomens <- 0
   para i de 0 ate N-1 faca
      se generos[i] = "F" entao
         somaAltura <- somaAltura + alturas[i]
      senao
         contHomens <- contHomens + 1
      fimse
   fimpara

   se (N - contHomens) = 0 entao
      escreval("Impossivel calcular a altura media das mulheres")
   senao
      mediaAltura <- somaAltura / (N - contHomens)
      escreval("Media das alturas das mulheres = ", mediaAltura:2:2)
   fimse
   
   escreva("Numero de homens = ", contHomens)

Fimalgoritmo