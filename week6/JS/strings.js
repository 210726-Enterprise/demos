const unchangeableWord = "Never";
let changebaleWord = 'Maybe'; // You can also declare Strings with single quotes.

// ECMA Script6 introduced a new way of declaring strings...The template literal

let templateLiteral = ``; // Template literals are defined by ` right under your escape key in the upper left hand side

templateLiteral = `This is a multi-line template literal...

This is one of the benefits of a template literal

....!`;

console.log(templateLiteral);

// Probably the greatest benefit of template literals is that it allows for STRING INTERPOLATION

// var is rearely used nowadays since lety and const were introduced. Open scoping kinda defeats the purpose of scopes...

let age = 97;
let mySentance = "Hello I am " + age + " years old."; // this is string concatenation.

console.log(mySentance);

templateLiteral = `Now I am ${age} years old`;
templateLiteral = `In 20 years I will be ${age + 20}`;

console.log(templateLiteral);
// String Interpolation means that we can insert placeholders for variables
// and the template literal will use the value of the variable
// when used.

console.log(`${400 * 3}`)


