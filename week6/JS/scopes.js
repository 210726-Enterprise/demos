/**
 * 4 main scopes in JS
 * - Global Scope - variables declared here are accesible from ANYWHERE
 *                   > vairbales declared outside of the function scope with var are global
 * 
 * - Functional/Local Scope - variables that are only accessible within a function and not outside of it
 * 
 * - Block Scope - let is an example of a wariable that we would use to restrict a value to a block scope. Think of a for loop and the
 * iterator i. for(let i=0....) {}
 * 
 * - Lexical Scope - involved in something called closures ** we'll get into closures (this JS's attempt at encapsulation)
*/

var name = "Charles"; // I can access this within a function because it's Global!

var num = 5; // number
var house = "casa"; // string
let answer = true; // 
const unknown = undefined; // here I'm setting different primitive datatypes to different variables that 
const o = {}; // implicit type --> this is an empty object
var a = [12, 34, 54];
const f = function(){}; // a function that does nothing

function funScope() {
    var x = "hello"; // even though I declared x with var (global), I declared it WITHIN a function
                    // so therefore it's restricted to the functional scope.
    console.log(x);
}

funScope();

// can I call upon x OUTSIDE of the function? NO! Because x is declared in the functional scope of funScope();
// console.log(x);

var myGlobalVar = "I am global!";

function whatIsMyScope() {

    var myLocalVar = "I am local (or functional)";

    console.log(myLocalVar);
    console.log(myGlobalVar);
}

// When I call whatIsMyScope(), it should print both the function's local/functionally scoped variable AND the global variable!
whatIsMyScope();
var d ="my Dog"; // glboal variable declared outside of the scope
let test = 90;
const anotherTest = 40; 

function blockScope() {

    // let & const are restricted to a block scope
    const c = "cat";
    var m = "mary";

    if (true) {
        console.log(m);
        console.log(c); // we can still access c's block scope becuase we're within it
        let d = "dog";
        // if we put it as
        // var d = "dog"; you would be able to access it outside of this block scope
    }

    // we are unable to call the d variable because it's been declared as let within block scope
    console.log(d);

    console.log(test);

}

// Var is only global outside of the functional scope
// Let and Const both added the concept of block scoping in ES6 -> EcmaScript 6
blockScope();