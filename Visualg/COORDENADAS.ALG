Algoritmo "Coordenadas"

Var
   x, y : real

Inicio
   escreva("Valor de X: ")
   leia(x)
   escreva("Valor de Y: ")
   leia(y)
   
   se (x > 0) e (y < 0) entao
      escreva("Q4")
   senao
      se (x > 0) e (y > 0) entao
         escreva("Q1")
      senao
         se (y > 0) e (x < 0) entao
            escreva("Q2")
         senao
            se (y < 0) e (x < 0) entao
               escreva("Q3")
            senao
               se (x = 0) e (y = 0) entao
                  escreva("Origem")
               senao
                  se y = 0 entao
                     escreva("EIXO X")
                  senao
                     escreva("EIXO Y")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo