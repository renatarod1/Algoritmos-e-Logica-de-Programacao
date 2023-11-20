vlTotal: float
qtdMinutos = int(input("Digite a quantidade de minutos: "))
vlTotal = 50.0

if qtdMinutos > 100:
    vlTotal = vlTotal + (qtdMinutos - 100) * 2.0

print(f"Valor a pagar: R$ {vlTotal:.2f}")
