
# Angular Notes

## Bootstrapping

process of an initial piece of code being pulled into the application and that code then pulling in more code which can in turn continue indefinitely

The root module will start by bootstrapping in the root component

Sections (components) can build off of each other.

Chaining chunks of code together.


## Data Binding
Data Binding is Angular's nice way of simplifying our work for using dynamic information within our HTML and TS files.

Everything you can do through the use of a Data Bind CAN be done in Vanilla JavaScript; Angular significantly reduces the complexity of doing so.

- Interpolation:
	- Sending data from our TS file to our HTML file.
	- TS => HTML
	- {{variable}} syntax - could be a variable or function
		- Double Curly Brace notation
		- Double-Mustache notation
	
	- JS: document.getElementByID("hello).innerHTML = "Hello World!"

	- TS: - {{hello}}		- HTML file
	- hello = "Hello World!"	- TS file

- Event Binding:
	- Take an event that occurs on the DOM and do something in our TS file.
	- HTML => TS
	- Like adding an event listener
	- (event) = "variable" <- Usually a function

- Property/Attribute Binding
	- Bind information to an attribute/property of an HTML element
	- TS => HTML
	- [] syntax	-> [src] = "variable"

	- JS: src="value"
		document.getElementById("id").setAttribute("src", "newValue");
		
	- TS: variable = "newValue";


- Two-way Binding
	- Information/data in our HTML will be sent to our TS file, and that information in our TS file can then be used in our HTML file.
	- HTML <==> TS
		
	- [(word)]		-> Bracket-parenthesis notation
				-> Banana in Box notation

	- This syntax wil be an attribute of an element.
	- [(ngModel)]	-> import FormsModule into your AppModule
	- DO NOT confuse ngModel as coming from NgModule


## Directives - Custom HTML

- 3 Types of Directives

- Structural Directives, like \*ngIf, \*ngFor, \*ngSwitch, dynamically add/remove HTML elements which are the building blocks of a webpage
	Building Blocks -> Structure -> Structural Directives

- Attribute Directives, Custom HTML Attributes
	- ng generate directive myDirective
	- ng g d myDirective
	- ng g d /directives/myDirective

- Component Directives, custom HTML tag, provide a custom view and functionality
	- \<app-root\>\</app-root\>


## Pipe |

a pipe will transform some sort of input into a different output before displaying in the HTML.

10 | currency: 'USD'	->	$10.00

- ng generate pipe myPipe
- ng g p myPipe
- ng g c /pipes/myPipe



## Routing in Angular

- A way for us to dynamically load in different components in runtime.
- This allows us to maintain a Single Page Application, while still being able to modify whole chunks of the page at a time.
- URLs will change; new request are not being made. The URLs change to be an indicator for the user/browser.


### How to Set Up Routing

1. import RouterModule //Already Done. Thank You Angular 7.
2. app-routing.module.ts file:
   - Add your routes/paths
   - <code>const routes: Routes = [{path: 'uri', component: myComponent}];</code>
3. in the imports section of the app-routing.module.ts:
   - RouterModule.forRoot(routes) //Already Done. Thank You Angular 8.
4. To use your router:
   - <code>\<router-outlet>\</router-outlet></code>


## Services

- A Service is designed to allow us to add functionality across our application
- It is much more lightweight than a Component
- It can be Injected into any Component (or Service) as we desire.
- When we generate a Service it creates 2 files:
  - myService.service.ts
  - myService.service.spec.ts

- ng generate service myService
- ng g s myService
- ng g s /services/myService


### Steps to creating and using a Service:

1. ng generate service serviceName
	- the Service has the @Injectable decorator which tells the Angular Injector that it can inject this class into other classes.
2. *Add the Service to the provider (property) -> app.module.ts
	- (I rarely have seena time in which you HAVE to add it)
3. Add the Service to the Constructor of the Class you want to have use your Service.
	- <code> constructor(private variableName: MyService) </code>


## Dependency Injection

- Design pattern wherein a Class receives an instance of an Object it needs (depends on) to function in the constructor (or other approaches outside of Angular). This instance that is injected is shared among other classes that also have said dependency injected into it.
- Using DI, decouples our classes. Coupling is the dependency (or reliance) on something that an entity needs in order to operate.
- In Angular we will see DI namely through Services which provide some sort of utility to different Components (or Services).


## Making HTTP Calls in Angular

1. import HttpClientModule and add it to imports (app.module.ts) ONLY ONCE.
2. import HttpClient to whatever Class is going to make HTTP Calls.
3. add a private HttpClient variable to the constructor of said class.
	- Injecting it into our Class.
4. Make an HTTP Calls, using the variable defined in the constructor.
	- <code>http.get\<User>('url');</code>
	- These HTTP functions return an object known as an Observable.
5. Once you have an Observable you can subscribe to it which starts the actual asynchronous call.


### Observable

- Asynchronous object that represents a stream of data
- You can create Observables by setting up an HTTP Call.
- You then subscribe to the Observable.
  - The OBservable is going to be listening for a response from the server.
  - you are subscribed to it so you can be informed as well.
- The subscribe() function takes in (up to) 3 callback functions that handle what to do if the call is successful, unsuccessful, and when complete. 