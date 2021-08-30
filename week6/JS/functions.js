// 4 main ways to declare a function

// 1. Function Declaration
function divide(a, b) {
    return  a/b; // returns the value
}

// 2. Function Expression - I am assigning an anonymous function to a variable called divide2
const divide2 = function (a, b) {
    return a/b;
}

// 3. Arrow function expression 
const divide3 = (a, b) => {
    return a/b;
}

// 4. Concise arrow function expression
const divide4 = (a, b) => a/b;

console.log(divide(10, 5)); // prints 2 to console