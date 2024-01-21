media: float
n = int(input("Quantos alunos serao digitados? "))

alunos = [0 for x in range(n)]
notas_1sem = [0 for x in range(n)]
notas_2sem = [0 for x in range(n)]

for i in range(0, n):
    print(f"Digite nome, primeira e segunda nota do {i + 1}o aluno:")
    alunos[i] = str(input())
    notas_1sem[i] = float(input())
    notas_2sem[i] = float(input())

print("Alunos aprovados:")
soma_notas = 0
for i in range(0, n):
    media = (notas_1sem[i] + notas_2sem[i]) / 2.0
    if media >= 6.0:
        print(alunos[i])