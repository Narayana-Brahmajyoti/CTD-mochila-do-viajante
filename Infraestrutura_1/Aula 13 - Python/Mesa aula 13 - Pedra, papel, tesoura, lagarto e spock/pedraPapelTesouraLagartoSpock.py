#sala 6 - membros - roberto castro, henrique santos, pedro marques, jonata santos, schelen, narayana brahmajyoti, wallacy dos santos silva

#encoding:UTF-8 
import random

userScore = 0
pcScore = 0
totalScore = 0

def percent():
    if totalScore > 0: 
        x = round(((totalScore - pcScore) / totalScore) * 100, 2)
        return x
    elif totalScore == 0:
        x = 0
        return x


# tem mais coisa link ai
# https://docs.google.com/document/d/14f5Ns-kBEP6FbfDoMmObSf4aCmhwjxdQW-jiwfgfE-U/edit#

while True:
    aleatorio = random.randrange(0, 5)  
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lagarto")
    print("5)Spock")
    print("6)Sair do Programa")
    print("7)Show Scores")
    opcao = int(input("O que você escolhe: "))
    
    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lagarto"
    elif opcao == 5:                
        escolhaUsuario = "spock"
    elif opcao == 6:
        print ("Nos vemos!") 
        break
    elif opcao == 7: 
        print ("Pontuações: ")
        print ("Usuário: ", userScore) # pontuação do usuario
        print ("Pc: ", pcScore) # pontuação do pc
        print ("Porcentagem de vitórias: ", percent(), "% " ) 
        continue
    else:
        print ("Valor Invalido")
        continue
        
    print("Tua escolha: ", escolhaUsuario)   
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lagarto" 
    elif aleatorio == 4:
        escolhaPc = "spock"
        
    print("PC escolheu: ", escolhaPc)
    print("...")
    
    if escolhaPc == "pedra" and escolhaUsuario == "papel":  # pedra vs papel
        print("Ganhou, papel cobre pedra")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura": # papel vs tesoura
        print("Ganhou, tesoura corta papel")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra": # tesoura corta pedra
        print("Ganhou, pedra amassa tesoura")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "tesoura": #lagarto vs tesoura
        print("ganhou, tesoura decapita lagarto")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "spock" and escolhaUsuario == "lagarto": # spock vs lagarto
        print("ganhou, lagarto envenena spock")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "papel" and escolhaUsuario == "lagarto": # papel vs lagarto
        print("ganhou, lagarto come papel")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "pedra": #lagarto vs pedra
        print("ganhou, pedra esmaga lagarto")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock": # tesoura vs spock
        print("ganhou, spock quebra tesoura") 
        userScore += 1
        totalScore += 1
    elif escolhaPc == "pedra" and escolhaUsuario == "spock": # pedra vs spock
        print("ganhou, spock vaporiza pedra")
        userScore += 1
        totalScore += 1
    elif escolhaPc == "spock" and escolhaUsuario == "papel": # spock vs papel
        print("ganhou, papel refuta spock")
        userScore += 1
        totalScore += 1 
        
    if escolhaUsuario == "pedra" and escolhaPc == "papel": # pedra vs papel
        print("Perdeu, papel cobre pedra")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "pedra" and escolhaPc == "spock": # pedra vs spock
        print("Perdeu, spock vaporiza pedra")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura": # papel vs tesoura
        print("Perdeu, tesoura corta papel")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "papel" and escolhaPc == "lagarto":# papel vs lagarto
        print("Perdeu, lagarto come papel")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra": # pedra vs tesoura
        print("Perdeu, pedra amassa tesoura")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario =="lagarto" and escolhaPc == "pedra": # lagarto vs pedra
        print("Perdeu, pedra esmaga lagarto")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock": # spock vs tesoura
        print("Perdeu, spock quebra tesoura")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "lagarto" and escolhaPc == "tesoura": # lagarto vs tesoura 
        print("Perdeu, tesoura decapita lagarto")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "spock" and escolhaPc == "papel": # spock vs papel 
        print("Perdeu, papel refuta spock")
        pcScore += 1
        totalScore += 1
    elif escolhaUsuario == "spock" and escolhaPc == "lagarto": # spock vs lagarto 
        print("Perdeu, lagarto envenena spock")
        pcScore += 1
        totalScore += 1

    elif escolhaPc == escolhaUsuario: # foca no 7 mostra a porc %
        print("Empate")
    again = input("Jogar novamente? s/n: ") # bo pro prox 
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")

    #totalscore = userScore + pcScore