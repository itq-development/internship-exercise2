[this_repo]: https://github.com/itq-development/internship-exercise2
[github_join_page]: https://github.com/join
[github_first_excercise]: https://github.com/itq-development/internship-exercise1/


exercise 2
===============================

Purpose of this document
------------------------

This excercise is to verify that you can:

1. create a simple web application
2. understand and work with MVC paradigm

List of tasks:
--------------

1. If you do not have a GitHub account yet, please go to [GitHub join page][github_join_page] and register. You will get a free account, no worries - no credit card is required. If you are lost, an initial information is also in the [First Internship Excercise][github_first_excercise].

2. Fork [this][this_repo] repository using any git client.

3. Pick your favourite web framework (it can be PHP, Django, Python, Java with JSP, Ruby on Rails, express with node.js or any other framework).

4. Create a simple form that will calculate an average car fuel consumption. It can calculate miles per gallon OR liters per every 100 kilometers - it is up to you - only one version will be verified. Please apply the rules of **Model-View-Controller** paradigm in your solution. 

 |Inputs (European version)|Output|
 |:-----|:-----|
 |fuel (in liters)|an average fuel consumption (for example 6.8 l / 100 km)|
 |journey driven (in kilometers)| |
 
 |Inputs (US version)|Output|
 |:-----|:-----|
 |fuel (in gallons)|an average fuel consumption (for example 35 miles per gallon)|
 |journey driven (in miles)| |

5. Commit your changes with meaningful commit messages.

6. Push your changes from your local computer to your GitHub repository.

7. Send a pull request to itq-development/internship-excercise2. This point is not mandatory, however it might speed up the verification process :)

You're done ;)
-------------------------------------
#Implementation of "Fuel Consumption"

##About structure:

###-main
    --java
        ---ru\itqdevelopment\exercise 
            ---- Calc : this class represents "Model" and used for calculation of average consumption relying on "liters" and "kilometers" 
            ---- FuelController : this class represents "Controller" which sends the data on "Model" and "View"  for their purposes
    --resources
        ---log4j.xml : used for logging of each action in application
    --webapp
        ---resources
            ----css
                ------bootstrap.min.css
                ------bootstrap-theme.min.css
                ------custom-style.css
                ------normalize.min.css
            ----fonts
                ------...(description omitted for brevity)
            ----js
                -----bootstrap.min.js
                -----custom.js
                -----jquery-2.1.4.min.js
        ---WEB-INF
            ----spring
                -----appServlet\servlet-context.xml : special context-file for “DispatcherServlet” 
                -----root-context.xml: defines shared resources visible to all other web components
            ----views
                -----components : here is located our .jsp page-components to import into the work page(s)
                -----index.jsp : "View" and main page of the project (where you can check the functionality)
            ----web.xml: used for filtering all of requests which comes to Spring (web) container (through “DispatcherServlet”, and controlled by him)           
###-test
    --java
        ---...(description omitted for brevity)
    --resources
        ---...(description omitted for brevity)