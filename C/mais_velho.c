#include <stdio.h>

int main()
{
    int n, maisVelho, posMaisVelho;

    printf("Quantas pessoas voce vai digitar? ");
    scanf("%d", &n);

    char nomes[n][50];
    int idades[n];

    for (int i = 0; i < n; i++)
    {
        printf("Dados da %da pessoa: ", i + 1);
        printf("\nNome: ");
        scanf("%s", nomes[i]);
        printf("Idade: ");
        scanf("%d", &idades[i]);
    }

    maisVelho = idades[0];
    posMaisVelho = 0;
    for (int i = 0; i < n; i++)
    {
        if (idades[i] > maisVelho)
        {
            maisVelho = idades[i];
            posMaisVelho = i;
        }
    }

    printf("PESSOA MAIS VELHA: %s", nomes[posMaisVelho]);
    return 0;
}
