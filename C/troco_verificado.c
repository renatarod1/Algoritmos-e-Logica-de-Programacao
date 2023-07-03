#include <stdio.h>
#include <stdlib.h>

int main()
{
    double preco, dinheiro, troco;
    int qtd;

    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);

    printf("Quantidade comprada: ");
    scanf("%d", &qtd);

    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro);

    troco = dinheiro - (preco * qtd);

    if (troco < 0.0){
        troco = abs(troco);
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS", troco);
    } else {
        printf("TROCO = %.2lf", troco);
    }

    return 0;
}
