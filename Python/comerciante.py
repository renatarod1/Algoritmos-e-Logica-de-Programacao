lucro_menor10: int; lucro_entre_10e20: int; lucro_acima20:int
lucro: float; vl_total_compra: float; vl_total_venda: float; lucro_total: float
n = int(input("Serao digitados dados de quantos produtos? "))

mercadorias = [0 for x in range(n)]
precos_compra = [0 for x in range(n)]
precos_venda = [0 for x in range(n)]

for i in range(0, n):
    print(f"Produto{i + 1}:")
    mercadorias[i] = str(input("Nome: "))
    precos_compra[i] = float(input("Preco de compra: "))
    precos_venda[i] = float(input("Preco de venda: "))

lucro_menor10 = 0
lucro_entre_10e20 = 0
lucro_acima20 = 0
for i in range(0, n):
    lucro = precos_venda[i] - precos_compra[i]
    porcentagem = lucro * 100.0 / precos_compra[i]
    if porcentagem < 10.0:
        lucro_menor10 = lucro_menor10 + 1
    elif porcentagem >= 10 and porcentagem <= 20.0:
        lucro_entre_10e20 = lucro_entre_10e20 + 1
    else:
        lucro_acima20 = lucro_acima20 + 1

vl_total_compra = 0
vl_total_venda = 0
for i in range(0, n):
    vl_total_compra = vl_total_compra + precos_compra[i]
    vl_total_venda = vl_total_venda + precos_venda[i]

print("\nRELATORIO:")
print(f"Lucro abaixo de 10%: {lucro_menor10}")
print(f"Lucro entre 10% e 20%: {lucro_entre_10e20}")
print(f"Lucro acima de 20%: {lucro_acima20}")
print(f"Valor total de compra: {vl_total_compra:.2f}")
print(f"Valor total de venda: {vl_total_venda:.2f}")
print(f"Lucro total: {vl_total_venda - vl_total_compra:.2f}")