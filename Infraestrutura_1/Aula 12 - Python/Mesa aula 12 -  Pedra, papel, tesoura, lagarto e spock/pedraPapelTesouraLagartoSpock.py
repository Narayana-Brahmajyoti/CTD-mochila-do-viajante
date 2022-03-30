#encoding:UTF-8
import random

while True: 
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lagarto")
    print("5)Spock")
    print("6)Sair do Programa")
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
    
    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Ganhou, papel cobre pedra")
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
    elif escolhaPc == "lagarto" and escolhaUsuario == "tesoura": #lagarto vs tesoura
        print("ganhou, tesoura decapita lagarto")
    elif escolhaPc == "spock" and escolhaUsuario == "lagarto": #lagarto vs spock
        print("ganhou, lagarto envenena spock")
    elif escolhaPc == "papel" and escolhaUsuario == "lagarto": #lagarto vs papel
        print("ganhou, lagarto come papel")
    elif escolhaPc == "lagarto" and escolhaUsuario == "pedra": #lagarto vs pedra
        print("ganhou, pedra esmaga lagarto")
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock": #spock vs tesoura
        print("ganhou, spock quebra tesoura") 
    elif escolhaPc == "pedra" and escolhaUsuario == "spock": #spock vs pedra
        print("ganhou, spock vaporiza pedra")
    elif escolhaPc == "spock" and escolhaUsuario == "papel": #spock vs papel
        print("ganhou, papel refuta spock")

    #sala 6 - membros - roberto castro, henrique santos, pedro marques, jonata santos, schelen, narayana brahmajyoti, wallacy dos santos silva
        
    if escolhaUsuario == "pedra" and escolhaPc == "papel": #pedra vs papel
        print("Perdeu, papel cobre pedra")
    elif escolhaUsuario == "pedra" and escolhaPc == "spock": # spock vs pedra
        print("Perdeu, spock vaporiza pedra")
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura": # tesoura vs papel
        print("Perdeu, tesoura corta papel")
    elif escolhaUsuario == "papel" and escolhaPc == "lagarto":# lagarto vs papel
        print("Perdeu, lagarto come papel")    
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra": # pedra vs tesoura
        print("Perdeu, pedra amassa tesoura")
    elif escolhaUsuario =="lagarto" and escolhaPc == "pedra": # lagarto vs pedra
        print("Perdeu, pedra esmaga lagarto")
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock": # spock vs tesoura
        print("Perdeu, spock quebra tesoura")
    elif escolhaUsuario == "lagarto" and escolhaPc == "tesoura": # lagarto vs tesoura 
        print("Perdeu, tesoura decapita lagarto")

    elif escolhaUsuario == "spock" and escolhaPc == "papel": # papel vs spock 
        print("Perdeu, papel refuta spock")

    elif escolhaPc == escolhaUsuario:
        print("Empate")
    again = input("Jogar novamente? s/n: ") 
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")