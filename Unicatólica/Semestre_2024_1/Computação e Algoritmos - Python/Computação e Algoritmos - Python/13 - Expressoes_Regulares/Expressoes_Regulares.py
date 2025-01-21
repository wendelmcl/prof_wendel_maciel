import re

#Função Search

frase = 'Olá, meu número de telefone é: (88)00000-0000'
print(re.search('\(\d{2}\)\d{4,5}-\d{4}', frase))
frase = 'A placa do carro que eu anotei durante o acidente foi: FRT-1998'
print(re.search('[A-Z]{3}-\d{4}', frase))
email = 'Entre em contato, meu email é teste@teste.com'
print(re.search('\w+@\w+\.com', email))

#Função Match
frase = 'A placa do carro que eu anotei durante o acidente foi: FRT-1998'
print(re.match('[A-Za-z]{3}-\d{4}', frase))
frase2 = 'FRT-1998 é a placa do carro'
print(re.match('[A-Za-z]{3}-\d{4}', frase2))

#Função Findall

frase3 = 'Meu número de telefone atual é (88)00000-0000. O número (88)11111-1111 é o antigo'
print(re.findall('\(\d{2}\)\d{4,5}-\d{4}', frase3))

emails = '''Nome: Teste 1
email: teste@teste.com
Nome: Teste 2
email: teste@teste.com
Nome: Teste 3
email: teste@teste.com.br
'''
print(re.findall('\w+@\w+\.\w*', emails))