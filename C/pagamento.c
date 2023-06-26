#include <stdio.h>
#include <string.h>

int main()
{
    char nome[50];
    double vlHora, pagamento;
    int qtdHorasTrab;

    printf("Nome: ");
    gets(nome);

    printf("Valor por hora: ");
    scanf("%lf", &vlHora);

    printf("Horas trabalhadas: ");
    scanf("%d", &qtdHorasTrab);

    pagamento = qtdHorasTrab * vlHora;

    printf("O pagamento para %s deve ser %.2lf", nome, pagamento);

    return 0;
}
