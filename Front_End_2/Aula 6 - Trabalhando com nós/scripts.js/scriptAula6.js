// Passo 1
// Você precisará remover os posts de cada felino do HTML e armazená-los em uma
// variável Javascript. Tenha o cuidado de armazenar os dados de uma forma que 
// seja facilmente acessível.
// Passo 2
// Como nosso HTML já tinha estilos aplicados a ele, devemos conseguir replicar
// essa estrutura com alguma ferramenta JavaScript (Obs.: você pode olhar os 
// conceitos literais de modelo novamente 😉). Para esta etapa, você 
// precisará fazer uma função que receba os dados necessários de um post
// e os insira no código HTML correspondente.
// Passo 3
// Assim que tivermos nossa função que passa nossos dados de postagem para o 
// código HTML, conseguiremos escrever esse código em nosso documento.


//Removendo os cards de cada felino
let felinos = document.querySelectorAll('.item');

function apagarCard(){
    felinos.remove();
}

//Criando a função que passa os dados de cada card para o código HTML
function criarCard(url, titulo, des) {
    
    let div = document.createElement('div');
    div.className = "item";

    let img = document.createElement('img');
    img.setAttribute('src', url);
    div.appendChild(img);

    let h2 = document.createElement('h2');
    h2.innerHTML = titulo;
    div.appendChild(h2);

    let p = document.createElement('p');
    p.innerHTML = des;
    div.appendChild(p);

    let container = document.querySelector('.container');
    container.appendChild(div);
}

// Criando varios cards
function ativarCards(){
criarCard('./imagens/chita.jpg', 'Chita', 'O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros.');
criarCard('./imagens/jaguar.jpg', 'Jaguar', 'Descrição do Felino 2');
criarCard('./imagens/leon.jpg', 'Leão', 'Descrição do Felino 3');
criarCard('./imagens/leopardo.jpg', 'Leopardo', 'Descrição do Felino 4');
criarCard('./imagens/pantera-negra.jpg', 'Pantera-Negra', 'O jaguar, ou jaguarete (Panthera onca) é um carnívoro felídeo da sub-família Panthera e do gênero Panthera. É a única das cinco espécies existentes deste gênero encontradas nas Américas. Também é o maior felino das Américas e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera leo).');
criarCard('./imagens/tiger.jpg', 'Tigre', 'Descrição do Felino 6');
criarCard('https://picsum.photos/200/300', 'Lorem Picsum', 'Imagem aleatória');
}