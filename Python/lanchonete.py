
cod = int(input("Codigo do produto comprado: "))
if cod > 0 and cod < 6:
    qtd = int(input("Quantidade comprada: "))

if cod == 1:
    valor = 5.0 * qtd
elif cod == 2:
    valor = 3.5 * qtd
elif cod == 3:
    valor = 4.8 * qtd
elif cod == 4:
    valor = 8.9 * qtd
elif cod == 5:
    valor = 7.32 * qtd
else:
    print("CODIGO DO PRODUTO INVÁLIDO, ESCOLHA UM CODIGO DE 1 a 5")
    exit()

print(f"Valor a pagar: {valor:.2f}")