mais_velha: int; pos: int
n = int(input("Quantas pessoas voce vai digitar? "))
nomes = [0 for x in range(n)]
idades = [0 for x in range(n)]

for i in range (0, n):
    print(f"Dados da {i + 1}a pessoa:")
    nomes[i] = str(input("Nome: "))
    idades[i] = int(input("Idade: "))

mais_velha = idades[0]
for i in range (0, n):
    if idades[i] > mais_velha:
        mais_velha = idades[i]
        pos = i

print(f"PESSOA MAIS VELHA: {nomes[pos]}")