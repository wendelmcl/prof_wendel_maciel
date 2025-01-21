import re

texto = "Minha casa fica na rua Carneiro, 78. O CEP é 88388-000 e meu site é https://www.iaexpert.academy"

print(re.findall('\d', texto))
print(re.findall('\d{5}-\d{3}', texto))
print(re.findall('https?://[A-Za-z0-9./]+', texto))