let myArr = [1, 2, 3];

myArr.push(4);

myArr.pop(); // removed the last element

console.log(myArr);

// Array functions in JS include filter() , map(), reduce()
let squaredValues = myArr.map(val => {
    return Math.pow(val, 2);
}); // this will return a new array, referenced by the variable squaredValues;

console.log(squaredValues);

let a = "ten";
let b = 10;
let c = true;
let d = {};
let e = null;
let f = "";
let g = 0;
let h = [];
let i = function(){}; // this is a first-class object (function)

const list = [a, b, c, d, e, f, g, h, i];

// iterating over an array in JS
for (let j=0; j<list.length; j++) {
    console.log(list[j]) // this captures the index number 
}

// to access an an object within an array you have to pass its INDEX # only
console.log(list[2]);  // this returns the 3rd element within the array

// list = 66; // you can't reassign list to a type other than any array;
// console.log(list);

// enhanced for loop
for (let elIndex in list) {

    // remember in JS we can iterate through the indices rather than the values
    console.log(`index is ${elIndex}    
                 values is ${list[elIndex]}
    `)
}

console.log("---------------------------------------------")

list.forEach(

    function(value) {
        console.log(value);
        console.log("---------")
    }

)

// we can simplify the above with a arrow function to pimplement the behavior of our anonymous function used as a callback
list.forEach(val => { // arrow function thanks to ES6
    console.log(val);
    console.log("----arrow function!-----")
});

// filter(), reduce().... 

// Look into TypeScript --> it's a superset of JS which enforces type safety 
