Algoritmo "TROCO"

Var
  precoUnitario, valorRecebido, troco : real
  quantidade : inteiro
  
Inicio
     escreva("Pre�o unit�rio do produto: ")
     leia(precoUnitario)
     escreva("Quantidade comprada: ")
     leia(quantidade)
     escreva("Dinheiro recebido: ")
     leia(valorRecebido)
     troco <- valorRecebido - (quantidade * precoUnitario)
     escreva("TROCO = ", troco:8:2)

Fimalgoritmo