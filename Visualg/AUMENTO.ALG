Algoritmo "Aumento"

Var
 salario, novoSalario, valorAumento : real
 percentual : inteiro
 
Inicio
   escreva("Digite o salario da pessoa: ")
   leia(salario)
   
   se salario < 1000.0 entao
      percentual <- 20
   senao
        se salario <= 3000.0 entao
           percentual <- 15
        senao
           se salario <= 8000.0 entao
              percentual <- 10
           senao
              percentual <- 5
           fimse
        fimse
   fimse
   
   valorAumento <- (salario * percentual) / 100
   novoSalario <- salario + valorAumento

   escreval("Novo salario = R$ ", novoSalario:6:2)
   escreval("Aumento = R$ ", valorAumento:6:2)
   escreva("Porcentagem = ", percentual, " %")
   
Fimalgoritmo