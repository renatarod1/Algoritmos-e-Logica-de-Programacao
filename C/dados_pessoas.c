#include <stdio.h>

int main()
{
    int n, qtdMulheres;
    double menorAltura, maiorAltura, somaAlturas, mediaAlturas;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &n);

    double alturas[n];
    char generos[n];

    for(int i = 0; i < n; i++){
        printf("Altura da %da pessoa: ", i + 1);
        scanf("%lf", &alturas[i]);
        printf("Genero da %da pessoa: ", i + 1);
        scanf("%s", &generos[i]);
    }

    menorAltura = alturas[0];
    for(int i = 0; i < n; i++){
        if (alturas[i] < menorAltura){
            menorAltura = alturas[i];
        }
    }

    maiorAltura = alturas[0];
    for(int i = 0; i < n; i++){
        if (alturas[i] > maiorAltura){
            maiorAltura = alturas[i];
        }
    }

    somaAlturas = 0;
    qtdMulheres = 0;
    for(int i = 0; i < n; i++){
        if (generos[i] == 'F'){
            qtdMulheres++;
            somaAlturas = somaAlturas + alturas[i];
        }
    }
    mediaAlturas = somaAlturas / (double)qtdMulheres;

    printf("Menor altura = %.2lf\n", menorAltura);
    printf("Maior altura = %.2lf\n", maiorAltura);
    printf("Media das alturas das mulheres = %.2lf\n", mediaAlturas);
    printf("Numero de homens = %d\n", n - qtdMulheres);

    return 0;
}
