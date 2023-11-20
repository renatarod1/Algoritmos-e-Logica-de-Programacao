preco = float(input("Preço unitário do produto: "))
qtd = int(input("Quantidade comprada: "))
dinheiro = float(input("Dinheiro recebido: "))

troco = dinheiro - (preco * qtd)

if troco < 0:
    print(f"DINHEIRO INSUFICIENTE. FALTAM {abs(troco):.2f} REAIS")
else:
    print(f"TROCO = {troco:.2f}")
