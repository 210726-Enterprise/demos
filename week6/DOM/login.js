function printPressed(e){
    console.log(`Key pressed in username field: ${e.key}`);
    console.log(e);
}

let passwordField = document.getElementById('password');
passwordField.addEventListener("keydown", passwordPress);

function passwordPress(e){
    console.log(`Key pressed in password field: ${e.key}`);
}

let login = document.getElementById('login');

login.addEventListener('submit', submitForm);

function submitForm(e){
    e.preventDefault();
    console.log("Form submitted");
    console.log(`The username was: ${document.getElementById('username').value}`);
    console.log(`The password was: ${document.getElementById('password').value}`);
    login.reset();
}