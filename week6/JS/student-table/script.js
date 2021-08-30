// 1. Build a function called addStudent

let idCounter = 1;

/*
 * ES6 also introduced a new concept called Generator Functions...these are functions from which we 
can pull a value from "midway".  It behaves like an iterator
 */
// the * marks it as a generator function
function* idGenerator() {
        yield idCounter++; 
  // we can call .next() on this function
}

function addStudent() {

    // Grab the unput field values
    let studentNameInputField = document.getElementById('student-name');
    // how do we grab the value from the input field?
    let studentName = studentNameInputField.value;
    let studentMajor = document.getElementById('student-major').value; // this is a faster way to do the above

    // console.log(studentName);

    // validate the values (ensure that they're not empty strings)
    if(!!studentName && !!studentMajor) {
        // // Create a row and cells for the students table with document.crearteElement

        let row = document.createElement('tr'); // tr in html is a table row
        let studentIdCell = document.createElement('td'); // td in html is a cell (data)
        let studentNameCell = document.createElement('td');
        let studentMajorCell = document.createElement('td');

        // append the cells to the row
        row.appendChild(studentIdCell);
        row.appendChild(studentNameCell);
        row.appendChild(studentMajorCell);

        // append the row to a preexisting table
        document.getElementById('student-table-body').appendChild(row);
        
        studentIdCell.innerText = idGenerator().next().value// some value (how do we generate an ID?)
        studentNameCell.innerText = studentName;
        studentMajorCell.innerText = studentMajor;

        // clear the input for the fields for future values to be provided
        studentNameInputField.value = '';
        document.getElementById('student-major').value = '';
    }
}

// create an event listener that fire when the button is clicked
document.getElementById('add-student').addEventListener("click", addStudent); // <---- example of a callback function!