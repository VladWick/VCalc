# VCalc
Handy calculator with useful features for math students.

Version: 0.1 
Author: VladWick

---------------------------------------

# Description 
This programm is written in Java using Swing.

Standart 
	Just average simple calculator with usual actions 
Scientific 
	Extended Calc with doubled functionality
Derivatives 
	Find the derivative of a function if the function itself is in user`s input 
Integrals 
	Find indefinite integral of a function if the function itself is in user`s input 
	
"Standart" and "Scientific" provide a whole bunch of buttons. Press on button - means change text in JLabel.
It means that you can`t paste expression and find an answer. You need type it. 

Derivatives and Integrals provide JTextField in which you can paste expression and then, after clicking on "Find Derivative/Integral", you can get an answer in the botton field.
	
---------------------------------------

# Implementation 
Architecture of the programm in this version is terrible. 75 classes for just a calculator.
Every single button has its own ActionListener class that doing the same thing in 90% of buttons. 

---------------------------------------

# Problems and bugs in this version 
Standart 
	No parentheses available 
	Change sign works only for the first number 
	
Scientific 
	Copy of the StandartCalc
	Scientific Calc buttons work as well as in the StandartCalc but other buttons does not make sense and only provide errors  
	
Derivatives 
	Only Supports standart table of functions (such as sin(x), x^n etc...)
		no coefficients 
		no other variables (only x)
	Stupid and raw side of programm actually 
	
Integrals 
	Only Supports standart table of functions (such as sin(x), x^n etc...)
		no coefficients 
		no other variables (only x)
	Stupid and raw side of programm as well as Derivatives 
	
