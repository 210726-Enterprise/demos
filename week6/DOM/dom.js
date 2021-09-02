console.log("We are connected");

let posts = [
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