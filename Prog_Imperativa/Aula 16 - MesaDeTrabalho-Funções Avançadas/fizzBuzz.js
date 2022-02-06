
let fizzBuzz = (x, y) => {
    for (let i = 0; i < 100; i++) {
        if(i % x == 0) {
            console.log("Fizz");
        } else if(i % y == 0) {
            console.log("Buzz"); 
        } else if(i % x === 0 && i % y === 0 ){
            console.log("FizzBuzz"); 
        } else {
            console.log(i);
        }
    }
}

fizzBuzz(3,5);