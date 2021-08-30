/**
 * Equality and equals operators:
 * 
 * = is an assignment operator
 * 
 * == compares an object on either side for value, but performs something called Type Coersion
 * '2' == 2 evaluates to true
 * 
 * === is a strict equals operator and compares types
 * so '2' === 2 evaluates to false.
 */

console.log(2 == '2'); // true TYPE COERSION is being performed here

console.log(2 === '2') // false becauuse the strict equality operator has deduced that a string is not equal to a number

// this function called compare takes in 2 parameters and evaluates their type and compares them with both a == & ===
function compare(first, second) {

    console.log(`
    
        first param = ${first}, and is of type ${typeof(first)} 
        second param = ${second}, and is of type ${typeof(second)}

        first == second evaluates to ${first == second}
        first === second evaluates to ${first === second}
    
    `
    );

}

compare(2, '2'); // true, false
compare("two", 2); // false, false
compare([], null); // false false
compare({}, {}); // are 2 empty objects equal to eachother? In JS 2 different object instances are NEVER equal to eachotther

var product = 4 * 'hello';
console.log(product); // NaN is Not A Number -> it is technically referred to a a property of the global object

console.log(isNaN(5 * 8)); // false
console.log(isNaN(product)); // true

var coolString = `This is "a quote!"`; // look no escape sequences!
console.log(coolString);

// !! -> double bang returns whether the value is truthy or falsey

// console.log(!!false); // is it truthy? -> false
// console.log(!!0) // also returns false because it's NOT truthy.  0 and false 

console.log("a".charCodeAt(0)) // return the ascii value; equates to 97
