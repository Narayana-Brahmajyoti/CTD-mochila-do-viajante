//Selecionando os IDs
let tituloForm = document.querySelector('#titulo-form');
let descricaoForm = document.querySelector('#descricao-form');
let urlForm = document.querySelector('#url-form');
let form = document.querySelector('#form');

//Selecionando o input 
const formRadio = document.querySelectorAll('input[name=\'option\']');

//Adicionando o evento
form.addEventListener('submit', enviar);

//Validação de seleção dos inputs
function radioSelecionado(inputs) {
    for(let i = 0; i < inputs.length; i++) {
        if (inputs[i].checked) {
            return inputs[i].value;
        }
    }   
} 

//Função principal
function enviar(event) {
    event.preventDefault();

    //validação dos inputs
    let radio = radioSelecionado(formRadio);
  
    //Atribuindo elemento pai 
    let container = document.querySelector('#list-container')
    
    //Adcionando os elementos do Card
    let titulo = document.createElement('h3');
    let descricao = document.createElement('span');
    let img = document.createElement('img');
    let selecao = document.createElement('span');
    

    //Colocando novos valores no documento
    titulo.innerHTML = tituloForm.value;
    descricao.innerHTML = descricaoForm.value;
    img.setAttribute('src', urlForm.value);
    selecao.innerHTML = radio;
    
    
    //Criando elemento DIV
    let item = document.createElement('div');

    //Criando os appendChild
    item.appendChild(titulo);
    item.appendChild(descricao);
    item.appendChild(img);
    item.appendChild(selecao);
    
    
    //Adcionando os itens no Card
    container.appendChild(item);
}

    //Limitando o texto da descrição
    function toLimit(string = "descricao-form"){
        string.value = string.value.substring(0,250);
    }