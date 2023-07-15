#include <stdio.h>

int main()
{
    int x, soma;

    printf("Digite um numero inteiro: ");
    scanf("%d", &x);

    while (x != 0){
      if (x % 2 != 0){
        x = x + 1;
      }

      soma = 0;
      for (int i = 0; i < 5; i++){
        soma = soma + x;
        x = x + 2;
      }
      //Ou substituindo o for: soma = 5 * x + 20;

      printf("SOMA = %d\n", soma);

      printf("Digite um numero inteiro: ");
      scanf("%d", &x);
    }

    return 0;
}
