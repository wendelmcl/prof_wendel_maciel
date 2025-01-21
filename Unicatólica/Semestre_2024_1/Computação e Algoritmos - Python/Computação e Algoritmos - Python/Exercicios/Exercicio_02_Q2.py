m1 = float(input('Digite sua nota: '))
m2 = float(input('Digite sua nota: '))
m3 = float(input('Digite sua nota: '))

soma = m1 + m2 + m3
media = soma / 3
print('Sua média é: ', media)
if media >=0 and media <= 4:
    print('Aluno reprovado.')
elif media >= 4.1 and media <= 6:
    print('Aluno pegou exame.')
    nota_exame = float(input('Digite a nota do exame: '))
    if nota_exame > 6:
        print('Aluno aprovado.')
    else:
        print('Aluno reprovado.')
else:
    print('Aluno aprovado.')