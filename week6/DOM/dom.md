# DOM (Document Object Model)
Tree like structure represents the HTML document known as the DOM tree
- Allows JS to access and manipulate elements/styles on a webpage

![dom](dom_structure.png)

The root of the DOM tree is our html tag, otherwise known as the document object
- Every other element is a node that can be accessed via JS

To gain access to the DOM, you simply use the `document` object in JS, it gives you access to methods to select, traverse, and manipulate elements on the HTML page

# Selecting Elements

There are several ways to select an element in the DOM tree:

- `document.getElementById("idname")`: selects a single element by its id
- `document.getElementsByClassName("classname")`: can select a group of elements with a specific class name
- `document.getElementsByTagName("tag")`: if you want to get every div on the page
- `document.querySelector("selector")` `document.querySelectorAll("selector")`: these grab elements by their css selector

# Travering the DOM

The document object provides us ways to move through the tree with different properties gaining access to pretty much any object on the tree

To gain access to the top most node:

- `document.documentElement` get the html element
- `document.head` get the head tag
- `document.body` get the body tag

To gain access to the parent nodes of the currently selected element
- `element.parentNode`
- `element.parentElement`

To gain access to the child nodes of the element selected:
- `element.childNodes`
- `element.firstChild`
- `element.lastChild`

To gain access to sibling nodes of an element:
- `element.previousElementSibling`
- `element.nextElementSibling`

# DOM Manipulation

We can also change/manipulate the HTML with Javascript

You can use `document.createElement()` to create an element and insert it into the dom tree

You can use `element.replaceChild()` to remove an element from the DOM, and replace it with another

You can completely remove an element with `element.removeChild()`

You can insert a node before another with `element.insertBefore()`

You can use `element.innerText`, `element.textContent` to get or set the text of an HTML element

You get or set the HTML of an element with `element.innerHTML`

You can clone a node with the `element.cloneNode()` 

There are also many other useful methods and properties that you can leverage on the element objects in JS

- `element.getAttributes("attname")`
- `element.setAttribute("attname")`
- `element.removeAttribute("attname")`
- `element.hasAttribute("attname")`

# Events and Listeners

Events occur when a user interacts with a webpage, or when the browser triggers one

You can configure your webpage to handle these events with Javascript using an event handler, events you can handle include:

-   **onclick** - This is a click event occurs when a user clicks the element on a web page.

-   **ondblclick** - This is a click event occurs when a user double clicks the element on a web page.

-   **onload** - This is a load event occurs when the browser has finished loading the page.

-   **onunload** - This is a load event occurs when a user closes the document.

-   **onresize** - This is a load event occurs when the browser window is minimized or maximized.

-   **onmouseover** - This is a mouse event occurs when the user moves the mouse over an HTML element.

-   **onmouseout** - This is a mouse event occurs when the user moves the mouse away from an HTML element.

-   **onkeydown** - This is a keyboard event occurs when the user presses down a key on the keyboard.

-   **onkeyup** - This is a keyboard event occurs when the user releases a key on the keyboard.

-   **onfocus** - This is a form-input event occurs when the user gives focus to an element on a web page.

-   **onblur** - This is a form-input event occurs when the user takes the focus away from a form element or a window.

-   **onchange** - This is a form-input event that occurs when a user changes the value of a form element.

-   **onsubmit** - This is a form-input event that occurs when the user submits a form on a web page.

There are three ways you can register an event handler:

1. Inline, where you set the on... attribute of the html element to a predefined function in your JS file
2. You can set the event property of the html element to a predefined function in JS
3. You can use the `element.addEventListener(event, function, useCapture)` method

# The Event Object

In Javascript events are represented by an Event Object

Event object has the following properties and methods:
- bubbles: a boolean value which indicates the propagation method, it is true by default
- currentTarget: a reference to the DOM element whose event listener triggered the specific event
    - This is different from the element that initially triggered the event as a single event can trigger multiple listeners through propagation
- preventDefault(): cancels the event/precents the default action
- stopPropagation(): prevents the event from propagating further
- target: a reference to the DOM element that triggered the event
- timeStamp: the time of the event in miliseconds
- type: the type of the event

## Types of Events

There are several subclasses of the Event Object, which all include their own properties as well as the properties of the event object

- A complete list of event objects can be found here: https://www.w3schools.com/jsref/obj_events.asp

## MouseEvent

This is an event that is generated when the user interacts with elements on the page with the mouse

Events like click, onmouseeneter, onmouseleave, create MouseEvent objects

The MouseEvent object has many properties that hold information about the sate of the machine when the event occured:

-   Coordinates of the mouse relative to the window: clientX and clientY
-   Coordinates of the mouse relative to the last event: movementX and movementY
-   Coordinates of the mouse relative to the target element: offsetX and offsetY
-   Coordinates of the mouse relative to the the screen: screenX and screenY
-   Whether alt, ctrl, or shift were hit during the event: altKey, ctrlKey, and shiftKey
-   Which mouse button was hit: button, buttons and which

## KeyboardEvent

This is an event that is generated when the user interacts with elements on the page with the keyboard

You would typically be used to add extra functionality to webforms

Events such as onkeydown, onkeypress, and onkeyup create KeyboardEventObjects

They KeyboardEvent Objects have many properties:
-   Whether alt, ctrl, or shift was hit during the event: altKey, ctrlKey, and shiftKey
-   Which key was hit: key, keycode, and which
-   Whether the key is being held down: repeat

# Bubbling/Capturing

Javascript has something called event propagation, which is essentially how the event flows through the component/elements on the page

There are two ways in which an event can propagate, the first is called bubbling, the second is called capturing

## Event Bubbling

Bubbling is the default event propagation for event listeners

- Follows a buttom up approach
- The event starts at the target element, then "bubbles" its way up the tree

Bubbling works for all handlers, regardless of how they are registered with the addEventListener()

## Event Capturing

Event capturing is the opposite of bubbling, instead of going from the target element to the top of the tree, it will start at the top and work its way down to the target element
- Follows the top to bottom approach

Capturing only works with event handlers that are registered with .addEventListner() with an added third argument that is set to true