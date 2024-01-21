soma: float; media: float
qtd_pares: int
n = int(input("Quantos elementos vai ter o vetor? "))
vet = [0 for x in range(n)]

for i in range(0, n):
    vet[i] = int(input("Digite um numero: "))

soma = 0
qtd_pares = 0
for i in range(0, n):
    if vet[i] % 2 == 0:
        soma = soma + vet[i]
        qtd_pares = qtd_pares + 1

if qtd_pares == 0:
    print("NENHUM NUMERO PAR")
else:
    media = soma / qtd_pares
    print(f"MEDIA DOS PARES = {media:.1f}")


