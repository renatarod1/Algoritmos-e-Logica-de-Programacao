Algoritmo "divisao"

Var
   N, i : inteiro
   num, den, res : real

Inicio

   escreva("Quantos casos voce vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Entre com o numerador: ")
      leia(num)
      escreva("Entre com o denominador: ")
      leia(den)

      se den =  0 entao
         escreval("DIVISAO IMPOSSIVEL")
      senao
         res <- num / den
         escreval("DIVISAO = ", res:4:2)
      fimse
   fimpara

Fimalgoritmo