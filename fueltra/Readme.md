#Fueltra: fuel tracker
Simple mvc app built with Node.js and Express.js

##Prerequisites

###1. [Node.js][nodejs]
Node.js should be installed.
To see if Node is installed, open Terminal (or  — if you are on Windows — the Windows Command Prompt), and type:

`node -v`

This should print a version number, so you’ll see something like this :

`v4.2.1`

If you see this or higher points-separated number, it's OK: Node is installed.

_The output, however, can be similar to the next one_:

`v0.10.35`

_And if it is, it's recommended that you update Node.js on your machine_. 

###2. [npm][]
Node.js should be installed.
To see if npm is installed, open Terminal (or  — if you are on Windows — the Windows Command Prompt), and type:

`npm -v`

This should print npm version number, so you’ll see something like this :

`1.4.21` (without 'v' at the beginning unlike in node.js output)

If you see this or higher points-separated number, it's OK: npm is installed.

---
If there are no similar outputs, please refer to these software developers sites to see how to install Node.js and npm:

nodejs: https://nodejs.org/en/download/

npm: https://docs.npmjs.com/getting-started/installing-node

##Run application

1. Open the Terminal (or Windows Command Prompt) in the `fueltra` folder.

2. Run following command:

    `npm start`

    The output should be something like this:

    ```
    > fueltra@0.0.0 start <PATH_TO_PROJECT_FOLDER>/fueltra
    > node ./bin/www
    ```
3. go to [http://localhost:3000/](http://localhost:3000/) in any browser.

If you see `Fueltra: fuel tracker` on the page, the application is running fine. Enjoy!

[nodejs]: https://nodejs.org/en/
[npm]: https://www.npmjs.com/
