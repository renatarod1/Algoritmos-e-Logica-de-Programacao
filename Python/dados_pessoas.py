menor_altura: float; maior_altura: float; soma_alt_m: float
qtd_mulheres: int

n = int(input("Quantas pessoas serao digitadas? "))
alturas = [0 for x in range(n)]
generos = [0 for x in range(n)]

for i in range(0, n):
    alturas[i] = float(input(f"Altura da {i + 1}a pessoa: "))
    generos[i] = str(input(f"Genero da {i + 1}a pessoa: "))

menor_altura = alturas[0]
maior_altura = alturas[0]
for i in range(0, n):
    if alturas[i] < menor_altura:
        menor_altura = alturas[i]
    if alturas[i] > maior_altura:
        maior_altura = alturas[i]

print(f"Menor altura = {menor_altura:.2f}")
print(f"Maior altura = {maior_altura:.2f}")

soma_alt_m = 0
qtd_mulheres = 0
for i in range(0, n):
    if generos[i] == 'F':
        qtd_mulheres = qtd_mulheres + 1
        soma_alt_m = soma_alt_m + alturas[i]

if qtd_mulheres == 0:
    print("Impossivel calcular a altura media das mulheres")
else:
    media_alt_m = soma_alt_m / qtd_mulheres
    print(f"Media das alturas das mulheres = {media_alt_m:.2f}")

print(f"Numeros de homens = {n - qtd_mulheres}")