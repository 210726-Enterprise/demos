# Webpack

Webpack is a software tool that is primarily used to bundle javascript/typescript together into a single module.
"Module" here refers to JavaScript modules, which really just means a single JS file.

Bundling offers a lot of benefits through minification and tree shaking. These are processes that remove any unused JS code from the resulting application. This can _vastly_ reduce project size. Often by greater than 99%.

There are a lot of different software tools that can be used for bundling. Webpack is the most popular.
Angular uses Webpack under the hood. Angular has several angular-specific libraries that abstract away the Webpack configuration, so we generally don't need to worry about it.

If in the future you switch from Angular to React, you would likely need to know how to interact with Webpack.

## Plugins

Webpack and other bundlers generally offer a vast range of miscellaneous plugins to help with the bundling/development processes.

For example, there are Webpack plugins that allow us to import CSS directly into a JS file.
Under normal circumstances, this action wouldn't make any sense.
However, Webpack understands that will eventually bundle many files together, including CSS, HTML, and JS.
And Webpack can take that CSS and link it as a stylesheet in the html that bundles together.

Webpack also offers plugins to support development itself. There is a Webpack development server plugin.

This allows us to create a small temporary local server that hosts your angular application for local testing/display.
This is what is used by the `ng serve` command. It defaults to `http://localhost:4200`. You can change the port if you need to.
This is not useful for production releases. As localhost is not available to the public. But it does allow you to view your own UI.