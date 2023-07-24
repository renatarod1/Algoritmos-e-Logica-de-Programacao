#include <stdio.h>

int main()
{
    int n, num, in, out;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    in = 0;
    out = 0;
    for (int i = 1; i <= n; i++)
    {
        printf("Digite um numero: ");
        scanf("%d", &num);
        if (num >= 10 && num <= 20)
        {
            in++;
        }
        else
        {
            out++;
        }
    }
    printf("%d DENTRO\n", in);
    printf("%d FORA", out);
    return 0;
}
