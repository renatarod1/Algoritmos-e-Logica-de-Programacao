c: int; r: int; s: int; totCobaias: int
percentC: float; percentR: float; percentS: float

n = int(input("Quantos casos de teste serao digitados? "))

totCobaias = 0
c = 0
r = 0
s = 0
for i in range(0, n):
    qtd = int(input("Quantidade de cobaias: "))
    cobaia = str(input("Tipo de cobaia: "))

    totCobaias = totCobaias + qtd
    if cobaia == 'C':
        c = c + qtd
    elif cobaia == 'R':
        r = r + qtd
    else:
        s = s + qtd

percentC = c * 100 / totCobaias
percentR = r * 100 / totCobaias
percentS = s * 100 / totCobaias
print()
print("RELATORIO FINAL:")
print(f"Total: {totCobaias} cobaias")
print(f"Total de coelhos: {c}")
print(f"Total de ratos: {r}")
print(f"Total de sapos: {s}")
print(f"Percentual de coelhos: {percentC:.2f}")
print(f"Percentual de ratos: {percentR:.2f}")
print(f"Percentual de sapos: {percentS:.2f}")