Algoritmo "Medidas"

Var
   A, B, C, areaQuadrado, areaTriangulo, areaTrapezio : real

Inicio
   escreva("Digite a medida A: ")
   leia(A)
   escreva("Digite a medida B: ")
   leia(B)
   escreva("Digite a medida C: ")
   leia(C)
   areaQuadrado <- A * A
   areaTriangulo <- (A * B) / 2
   areaTrapezio <- ((A + B)* C) / 2
   escreval("AREA DO QUADRADO = ", areaQuadrado:8:4)
   escreval("AREA DO TRIANGULO = ", areaTriangulo:8:4)
   escreva("AREA DO TRAPEZIO = ", areaTrapezio:8:4)
   
Fimalgoritmo