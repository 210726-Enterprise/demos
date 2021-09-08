
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



