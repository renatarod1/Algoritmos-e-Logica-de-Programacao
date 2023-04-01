Algoritmo "comerciante"

Var
   N, i, abaixo, entre, acima : inteiro
   vlTotCompra, vlTotVenda, perctLucro, lucro, lucroTot : real
   nomeProd : vetor [0..99] de caractere
   precoCompra : vetor [0..99] de real
   precoVenda : vetor [0..99] de real

Inicio

   escreva("Serao digitados dados de quantos produtos? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Produto ",i+1,":")
      escreva("Nome: ")
      leia(nomeProd[i])
      escreva("Preco de compra: ")
      leia(precoCompra[i])
      escreva("Preco de venda: ")
      leia(precoVenda[i])
   fimpara

   abaixo <- 0
   entre <- 0
   acima <- 0
   para i de 0 ate N-1 faca
      lucro <- precoVenda[i] - precoCompra[i]
      perctLucro <- (100.0 * lucro) / precoCompra[i]

      se perctLucro < 10 entao
         abaixo <- abaixo + 1
      senao
         se perctLucro <= 20 entao
            entre <- entre + 1
         senao
            acima <- acima + 1
         fimse
      fimse
   fimpara

   vlTotCompra <- 0
   vlTotVenda <- 0
   para i de 0 ate N-1 faca
      vlTotCompra <- vlTotCompra + precoCompra[i]
      vlTotVenda <- vlTotVenda + precoVenda[i]
   fimpara

   lucroTot <- vlTotVenda - vlTotCompra

   escreval
   escreval("RELATORIO:")
   escreval("Lucro abaixo de 10%: ", abaixo)
   escreval("Lucro entre 10% e 20%: ", entre)
   escreval("Lucro acima de 20%: ", acima)
   escreval("Valor total de compra: ", vlTotCompra:3:2)
   escreval("Valor total de venda: ", vlTotVenda:3:2)
   escreval("Lucro total: ", lucroTot:3:2)

Fimalgoritmo