lista = []

try:
    valor1 = float(input('Digite um valor: '))
    valor2 = float(input('Digite um valor: '))

    lista.append(valor1)
    lista.append(valor2)

    divisao = lista[0] / lista[1]

except ValueError:
    print('Valor inválido')
except ZeroDivisionError:
    print('Valor digitado é igual a zero')
except IndexError:
    print('Posição da Lista inválida')
except KeyboardInterrupt:
    print('Usuário interrompeu a execução')
else:
    print('A divisão é: ', divisao)