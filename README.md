# Chapter13exerciseProjectPAYROLL

a project that will simulate a weekly payroll. This payroll includes 2 types of employees -- managers and hourly employees. Managers have annual salaries, hourly employees have are paid by the hour.

Use the following data:

1. Manager, salaried: Ann Barrett, annual pay $52,000
2. Manager, salaried: Frank Greene, annual pay $48,000
3. Hourly employee: Barry Johnson, $12.50/hour
4. Hourly employee: Cathy Davidson, $15.00/hour
5. Hourly employee: Dan Peters, $10.00/hour

Note that the names of the employees are right-aligned so that the colons after the names are lined up. The pay for all employees appears in a column, and the hours and hourly rate for hourly employees are aligned in columns.

Create a base or super class for an Employee. This class has instance variables for first name and last name of each employee. Include a constructor that accepts 2 strings for the first and last name. It needs the usual get and set methods for each String (first name and last name). Add a method to get the full name, which will concatenate the first name and last name together with a space between them. For example, if the first name is “Bob” and the last name is “Jones”, the method to get the full name would return “Bob Jones”.

Create a class for Hourly Employees that extends the Employee class. Besides the name of the employee which it inherits from the Employee class, this class needs instance variables for the employee’s pay rate and hours worked. Use a constructor that has 3 parameters, 2 strings for the first and last name, and a double for the pay rate. Include the usual set and get methods for the rate and for the hours. Write a method to calculate and return the gross pay for the employee. Do the usual calculations for gross pay – any hours > 40 are overtime hours, and those hours are paid at 1.5 the pay rate.

Create a class for Salaried Employees that also extends the Employee class. Besides the name of the employee which it inherits from the Employee class, this class needs a variable for annual pay. The constructor has 3 parameters, 2 strings for the first and last name, and a double for the annual pay. Include the usual get and set methods for the annual pay. Create a method that calculates and returns the weekly pay for the employee.

Create unit tests for the classes that calculate weekly pay, with at least 5 tests for each calculation. Take a screenshot of the successful results.

In the driver class, create 2 Array Lists, one for hourly employees (staff) and one for salaried employees (managers). Using anonymous objects, add 2 managers and 3 staff to their respective array lists. For the staff, ask the user how many hours the employee worked and add that to the object in the array list for that employee – be sure to list the employee’s name in the query. Then print the results of the payroll as seen in the sample session.

You can use a For loop or a For-Each loop to go through the ArrayLists to access each employee’s data. Note that with a For loop, you have to get the employee from the ArrayList before you can access its methods, and that with a For-Each loop, you can skip that method call to get the employee data. See the examples in the book on p. 442, where it shows a For loop and a For-Each loop to display a bear object.

You will need to use printf() to get the style of results specified in the sample session. Use the tab escape character and a length value on the String variables.

Take a screenshot of your execution of the sample session, then run the program again with different hours for the hourly employees and take a screenshot.

 

Submission: the specified screenshots (of execution of the program and successful unit tests) and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[email me](bellKevin.me) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
