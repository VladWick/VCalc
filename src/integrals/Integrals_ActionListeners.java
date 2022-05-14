package integrals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Integrals_ActionListeners extends Integrals {
	
}

class ClearIntegralsPressed extends Integrals_ActionListeners implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		inputFuncIntegrals.setText("");
		outputFuncIntegrals.setText("");
	}
}

class FindIntegralPressed extends Integrals_ActionListeners implements ActionListener {
	ArrayList<String> expressions = new ArrayList<String>();
	ArrayList<Character> operators = new ArrayList<Character>();
	
	void breakIntoPieces(String str) {
		
		//5.6*(9*x-4)^(123.123)+5.6*(9*x-4)^(123.123)
		for(int i = 0 ; i < str.length(); ++i) {
			if(str.charAt(i) == '+') {
				operators.add(str.charAt(i));
				
				String numberBeforeString = str.substring(0, i);
				expressions.add(numberBeforeString);
				
				str = str.substring(i+1, str.length());
				i = 0;
			}
		}
		
		expressions.add(str);
		str = "";
		
		System.out.println(expressions);
		System.out.println(operators);
	}
	
	String solve(String str) {
		int amountOfParentheses = 0;
		for(int j = 0; j < str.length(); ++j) {
			if(str.charAt(j) == '(') {
				amountOfParentheses += 1;
			}
		}
		
		int indexOfX = str.indexOf("x");
		int indexOfExp = str.indexOf("^");
		int indexOfLeftPar = str.indexOf("(");
		
		String answer = "";
		
		// C*x^(n+1)/(n+1)
		if(amountOfParentheses == 2) {
			if(indexOfX-1 != indexOfLeftPar) {
				//5.6*(9*x-4)^(123.123)
				//C*(Bx-a)^(number)
				String newX = str.substring(indexOfLeftPar, indexOfExp);
				
				String exponentString = str.substring(indexOfExp+2, str.length()-1);
				Double exponent = Double.parseDouble(exponentString);
				String coefficientString = str.substring(0, indexOfLeftPar-1);
				Double coefficient = Double.parseDouble(coefficientString);
				
				String coefficientOfXString = str.substring(indexOfLeftPar+1 ,indexOfX-1);
				Double coefficientOfX = Double.parseDouble(coefficientOfXString);
				
				Double newCoefficient = (coefficientOfX*coefficient/(exponent+1));
				
				answer = newCoefficient + "*" + newX + "^(" + (exponent+1) + ")";
				if(newCoefficient == Math.floor(newCoefficient)) {
					int newCoefficientInt = newCoefficient.intValue();	
					answer = newCoefficientInt + "*" + newX;
				}
				if(exponent == Math.floor(exponent)) {
					int exponentInt = exponent.intValue();			
					answer += "^(" + (exponentInt+1) + ")";
				} 
			} else {
				//5.6*(x-4)^(123.123)
				//C*(x-a)^(number)
				String newX = str.substring(indexOfLeftPar, indexOfExp);
				
				String exponentString = str.substring(indexOfExp+2, str.length()-1);
				Double exponent = Double.parseDouble(exponentString);
				String coefficientString = str.substring(0, indexOfX-2);
				Double coefficient = Double.parseDouble(coefficientString);	
				Double newCoefficient = (coefficient/(exponent+1));
				
				answer = newCoefficient + "*" + newX + "^(" + (exponent+1) + ")";
				if(newCoefficient == Math.floor(newCoefficient)) {
					int newCoefficientInt = newCoefficient.intValue();	
					answer = newCoefficientInt + "*" + newX;
				}
				if(exponent == Math.floor(exponent)) {
					int exponentInt = exponent.intValue();			
					answer += "^(" + (exponentInt+1) + ")";
				} 
			}
		} else if (amountOfParentheses == 1) {
			//7*x^(456)
			//C*x^(number)
			String coefficientString = str.substring(0, indexOfX-1);
			Double coefficient = Double.parseDouble(coefficientString);
			String exponentString = str.substring(indexOfX+3, str.length()-1);
			Double exponent = Double.parseDouble(exponentString);
			
			Double newCoefficient = (coefficient/(exponent+1));
			
			answer = newCoefficient + "*" + "x^(" + (exponent+1) + ")";
		} else {
			System.out.println("Something went wrong.");
		}
		return answer;
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = inputFuncIntegrals.getText();
		
		if(str.contains("x") && str.contains("^") && str.contains("(") && str.contains(")")) {
			// Filling 'expressions' and 'operators' 
			breakIntoPieces(str);
			
			String finalAnswer = "";
			for(int i = 0 ; i < expressions.size(); ++i) {
				finalAnswer += solve(expressions.get(i)) + "+";
			}
			
			// Fix the bug with '+' at the end
			System.out.println(finalAnswer);
			if(finalAnswer.contains("+")) {
				finalAnswer = finalAnswer.substring(0, finalAnswer.length()-1);
				outputFuncIntegrals.setText(finalAnswer);
			} else {
				outputFuncIntegrals.setText(finalAnswer);
			}
			expressions.clear();
			operators.clear();
		} else {
			System.out.println("Unappropriate input. Missing 'x' or '^' of '(' of ')' " );
		}
	}
}
