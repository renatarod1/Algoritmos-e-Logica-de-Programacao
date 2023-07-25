#include <stdio.h>

int main()
{
    int n;
    double vl1, vl2, vl3, media;

    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("Digite tres numeros:\n");
        scanf("%lf %lf %lf", &vl1, &vl2, &vl3);
        media = (vl1 * 2 + vl2 * 3 + vl3 * 5) / 10;
        printf("MEDIA = %.1lf\n", media);
    }

    return 0;
}
