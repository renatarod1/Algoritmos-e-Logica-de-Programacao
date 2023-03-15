Algoritmo "Lanchonete"

Var
 cod, qtd : inteiro
 valor :real
 
Inicio
   escreva("Codigo do produto comprado: ")
   leia(cod)
   escreva("Quantidade comprada: ")
   leia(qtd)
   
   escolha cod
   caso 1
        valor <- 5.0 * qtd
   caso 2
        valor <- 3.5 * qtd
   caso 3
        valor <- 4.8 * qtd
   caso 4
        valor <- 8.9 * qtd
   caso 5
        valor <- 7.32 * qtd
   fimescolha
   
   escreva("Valor a pagar: R$", valor:4:2)

Fimalgoritmo