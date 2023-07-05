#include <stdio.h>

int main()
{
    int hi, hf, duracao;

    printf("Hora inicial: ");
    scanf("%d", &hi);


    printf("Hora final: ");
    scanf("%d", &hf);

    if (hi < hf){
        duracao = hf - hi;
    } else {
        duracao = 24 - (hf - hi);
    }

    printf("O JOGO DUROU %d HORA%(S%)", duracao);

    return 0;
}
