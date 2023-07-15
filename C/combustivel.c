#include <stdio.h>

int main()
{
    int cod, a, g, d;

    printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
    scanf("%d", &cod);

    a = 0;
    g = 0;
    d = 0;

    while (cod != 4)
    {
        switch (cod)
        {
        case 1:
            a++;
            break;

        case 2:
            g++;
            break;

        case 3:
            d++;
            break;
        }

        printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        scanf("%d", &cod);
    }

    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", a);
    printf("Gasolina: %d\n", g);
    printf("Diesel: %d\n", d);

    return 0;
}
