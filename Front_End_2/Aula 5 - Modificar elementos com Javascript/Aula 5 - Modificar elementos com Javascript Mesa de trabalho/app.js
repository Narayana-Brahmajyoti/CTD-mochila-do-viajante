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