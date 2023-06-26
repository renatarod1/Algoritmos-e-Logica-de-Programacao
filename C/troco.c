#include <stdio.h>

int main()
{
    double preco, vlRecebido, troco;
    int qtd;

    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);

    printf("Quantidade comprada: ");
    scanf("%d", &qtd);

    printf("Dinheiro recebido: ");
    scanf("%lf", &vlRecebido);

    troco = vlRecebido - (preco * qtd);

    printf("TROCO = %.2lf", troco);

    return 0;
}
