function digitalHouse(numero1, numero2)  {
    let contador = 1;
    let numeros = [];
    do {
        numeros.push(contador); 
        contador++; 
    } while (contador <= 100); 
    console.log(numeros);

    for (let i = 0; i < numeros.length; i++) { 

        if ( numeros[i] % numero1 == 0) {
            numeros[i] = "Digital";
        } else if ( numeros[i] % numero2 == 0) {
            numeros[i] = "House";            
        } 
    }
    console.log(numeros);
}

digitalHouse(2, 3);