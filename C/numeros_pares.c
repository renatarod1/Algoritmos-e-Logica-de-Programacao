#include <stdio.h>

int main()
{
    int n, qtdPares;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    int numeros[n];

    for(int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%d", &numeros[i]);
    }
    printf("\nNUMEROS PARES:\n");
    qtdPares = 0;
    for(int i = 0; i < n; i++)
    {
        if (numeros[i] % 2 == 0)
        {
            printf("%d ", numeros[i]);
            qtdPares++;
        }
    }
    printf("\n\nQUANTIDADE DE PARES = %d", qtdPares);

    return 0;
}
