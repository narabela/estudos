#EXERCICIO 05

nomes = []
idades = []
tipoSanguineos = []
tipoA = 0
tipoB = 0
tipoAB = 0
tipoO = 0

while True:

    nome = input("Digite o nome: ")
    idade = int (input("Digite a idade: "))
    tipoSanguineo = input("Digite o Tipo Sanguineo: ").upper()
    if (tipoSanguineo == "A"):
        tipoA +=1
    elif (tipoSanguineo == "B"):
        tipoB += 1
    elif (tipoSanguineo == "AB"):
         tipoAB += 1
    elif (tipoSanguineo == "O"):
        tipoO += 1
    else:
        print("Opcao Invalida")

    nomes.append(nome)
    idades.append(idade)
    tipoSanguineos.append(tipoSanguineo)

    r = input("Deseja continuar? S/N: ").lower()
    if (r == "n" ):
        break


doacao = input("Digite o tipo sanguineo que o paciente precisa: ").upper()
if (doacao == "A"):
    print (f"Existem {tipoA} doadores Tipo A")
elif (doacao == "B"):
    print (f"Existem {tipoB} doadores Tipo B")
elif (doacao == "AB"):
    print (f"Existem {tipoAB} doadores Tipo AB")
elif (doacao == "O"):
    print (f"Existem {tipoO} doadores Tipo O")
else:
    print("Opção Invalida")