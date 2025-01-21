soma = 0
media = 0

dicionario_de_notas = {}

for i in range(1, 4):
    nome = str(input('Digite o nome do aluno(a): '))
    nota = float(input('Digite a nota do aluno(a): '))
    dicionario_de_notas[nome] = nota


print(dicionario_de_notas.items())

for nome, nota in dicionario_de_notas.items():
    soma = soma + nota

media = soma / 3

print('A média dos alunos(as) é: ', media)