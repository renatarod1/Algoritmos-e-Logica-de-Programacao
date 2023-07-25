#include <stdio.h>

int main()
{
    int n, qtd, total, totalC, totalR, totalS;
    double percentC, percentR, percentS;
    char tipo;

    printf("Quantos casos de teste serao digitados? ");
    scanf("%d", &n);

    totalC = 0;
    totalR = 0;
    totalS = 0;
    for (int i = 0; i < n; i++)
    {
        printf("Quantidade de cobaias: ");
        scanf("%d", &qtd);

        printf("Tipo de cobaia: ");
        fseek(stdin,0,SEEK_END);
        scanf("%c", &tipo);

        switch (tipo)
        {
        case 'C':
            totalC = totalC + qtd;
            break;

        case 'R':
            totalR = totalR + qtd;
            break;

        case 'S':
            totalS = totalS + qtd;
            break;
        }
    }

    total = totalC + totalR + totalS;
    percentC = (double)totalC * 100 / total;
    percentR = (double)totalR * 100 / total;
    percentS = (double)totalS * 100 / total;
    printf("\n");
    printf("RELATORIO FINAL:\n");
    printf("Total: %d cobaias\n", total);
    printf("Total de coelhos: %d\n", totalC);
    printf("Total de ratos: %d\n", totalR);
    printf("Total de sapos: %d\n", totalS);
    printf("Percentual de coelhos: %.2lf\n", percentC);
    printf("Percentual de ratos: %.2lf\n", percentR);
    printf("Percentual de sapos: %.2lf", percentS);

    return 0;
}
