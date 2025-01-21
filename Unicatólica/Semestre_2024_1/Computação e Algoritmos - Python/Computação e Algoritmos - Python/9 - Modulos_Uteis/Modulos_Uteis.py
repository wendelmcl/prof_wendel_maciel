#Biblioteca Math
import math

print(math.sqrt(9))

print(math.sin(45))

print(math.cos(45))

print(math.log(1000, 10))

print(math.log(32, 2))

print(math.log(1000))

print(math.e)

print(math.pi)

#Biblioteca DateTime
import datetime
print(dir(datetime))

print(datetime.date.today())
print(datetime.datetime.now())

data = datetime.date(2023, 7, 17)

print(data.day)
print(data.month)
print(data.year)

horario = datetime.datetime(2023, 7, 17, 7, 30 ,0)
print(horario)

print(horario.hour)
print(horario.minute)
print(horario.second)

#Biblioteca Random

import random

print(random.random())
print(random.randint(1, 10))
print(random.randrange(0, 10, 2))

print(random.randrange(0, 10, 3))

x = ['K', 'd', 13, '34-k', 'x']
print(random.choice(x))

#Biblioteca Time
import time as tm
print(tm.time())

antes = tm.time()
print('Antes: ', antes)
lista = []
for i in range(0, 1000):
    lista.append(i)
depois = tm.time()
print('Depois: ', depois)
intervalo = depois - antes
print('Intervalo: ', intervalo)

print('Finalizando...')
tm.sleep(2)
print('...')
tm.sleep(2)
print('Até a próxima.')