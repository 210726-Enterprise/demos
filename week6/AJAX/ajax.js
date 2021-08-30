let button = document.getElementById('btn');
let p_name = document.getElementById('name');
let p_id = document.getElementById('id');

// evenetually we'll add an event listener which will trigger a function that we'll define below
button.addEventListener("click", ajaxCall);


function ajaxCall() {

    // capture the input of the user here
    let number = document.getElementById('field').value;

    // Step 1: Attaining the obj to send the request
    let xhr = new XMLHttpRequest();

    // Step 2:
    /*
    0. UNSENT : open() method has not been called
    1. OPENED : OPNE() METHOD CALLED
    2. HEADERS_RECIEVED : send() has been called and the headers + status code of the HTTP request are now available
    3. LOADING : doanloading the full response -- the partial response body is available
    4. DONE : the entire operation is now complete
    */
    xhr.onreadystatechange = function() {
        
        // In this function, the keyword this is referring to the XMLHttpRequest itself
        if (this.readyState == 4 && this.status == 200) {

            // do something with the response that's been received
            let receivedPokemon = JSON.parse(xhr.responseText);

            console.log(receivedPokemon);

            //render the object in html
            // it's up to us to design the proper function to render the parse object in html
           renderHTML(receivedPokemon)
        }

    }

    // Step 3. open the request
    xhr.open("GET", `https://pokeapi.co/api/v2/pokemon/${number}`);
    // this is the actual request to the server that we're making

    // STEP 4 send the request
    xhr.send();

}

function renderHTML(data) {

    // add the name and id ok the object to the page
    p_name.innerHTML = "Name " + data.name;
    p_id.innerHTML = "ID: " + data.id;

    let image = document.getElementById('pokemonImg');
    image.setAttribute("src", data.sprites.front_default);

    // set the height
    image.setAttribute("height", "300");
}
