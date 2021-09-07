# Angular

Angular is a typescript-based web application framework. It is component-based, open source, and created by Google.

It has had a tumultuous version history, being the successor of AngularJS (which used to be also be called Angular).

Both AngularJS and Angular have had multiple versions, so sometimes it can be ambiguous to simply say "Angular".

## Component-Based

Angular is a component based framework, which means our development will primarily consist of constructing "Components".

A "Component" is a small section of a website/webpage. It includes the view (how the UI looks), the logic for the view, and any data to populate the view.

Component-Based architectures are very popular for UI design as a whole. Most modern UI frameworks use Components: Angular, React, and Vue.

These components are woven together to construct complex UIs using "Composition" in contrast to "Inheritance".
It is the idea that components _consist of_ other components.

Inheritance creates generic blueprints and then inherits from them to construct more specific blueprints.

Our UI doesn't really follow this workflow. We don't generally have vague webpages and more specific webpages.
Everything is realistically quite specific, but then can be reused with different data.
And even the more broad parts of our webpage aren't inherited to other variations, but just consist of specific contents.

Following this Component based workflow, we don't really use inheritance to construct our Components. In some limited cases, we do.
But not to a particularly large degree.

## Single Page Application (SPA)

In contrast to legacy websites, we desire to develop an entire website that consists of only a single html page.

The reason is primarily for performance benefits. Requiring the use of multiple html pages causes the website to have an overhead as the browser sends HTTP requests for the other pages in the website.

It is possible to optimize a multi-page website and have _very_ fast load times for each page, but it requires a lot of effort.

On the other hand, a Single Page Application _pretends_ to consist of multiple web pages, but really is only a single html file, that uses large quantities of DOM manipulation to swap out the contents of the webpage accordingly.

Additionally, it uses JS to change the address bar to make it seem like the web page navigated, when it did not.

This mechanic is often referred to as "Routing".

By making this change, our backend server can spend its effort responding with JSON data, instead of needing to send HTML files in response.

## Features

Angular consists of a few primary constructs or scaffolds: Components, Modules, and Services.
There are additionally smaller constructs as well, such as Directives and Pipes.

### Component

As mentioned above, a Component consists of a small section of a webpage. It includes the view, the logic, and the data.
With this in mind, Components in Angular consist of 3 files: .html, .css, and .ts (typescript)
Additionally, you could have a testing file as well: .spec.ts or .test.ts

Similarly to how we can have unit tests in Java, we can have unit tests for our typescript components.

There are also other forms of tests, such as End-to-end tests (e2e) which test the entire UI together.

These Components will make up and compose our UI.

Uses `@Component` decorator.

```typescript
@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
```

The `selector` property effectively defines a custom tag that we can use in our HTML that will be substited with the component.
This is how nest components within each other.
With this in mind, this selector property is generally lowercase that follows kebab-casing.

The `templateUrl` property binds together the logic and the view. It informs Angular which html file is associated with this component.
The `styleUrls` property is similar, it binds together the css for the view. We do not need to use a css stylesheet directly.

### Module

Modules are an organizational unit/construct within Angular. They contain Components and Services. Support features such as lazy loading certain components for performance optimization.

Angular applications might consist of only 1 module to start, or could be architected/designed with multiple modules from the beginning.
Alternatively, you might refactor at some point in the future to split 1 module into multiple.

Uses `@NgModule` decorator.

```typescript
@NgModule({
  declarations: [
    AppComponent,
    HeroesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
```

The `declarations` property defines which Components/Services belong to this module. Remember, Modules are an organizational container for Services and Components.

The `imports` property defines which other modules are being leveraged by the current Module. This is important if you have Components that wish to nest another component within them, but that other component belongs to a different module.

The `bootstrap` property is effectively the root component of the application.

### Services

Services are dedicated logic for the application as a whole. Sometimes our website must behave in a manner that is not specific to any single part of the UI. This logic can be put in a "Service".

There aren't really any limitations to what logic a Service can contain, but it is specific for logic not tied to the UI.

Important Note: If you have any data stored in member variables of a Service class, this data is lost when you refresh the page.
Refreshing a page loads an entirely new HTML page, and all previous JS that was executing is lost (the old stack and heap are deleted effectively).

Uses `@Injectable` decorator

```typescript
@Injectable({
  providedIn: 'root',
})
```

The `providedIn` property defines some configuration in regards to how this service will be consumed via Dependency Injection.

The Services classes contain methods to do whatever logic your application needs. It can be many methods or a single method. Whatever is needed by the app.

Generally try to avoid Services becoming too complicated. Always look for opportunities to simply and abstract. You can split services into multiple if needed.

### Databinding

One of the very useful features that Angular offers is to conveniently pass data back and forth between the DOM and our TypeScript Components (or our logic).

We often want to bind data that was retrieved from an HTTP request and display on the UI. We often want to receive new input from the user and pull it into our Components. And sometimes we may want to do both at the same time.

#### One-Way Databinding

Property/Attribute Binding & String Interpolation: The term to describe binding data from ts to our DOM.
This is where we take input from our Component and render on the DOM in some fashion.

The difference between these lies on the location of where data will be bound.
If the information will be put in innerHTML, then we will use String Interpolation.
Ex: Display a username in a paragraph tag.
Syntax: Double Curly Braces

```html
<p>{{ username }}</p>
```

In the above example, `username` would be the name of a public member variable on the Component class.
Note that the variable must be public, as otherwise, it cannot be bound.

Instead, if you wish to bind data to an attribute of an HTML element, you would use property binding.
Ex: Have a dynamic anchor tag that routes to a different URL depending on who is logged in
Syntax: Square Brackets

```html
<a [href]="url">CLICK HERE</a>
```

In the above example, `url` would be also be a public member variable on the Component class.

The other direction of one-way databinding is to bind DOM events to trigger methods in our TypeScript Component.
This is called Event Binding.
It uses parentheses for the syntax.

Ex: Trigger a function when I click a button

```html
<button (click)="alert(e)">CLICK ME</button>
```

In the above example, `alert` is a public method on the Component class.
You can pass parameters into the method. In this case, `e` is the event object that is passed into the method call.
And unlike in standard HTML, the attribute name no longer has the `on` prefix.

#### Two-Way Databinding

This is a use-case where we want to receive input from the user and store that in a member variable of the Component.
We can then further use that variable to bind back to the DOM if needed.

The syntax is both square brackets and parentheses, as it combines both one-way databinding directions.
Note that the attribute in the middle _must be_ `ngModel`, and it is case sensitive.
Additionally, the order of the brackets is important, the square brackets must be on the outside.
To help remember, I have heard many people refer to the syntax as "Banana in a box": [()]
I would avoid using this terminology in professional situations.

```html
<input [(ngModel)]="username" />
<p>{{ username }}</p>
```

In this above scenario, the contents of the input element will be bound to a variable called `username` on the Component class.
We can do additional binding as we desire.

This will allow our UI to dynamically update based on the value of the variable as it changes.

Final Note: In order to use this, you _must_ import the FormsModule in your AppModule.