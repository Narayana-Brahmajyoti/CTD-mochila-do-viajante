*** Variables ***  
${SITE}                         https://chicorei.com/
${NAVEGADOR}                    Firefox
${CONCORDAR_COOKIES}            css=#confirmPolicyButton
${CAMPO_PESQUISA}               id=header-search-input-desktop
${PESQ_VIRA_LATA}               Vira Lata Caramelo
${RES_PESQ_VIRA_LATA}           xpath=//span[contains(.,'De R$ 74,99 por R$ 69,99')]
${SLEEP}                        2
${CONFIRMAR_VALOR_CAMISA}       xpath=//p[contains(.,'R$ 69,99')]
${VALOR_CAMISA}                 R$ 69,99
${COR_CAMISA}                   css=.cr-option-squared:nth-child(2)
${TAMANHO_CAMISA}               xpath=//div[3]/nav/div[2]
${BTN_COMPRAR}                  css=.btn-loading:nth-child(1) > span:nth-child(2)
${BTN_VER_SACOLA}               xpath=//div[4]/div/a/div
${VALIDAR_MENSAGEM}             css=#cart-loyalty > .mx-0
${TXT_MSG_VIRA_LATA}            VOCÊ ESTÁ ACUMULANDO 1 PONTOS NO CARTÃO FIDELIDADE!
${FECHAR_PEDIDO}                xpath=//div[@id='cart-finish']/button[2]

# Variaveis segundo caso
# ${PESQ_AMARELO_DESESPERO}       Amarelo é desespero          
# ${RES_PESQ_AMARELO_DESESPERO}   xpath=//span[contains(.,'De R$ 79,99 por R$ 69,99')]
# ${CONFIRMAR_VALOR_CAMISA}       xpath=//p[contains(.,'R$ 69,99')]
# ${VALOR_CAMISA}                 R$ 69,99 
# ${COR_CAMISA}                   css=.cr-option-squared:nth-child(2)
# ${TAMANHO_CAMISA}               xpath=//div[3]/nav/div[2]
# ${BTN_COMPRAR}                  css=.btn-loading:nth-child(1) > span:nth-child(2)
# ${BTN_VER_SACOLA}               xpath=//div[4]/div/a/div
# ${VALIDAR_MENSAGEM}             css=#cart-loyalty > .mx-0
# ${TXT_MSG_AMARELO}              Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo.
# ${FECHAR_PEDIDO}                xpath=//div[@id='cart-finish']/button[2]

# # Variaveis terceiro caso
#  ${PESQ_ERARR}                    Erarr          
# ${RES_PESQ_ERARR}               xpath=//span[contains(.,'De R$ 79,99 por R$ 69,99')]
# ${CONFIRMAR_VALOR_CAMISA}       xpath=//p[contains(.,'R$ 69,99')]
# ${VALOR_CAMISA}                 R$ 69,99
# ${COR_CAMISA}                   css=.cr-option-squared:nth-child(2)
# ${TAMANHO_CAMISA}               xpath=//div[3]/nav/div[2]
# ${BTN_COMPRAR}                  css=.btn-loading:nth-child(1) > span:nth-child(2)
# ${BTN_VER_SACOLA}               xpath=//div[4]/div/a/div
# ${VALIDAR_MENSAGEM}             css=#cart-loyalty > .mx-0
#  ${TXT_MSG_ERARR}                 De segunda a sexta, das 8h às 20h.
# ${FECHAR_PEDIDO}                xpath=//div[@id='cart-finish']/button[2]

# # Variaveis quarto caso
#  ${PESQ_Nem_Te_Vi}                Nem Te Vi 
# ${RES_PESQ_Nem_Te_Vi}           xpath=//span[contains(.,'De R$ 79,99 por R$ 69,99')]
# ${CONFIRMAR_VALOR_CAMISA}       xpath=//p[contains(.,'R$ 69,99')]
# ${VALOR_CAMISA}                 R$ 69,99
# ${COR_CAMISA}                   css=.cr-option-squared:nth-child(2)
# ${TAMANHO_CAMISA}               xpath=//div[3]/nav/div[2]
# ${BTN_COMPRAR}                  css=.btn-loading:nth-child(1) > span:nth-child(2)
# ${BTN_VER_SACOLA}               xpath=//div[4]/div/a/div
# ${VALIDAR_MENSAGEM}             css=#cart-loyalty > .mx-0
#  ${TXT_MSG_NEM_TE_VI}             Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo.
# ${FECHAR_PEDIDO}                xpath=//div[@id='cart-finish']/button[2]

# # Variaveis quinto caso
#  ${PESQ_ALCEU_DISPOR}             Alceu Dispor        
# ${RES_PESQ_ALCEU_DISPOR}        xpath=//span[contains(.,'De R$ 79,99 por R$ 69,99')]
# ${CONFIRMAR_VALOR_CAMISA}       xpath=//p[contains(.,'R$ 69,99')]
# ${VALOR_CAMISA}                 R$ 69,99
# ${COR_CAMISA}                   css=.cr-option-squared:nth-child(2)
# ${TAMANHO_CAMISA}               xpath=//div[3]/nav/div[2]
# ${BTN_COMPRAR}                  css=.btn-loading:nth-child(1) > span:nth-child(2)
# ${BTN_VER_SACOLA}               xpath=//div[4]/div/a/div
# ${VALIDAR_MENSAGEM}             css=#cart-loyalty > .mx-0
#  ${TXT_MSG_ALCEU_DISPOR}          Compre parcelado com cartão ou á vista com boleto ou depósito
# ${FECHAR_PEDIDO}                xpath=//div[@id='cart-finish']/button[2]

*** Keywords ***  
#Inicio primeiro caso
Acessar o site Chico Rei
    Open Browser        ${SITE}     ${NAVEGADOR}
    Maximize Browser Window  
Clicar em "Concordar" no aviso sobre Cookies
    Click Element       ${CONCORDAR_COOKIES}     
Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
    Input Text          ${CAMPO_PESQUISA}    ${PESQ_VIRA_LATA}      
    Sleep               ${SLEEP}     
    Click Element       ${RES_PESQ_VIRA_LATA}
Validar se o valor do produto é "R$ 69,99"
    Sleep               ${SLEEP}     
    Element Should Contain  ${CONFIRMAR_VALOR_CAMISA}   ${VALOR_CAMISA}
Selecionar um tamanho, cor e clicar em comprar
    Click Element           ${TAMANHO_CAMISA}
    Click Element           ${COR_CAMISA}
    Click Element           ${BTN_COMPRAR}
Clicar em "Ver sacola"
    Click Element           ${BTN_VER_SACOLA}
Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
    Sleep                   ${SLEEP}
    Page Should Contain     ${TXT_MSG_VIRA_LATA}
Clicar em "Fechar pedido"
    Click Element           ${FECHAR_PEDIDO}
    Sleep                   ${SLEEP}
Close Browser

# Inicio segundo caso

# Acessar o site Chico Rei
#     Open Browser            ${SITE}     ${NAVEGADOR}
#     Maximize Browser Window  
# Clicar em "Concordar" no aviso sobre Cookies
#     Click Element           ${CONCORDAR_COOKIES}     
# Pesquisar por "Amarelo é desespero" e selecionar a primeira opção da lista de resultados
#     Input Text              ${CAMPO_PESQUISA}    ${PESQ_AMARELO_DESESPERO}      
#     Sleep                   ${SLEEP}     
#     Click Element           ${RES_PESQ_AMARELO_DESESPERO}
# Validar se o valor do produto é "R$ 69,99"
#     Sleep                   ${SLEEP}     
#     Element Should Contain  ${CONFIRMAR_VALOR_CAMISA}   ${VALOR_CAMISA}
# Selecionar um tamanho, cor e clicar em comprar
#     Click Element           ${TAMANHO_CAMISA}
#     Click Element           ${COR_CAMISA}
#     Click Element           ${BTN_COMPRAR}
# Clicar em "Ver sacola"
#     Click Element           ${BTN_VER_SACOLA}
# Validar se a mensagem "Adquira o Chico Rei Prime para desfrutar de frete grátis por 1 ano em todos os pedidos, sem valor mínimo." está sendo exibida
#     Sleep                   ${SLEEP}
#     Element Should Contain  ${VALIDAR_MENSAGEM}     ${TXT_MSG_AMARELO}
# Clicar em "Fechar pedido"
#     Click Element           ${FECHAR_PEDIDO}
#     Sleep                   ${SLEEP}
# Close Browser
     
# Inicio terceiro caso
# Acessar o site Chico Rei
#     Open Browser            ${SITE}     ${NAVEGADOR}
#     Maximize Browser Window  
# Clicar em "Concordar" no aviso sobre Cookies
#     Click Element           ${CONCORDAR_COOKIES}     
# Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
#     Input Text              ${CAMPO_PESQUISA}    ${PESQ_ERARR}      
#     Sleep                   ${SLEEP}     
#     Click Element           ${RES_PESQ_ERARR}
# Validar se o valor do produto é "R$ 69,99"
#     Sleep                   ${SLEEP}     
#     Element Should Contain  ${CONFIRMAR_VALOR_CAMISA}   ${VALOR_CAMISA}
# Selecionar um tamanho, cor e clicar em comprar
#     Click Element           ${TAMANHO_CAMISA}
#     Click Element           ${COR_CAMISA}
#     Click Element           ${BTN_COMPRAR}
# Clicar em "Ver sacola"
#     Click Element           ${BTN_VER_SACOLA}
# Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
#     Sleep                   ${SLEEP}
#     Element Should Contain  ${VALIDAR_MENSAGEM}     ${TXT_MSG}
# Clicar em "Fechar pedido"
#     Click Element           ${FECHAR_PEDIDO}
#     Sleep                   ${SLEEP}
# Fechar Browser
#     Close Browser

# Inicio quarto caso
# Acessar o site Chico Rei
#     Open Browser            ${SITE}     ${NAVEGADOR}
#     Maximize Browser Window  
# Clicar em "Concordar" no aviso sobre Cookies
#     Click Element           ${CONCORDAR_COOKIES}     
# Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
#     Input Text              ${CAMPO_PESQUISA}    ${PESQ_Nem_Te_Vi}      
#     Sleep                   ${SLEEP}     
#     Click Element           ${RES_PESQ_Nem_Te_Vi}
# Validar se o valor do produto é "R$ 69,99"
#     Sleep                   ${SLEEP}     
#     Element Should Contain  ${CONFIRMAR_VALOR_CAMISA}   ${VALOR_CAMISA}
# Selecionar um tamanho, cor e clicar em comprar
#     Click Element           ${TAMANHO_CAMISA}
#     Click Element           ${COR_CAMISA}
#     Click Element           ${BTN_COMPRAR}
# Clicar em "Ver sacola"
#     Click Element           ${BTN_VER_SACOLA}
# Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
#     Sleep                   ${SLEEP}
#     Element Should Contain  ${VALIDAR_MENSAGEM}     ${TXT_MSG_NEM_TE_VI}
# Clicar em "Fechar pedido"
#     Click Element           ${FECHAR_PEDIDO}
#     Sleep                   ${SLEEP}
# Fechar Browser
#     Close Browser

# Inicio quinto caso
# Acessar o site Chico Rei
#     Open Browser            ${SITE}     ${NAVEGADOR}
#     Maximize Browser Window  
# Clicar em "Concordar" no aviso sobre Cookies
#     Click Element           ${CONCORDAR_COOKIES}     
# Pesquisar por "Vira lata caramelo" e selecionar a primeira opção da lista de resultados
#     Input Text              ${CAMPO_PESQUISA}    ${PESQ_ALCEU_DISPOR}      
#     Sleep                   ${SLEEP}     
#     Click Element           ${RES_PESQ_ALCEU_DISPOR}
# Validar se o valor do produto é "R$ 69,99"
#     Sleep                   ${SLEEP}     
#     Element Should Contain  ${CONFIRMAR_VALOR_CAMISA}   ${VALOR_CAMISA}
# Selecionar um tamanho, cor e clicar em comprar
#     Click Element           ${TAMANHO_CAMISA}
#     Click Element           ${COR_CAMISA}
#     Click Element           ${BTN_COMPRAR}
# Clicar em "Ver sacola"
#     Click Element           ${BTN_VER_SACOLA}
# Validar se a mensagem "VOCÊ ESTÁ ACUMULANDO 1 PONTO NO CARTÃO FIDELIDADE!" está sendo exibida
#     Sleep                   ${SLEEP}
#     Element Should Contain  ${VALIDAR_MENSAGEM}     ${TXT_MSG_ALCEU_DISPOR}
# Clicar em "Fechar pedido"
#     Click Element           ${FECHAR_PEDIDO}
#     Sleep                   ${SLEEP}
# Fechar Browser
#     Close Browser