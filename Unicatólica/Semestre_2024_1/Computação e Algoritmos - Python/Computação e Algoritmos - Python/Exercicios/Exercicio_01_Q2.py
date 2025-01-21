tempo_gasto = float(input('Tempo gasto na viagem: '))
velocidade_media = float(input('Velocidade média: '))

distancia_percorrida = tempo_gasto * velocidade_media
litros_usados = distancia_percorrida / 12.0

print('A velocidade média: ', velocidade_media)
print('Tempo gasto na viagem: ', tempo_gasto)
print('A distânica percorrida: ', distancia_percorrida)
print('Quantidade de litros: ', round(litros_usados, 1))