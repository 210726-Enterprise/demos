# Transpilation

As discussed, JavaScript has many different runtimes. Both on different browser platforms, as well as on the server-side. The issue is compounded with newer/older versions of the browsers and new EcmaScript releases.

In order to allow our developers to develop using the latest and greatest features from EcmaScript while still supporting legacy browsers as needed, we will leverage transpilation.

It is similar in concept to compilation. Compilation translates from a high level programming language to a lower level language.
Transpilation translates from a high level programming language to another high level language.

In particular, we use a tool called "Babel". It will allow us to transpile from ESNext JavaScript to ES5 JavaScript, which is supported by the vast majority of browsers (including most legacy browsers).

As part of this process, there are many methods that have been defined by the EcmaScript standard for different prototypes, such as the .filter method on Arrays, or the fetch function. Older versions of JavaScript may not have implementations for these methods. To alleviate this, we use polyfills.

Polyfills are implementations provided from some external source (there are many polyfill libraries). This allows us to provide our own implementation for methods that are not provided by the runtime itself.