Algoritmo "combustivel"
Var
   cod, a, g, d : inteiro


Inicio
   a <- 0
   g <- 0
   d <- 0

   escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
   leia(cod)

   enquanto cod <> 4 faca

      escolha cod
      caso 1
         a <- a + 1
      caso 2
         g <- g + 1
      caso 3
         d <- d + 1
      fimescolha

      escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
      leia(cod)
   fimenquanto

   escreval("MUITO OBRIGADO")
   escreval("Alcool: ", a)
   escreval("Gasolina: ", g)
   escreval("Diesel: ", d)

Fimalgoritmo