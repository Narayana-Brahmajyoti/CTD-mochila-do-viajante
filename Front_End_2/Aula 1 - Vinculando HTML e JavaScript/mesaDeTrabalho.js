// Mesa de trabalho Aula 1 Grupo 3 -
 
// Desenvolver um script que permita somar um array de números consecutivos, de forma
// que se some o primeiro número com o segundo e o imprima através do console.
// Depois, temos que pegar este resultado e somar o terceiro número, e assim por diante, até
// termos terminado de percorrer todo o array.

let array = [1, 2, 4, 8];
let soma = array[0];

for (let i = 1; i < array.length; i++) {
    soma += array[i];
    console.log(soma)
}

// let array = [1, 2, 4, 8];
// let soma = 0;

// for (let valor of array) {
    // soma += valor;
    // console.log(soma)
// }

