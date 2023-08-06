#include <stdio.h>

int main()
{
    int n, abaixo, entre, acima;
    double lucro, porcentagem, vlTotalCompra, vlTotalVenda;

    printf("Serao digitados dados de quantos produtos? ");
    scanf("%d", &n);

    char produtos[n][30];
    double precosCompra[n];
    double precosVenda[n];

    for(int i = 0; i < n; i++)
    {
        printf("Produto %d:\n", i+1);
        printf("Nome: ");
        fseek(stdin, 0, SEEK_END);
        gets(produtos[i]);
        printf("Preco de compra: ");
        scanf("%lf", &precosCompra[i]);
        printf("Preco de venda: ");
        scanf("%lf", &precosVenda[i]);
    }
    printf("\nRELATORIO:\n");

    abaixo = 0;
    entre = 0;
    acima = 0;
    for (int i = 0; i < n; i++)
    {
        lucro = precosVenda[i] - precosCompra[i];
        porcentagem = lucro * 100 / precosCompra[i];
        if (porcentagem < 10)
        {
            abaixo++;
        }
        else if (porcentagem >= 10 && porcentagem <= 20)
        {
            entre++;
        }
        else
        {
            acima++;
        }
    }
    printf("Lucro abaixo de 10%%: %d\n", abaixo);
    printf("Lucro entre 10%% e 20%%: %d\n", entre);
    printf("Lucro acima de 20%%: %d\n", acima);

    vlTotalCompra = 0;
    vlTotalVenda = 0;
    for (int i = 0; i < n; i++)
    {
        vlTotalCompra = vlTotalCompra + precosCompra[i];
        vlTotalVenda = vlTotalVenda + precosVenda[i];
    }
    printf("Valor total de compra: %.2lf\n", vlTotalCompra);
    printf("Valor total de venda: %.2lf\n", vlTotalVenda);
    printf("Lucro total: %.2lf\n", vlTotalVenda - vlTotalCompra);

    return 0;
}
