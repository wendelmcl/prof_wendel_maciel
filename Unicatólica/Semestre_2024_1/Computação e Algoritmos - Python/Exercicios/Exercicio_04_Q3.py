import numpy as np

matriz = np.array([[3,4,1], [3,1,5]])

soma = 0

print(matriz)
print(matriz.shape)

for i in range(matriz.shape[0]):
    for j in range(matriz.shape[1]):
        print(matriz[i][j])

for i in range(matriz.shape[0]):
    for j in range(matriz.shape[1]):
        soma = soma + matriz[i][j]

print('A soma da Matriz é: ', soma)