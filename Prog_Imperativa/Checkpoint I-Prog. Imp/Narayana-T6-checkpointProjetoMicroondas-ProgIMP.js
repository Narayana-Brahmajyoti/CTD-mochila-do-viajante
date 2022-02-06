/** Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e desenvolva
conforme solicitado. Veja abaixo os requisitos do projeto:
- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos
tempos pré-definidos.
1 - Pipoca – 10 segundos (padrão);
2 - Macarrão – 8 segundos (padrão);
3 - Carne – 15 segundos (padrão);
4 - Feijão – 12 segundos (padrão);
5 - Brigadeiro – 8 segundos (padrão);
- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for
maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente";
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabum”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!". 
*/


// A var opção recebe o número de correspondente a opção do menu e a escolherTempo recebe o tempo que o usuário deseja preparar seu prato.

let opcao = 
let escolherTempo = 

// Todas as opções abaixo são as id's do prato e seu tempo padrão de preparo.

let opcaoPipoca = 1;
let opcaoMacarrao = 2;
let opcaoCarne = 3;
let opcaoFeijao = 4;
let opcaoBrigadeiro = 5;

let tempoPreparoPipoca = 10;
let tempoPreparoMacarrao = 8;
let tempoPreparoCarne = 15;
let tempoPreparoFeijao = 12;
let tempoPreparoBrigadeiro = 8;

// Função menu mostra as opções pre-definidas.

function menu(){
    console.log("1-Pipoca", "2-Macarrão", "3-Carne", "4-Feijão","5-Brigadeiro")
    escolherOpcao()
}

menu()

// Esta função compara a opção de prato escolhido com seu tempo de preparo padrão e o tempo escolhido.

function escolherOpcao(){
    
    let tempoEscolhido = escolherTempo
    if (opcao == opcaoPipoca){
        preparo(tempoEscolhido,tempoPreparoPipoca)
    } else if(opcao == opcaoMacarrao){
        preparo(tempoEscolhido,tempoPreparoMacarrao)
    } else if(opcao == opcaoCarne){
        preparo(tempoEscolhido,tempoPreparoCarne)
    } else if(opcao == opcaoFeijao){
        preparo(tempoEscolhido,tempoPreparoFeijao)
    } else if(opcao == opcaoBrigadeiro){
        preparo(tempoEscolhido,tempoPreparoBrigadeiro)
    } else {console.log ("Prato inexistente")

    }
}

//Esta função imprime a mensagem de acordo com o tempo escolhido pelo usuário.

function preparo(tempoEscolhido,tempoPadrao) {
    if ((tempoEscolhido / 2)== tempoPadrao){
        console.log("Sua comida queimou")
    } else if (tempoPadrao > tempoEscolhido){
        console.log("Tempo insuficiente")
    } else if ((tempoEscolhido / 3) >= tempoPadrao){
        console.log("KABUMMM")
    } else {
        console.log ("Prato pronto, bom apetite!!!");
    }
}