def ler_os_valores():
    tempo_gasto = float(input('Digite o tempo gasto na viagem: '))
    velocidade_media = float(input('Digite a velocidade média da viagem: '))
    return tempo_gasto, velocidade_media

def calculcar_a_distancia(tempo_gasto, velocidade_media):
    distancia = tempo_gasto * velocidade_media
    return distancia

def calcular_quantidade_de_litros(distancia):
    litros_usados = distancia / 12
    return litros_usados

def imprimir_resultado(tempo_gasto, velocidade_media, distancia, litros_usados):
    print('Tempo gasto na viagem: ', tempo_gasto)
    print('Velocidade média da viagem: ', velocidade_media)
    print('Distância percorrida na viagem: ', distancia)
    print('A quantidade de litros de combustíveis gastos na viagem: ', litros_usados)

tempo_gasto, velocidade_media = ler_os_valores()
distancia = calculcar_a_distancia(tempo_gasto, velocidade_media)
litros_usados = calcular_quantidade_de_litros(distancia)
imprimir_resultado(tempo_gasto, velocidade_media, distancia, litros_usados)


