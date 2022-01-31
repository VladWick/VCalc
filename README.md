# VCalc
---------------------------------------
Handy calculator with useful features for math students.

<i>Version: 0.1</i> <br>
<i>Author: VladWick</i>

---------------------------------------

<h2>Description</h2>
This programm is written in Java using Swing.

Standart 
	Just average simple calculator with usual actions 
Scientific 
	Extended Calc with doubled functionality
Derivatives 
	Find the derivative of a function if the function itself is in user's input 
Integrals 
	Find indefinite integral of a function if the function itself is in user's input 
	
"Standart" and "Scientific" provide a whole bunch of buttons. Press on button - means change text in JLabel.
It means that you can not paste expression and find an answer. You need type it. 

Derivatives and Integrals provide JTextField in which you can paste expression and then, after clicking on "Find Derivative/Integral", you can get an answer in the botton field.
	
---------------------------------------

<h2>Implementation</h2>
Architecture of the programm in this version is terrible. 75 classes for just a calculator.

Every single button has its own ActionListener class that doing the same thing in 90% of buttons. 

---------------------------------------

<h2>Problems and bugs in this version</h2>
Standart <br>
	No parentheses available <br>
	Change sign works only for the first number <br>
	
Scientific <br>
	Copy of the StandartCalc <br>
	Scientific Calc buttons work as well as in the StandartCalc but other buttons does not make sense and only provide errors <br>
	
Derivatives <br>
	Only Supports standart table of functions (such as sin(x), x^n etc...)<br>
		no coefficients <br>
		no other variables (only x)<br>
	Stupid and raw side of programm actually <br>
	
Integrals <br>
	Only Supports standart table of functions (such as sin(x), x^n etc...)<br>
		no coefficients <br>
		no other variables (only x)<br>
	Stupid and raw side of programm as well as Derivatives <br>
	
