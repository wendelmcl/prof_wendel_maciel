import math

#Operações Matemáticas
a = 5
b = 3
print(a, b)

print('A soma é: ', a + b)

print('A subtração é: ', a - b)

print('A multiplicacao é: ', a * b)

print('A divisão é: ', a / b)

print("O resto da divisão é: ", 10 % 3)

print('5 elevado a 3 é: ', 5**3)

print(math.sqrt(81))

#Arredondamento
casos_doenca = 134
numero_habitantes = 34432
casos_por_habitante = casos_doenca / numero_habitantes
print(casos_por_habitante)

print('O número de casos por habitante é de', round(casos_por_habitante, 4))