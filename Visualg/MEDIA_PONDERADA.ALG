Algoritmo "media_ponderada"

Var
 N, i : inteiro
 v1, v2, v3, media : real

Inicio
   escreva("Quantos casos voce vai digitar? ")
   leia(N)
   
   para i de 1 ate N faca
      escreval("Digite tres numeros:")
      leia(v1)
      leia(v2)
      leia(v3)
      media <- (2 * v1 + 3 * v2 + 5 * v3) / 10
      escreval("MEDIA = ", media:3:1)
   fimpara
   
Fimalgoritmo