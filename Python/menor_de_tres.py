primeiro = int(input("Primeiro valor: "))
segundo = int(input("Segundo valor: "))
terceiro = int(input("Terceiro valor: "))

if primeiro < segundo and primeiro < terceiro:
    menor = primeiro
elif segundo < terceiro:
    menor = segundo
else:
    menor = terceiro

print(f"MENOR = {menor}")
