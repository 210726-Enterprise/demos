/**
 * I want to count things....
 * 
 * 
 */

let count = 0; // this is a global variable

function countCar() {
    return "Car count is " + ++count;
}

function countCats() {
    return "Cat count is " + ++count; // I'll run into major issues if BOTH functions share the same global coutner variable
}

console.log(countCar());

// To solve the issue of sharing global variables among functions, we use something called Closure

// Closure is JS's attempt at encapsulation
/**
 * A closure is the combo of a function and the lexical environment whithin which that function was declared.
 */
// dyanmic function for counting any object
function makeCounter(noun) {

    let count = 0; // outer function count

    function countNoun() {
        console.log(noun + " count is " + ++count); // function scope and local scope
    }

    return countNoun;
}

for(let j=0; j<3; j++) {
    makeCounter("buckets");
}

for(let j=0; j<7; j++) {
    makeCounter("apples");
}

/**
 * 
 * @param {number} a // perhaps  controlling the data type that's passed through
 * @returns 
 */
let closureFunc = function cake(a) {

    // declare some variables up here
    let flour = true;
    let cornMill = false;
    let cupsOfSugar = 1;

    function bake() {

        var heat = 350;

        console.log("Baking the cake at " + heat + "!");
        console.log(`flour: ${flour}`)
        console.log(`CornMill : ${cornMill}`)
        console.log(`cupsOfSugar: ${cupsOfSugar}`)

        heat++ // belongs to bake()
        // then alter the outer function's variables
        flour = !flour;
        cornMill = !cornMill;
        cupsOfSugar++;
        console.log(`the heat is ${heat}`)

    }

    //console.log(heat); // heat is not accessible 
    return bake;
}

closureFunc = closureFunc(); // if we didn't have this like reassinging the object to it's invokation, we wouldn't be able to call it below
                            // in the for loop

/**
 *  
 * In short, function with parenthesis () is actually calling (invoke) that function whereas 
 * function without parenthesis () is an object of that function which can be passed 
 * as an argument and later be called by appending () to it.
 * 
 * */ 

for(k=0; k<4; k++) {
    closureFunc();
}

/**
 * What is Closure? It's JS'a attempt at encapsulation: 
 * It allows for 2 main things:
 * 
 * 1. it allows for an inner function to access an enclosing function's variable (bake() could access cake()'s variables)
 * 2. it allows for an inner function to preserve an enclosing function's scope chain when executing the the function
 */

// Counter Method
function makeCounter(noun) {

    let count = 0;

    function countNoun() {
        return noun + " count is " + ++count;
    }

    return countNoun;
 }

 
 makeCounter = makeCounter("Apples");
 for(let j=0; j<3;j++) {
    console.log(makeCounter())
 }

//  makeCounter = makeCounter("Apples");
//  for(let j=0; j<3;j++) {
//     console.log(makeCounter1())
//  }
