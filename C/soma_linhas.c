#include <stdio.h>

int main()
{
    int m, n;
    double soma;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &m);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &n);

    double mat[m][n];
    double vet[m];

    for(int i = 0; i < m; i++)
    {
        printf("Digite os elementos da %da. linha:\n", i+1);
        for(int j = 0; j < n; j++)
        {
            scanf("%lf", &mat[i][j]);
        }
    }

    for(int i = 0; i < m; i++)
    {
        soma = 0;
        for(int j = 0; j < n; j++)
        {
            soma = soma + mat[i][j];
        }
        vet[i] = soma;
    }

    printf("VETOR GERADO:\n");
    for (int i = 0; i < m; i++)
    {
        printf("%.1lf\n", vet[i]);
    }
    return 0;
}
