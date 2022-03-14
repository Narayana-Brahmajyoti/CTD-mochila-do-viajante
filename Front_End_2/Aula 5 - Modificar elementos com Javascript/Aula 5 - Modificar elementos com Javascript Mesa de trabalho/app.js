// let body = document.querySelector('body');
// let button = document.querySelector('button');
// let item = document.querySelector('li');

// item.classList.add('dark');

// function colorChange() {
//     body.classList.toggle('dark')
//     for (let item of texto) {
//         item.classList.toggle('dark');


//     }

// }
//     button.onclick = colorChange;

// let bodyDark = document.querySelector('body');
// let chk = document.querySelector('.checkbox');
// let title = document.querySelector('h1');
// let cards = document.querySelectorAll('div.item');
// let texts = document.querySelectorAll('h2 p');

// function toggleDarkMode() {
    // bodyDark.classList.toggle('darkBody');
    // title.classList.toggle('darkTitle');
    // cards.forEach(div => {
        // div.classList.toggle('darkItem');
        // div.classList.toggle('darkText');
    // });
// }

// button.onclick = toggleDarkMode;

// let chk = document.querySelector('.darkMode');
// chk.addEventListener("change", () => {
    // document.body.classList.toggle("dark")
// }) 

// let body = document.querySelector('body');
// let checkbox = document.querySelector('input[type="checkbox]');

// changeColors = (colors) => {

// }

// checkbox.addEventListener("change", ({target}) => {
    // target.checked ? changeColors() : changeColors()
// })

function  modoDark () {
    let darkBackground  = document.querySelector('body');
    darkBackground.classList.toggle('darkBackground');

    let darkTitle = document.querySelector('h1');
    darkTitle.classList.toggle('darkTitle');

    let checkbox = document.querySelector('.darkMode');
    checkbox.classList.toggle('btTextDark');

    let darkItem = document.querySelectorAll('.item');
    darkItem.forEach(element => { element.classList.toggle('darkItem') });

    let darkText = document.querySelectorAll('.item h2, p');
    darkText.forEach(element => { element.classList.toggle('darkText') }); 

} 
let chk = document.getElementById('chk');
chk.addEventListener('click', modoDark);