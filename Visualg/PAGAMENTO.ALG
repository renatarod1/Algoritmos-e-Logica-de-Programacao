Algoritmo "Pagamento"

Var
   nome : caractere
   qtdHorasTrab : inteiro
   valorHora, pagamento : real
   
Inicio
      escreva("Nome: ")
      leia(nome)
      escreva("Valor por hora: ")
      leia(valorHora)
      escreva("Horas trabalhadas: ")
      leia(qtdHorasTrab)
      pagamento <- valorHora * qtdHorasTrab
      escreva("O pagamento para ", nome, " deve ser ", pagamento:8:2)
      
Fimalgoritmo