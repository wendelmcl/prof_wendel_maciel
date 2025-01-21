#Tupla
tupla = ('Homo Sapiens', 'Canis Familiaris', 'Felis Catus')
print(tupla[0])
print(tupla.index('Homo Sapiens'))

for elemento in tupla:
    print(elemento)

print('################################################################')


#Listas
l1 = ['Homo Sapiens', 'Canis Familiaris', 'Felis Catus']
print(l1)
l2 = ['Xenopus Laevis', 'Ailuropoda']
print(l2)
l3 = l1 + l2
print(l3)
l2_2 = l2 * 2
print(l2_2)

print(l1[0])
print(l1[0:2])

l1.append('Gorila Gorila')
print(l1)

l1.remove('Felis Catus')
print(l1)

del(l1)

for item in l2_2:
    print(item)

print('################################################################')

#Dicionários
coleta = {'Aedes Aegypt' : 32, 'Aedes Albopictus' : 22, 'Anopheles Darlingi' : 14}
print(coleta['Aedes Aegypt'])
coleta['Rhodnius Montenegrensis'] = 11
print(coleta)
del(coleta)['Aedes Albopictus']
print(coleta)
print(coleta.items())
print(coleta.keys())
print(coleta.values())
coleta2 = {'Anopheles Gambiae' : 13, 'Anopheles Deaneorum' : 14}
print(coleta2)
coleta.update(coleta2)
print(coleta)
print(coleta.items())

for especie, num_especimes in coleta.items():
    print(f'Espécie: {especie}, número de espécimes coletados: {num_especimes}')

print('################################################################')

#Conjuntos (Set)
biomoleculas = ('Proteína', 'Ácidos Nucleicos', 'Carboidrato', 'Lipídeo', 'Ácidos Nucleicos', 'Carboidrato', 'Carboidrato', 'Carboidrato')

print(biomoleculas)

print(set(biomoleculas))

c1 = {1,2,3,4,5}
c2 = {3,4,5,6,7}
c3 = c1.intersection(c2)
print(c3)

print(c1.difference(c2))
print(c2.difference(c1))