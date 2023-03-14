Algoritmo "temperatura"

Var
 temp, res: real
 opc : caractere
 
Inicio
      escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
      leia(opc)

      escolha opc
      caso "C"
           escreva("Digite a temperatura em Celsius: ")
           leia(temp)
           res <- 9 * temp / 5 + 32
           escreva("Temperatura equivalente em Fahrenheit: ", res:4:2)
      caso "F"
           escreva("Digite a temperatura em Fahrenheit: ")
           leia(temp)
           res <- 5 / 9 * (temp - 32)
           escreva("Temperatura equivalente em Celsius: ", res:4:2)
      fimescolha

Fimalgoritmo