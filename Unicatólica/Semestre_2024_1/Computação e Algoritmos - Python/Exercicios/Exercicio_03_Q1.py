#For
soma = 0
media = 0

for numero in range(1, 6):
    nota = float(input('Digite uma nota: '))
    soma = soma + nota

media = soma / 5

print('A média é: ', media)
print('########################')

#While
numero = 1
nota = 0
soma = 0
media = 0

while numero <= 5:
    nota = float(input('Digite uma nota: '))
    soma = soma + nota
    numero = numero + 1

media = soma / 5
print('A média é: ', media)
print('########################')