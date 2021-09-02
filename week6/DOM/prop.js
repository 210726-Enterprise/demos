let bubbleElements = document.getElementsByClassName('bubble');

for(el of bubbleElements){
    //With add event listener
    //Argument one is the event you want to listen for
    //Argument two is the function to call on said event
    //Argumenmt three is the capture or bubble mode
    el.addEventListener('click', stopProp);
    el.addEventListener('click', bubble);
    el.addEventListener('click', viewTarget);
}

function bubble(){
    alert('Bubbling: ' + this.tagName);
}

let captureElements = document.getElementsByClassName('capture');

for(el of captureElements){
    el.addEventListener('click', capture, true);
}

function capture(){
    alert('Captured: ' + this.tagName);
}

function viewTarget(event){
    console.log(event.target);
}

function stopProp(event){
    event.stopPropagation();
}

function stopImProp(event){
    event.stopImmediatePropagation();
}