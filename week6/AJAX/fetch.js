window.onload = function() {
    console.log("fetch.js is loaded")
    // capture the button element and add an event listener
    document.getElementById('btn').addEventListener("click", getPokemon);
}

// The window objec tis the Global Object in the Browser

/*

This is the same functionaloty that AJAX provides us.
Fetch API is a more modern method of making a request to a server, which allows extra 
functionality like chaining and error handling.

*/
function getPokemon() {

    // grab the number that user input
    let number = document.getElementById('field').value;

    // fetch requires 1 param -> url from which we are retrieving data
    fetch(`https://pokeapi.co/api/v2/pokemon/${number}`) // fetch returns a PROMISE which is a obj that produces a single value at some point in the furture
        .then((response) => response.json())
        .then((data) => {

            console.log(data)

            // set the src attrbiute of the image element to the property we want from the data returned
            setPokemonImg(data.sprites.front_default);

        }, (err) => {
            console.log(`error: ${err}`)
        });
}

function setPokemonImg(imgSrc) {
    document.getElementById('pokemonImg').src = imgSrc;
}


console.log("something here")