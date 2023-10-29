nome = str(input("Nome: "))
vl_hora = float(input("Valor por hora: "))
horas_trab = int(input("Horas trabalhadas: "))

pagamento = horas_trab * vl_hora
print(f"O pagamento para {nome} deve ser {pagamento:.2f}")