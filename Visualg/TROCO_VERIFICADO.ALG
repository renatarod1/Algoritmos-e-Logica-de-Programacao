Algoritmo "Troco_Verificado"

Var
   precoProduto, valorRecebido, troco : real
   qtdProduto : inteiro
   
Inicio
      escreva("Preço unitário do produto: ")
      leia(precoProduto)
      escreva("Quantidade comprada: ")
      leia(qtdProduto)
      escreva("Dinheiro recebido: ")
      leia(valorRecebido)
      
      troco <- valorRecebido - (precoProduto * qtdProduto)
      
      se (troco < 0) entao
         escreva("DINHEIRO INSUFICIENTE. FALTAM ", Abs(troco):6:2, " REAIS")
      senao
         escreva("TROCO = ", troco:6:2)
      fimse
      
Fimalgoritmo