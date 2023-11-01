tot_segundos =  int(input("Digite a duracao em segundos: "))

horas = tot_segundos // 3600
resto_horas = tot_segundos % 3600

minutos = resto_horas // 60
segundos = resto_horas % 60

print(f"{horas}:{minutos}:{segundos}")