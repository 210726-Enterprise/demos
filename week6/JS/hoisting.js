"use strict"
/**
 * InJavaScript vairables declared iwth var are autoimatically hoisted.
 * That menas that they're treated as if they were declared at the very top of the page.
 */



myVariable = "Look I'm defined!";
console.log(myVariable); // output:defined 

// since I've declared with var, it's automatically hoisted to the top 

var myVariable; // THIS IS DECLARING the variable iwth var so it's as if we've declared it at the top of the page -- works within strict moe 
