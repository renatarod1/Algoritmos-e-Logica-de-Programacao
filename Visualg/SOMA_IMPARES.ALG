Algoritmo "soma_impares"

Var
  X, Y, i, soma, mudar : inteiro

Inicio
   soma <- 0

   escreval("Digite dois numeros:")
   leia(X)
   leia(Y)

   se X > Y entao
      mudar <- x
      x <- y
      y <- mudar
   fimse


   para i de x+1 ate y-1 faca
      se i % 2 <> 0 entao
         soma <- soma + i
      fimse
   fimpara

   escreval("SOMA DOS IMPARES = ", soma)
Fimalgoritmo