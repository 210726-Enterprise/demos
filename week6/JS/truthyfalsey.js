/**
 * JS has a special way of coercing all different types of values into a boolean value of either tru or false.
 * 
 * There are only 6 falsey values -- everything else is Truthy
 * 
 * - 0
 * - null
 * - empty string
 * - false
 * - NaN
 * - undefined
 * 
 * !! double bang operator which will return a variable's truthy value (either true that its truthy or false aka not truthy)
 */


function checkTruthy(input) {
    console.log(`
        input is ${input} and is of type ${typeof(input)}
        It has a truthy value of ${!!input}
    `);
}

checkTruthy(0); // false
checkTruthy(""); // false
checkTruthy(19); // true

var username = "";

// assessing for truthy falseyt values is an easy to determine whether input is valid or not
checkTruthy(username); // 

var x = parseInt("sdgksdfkghj");
checkTruthy(x);

checkTruthy([]); // empty array is TRUTHY!
checkTruthy({}); // empty object is same as an empty array TRUTHY...it's an object (albeit an EMPTY, but still a valid object)

