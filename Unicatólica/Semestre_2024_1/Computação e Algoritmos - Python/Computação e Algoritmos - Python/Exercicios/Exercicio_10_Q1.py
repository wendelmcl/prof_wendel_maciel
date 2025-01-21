class Aluno:
    def __init__(self, nome, nota1, nota2):
        self.nome = nome
        self.nota1 = nota1
        self.nota2 = nota2
    
    def calcular_media(self, nota1, nota2):
        return (nota1+nota2) / 2
    
    def mostrar_dados(self):
        print('Nome: ', self.nome, '\n', 'Nota 1: ', self.nota1, '\n', 'Nota 2: ', self.nota2)

    def resultado(self):
        soma = self.nota1 + self.nota2
        media = soma / 2
        if media >= 6:
            print('Aluno aprovado.')
        elif media >= 4 and media < 6:
            print('Aluno pegou exame.')
            notaExame = float(input('Digite a nota do exame: '))
            if notaExame > 6:
                print('Aluno aprovado.')
            else:
                print('Aluno reprovado.')
        else:
            print('Aluno reprovado.')

a1 = Aluno('Ana', 10, 10)
a2 = Aluno('Felipe', 8, 9)

print(a1.mostrar_dados())
print('A média do aluno(a)', a1.nome, 'é: ', a1.calcular_media(a1.nota1, a1.nota2))
print('O resultado do aluno(a)', a1.nome, 'é: ', a1.resultado())
print('\n')
print(a2.mostrar_dados())
print('A média do aluno(a)', a2.nome, 'é: ',a2.calcular_media(a2.nota1, a2.nota2))
print('O resultado do aluno(a)', a2.nome, 'é: ', a2.resultado())