somaAltura: float; qtdMenores: int; percentMenores: float
n = int(input("Quantas pessoas serao digitadas? "))

nome = [0 for x in range(n)]
idade = [0 for x in range(n)]
altura = [0 for x in range(n)]

for i in range(0, n):
    print(f"Dados da {i + 1}a pessoa:")
    nome[i] = str(input("Nome: "))
    idade[i] = int(input("Idade: "))
    altura[i] = float(input("Altura: "))

somaAltura = 0
qtdMenores = 0
for i in range(0, n):
    somaAltura = somaAltura + altura[i]

alturaMedia = somaAltura / n

for i in range(0, n):
    if idade[i] < 16:
        qtdMenores = qtdMenores + 1

percentMenores = qtdMenores * 100 / n

print()
print(f"Altura média: {alturaMedia:.2f}")
print(f"Pessoas com menos de 16 anos: {percentMenores:.1f}%")
for i in range(0, n):
    if idade[i] < 16:
        print(nome[i])