with open('Manipulacao_de_Arquivos/frase1.txt', 'r') as txt:
    for linha in txt:
        print(linha)
    txt.close()
    

with open('Manipulacao_de_Arquivos/frase1.txt', 'r') as txt:
    r = txt.readlines()
    print (r)
    txt.close()

with open('Manipulacao_de_Arquivos/frase2.txt', 'w') as txt:
    txt.write('Olá a todos.')
    txt.close()

with open('Manipulacao_de_Arquivos/frase2.txt', 'r') as txt:
    for linha in txt:
        print(linha)
    txt.close()