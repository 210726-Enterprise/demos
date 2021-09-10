// Primitive Values
// Number
// String
// boolean
// null
// undefined
// Symbol
// BigInt

// Object
// var variable;
// let varaible2;
let variable = 5;
variable = "something";

let object1 = {
  objectId: 1,
  name: 2,
  nestedObj: {
    exists: true,
  },
};

const object2 = {
  objectId: 1,
  name: "string",
  nestedObj: {
    exists: true,
  },
};

object1.name = object2;

object1 = 5;

// console.log(object1);
// console.log(object1.objectId);
// console.log(object1.name);
// console.log(object1.nestedObj.exists);

let myObj = {
  a: "a",
  b: 2,
  c: true,
  d: function () {
    console.log("d");
    return "d";
  },
  e() {
    // this is a method. similar to a function but MUST be attached to an object.
    console.log("e");
    return "e";
  },
};
// this is dot notation, it allows to access sub properties on an object
// console.log(myObj.a);
// console.log(myObj.b);
// console.log(myObj.c);
// console.log(myObj.d());
// console.log(myObj.e());
// myObj.d();
// myObj.e();

// this is bracket notation, which also allows us to access sub properties on an object.
// let index = "d";
// myObj[index](); // these are equivalent
// myObj["d"]();

// the old school way to create a class. By creating a function that generates a special type of object.
// function Car(model) {
//   this.model = model;
//   this.make = "Honda";
//   this.year = 2021;
// }

// const myCar = new Car("Civic");
// myCar.model = "Accord";

// console.log(myCar);

// ES6 introduced classes in 2015
class Truck {
  // a constructor is a function that returns an object
  constructor(model, make, year) {
    this.model = model;
    this.make = make;
    this.year = year;
    this.speed = 0;
  }

  // declare some member methods

  accelerate = () => {
    if (this.speed < 15) {
      this.speed += 5;
      console.log(this.speed);
      this.accelerate();
    } else {
      console.log(this.speed);
      this.explode();
    }
  };
}

Truck.prototype.random = "yessir";

const truck = new Truck("Tundra", "Toyota", 1945);

console.log(!!false);

// Falsy values
// false
// 0
// -0
// null
// "", '', ``
// undefined
// NaN
// 0n

// array destructuring.
// function something() {
//   return [
//     new Truck(),
//     function somethingElse() {
//       console.log("something else");
//     },
//   ];
// }

// const truckFromSomething = something()[0];
// const [truckFromDest, randoFunction] = something();
// truckFromDest.accelerate();

// array destructuring, you descructure arrays by their index. need place holders to access higher indexes
// const [, , , , arrTruck, sixth] = [
//   1,
//   "string",
//   true,
//   NaN,
//   truck,
//   function () {
//     console.log("Maybe?");
//   },
//   () => {
//     console.log("Sure!");
//   },
// ];

// console.log(sixth());

// arrTruck.accelerate();

// object desctructuring, you destructure objects by their keys
let random = 5;

const { random: alias } = truck;

truck.random = "something else";

Truck.prototype.explode = () => {
  console.log("oh no. i have explode");
};

console.log("prototype: " + truck.random);
console.log("destructured: " + alias);

truck.accelerate();
