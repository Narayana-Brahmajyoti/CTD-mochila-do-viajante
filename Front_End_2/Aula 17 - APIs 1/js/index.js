// Aqui realizamos a consulta da promisse, esperando sua resposta assíncrona
fetch("https://randomuser.me/api/")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    //manipulamos a resposta
    console.log(data.results[0]);
    renderizarDadosUsuario(data.results[0]);
  })

function renderizarDadosUsuario(dados) {
    /* -------------------------------- Tarefa 1 -------------------------------- */
    // Aqui devem desenvolver uma função que seja exibida na tela:
    // a foto, o nome completo do usuário e o e-mail.
    // Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.
    
    let card = document.querySelector(".card");
    let img = document.createElement("img");
    let usuario = document.createElement("h2");
    let email = document.createElement("p");

    img.src = dados.picture.large;
    usuario.innerHTML = dados.name.first + " " + dados.name.last;
    email.innerHTML = dados.email;

    let item = document.createElement("div");
    item.classList.add("item");
    let itemImg = document.createElement("div");
    itemImg.classList.add("item-img");
    let cardUsuario = document.createElement("div");
    cardUsuario.classList.add("card-usuario");
    
    itemImg.appendChild(img);
    item.appendChild(usuario);
    item.appendChild(email);

    cardUsuario.appendChild(itemImg);
    cardUsuario.appendChild(item);
    card.appendChild(cardUsuario);
    
}

/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.
 let btnRandom = document.getElementById("random");
 //bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.
    btnRandom.addEventListener("click", (evento) => {
        evento.preventDefault();

        fetch("https://randomuser.me/api/")
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            console.log(data.results[0]);
            renderizarDadosUsuario(data.results[0]);
        })    
    });