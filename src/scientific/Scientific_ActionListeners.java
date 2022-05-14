package scientific;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class Scientific_ActionListeners extends Scientific {
	public static List<Character> operators = Arrays.asList('+', '-', '*', '/', '%');
	public static List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	public static List<String> functions = Arrays.asList("sin", "cos", "tg", "sqrt", "reverse", "exponent", 
															"square", "factorial", "abs", "lg", "ln");

	public static double[] operations = {0.0, 0.0};
	public static char currentOperator = ' ';
	
	public static double[] exponentOperations = {0.0, 0.0};
	
	public final Double PI = 3.14159265359;
	public final Double E = 2.71828;
}

class DotPressedScientific extends Scientific_ActionListeners implements ActionListener {

	void writeDot(String str) {
		if(str.isEmpty()) {
			System.out.println("Can`t start expression with dot.");
		} else {
			char lastChar = str.charAt(str.length()-1);
			String acceptString = "accept";
			for(int i = 0 ; i < operators.size(); ++i) {
				if(lastChar == operators.get(i)) {
					acceptString = "operator";
					break;
				} else if(lastChar == '.') {
					acceptString = "dot";
					break;
				}
			}
			
			if(acceptString.equals("accept")) {
				// Checking whole string for 'dots'
				boolean accept2 = true;
				for(int i = 0 ; i < str.length()-1; i++) {
					char currentChar = str.charAt(i);
					if(currentChar == '.') {
						accept2 = false;
						System.out.print("Dot was already been pressed.");
						break;
					}
				}
				
				if(accept2) {
				Scientific.outputFieldScientific.setText(str + ".");
				}
			
			} else if(acceptString.equals("dot")) {
				System.out.println("Unacceptable. Dot + dot");
			} else if(acceptString.equals("operator")) {
				System.out.println("Unacceptable. Operator + dot.");
			} else {
				System.out.println("Something went wrong.");
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		writeDot(str);
	}
}

class DeletePressedScientific extends Scientific_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		
		if(name.equals("deleteAll")) {
			Scientific.outputFieldScientific.setText("");
		} else if (name.equals("deleteOne")) {
			Scientific.outputFieldScientific.setText(str.substring(0, str.length()-1));
		} else {
			System.out.println("Something went wrong.");
		}
	}
}

class NumberPressedScientific extends Scientific_ActionListeners implements ActionListener{
	
	void writeNumber(String str, int nameInt, String type) {
		for(int i = 0 ; i < numbers.size(); ++i) {
			if(nameInt == numbers.get(i)) {
				if(type.equals("number")) {
					Scientific.outputFieldScientific.setText(str + numbers.get(i));
				} else if (type.equals("operator")){
					Scientific.outputFieldScientific.setText(Integer.toString(numbers.get(i)));
				}
			} 
		}
	}

	String checkTypeOfInput(String str, String type) {
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(!str.equals("-")) {
				for(int i = 0 ; i < operators.size(); ++i) {
					if(lastChar == operators.get(i)) {
						type = "operator";
						currentOperator = operators.get(i);
						// Adding first operation here to prevent problems in 'ChangeSign'
						String substr = str.substring(0, str.length()-1);
						double firstOperation = Double.parseDouble(substr); 
						operations[0] = firstOperation;
						break;
					}
				}
			}
		}
		return type;
	}


	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		int nameInt = Integer.parseInt(name);
		
		String type = "number";
		type = checkTypeOfInput(str, type);
		
		writeNumber(str, nameInt, type);
	}
}

class ConstPressed extends Scientific_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		
		JButton o = (JButton)e.getSource();
		String nameString = o.getName();
		
		if(nameString.equals("e")) {
			Scientific.outputFieldScientific.setText(str + E);
		} else if(nameString.equals("pi")) {
			Scientific.outputFieldScientific.setText(str + PI);
		} else {
			System.out.println("Something went wrong.");
		}
	}
}

class OperatorPressedScientific extends Scientific_ActionListeners implements ActionListener{

	void writeOperator(String str, String name, char nameChar) {
		if(exponentOperations[0] != 0.0 && str.charAt(0) == '^') {
		System.out.println("Exponent is in progress. Press enter firstly.");
		} else {
			//Main wave of the programm
			if(str.isEmpty()) {
				if(name.equals("-")) {
					Scientific.outputFieldScientific.setText("-");
				} else {
					System.out.println("Expression can`t start with the operator rather than minus.");
				}
			} else if(str.length() == 1) {
				char lastChar = str.charAt(str.length()-1);
				
				if(lastChar == '-') {
					if(name.equals("-")) {
						System.out.println("Two minuses at the start. Wrong.");
					} else {
						System.out.println("Minus + operator at the start. Wrong.");
					}
				} else {
					boolean accept = true;
					for(int i = 0; i < operators.size(); ++i) {
						if(lastChar == operators.get(i)) {
							accept = false;
							break;
						}
					}
					if(!accept) {
						System.out.println("Operator + operator. Wrong.");
					} else {
						for(int i = 0; i < operators.size(); ++i) {
							if(nameChar == operators.get(i)) {
								Scientific.outputFieldScientific.setText(str + operators.get(i));
								break;
							}
						}
					}
				}
			} else {
				char lastChar = str.charAt(str.length()-1);	
				if(lastChar == '.') {
					System.out.println("Dot + operator. Unacceptable.");
				} else {
					boolean operatorLastChar = false;
					for(int i = 0; i < operators.size(); ++i) {
						if(lastChar == operators.get(i)) {
							operatorLastChar = true;
						}
					}
					if(!operatorLastChar) {
						Scientific.outputFieldScientific.setText(str + name);
					} else {
						System.out.println("Operator + operator. Wrong.");
					}
				}
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		char nameChar = name.charAt(0);
		
		writeOperator(str, name, nameChar);
	}
}

class FunctionPressedScientific extends Scientific_ActionListeners implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String nameString = o.getName();
		
		Double value = Double.parseDouble(str);
		Double answer = 0.0;
		if(nameString.equals("sin")) {
			answer = Math.sin(value);
		} else if(nameString.equals("cos")) {
			answer = Math.cos(value);
		} else if(nameString.equals("tg")) {
			answer = Math.tan(value);
		} else if(nameString.equals("sqrt")) {
			answer = Math.sqrt(value);
		} else if(nameString.equals("square")) {
			answer = Math.pow(value, 2);
		} else if(nameString.equals("reverse")) {
			answer = Math.pow(value, -1);
		} else if(nameString.equals("ln")) {
			answer = Math.log(value);
		} else if(nameString.equals("lg")) {
			answer = Math.log10(value);
		} else if(nameString.equals("abs")) {
			answer = Math.abs(value);
		} else if(nameString.equals("exponent")) {
			exponentOperations[0] = value;
			Scientific.outputFieldScientific.setText("^");
		} else if(nameString.equals("factorial")) {
			if(Math.floor(value) == value) {
				int valueInt = Integer.parseInt(str);
				int finalAnswer = 1;
				for(int i = valueInt; i > 0; i--) {
					finalAnswer = finalAnswer * i;
				}
				answer = Double.valueOf(finalAnswer);
			} else {
				System.out.println("Number mast be INTEGER, not DOUBLE.");
			}
		}
		operations[0] = answer;
		computeFunction(answer, nameString);
	}

	void computeFunction(Double answer, String nameString) {
		if(!nameString.equals("exponent")) {
			if(answer == Math.floor(answer)) {
			int answerInt = answer.intValue();			
				Scientific.outputFieldScientific.setText(Integer.toString(answerInt));
			} else {
				Scientific.outputFieldScientific.setText(Double.toString(answer));
			}
		}
	}
}

class EqualsPressedScientific extends Scientific_ActionListeners implements ActionListener{

	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		solve(str);
	}

	void solve(String str) {
		if(exponentOperations[0] != 0.0 && str.charAt(0) == '^') {
			String substr = str.substring(1, str.length());
			Double exp = Double.parseDouble(substr);
			
			exponentOperations[1] = exp;
			
			Double answer = Math.pow(exponentOperations[0], exponentOperations[1]);
			
			if(answer == Math.floor(answer)) {
				int answerInt = answer.intValue();			
				Scientific.outputFieldScientific.setText(Integer.toString(answerInt));
			} else {
				Scientific.outputFieldScientific.setText(Double.toString(answer));
			}
			exponentOperations[0] = 0.0;
			exponentOperations[1] = 0.0;
		} else {
			if(str.isEmpty()) {
				System.out.println("Nothing to solve.");
			} else {
				String lastChar = str.substring(str.length()-1);
				double lastCharDouble = Double.parseDouble(lastChar);
				
				/*Adding second operation number*/
				for(int i = 0 ; i < numbers.size(); ++i) {
				if(lastCharDouble == numbers.get(i)) {
					
					String substr = str.substring(0, str.length());
					double secondOperation = Double.parseDouble(substr); 
					operations[1] = secondOperation;
					
					break;
				}
				}
				
				/*Solving the Calc*/
				double x = operations[0];
				double y = operations[1];
				Double answer = 0.0;
				
				switch(currentOperator) {
				case '*': {
					answer = x*y;
					operations[0] = answer;
					operations[1] = 0.0;
					break;
				}
				case '/': {
					answer = x/y;
					operations[0] = answer;
					operations[1] = 0.0;
					break;
				}
				case '+': {
					answer = x+y;
					operations[0] = answer;
					operations[1] = 0.0;
					break;
				}
				case '-': {
					answer = x-y;
					operations[0] = answer;
					operations[1] = 0.0;
					break;
				}
				case '%': {
					answer = x%y;
					operations[0] = answer;
					operations[1] = 0.0;
					break;
				}
				}
				
				if(answer == Math.floor(answer)) {
					int answerInt = answer.intValue();			
					Scientific.outputFieldScientific.setText(Integer.toString(answerInt));
				} else {
					Scientific.outputFieldScientific.setText(Double.toString(answer));
				}
			}
		}
	}
}

class ChangeSignPressedScientific extends Scientific_ActionListeners implements ActionListener{

	void change(String str) {
		if(str.isEmpty()) {
			Scientific.outputFieldScientific.setText("-");
		} else {
			char lastChar = str.charAt(str.length()-1);
			char firstChar = str.charAt(0);
			if(lastChar == '-' && str.length() == 1) {
				Scientific.outputFieldScientific.setText("");
			} else {
				if(firstChar != '-') {
					Scientific.outputFieldScientific.setText("-" + str);
				} else {
					Scientific.outputFieldScientific.setText(str.substring(1, str.length()));
				} 
			}
		}
	}

	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		change(str);
	}
}