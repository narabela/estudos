#EXERCICIO 02

nomes = []
idades = []
salarios = []

opcao = 1

while True:
    nome = input("Digite o nome: ")
    idade = int(input("Digite a idade: "))
    salario = float(input("Digite o salario: "))

    nomes.append(nome)
    idades.append(idade)
    salarios.append(salario)

    indice_maior_idade = idades.index(max(idades))
    indice_menor_idade = idades.index(min(idades))

    opcao = int(input("Deseja sair? Digite 0 para sair e qualquer número para continuar. "))
    if opcao == 0 :
        break


print(f"Segue dados do mais velho: Nome {nomes[indice_maior_idade]}, Idade: {idades[indice_maior_idade]}, Salário: {salarios[indice_maior_idade]}")
print(f"Segue dados do mais novo: Nome {nomes[indice_menor_idade]}, Idade: {idades[indice_menor_idade]}, Salário: {salarios[indice_menor_idade]}")

