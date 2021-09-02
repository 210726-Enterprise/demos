console.log("We are connected");

/*let posts = [
    {
        username: 'rick',
        content: "Morty and I will be doing space stuff today, don't try to bother us."
    },
    {
        username: 'morty',
        content: 'I will never be doing space stuff with Rick again!'
    },
    {
        username: 'summer',
        content: 'Grandpa rick never lets me go on adventures with them anymore.'
    }
];


//We want to grab the div, and inject the posts into it
//We can grab with getElementById
let container = document.getElementById('post-container');

console.log(container);

for(postObj of posts){
    //Create a new "post" element to put in the container
    let post = document.createElement('div');
    //post.innerText = postObj.username;
    post.innerHTML = `<h2>${postObj.username}</h2>
                      <p>${postObj.content}</p>`;
    console.log(post);
    container.append(post);
}
*/

// AJAX FUN BELOW
let container = document.getElementById('post-container');

let apiURL = 'https://jsonplaceholder.typicode.com/posts';

function populatePage(posts){
    for(postObj of posts){
        //Create a new "post" element to put in the container
        let post = document.createElement('div');
        //post.innerText = postObj.username;
        post.innerHTML = `<h2>${postObj.title}</h2>
                          <p>${postObj.body}</p>`;
        console.log(post);
        container.append(post);
    }
}

//When our document loads, we will make request
/*
(() => {
    //step one crate the XHR Object
    let xhttp = new XMLHttpRequest();

    //step two set a callback function for oreadystatechange
    xhttp.onreadystatechange = getData = () => {
        if(xhttp.readyState === 4 && xhttp.status === 200){
            let res = JSON.parse(xhttp.responseText);
            console.log(res);
            populatePage(res);
        }
    }

    //step three
    xhttp.open('GET', apiURL);

    //step four
    xhttp.send();
})();
*/

// Refactor the above into a fetch request

(()=>{
    //fetch makes the request and returns a promise
    fetch(apiURL)
        //we consume said promise, and turn the reponse into json, which also returns a promise
        .then((res) => res.json())
        //We consumse that promise, and populate the webpage with the data grabbed
        .then((data) => populatePage(data));
})();

//In fetch you can access things like the requestHeaders and responseHeaders

//Lets take a look at the response headers
function responseHeaders(){
    fetch(apiURL).then((res) => console.log(res.headers));
}

responseHeaders();

//We can set request headers by including an object in the fetch call
function requestHeaders(){
    fetch(apiURL, {
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then((res) => res.json())
        .then((json) => console.log(json));
}

requestHeaders();

function post(){
    let title = 'This is our title value';
    let body = 'This is our body';
    /* Old object literal style
    let obj1 = {
        title: title,
        body: body,
        id: 1
    };
    */
    let obj = {
        title,
        body,
        id: 1
    };

    fetch(apiURL, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(obj)
    })
        .then((res) => res.json())
        .then((json) => console.log(json));
}

post();

function failedRequest(){
    fetch(apiURL, {
        method: 'GET',
        body: {}
    })
    .then((res) => res.json())
    .then((json) =>console.log(json))
    .catch((err) => console.log(err));
}

failedRequest();