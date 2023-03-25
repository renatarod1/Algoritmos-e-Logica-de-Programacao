Algoritmo "pares_consecutivos"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
   n, soma : inteiro

Inicio
   escreva("Digite um numero inteiro: ")
   leia(n)

   enquanto n <> 0 faca
      se n % 2 <> 0 entao
         n <- n + 1
      fimse

      soma <- 5 * n + 20
      escreval("SOMA = ", soma)

      escreva("Digite um numero inteiro: ")
      leia(n)
   fimenquanto

Fimalgoritmo