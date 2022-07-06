***  Variables  ***  
${SITE} http://mercadolivre.com.br
${NAVEGADOR} chrome
${CAMPO_USUARIO} css=#user-name
${CAMPO_SENHA} css=#password
${BOTAO_LOGIN} css=#login-button

***  Keywords  ***  
Acessar a loja
    Open Browser ${SITE} ${NAVEGADOR}
Fazer login
    Input Text ${CAMPO_USUARIO} ${USUARIO}
    Input Text ${CAMPO_SENHA} ${SENHA}
    Click Element ${BOTAO_LOGIN}