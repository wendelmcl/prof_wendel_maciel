def ler_temperatura_em_celsius():
    temperatura_em_celsius = float(input('Digite a temperatura em graus Celsius: '))
    return temperatura_em_celsius

def calcular(temperatura_em_celsius):
    temperatura_em_fahrenheit = (9 * temperatura_em_celsius + 160) / 5
    return temperatura_em_fahrenheit

def imprimir_resultado(temperatura_em_fahrenheit):
    print(temperatura_em_fahrenheit)

temperatura_em_celsius = ler_temperatura_em_celsius()
temperatura_em_fahrenheit = calcular(temperatura_em_celsius)
imprimir_resultado(temperatura_em_fahrenheit)

