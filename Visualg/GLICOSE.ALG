Algoritmo "Glicose"

Var
   classificacao : real

Inicio
   escreva("Digite a medida da glicose: ")
   leia(classificacao)

   se classificacao <= 100.0 entao
        escreva("Classificacao: normal")
   senao
        se classificacao <= 140.0 entao
           escreva("Classificacao: elevado")
        senao
           escreva("Classificacao: diabetes")
        fimse
   fimse

Fimalgoritmo