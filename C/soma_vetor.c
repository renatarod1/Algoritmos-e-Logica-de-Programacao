#include <stdio.h>

int main()
{
    int n;
    double soma, media;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    double vet[n];

    for (int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }
    printf("\nVALORES = ");

    for (int i = 0; i < n; i++)
    {
        printf("%.1lf ", vet[i]);
    }
    printf("\n");

    soma = 0;
    for (int i = 0; i < n; i++)
    {
        soma = soma + vet[i];
    }
    printf("SOMA = %.2lf\n", soma);

    media = soma / n;
    printf("MEDIA = %.2lf", media);

    return 0;
}
