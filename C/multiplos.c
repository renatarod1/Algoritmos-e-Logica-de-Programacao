#include <stdio.h>

int main()
{
    int num1, num2;

    printf("Digite dois numeros inteiros:\n");
    scanf("%d", &num1);
    scanf("%d", &num2);

    if (num1 % num2 == 0 || num2 % num1 == 0){
        printf("Sao multiplos");
    } else {
        printf("Nao sao multiplos");
    }

    return 0;
}
