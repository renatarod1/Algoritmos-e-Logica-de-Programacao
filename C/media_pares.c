#include <stdio.h>

int main()
{
    int n, soma, qtdPar;
    double media;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &n);

    int vet[n];

    for (int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
    }

    soma = 0;
    qtdPar = 0;
    for (int i = 0; i < n; i++)
    {
        if (vet[i] % 2 == 0)
        {
            soma = soma + vet[i];
            qtdPar++;
        }
    }

    if (qtdPar == 0)
    {
        printf("NENHUM NUMERO PAR\n");
    }
    else
    {
        media = (double)soma / qtdPar;
        printf("MEDIA DOS PARES = %.1lf\n", media);
    }

    return 0;
}
