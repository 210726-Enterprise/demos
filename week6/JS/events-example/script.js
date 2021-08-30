// Here I want to provide the functionality so that when I click the button, I change some text.

// 1. create a function called changeText();
function changeText() {

    // 2. Grab the elemtn on the page that we want to change by its ID
    var e = document.getElementById("my_paragraph");

    // 3. change the element's text to "Changed Text!"
    e.textContent = "Changed Text!"; // e.innerHTML
}

// 4. Grab the button element FROM the document
// var btn = document.getElementById("my_button") // this is one way of selecting the element

var btn = document.querySelector("input"); // this is another way of grabbing the butto element

/**
 * var btn = document.getElementByClassName(...)
 */

// 5. add an event listener so that the changeText() function is invoked on a click

btn.addEventListener("click", changeText)
// here we are passing a function as a parameter
// this is an example of a Callback Function