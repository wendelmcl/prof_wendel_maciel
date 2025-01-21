alunos = {'Pedro':8.0, 'Maria':10.0, 'Amilton':7.5}

with open('Exercicios/Exercicio_08_Q1_2.txt', 'w') as txt:
    for nome, nota in alunos.items():
        txt.write(f'{nome}, {nota}\n')
txt.close()

with open('Exercicios/Exercicio_08_Q1_2.txt', 'r') as txt:
    for linha in txt:
        print(linha)
txt.close()