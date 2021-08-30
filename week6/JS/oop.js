
// this is basic object literal syntax
const immtuableMaybe = {
// this is similar to JSON, but JSON isn't ACTUALLY javascript
    someValue: 10,
    anotherValue: 'test',
    nestedObj: {
        nestedValue: 100
    }
}

console.log(immtuableMaybe);

// you CANNOT do this:
//immtuableMaybe = {}; // because we declared this obj with const

immtuableMaybe.someValue = 11; // you capture values iwth dot notation

console.log(immtuableMaybe); // mutation of an object's properties is entirely possible even though we declared immutableMaybe with const

let myObj = {
    a: 'a',
    b: 2,
    c: true,
    d: function() {
        console.log('d')
    } 
,
    e() { // a method differs from a function is because it's a function that belongs to an object
        console.log('e')
    },
    'some property': 'some value'
}

myObj.e();
myObj.d();


console.log(myObj.a); // dot notation
console.log(myObj['b']) // bracket notation for accessing object members
console.log(myObj['some property']); 

// old school way (pre- ES6) of creating a class would be to create a function that generates a special type of object
function Car(model) {
    this.model = model;
    this.color = 'silver';
    this.year = '2015';

    // bad practice would be to create the toString() method inside the constructor function .....
}

let myCar = new Car('Honda Civic');

console.log(myCar);
console.log(myCar.toString());

Car.prototype.toString = function() {
    return(`${this.model}, ${this.color}, ${this.year}`)
}

console.log(myCar.toString())

let yourCar = new Car("Nissan Rogue");
console.log(yourCar.toString());

// ES6 introduced Classes in 2015 
class Truck {

    // only one constructor function is allowed in each class declaration  in Es6 
    constructor(model, year, color ='silver') { // I am intending to make every truck silver in this world 
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // try calling the prototype to alter the constructor -- see what happens

    // below are methods
    honk = () => {
        console.log("HONK!")
    }

    squeak() {
        console.log("SQUEAK!")
    }

    beep = function() {
        console.log("BEEP!")
    }
}

let myTruck = new Truck("Toyota Tacoma", 2020, 'black');
console.log(myTruck);
// if we don't pass thru a color into the contrcutor as the third param, then it's automatically silver

myTruck.beep();

Truck.prototype.break = function() {
    console.log("")
}

// We use the prototyp property when we want every instance of an object ot have the same functionality, but we want to modify the
// already declared class



// Parasitic Combination Inheritance 
var semi = Object.create(Truck.prototype);
semi.constructor = Truck;
Pickup.prototype = semi; // this is a totally new class that is inheriting from Truck

let myPickupTruck = new Pickup("Ford F150", 2013, 'red');

console.log(myPickupTruck);










