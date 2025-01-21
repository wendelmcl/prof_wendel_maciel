def quantidade_de_litros_sem_parametros():
    tempo_gasto = float(input('Digite o tempo gasto na viagem: '))
    velocidade_media = float(input('Digite a velocidade média: '))
    distancia = tempo_gasto * velocidade_media
    litros_usados = distancia / 12
    return litros_usados

resultado_funcao_sem_parametro = quantidade_de_litros_sem_parametros()

print('Função sem Parâmetros - A quantidade de litros de combustível é: ', resultado_funcao_sem_parametro)


tempo_gasto = float(input('Digite o tempo gasto na viagem: '))
velocidade_media = float(input('Digite a velocidade média: '))
def quantidade_de_litros_com_parametros(tempo_gasto, velocidade_media):
    distancia = tempo_gasto * velocidade_media
    litros_usados = distancia / 12
    return litros_usados

resultado_funcao_com_parametro = quantidade_de_litros_com_parametros(tempo_gasto, velocidade_media)
print('Função com Parâmetros - A quantidade de litros de combustível é: ', resultado_funcao_com_parametro)


tempo_gasto = float(input('Digite o tempo gasto na viagem: '))
velocidade_media = float(input('Digite a velocidade média: '))
distancia = tempo_gasto * velocidade_media
def quantidade_de_litros_com_parametros_simples(distancia):
    litros_usados = distancia / 12
    return litros_usados

resultado_funcao_com_parametro_simples = quantidade_de_litros_com_parametros_simples(distancia)
print('Função com Parâmetros Simples - A quantidade de litros de combustível é: ', resultado_funcao_com_parametro_simples)


tempo_gasto = float(input('Digite o tempo gasto na viagem: '))
velocidade_media = float(input('Digite a velocidade média: '))

def quantidade_de_litros_com_parametros_e_impressao(tempo_gasto, velocidade_media):
    distancia = tempo_gasto * velocidade_media
    litros_usados = distancia / 12
    print('Função com Parâmetros Simples - A quantidade de litros de combustível é: ', litros_usados)

quantidade_de_litros_com_parametros_e_impressao(tempo_gasto, velocidade_media)
