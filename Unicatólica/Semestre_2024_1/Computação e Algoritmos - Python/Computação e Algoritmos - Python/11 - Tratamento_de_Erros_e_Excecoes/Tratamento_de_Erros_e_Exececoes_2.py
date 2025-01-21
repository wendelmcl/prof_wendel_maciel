#Tratamento de Erros

try:
    n = int(input('Digite um número inteiro: '))
except:
    print('Valor inválido')
else:
    print(f'Valor digitado é: {n}')

while True:
    try:
        n = int(input('Digite um número inteiro: '))
    except:
        print('Valor inválido')
    else:
        print(f'Valor digitado é: {n}')
        break

while True:
    try:
        p = int(input('Digite um número inteiro: '))
    except ValueError:
        print('Valor inválido')
    except KeyboardInterrupt:
        print('Usuário interrompeu a execução')
        break
    else:
        print(f'Valor digitado é {p}')
        break