def soma(a,b,c):
    soma = a + b + c
    return soma

def subtracao(a, b, c):
    subtracao = (a - b) - c
    return subtracao

def multiplicacao(a,b,c):
    multiplicacao = a * b * c
    return multiplicacao

def divisao(a, b, c):
    divisao = (a / b) / c
    return divisao

def isPalindromo(string):
    if string == string[::-1]:
        return True
    else:
        return False