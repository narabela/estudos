#EXERCICIO 03

nomes = []
idades = []
sexos = []

sexoFem = 0
menoresIdade = 0
sexoMascMaior = 0

while True:
    nome = input("Digite o nome: ")
    idade = int(input("Digite a idade: "))
    sexo = input("Digite F para Feminino e M para masculino: ").lower()

    nomes.append(nome)
    idades.append(idade)
    sexos.append(sexo)

    if idade < 18:
        menoresIdade += 1
        if sexo == "f":
            sexoFem += 1
    elif sexo == "m" and idade >= 18:
        sexoMascMaior += 1

    opcao = int(input("Se deseja sair digite 0: "))
    if opcao == 0:
        break

print(f"Quantidade de mulheres menores de idade: {sexoFem}")
print(f"Quantidade de menores de idade: {menoresIdade}")
print(f"Quantidade de homens maiores de idade: {sexoMascMaior}")
