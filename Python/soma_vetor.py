n = int(input("Quantos numeros voce vai digitar? "))
vetor = [0 for x in range(n)]

for i in range(0, n):
    vetor[i] = float(input("Digite um numero: "))

print()
print("VALORES = ", end="")
for i in range(0, n):
    print(f"{vetor[i]:.1f}", end=" ")
print()

soma = 0
for i in range(0, n):
    soma = soma + vetor[i]

print(f"SOMA = {soma:.2f}")
print(f"MEDIA = {soma / n:.2f}")