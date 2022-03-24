//Selecionando os IDs
function selectId(id){
    return document.getElementById(id);
}
let tituloForm = selectId("titulo-form");
let descricaoForm = selectId("descricao-form");
let urlForm = selectId("url-form");
let form = selectId("form");
let formCheckbox = selectId("permissao-img");

//Capturando o inputd Radio 
let formRadio = document.getElementsByName("option");

//Adicionando o evento
form.addEventListener("submit", enviar);

//Validação de seleção dos inputs
function radioSelecionado(inputs) {
    for(let i = 0; i < inputs.length; i++) {
        if (inputs[i].checked) {
            return inputs[i].value;
        }
    }   
} 

 //Limitando o texto da descrição
 function toLimit(string = "descricao-form"){
    string.value = string.value.substring(0,250);
}

//Função principal
function enviar(event) {
    event.preventDefault();

    //validação dos inputs
    let radio = radioSelecionado(formRadio);
  
    //Atribuindo elemento pai 
    let container = selectId("list-container")
    
    //Adcionando os elementos do Card
    let titulo = document.createElement("h3");
    let descricao = document.createElement("span");
    let img = document.createElement("img");
    let selecao = document.createElement("span");
    let chk = document.createElement("h4");
    let imgRestrita = formCheckbox.checked ? "imgPublica" : "imgRestrita";
    
    //Adcionando novos valores no documento
    titulo.innerHTML = tituloForm.value;
    descricao.innerHTML = descricaoForm.value;
    img.setAttribute("src", urlForm.value);
    img.setAttribute("id", imgRestrita);
    selecao.innerHTML = radio;
    chk.innerHTML = formCheckbox.checked ? "Imagem pública" : "Imagem restrita";

    //Criando elemento DIV
    let item = document.createElement("div");

    //Criando os appendChild
    item.appendChild(titulo);
    item.appendChild(descricao);
    item.appendChild(img);
   
    item.appendChild(selecao);
    item.appendChild(chk)
    
    //Adcionando os itens no Card
    container.appendChild(item);
}
   
   
   
   

    
    
    