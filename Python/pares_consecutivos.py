numero = int(input("Digite um numero inteiro: "))

while numero != 0:
    if numero % 2 != 0:
        numero = numero + 1

    soma = 5 * numero + 20
    print(f"SOMA = {soma}")
    numero = int(input("Digite um numero inteiro: "))

"""solucao usando o for
    soma = 0
    for i in range(0, 5):
        soma = soma + numero
        numero = numero + 2
"""

