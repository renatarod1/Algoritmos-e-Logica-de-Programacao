Algoritmo "media_idades"

Var
    idade, soma, contador : inteiro
    media : real

Inicio
    soma <- 0
    contador <- 0
    
    escreval("Digite as idades:")
    leia(idade)
    
    se idade < 0 entao
       escreva("IMPOSSIVEL CALCULAR")
    senao
       enquanto idade > 0 faca
           contador <- contador + 1
           soma <- soma + idade
           leia(idade)
       fimenquanto

       media <- soma / contador
       escreva("MEDIA = ", media:4:2)
    fimse
    
Fimalgoritmo