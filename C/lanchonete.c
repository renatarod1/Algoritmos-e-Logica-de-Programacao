#include <stdio.h>

int main()
{
    int cod, qtd;
    double valor;

    printf("Codigo do produto comprado: ");
    scanf("%d", &cod);
    printf("Quantidade comprada: ");
    scanf("%d", &qtd);

    switch (cod){
    case 1:
        valor = qtd * 5.0;
        break;

    case 2:
        valor = qtd * 3.5;
        break;

    case 3:
        valor = qtd * 4.8;
        break;

    case 4:
        valor = qtd * 8.9;
        break;

    case 5:
        valor = qtd * 7.32;
        break;
    }

    printf("Valor a pagar: R$ %.2lf", valor);
    return 0;
}
