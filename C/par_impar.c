#include <stdio.h>

int main()
{
    int n, num;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        printf("Digite um numero: ");
        scanf("%d", &num);

        if (num == 0)
        {
            printf("NULO\n");
        }
        else
        {
            if (num % 2 == 0)
            {
                printf("PAR ");
            }
            else
            {
                printf("IMPAR ");
            }

            if (num > 0)
            {
                printf("POSITIVO\n");
            }
            else
            {
                printf("NEGATIVO\n");
            }
        }
    }

    return 0;
}
