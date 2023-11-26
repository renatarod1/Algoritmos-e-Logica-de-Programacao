a: int; g: int; d: int
cod = int(input("Informe um codigo (1, 2, 3) ou 4 para parar: "))
a = 0
g = 0
d = 0

while cod != 4:
    if cod == 1:
        a = a + 1
    elif cod == 2:
        g = g + 1
    elif cod == 3:
        d = d + 1

    cod = int(input("Informe um codigo (1, 2, 3) ou 4 para parar: "))

print("MUITO OBRIGADO")
print(f"Alcool {a}")
print(f"Gasolina {g}")
print(f"Diesel {d}")

