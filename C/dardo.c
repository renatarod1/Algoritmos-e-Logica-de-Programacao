#include <stdio.h>

int main()
{
    double dist1, dist2, dist3, maior;

    printf("Digite as tres distancias:\n");
    scanf("%lf", &dist1);
    scanf("%lf", &dist2);
    scanf("%lf", &dist3);

    if (dist1 > dist2 && dist1 > dist3){
        maior = dist1;
    } else if (dist2 > dist3){
        maior = dist2;
    } else {
        maior = dist3;
    }

    printf("MAIOR DISTANCIA = %.2lf", maior);
    return 0;
}
