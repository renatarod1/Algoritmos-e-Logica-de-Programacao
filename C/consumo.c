#include <stdio.h>

int main()
{
    int distancia;
    double combustivel, consumoMedio;

    printf("Distancia percorrida: ");
    scanf("%d", &distancia);

    printf("Combustivel gasto: ");
    scanf("%lf", &combustivel);

    consumoMedio = distancia / combustivel;

    printf("Consumo medio: %.3lf", consumoMedio);
    return 0;
}
