// Um nutricionista enviou a seguinte tabela com os dados de seus clientes e, você será responsável por calcular o Índice de Massa Corporal de cada registro:
// O Índice de Massa Corporal (IMC) se calcula dividindo o peso pela altura2  (a altura deve estar em metros e o peso em quilogramas). Por exemplo, no caso de Carlos de Souza, a altura ao quadrado é 3,09. 

// Você deverá criar 6 variáveis:
// Nome
// Idade
// Peso
// Altura
// Plano (só nos interessa saber se TEM ou NÃO TEM)
// Índice de Massa Corporal (IMC)

//Acrescentei a esta resolução os clientes como objetos literais :)

let cliente1 = {
    nome: "José",
    sobrenome: "da Silva",
    idade: 27,
    peso: 83.5,
    altura: 1.70,
    plano: "Ouro"
}

let cliente2 = {
    nome: "Carlos",
    sobrenome: "de Souza",
    idade: 28,
    peso: 80.1,
    altura: 1.76,
    plano: "Diamante"
}

let cliente3 = {
    nome: "Aline",
    sobrenome: "Ferreira",
    idade: 33,
    peso: 63.7,
    altura: 1.53,
    plano: null
}

let cliente4 = {
    nome: "Ana",
    sobrenome: "Paula",
    idade: 26,
    peso: 55.0,
    altura: 1.62,
    plano: "Prata"
}


function imc(peso, altura) {
    let calculo = (cliente1.peso / (cliente1.altura * 2));
    console.log(cliente1.nome + " " + cliente1.sobrenome + " " + "tem" + " " + cliente1.idade + " " + "anos e seu índice de massa corporal é de" + " " + calculo.toFixed(2))
}

imc();
