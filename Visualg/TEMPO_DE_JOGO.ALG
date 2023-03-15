Algoritmo "tempo_de_jogo"

Var
  hInicial, hFinal, duracao : inteiro

Inicio

   escreva("Hora inicial: ")
   leia(hInicial)
   escreva("Hora final: ")
   leia(hFinal)

   se (hInicial >= hFinal) entao
      duracao <- (24 - hInicial) + hFinal
   senao
      duracao <- hFinal - hInicial
   fimse

   escreva("O JOGO DUROU ",duracao,  " HORA(S)")

Fimalgoritmo