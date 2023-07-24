#include <stdio.h>

int main()
{
    int x, y, troca, somaImpares;

    printf("Digite dois numeros:\n");
    scanf("%d %d", &x, &y);

    if (x > y)
    {
        troca = y;
        y = x;
        x = troca;
    }

    somaImpares = 0;
    for(int i = x + 1; i < y; i++)
    {
        if (i % 2 != 0)
        {
            somaImpares = somaImpares + i;
        }
    }

    printf("SOMA DOS IMPARES = %d", somaImpares);
    return 0;
}
