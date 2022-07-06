*** Settings ***
Library         SeleniumLibrary
Resource        ./narayanaBrahmajyoti.resource
#Test Setup      Acessar o site Chico Rei
#Test Teardown   Fechar Browser

*** Test Cases ***  
#Inicio primeiro caso
Processo de compra de uma camiseta no site Chico Rei
    Acessar o site Chico Rei
Processo de compra de uma camiseta "Vira lata caramelo" no site Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,99"
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
    Clicar em "Fechar pedido"

#Inicio segundo caso
Processo de compra de uma camiseta no site Chico Rei
    Acessar o site Chico Rei
Processo de compra de uma camiseta " Amarelo é Desespero" no site Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Amarelo é desespero" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,90"
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem "Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo." está sendo exibida
    Clicar em "Fechar pedido"
    Fechar Browser

# #Inicio terceiro caso
Processo de compra de camiseta no site Chico Rei
    Acessar o site Chico Rei
Processo de compra de uma camiseta "Erarr é humano" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Erarr" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,90"
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem "De segunda a sexta, das 8h às 20h." está sendo exibida
    Clicar em "Fechar pedido"
    Fechar Browser

#Inicio quarto caso
Processo de compra de camiseta no site Chico Rei
    Acessar o site Chico Rei
Processo de compra de uma camiseta "Nem Te Vi" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Nem Te Vi" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,90"
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem "Compre parcelado com cartão ou á vista com boleto ou depósito" está sendo exibida
    Clicar em "Fechar pedido"
    Fechar Browser

#Inicio quinto caso
Processo de compra de camiseta no site Chico Rei
    Acessar o site Chico Rei
Processo de compra de uma camiseta "Alceu Dispor" no site do Chico Rei
    Clicar em "Concordar" no aviso sobre Cookies
    Pesquisar por "Alceu Dispor" e selecionar a primeira opção da lista de resultados
    Validar se o valor do produto é "R$ 69,90"
    Selecionar um tamanho, cor e clicar em comprar
    Clicar em "Ver sacola"
    Validar se a mensagem "Sua primeira troca na Chico Rei é por nossa conta!" está sendo exibida
    Clicar em "Fechar pedido"
    Fechar Browser
