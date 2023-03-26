Algoritmo "experiencias"

Var
   N, qtd, i, c, r, s, total : inteiro
   pC, pR, pS : real
   opc : caractere

Inicio
   escreva("Quantos casos de teste serao digitados? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Quantidade de cobaias: ")
      leia(qtd)
      escreva("Tipo de cobaia: ")
      leia(opc)

      escolha opc
      caso "C"
         c <- c + qtd
      caso "R"
         r <- r + qtd
      caso "S"
         s <- s + qtd
      fimescolha
   fimpara

   total <- c + r + s
   pC <- c * 100 / total
   pR <- r * 100 / total
   pS <- s * 100 / total

   escreval
   escreval("RELATORIO FINAL:")
   escreval("Total: ", total, " cobaias")
   escreval("Total de coelhos: ", c)
   escreval("Total de ratos: ", r)
   escreval("Total de sapos: ", s)
   escreval("Percentual de coelhos: ", pC:4:2)
   escreval("Percentual de ratos: ", pR:4:2)
   escreval("Percentual de sapos: ", pS:4:2)

Fimalgoritmo