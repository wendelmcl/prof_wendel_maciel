def celsius_para_fahrenheit_sem_parametros():
    celsius = float(input('Digite o valor em Celsius: '))
    fahrenheit = (9 * celsius + 160) / 5
    return fahrenheit

resultado_funcao_sem_parametro = celsius_para_fahrenheit_sem_parametros()
print('Função sem Parâmetro - A temperatura em Fahrenheit é: ', resultado_funcao_sem_parametro)


celsius = float(input('Digite o valor em Celsius: '))
def celsius_para_fahrenheit_com_parametros(celsius):
    fahrenheit = (9 * celsius + 160) / 5
    return fahrenheit

resultado_funcao_com_parametro = celsius_para_fahrenheit_com_parametros(celsius)
print('Função com Parâmetro - A temperatura em Fahrenheit é: ', resultado_funcao_com_parametro)

celsius = float(input('Digite o valor em Celsius: '))

def celcius_para_fahrenheit_com_parametros_e_impressao(celsius):
    fahrenheit = (9 * celsius + 160) / 5
    print('Função com Parâmetro e Impressão - A temperatura em Fahrenheit é: ', fahrenheit)

celcius_para_fahrenheit_com_parametros_e_impressao(celsius)