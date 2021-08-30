//"use strict"
// Strict mode prevents a lack of declarative keywords

/**
 * documentation comment
 */

/**
 * PRIMITIVE DATATYPES
 * 
 * - boolean
 * - number
 * - BitInt * extra -- look into this
 * - string
 * - null
 * - undefined
 * 
 * REFERENCE DATATYPES
 * - objects
 * - arrays
 * - functions
 *      - functions are considered first-class objects because they can have properties and methods like an object.
 *        What distinguished functions from other objects is that they can be invoked.
 */

var num = 5; // number datatype
num = "Hello"; // notice that there's no problem in changing the datatype that the variable holds.

console.log(num); // I should see "Hello" print to my console

var isApproved = false;
var noMansLand = undefined;

// This is a new feature in JS introduced in 2015 in EcmaScript 6 
// declaring variables without a declarative keyword like var...automatically this equates to var
// If I want to make it so that I CAN'T declare variables without a declarative keyword
h = "hi";

console.log(h);

// EcmaScript 6 introduced in 2015 some new ways to decalre variables: let and const

let fickleVar = 10;

console.log(fickleVar);

fickleVar = "ten";

console.log(fickleVar);

const solidVar = 20;

// You CANNOT reassign a value to variable declared with const.
// solidVar = "2000";

console.log(solidVar);

var something = "word";

something = 50;

console.log(something);

