/**
 * What is "this"?
 * 
 * The JavaScript this keyword refers to the object that it belongs to.
 * 
 * - in a method, this refers to the owner object
 * - alone, this refers to the GLOBAL object
 * - in a FUNCTION, this still refers to the global
 * - if strict mode is on, this in a function returns undefined
 * 
 */
'use strict'
console.log(this) // in Node, this still refers to the global object, which is an empty object in Node {}

function foo() {
    console.log(this) // still refers to the global object

    // in strict mode, in a function, this wil refer to undefined.
}

//h = "hi" // automatically declared with var, but not possible in strict mode

const person = {
    firstName: "John",
    lastName: "Doe",
    id: 2345,
    fullName: function() { // this is a method because it belongs to an iobject (it is a property)
        return this.firstName + " " + this.lastName; 
    }
    // in this case, this refers to the object   
}

// in the browser the global object is the Window object, so in my console -> console.log(this) -> [object Window]

foo();
