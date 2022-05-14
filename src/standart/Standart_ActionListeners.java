package standart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class Standart_ActionListeners extends Standart {
	public static List<Character> operators = Arrays.asList('+', '-', '*', '/', '%');
	public static List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

	public static double[] operations = {0.0, 0.0};
	public static char currentOperator = ' ';
}
 
class DotPressed extends Standart_ActionListeners implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		writeDot(str);
	}

	public void writeDot(String str) {
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
					Standart.outputFieldStandart.setText(str + ".");
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
}

class DeletePressed extends Standart_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		
		if(name == "deleteAll") {
			Standart.outputFieldStandart.setText("");
		} else if (name == "deleteOne") {
			Standart.outputFieldStandart.setText(str.substring(0, str.length()-1));
		} else {
			System.out.println("Something went wrong.");
		}
	}
}

class NumberPressed extends Standart_ActionListeners implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		int nameInt = Integer.parseInt(name);
		
		String type = "number";
		
		type = checkTypeOfInput(str, type);
		writeNumber(str, nameInt, type);	
	}

	public String checkTypeOfInput(String str, String type) {
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

	public void writeNumber(String str, int nameInt, String type) {
		for(int i = 0 ; i < numbers.size(); ++i) {
			if(nameInt == numbers.get(i)) {
				if(type.equals("number")) {
					Standart.outputFieldStandart.setText(str + numbers.get(i));
				} else if (type.equals("operator")){
					Standart.outputFieldStandart.setText(Integer.toString(numbers.get(i)));
				}
			} 
		}
	}
}

class OperatorPressed extends Standart_ActionListeners implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		char nameChar = name.charAt(0);
		
		writeOperator(str, name, nameChar);
	}

	public void writeOperator(String str, String name, char nameChar) {
		if(str.isEmpty()) {
			if(name.equals("-")) {
				Standart.outputFieldStandart.setText("-");
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
							Standart.outputFieldStandart.setText(str + operators.get(i));
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
					Standart.outputFieldStandart.setText(str + name);
				} else {
					System.out.println("Operator + operator. Wrong.");
				}
			}
		}
	}
}

class EqualsPressed extends Standart_ActionListeners implements ActionListener{

	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		solve(str);
	}

	public void solve(String str) {
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
				Standart.outputFieldStandart.setText(Integer.toString(answerInt));
			} else {
				Standart.outputFieldStandart.setText(Double.toString(answer));
			}
		}
	}
}

class ChangeSignPressed extends Standart_ActionListeners implements ActionListener{

	void change(String str) {
		if(str.isEmpty()) {
			Standart.outputFieldStandart.setText("-");
		} else {
			char lastChar = str.charAt(str.length()-1);
			char firstChar = str.charAt(0);
			if(lastChar == '-' && str.length() == 1) {
				Standart.outputFieldStandart.setText("");
			} else {
				if(firstChar != '-') {
					Standart.outputFieldStandart.setText("-" + str);
				} else {
					Standart.outputFieldStandart.setText(str.substring(1, str.length()));
				} 
			}
		}
	}

	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		change(str);
	}
}