#include <stdio.h>

int main()
{
    int n, posMaiorVl;
    double maiorVl;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    double vet[n];

    for (int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }

    maiorVl = vet[0];
    posMaiorVl = 0;
    for (int i = 0; i < n; i++)
    {
        if (vet[i] > maiorVl)
        {
            maiorVl = vet[i];
            posMaiorVl = i;
        }
    }

    printf("\nMAIOR VALOR = %.1lf\n", maiorVl);
    printf("POSICAO DO MAIOR VALOR = %d\n", posMaiorVl);
    return 0;
}
