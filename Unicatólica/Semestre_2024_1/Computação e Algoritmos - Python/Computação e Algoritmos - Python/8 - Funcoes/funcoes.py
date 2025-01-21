#Função sem parâmetro e sem retorno

def mensagem():
    print('Texto da função')

mensagem()

#Função com passagem de parâmetro

def mensagem(texto):
    print(texto)

mensagem('Texto 1')


def soma(a, b):
    print(a + b)
soma(2, 3)

#Função com passagem de parâmetro e retorno

def soma(a, b):
    return a + b

r = soma(3, 2)

print(r)

def calcula_energia_potencial_gravitacional(m,h,g = 10):
    '''
    Calcula a energia potencial gravitacional.
    Argumentos:
    m: massa, entrada como uma variável float.
    h: altura, entrada como uma variável float.

    Argumento opcional:
    g: aceleração gravitacional, com valor default de 10.
    '''
    e = g * m * h
    return e

energia = calcula_energia_potencial_gravitacional(30, 12)

print(energia)
help(calcula_energia_potencial_gravitacional)