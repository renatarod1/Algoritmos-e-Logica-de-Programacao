hi = int(input("Hora inicial: "))
hf = int(input("Hora final: "))

if hi < hf:
    duracao = hf - hi
else:
    duracao = 24 - (hi - hf)

print(f"O JOGO DUROU {duracao} HORA(S)")