lista=[]
soma = 0

for i in range(1, 6):
    numero = int(input('Digite um numero: '))
    lista.append(numero)


for item in lista:
    soma = soma + item

print('O valor da soma da lista é: ', soma)