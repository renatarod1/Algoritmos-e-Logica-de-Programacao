n = int(input("Quantos valores vai ter cada vetor? "))

A = [0 for x in range(n)]
B = [0 for x in range(n)]
C = [0 for x in range(n)]

print("Digite os valores do vetor A:")
for i in range(0, n):
    A[i] = int(input())

print("Digite os valores do vetor B:")
for i in range(0, n):
    B[i] = int(input())

for i in range(0, n):
    C[i] = A[i] + B[i]

print("VETOR RESULTANTE:")
for i in range(0, n):
    print(C[i])
