#EXERCICIO 04

import statistics

idades = []
sexos = []
salarios = []
sexoFem = 0
while True:

    idade = int (input("Digite a idade: "))
    if (idade < 0):
        break
    sexo = input("Digite M para Masculino e F para Feminino: ").lower()
    if (sexo == 'f'):
        sexoFem +=1
    salario = float(input("Digite o salário: "))

    idades.append(idade)
    sexos.append(sexo)
    salarios.append(salario)

    indice_menor_salario = salarios.index(min(salarios))
    idade_menor_salario = idades[indice_menor_salario]
    sexo_menor_salario = sexos[indice_menor_salario]

mediaSalario = statistics.mean(salarios)
maiorIdade = max(idades)
menorIdade = min(idades)
maiorSalario = max(salarios)

print(f"A media dos salarios é: {mediaSalario}")
print(f"A maior idade é: {maiorIdade} e a menor Idade é: {menorIdade}")
print(f"A quantidade de mulheres é: {sexoFem}")
print(f"A pessoa com o menor salário tem {idade_menor_salario} anos e é do sexo {sexo_menor_salario}. ")
