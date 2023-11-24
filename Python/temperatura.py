opc = str(input("Voce vai digitar a temperatura em qual escala (C/F)? "))

if opc == 'F':
    f = float(input("Digite a temperatura em Fahrenheit: "))
    c = 5.0 / 9.0 * (f - 32.0)
    print(f"Temperatura equivalente em Celsius: {c:.2f}")
else:
    c = float(input("Digite a temperatura em Celsius: "))
    f = 9.0 * c / 5.0 + 32.0;
    print(f"Temperatura equivalente em Fahrenheit: {f:.2f}")
