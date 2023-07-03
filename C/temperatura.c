#include <stdio.h>
#include <stdlib.h>

int main()
{
    char opc;
    double f, c;

    printf("Voce vai digitar a temperatura em qual escala (C/F)? ");
    scanf("%c", &opc);

    if (opc == 'F'){
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &f);

        c = 5.0 / 9.0 * (f - 32.0);
        printf("Temperatura equivalente em Celsius: %.2lf", c);
    } else {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &c);

        f = 9.0 * c / 5.0 + 32.0;
        printf("Temperatura equivalente em Fahrenheit: %.2lf", f);
    }

    return 0;
}
