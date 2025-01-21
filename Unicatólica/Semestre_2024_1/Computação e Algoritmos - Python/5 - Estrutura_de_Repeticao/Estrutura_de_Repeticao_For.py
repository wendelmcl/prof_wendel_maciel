print(1)
print(2)
print(3)
print(4)
print(5)
print('############')

for numero in range(1, 6):
    print(numero)
print('############')

for numero in range(6, 0):
    print(numero)
print('############')

for numero in range(5, 0, -1):
    print(numero)
print('############')

soma = 0
for numero in range(1, 6):
    soma = soma + numero
print(soma)
print('############')

palavra = 'sorvete'
for letra in palavra:
    print(letra)
print('############')

palavra = 'sorvete'
for letra in palavra:
    if letra == 'v':
        print('Achou a letra v')
print('############')

for i in range(0, 5):
    print (i)
    print('---')
    for j in range(0,3):
        print (j)
print('############')
