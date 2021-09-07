# TypeScript

TypeScript is a high level programming language that is quite similar to JavaScript.

In particular, TypeScript is a superset of JavaScript. It includes all of the same features and syntax that regular JavaScript supports in addition to new features.
Most of the new features are focused around static typing (but not all).

## Some TypeScript Features

- Static Typing
- Interfaces
- Access modifiers
  - TypeScript does not have a default access, instead public is the default access modifier
- Decorators
  - Basically just annotations
- etc

We will develop our applications using TypeScript and then transpile back to JavaScript so that it can be executed by the browser's JS runtime.

## Caveats

In general, there aren't really any TypeScript specific interpreters. We _always_ transpile to JavaScript and then execute.
What this means, is that our typing restrictions exist only while we are writing the code and not while it is executing.
This can sometimes cause problems.

For example, we write a fetch request to obtain data from an external API. We expect the response to be an array of objects.
So, in our TypeScript code, we type our variables accordingly.

```typescript
interface Data {
  id: number,
  content: string
}

const response: Promise<Data[]> = fetch<Data[]>('some-url').then(res => res.json());

response.then(arr => console.log(arr));
```

We might expect to see the data from the api be an array of those objects.

However, what if the API didn't give us that? What if instead, we just received a single string in response? What happens?

Because our TypeScript has already been transpiled into JavaScript in order to execute, all of our typing does not exist during exection.
That means, this scenario will not throw any errors, and will just be a string instead of an array of objects.

The resulting JavaScript was really just:

```javascript

const reponse = fetch('some-url').then(res => res.json());

response.then(arr => console.log(arr));
```

For the most part, it can be tough to deal with data being received from external sources. We must just accept that issues could arise, and there can be some error handling in place to protect yourself, but not much.

However, for our own code/data, TypeScript will throw compilation errors if you are using data in a way that does not conform to its type.
This does still have significant benefits.

In particular, it helps a lot with undefined data causing errors.