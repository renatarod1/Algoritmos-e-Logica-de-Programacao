preco = float(input("Preço unitário do produto: "))
qtd = int(input("Quantidade comprada: "))
vl_dinheiro = float(input("Dinheiro recebido: "))

troco = vl_dinheiro - (qtd * preco)

print(f"TROCO = {troco:.2f}")