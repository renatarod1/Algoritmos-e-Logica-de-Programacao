Algoritmo "Operadora"

Var
   minutos: inteiro
   valorTotal : real
   
Inicio
      escreva("Digite a quantidade de minutos: ")
      leia(minutos)
      
      valorTotal <- 50.0
      se minutos > 100 entao
           valorTotal <- valorTotal + 2 * (minutos - 100)
      fimse
      
      escreva("Valor a pagar: R$ ", valorTotal:4:2)

Fimalgoritmo
