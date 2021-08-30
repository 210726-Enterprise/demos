window.onload=() => {
    retrieveQuestion();
    document.getElementById("reveal").onclick=reveal;
    document.getElementById("next").onclick=retrieveQuestion;
};

function retrieveQuestion() {
    document.getElementById("qdiv").style.display='none';

    // Step 1: Create a new XML Http Request
    var xhttp = new XMLHttpRequest();
    // Step 2: Set a callback function to ReadyStateChange
    xhttp.onreadystatechange = parseJeopardy;
    // Step 3: Open the request
    xhttp.open("GET", "http://jservice.io/api/random");
    // Step 4: Send the request
    xhttp.send();

    function parseJeopardy() {
        var c = document.getElementById("category");
        var q = document.getElementById("question");
        var a = document.getElementById("answer");

        if(xhttp.readyState===4 && xhttp.status=== 200) {
            var trivia = JSON.parse(xhttp.responseText);
            c.innerHTML=trivia[0].category.title;
            q.innerHTML=trivia[0].answer;
            a.innerHTML=trivia[0].question;

        } else {
            
            c.innerHTML="Loading";

            a.innerHTML="Loading";
        }
    }
}

function reveal () {
    document.getElementById("qdiv").style.display='block';
}
