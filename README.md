# VCalc 0.3
---------------------------------------
Handy calculator with useful features for math students.

<i>Version: 0.3</i> <br>
<i>Author: VladWick</i>

---------------------------------------

<h2>Description</h2>
This programm is written in Java using Swing.

<h3>Standart</h3> 
	&emsp; Just average simple calculator with usual actions 
<h3>Scientific</h3> 
	&emsp; Extended Calc with doubled functionality
<h3>Derivatives</h3>
	&emsp; Find the derivative of a function if the function itself is in user's input 
<h3>Integrals</h3>
	&emsp;Find indefinite integral of a function if the function itself is in user's input<br>
	
"Standart" and "Scientific" provide a whole bunch of buttons. Press on button - means change text in JLabel.
It means that you can not paste expression and find an answer. You need type it. 

Derivatives and Integrals provide JTextField in which you can paste expression and then, after clicking on "Find Derivative/Integral", you can get an answer in the botton field.
	
---------------------------------------

<h2>Implementation</h2>
Architecture of the programm in this version is terrible. 75 classes for just a calculator. <br>
Every single button has its own ActionListener class that doing the same thing in 90% of buttons. 

---------------------------------------

<h2>Problems and bugs in this version</h2>
<h3>Standart</h3>
	&emsp; No parentheses available <br>
	&emsp; Change sign works only for the first number <br>
	
<h3>Scientific</h3> <br>
	&emsp; Copy of the StandartCalc <br>
	&emsp; Scientific Calc buttons work as well as in the StandartCalc but other buttons does not make sense and only provide errors <br>
	
<h3>Derivatives</h3>
	&emsp; Only Supports standart table of functions (such as sin(x), x^n etc...)<br>
		&emsp; &emsp; no coefficients <br>
		&emsp; &emsp; no other variables (only x)<br>
	&emsp; Stupid and raw side of programm actually <br>
	
<h3>Integrals</h3>
	&emsp; Only Supports standart table of functions (such as sin(x), x^n etc...)<br>
		&emsp; &emsp; no coefficients <br>
		&emsp; &emsp; no other variables (only x)<br>
	&emsp; Stupid and raw side of programm as well as Derivatives <br>
	
---------------------------------------
<h2>UPDATE VCalc0.2</h2>
&emsp; - Better readability and architecture now because less classes<br>
&emsp; - Dark and white mode move to another new class called "Design"<br>
&emsp; - Move switching classes to the "Design"<br>
&emsp; - Made a Calc with the same functionality. but with one operation at a time in StandartCalc<br>

---------------------------------------
<h2>UPDATE VCalc0.3</h2>
&emsp; - Update whole programm with the ideas of "Clean Code" <br>
&emsp; - all classes is divided into functions in a right and readable way  <br>
&emsp; - all the design details into the class "Design" => dark and white mode  <br>
&emsp; - less comments - better code layout  <br>
