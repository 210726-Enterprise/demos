/*
JavaScript is by default SYNCHRONOUS

This means that our code is executed line by line, in order (unless it's hoisted)
Any function that belongs to the global object or declared with var is HOISTED. 
*/

function myfunc() {

}

var myVar = 10;

console.log("1");
console.log("2");
console.log("3");

/*
ASYNCHRONOUS means that something will wait for a time to finish some function....
think about it waiting for a REQUEST to REPSONSE while the rest of the code continues to execute
*/

// settimeout is an ASYNCHRONOUS method that belongs to the global object -> look into MDN for more global object methods
setTimeout(function afterTwoSeconds() {
    console.log('this is asynchronous!');
}, 2000) // this will run in the background of my program asynchronously, without stopping the line of execution of other lines of code


console.log("5");
console.log("6");