package ssdi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.border.*;

public class Standart {
	
	public static JFrame standartFrame = new JFrame();
	public static JFrame scientificFrame = new JFrame();
	public static JFrame derivativesFrame = new JFrame();
	public static JFrame integralsFrame = new JFrame(); 

	public static JPanel mainPanelStandart = new JPanel();
	
	public static JPanel menuFieldStandart = new JPanel();
	public static JLabel nameStandart = new JLabel("Standart");
	public static JButton darkThemeButtonDefaultStandart = new JButton();
	public static JButton lightThemeButtonDefaultStandart = new JButton();
	
	public static JPanel switchPanelStandart = new JPanel();
	public static JButton standartCalcButtonStandart = new JButton();
	public static JButton scientificCalcButtonStandart = new JButton();
	public static JButton derivativesCalcButtonStandart = new JButton();
	public static JButton integralsCalcButtonStandart = new JButton();
	
	public static JLabel outputFieldStandart = new JLabel();
	
	public static JPanel buttonsLabelStandart = new JPanel();
	public static JButton deleteAllButton = new JButton();
	public static JButton deleteOneButton = new JButton();
	public static JButton persentButton = new JButton();
	public static JButton divideButton = new JButton();
	public static JButton sevenButton = new JButton();
	public static JButton eightButton = new JButton();
	public static JButton nineButton = new JButton();
	public static JButton multipleButton = new JButton();
	public static JButton fourButton = new JButton();
	public static JButton fiveButton = new JButton();
	public static JButton sixButton = new JButton();	
	public static JButton minusButton = new JButton();
	public static JButton oneButton = new JButton();
	public static JButton twoButton = new JButton();
	public static JButton threeButton = new JButton();
	public static JButton plusButton = new JButton();
	public static JButton zeroButton = new JButton();
	public static JButton dotButton = new JButton();
	public static JButton equalsButton = new JButton();
	public static JButton changeSignButton = new JButton();

	// Calculation variables
	public static List<Character> operators = Arrays.asList('+', '-', '*', '/', '%');
	public static List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

	public static double[] operations = {0.0, 0.0};
	public static char currentOperator = ' ';
	
	// Neutral components
	public static Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
	public static Font font18 = new Font(Font.SANS_SERIF,  Font.BOLD, 18);
	public static Font font20 = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
	public static Font font25 = new Font(Font.SANS_SERIF,  Font.BOLD, 25);

	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorDarkGrey = new Color(12, 12, 12);
	public static Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	public static Color colorWhite = new Color(255, 255, 255);
	public static Color colorDarkWhite = new Color(250, 250, 250);
	public static Color colorDeeperDarkWhite = new Color(245, 245, 245);
	public static Color colorRed = new Color(255, 0, 0);
	public static Color colorGreen = new Color(0, 255, 0);
	public static Color colorBlue = new Color(0, 0, 255);
	
	public void addingComponentsInTheRightOrder() {
		
		menuFieldStandart.add(nameStandart);
		menuFieldStandart.add(darkThemeButtonDefaultStandart);
		menuFieldStandart.add(lightThemeButtonDefaultStandart);
		
		switchPanelStandart.add(standartCalcButtonStandart);
		switchPanelStandart.add(scientificCalcButtonStandart);
		switchPanelStandart.add(derivativesCalcButtonStandart);
		switchPanelStandart.add(integralsCalcButtonStandart);
		
		mainPanelStandart.add(menuFieldStandart);
		mainPanelStandart.add(switchPanelStandart);
		mainPanelStandart.add(outputFieldStandart);
		
		buttonsLabelStandart.add(deleteAllButton);
		buttonsLabelStandart.add(deleteOneButton);
		buttonsLabelStandart.add(persentButton);
		buttonsLabelStandart.add(divideButton);
				
		buttonsLabelStandart.add(sevenButton);
		buttonsLabelStandart.add(eightButton);
		buttonsLabelStandart.add(nineButton);
		buttonsLabelStandart.add(multipleButton);
				
		buttonsLabelStandart.add(fourButton);
		buttonsLabelStandart.add(fiveButton);
		buttonsLabelStandart.add(sixButton);
		buttonsLabelStandart.add(minusButton);
				
		buttonsLabelStandart.add(oneButton);
		buttonsLabelStandart.add(twoButton);
		buttonsLabelStandart.add(threeButton);
		buttonsLabelStandart.add(plusButton);
				
		buttonsLabelStandart.add(zeroButton);
		buttonsLabelStandart.add(dotButton);
		buttonsLabelStandart.add(changeSignButton);
		buttonsLabelStandart.add(equalsButton);
	}
	
	public void customizeComponents() throws IOException {
		
		mainPanelStandart.setLayout(new GridLayout(3, 1));
		
		nameStandart.setText("Standart Calc");
		nameStandart.setFont(font20);
		nameStandart.setVerticalAlignment(JLabel.CENTER);
		nameStandart.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage buttonIconDark = ImageIO.read(new File("src/ssdi/images/iconDarkTheme.png"));
		buttonIconDark = resize(buttonIconDark, 50, 50);
		darkThemeButtonDefaultStandart = new JButton(new ImageIcon(buttonIconDark));
		darkThemeButtonDefaultStandart.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultStandart.setContentAreaFilled(false);	
		BufferedImage buttonIconLight = ImageIO.read(new File("src/ssdi/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultStandart = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultStandart.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultStandart.setContentAreaFilled(false);
		menuFieldStandart.setLayout(new GridLayout(1, 3));
		
		standartCalcButtonStandart.setText("Standart");
		standartCalcButtonStandart.setFont(font18);
		scientificCalcButtonStandart.setText("Scientific");
		scientificCalcButtonStandart.setFont(font18);
		derivativesCalcButtonStandart.setText("Derivatives");
		derivativesCalcButtonStandart.setFont(font18);
		integralsCalcButtonStandart.setText("Integrals");
		integralsCalcButtonStandart.setFont(font18);
		switchPanelStandart.setLayout(new GridLayout(4, 1));
		
		outputFieldStandart.setBounds(30,100, 50, 50);
		outputFieldStandart.setFont(font20);
		outputFieldStandart.setBorder(solidBorder);
		outputFieldStandart.setVerticalAlignment(JLabel.CENTER);
		outputFieldStandart.setHorizontalAlignment(JLabel.CENTER);
		
		// Buttons started here  
		deleteAllButton.setText("AC");
		deleteAllButton.setName("deleteAll");
		deleteAllButton.setFont(font20);
		
		BufferedImage buttonIconDelete = ImageIO.read(new File("src/ssdi/images/iconDelete.png"));
		buttonIconDelete = resize(buttonIconDelete, 35, 35);
		deleteOneButton = new JButton(new ImageIcon(buttonIconDelete));
		deleteOneButton.setName("deleteOne");
		
		persentButton.setText("%");
		persentButton.setName("%");
		persentButton.setFont(font20);

		divideButton.setText("/");
		divideButton.setName("/");
		divideButton.setFont(font20);
	
		sevenButton.setText("7");
		sevenButton.setName("7");
		sevenButton.setFont(font20);
		
		eightButton.setText("8");
		eightButton.setName("8");
		eightButton.setFont(font20);
		
		nineButton.setText("9");
		nineButton.setName("9");
		nineButton.setFont(font20);
		
		multipleButton.setText("*");
		multipleButton.setName("*");
		multipleButton.setFont(font20);
		
		fourButton.setText("4");
		fourButton.setName("4");
		fourButton.setFont(font20);
		
		fiveButton.setText("5");
		fiveButton.setName("5");
		fiveButton.setFont(font20);
		
		sixButton.setText("6");
		sixButton.setName("6");
		sixButton.setFont(font20);
		
		minusButton.setText("-");
		minusButton.setName("-");
		minusButton.setFont(font20);
	
		oneButton.setText("1");
		oneButton.setName("1");
		oneButton.setFont(font20);
		
		twoButton.setText("2");
		twoButton.setName("2");
		twoButton.setFont(font20);
		
		threeButton.setText("3");
		threeButton.setName("3");
		threeButton.setFont(font20);
	
		plusButton.setText("+");
		plusButton.setName("+");
		plusButton.setFont(font20);
		
		zeroButton.setText("0");
		zeroButton.setName("0");
		zeroButton.setFont(font20);
		
		dotButton.setText(".");
		dotButton.setName(".");
		dotButton.setFont(font20);
		
		changeSignButton.setText("+/-");
		changeSignButton.setFont(font20);
		
		equalsButton.setText("=");
		equalsButton.setFont(font20);
		
		buttonsLabelStandart.setBounds(40, 50, 0, 0);
		buttonsLabelStandart.setLayout(new GridLayout(5, 4, 3, 3));	
	}
	
	public void actionListeners() {
		darkThemeButtonDefaultStandart.addActionListener(new darkThemeButtonDefaultStandartPressed());
		lightThemeButtonDefaultStandart.addActionListener(new lightThemeButtonDefaultStandartPressed());
		
		standartCalcButtonStandart.addActionListener(new StandartMenuPressed());
		scientificCalcButtonStandart.addActionListener(new ScientificMenuPressed());
		derivativesCalcButtonStandart.addActionListener(new DerivativesMenuPressed());
		integralsCalcButtonStandart.addActionListener(new IntegralsMenuPressed());
		
		deleteAllButton.addActionListener(new DeletePressed());
		deleteOneButton.addActionListener(new DeletePressed());
		persentButton.addActionListener(new OperatorPressed());
		divideButton.addActionListener(new OperatorPressed());
		sevenButton.addActionListener(new NumberPressed());
		eightButton.addActionListener(new NumberPressed());
		nineButton.addActionListener(new NumberPressed());
		multipleButton.addActionListener(new OperatorPressed());
		fourButton.addActionListener(new NumberPressed());
		fiveButton.addActionListener(new NumberPressed());
		sixButton.addActionListener(new NumberPressed());
		minusButton.addActionListener(new OperatorPressed());
		oneButton.addActionListener(new NumberPressed());
		twoButton.addActionListener(new NumberPressed());
		threeButton.addActionListener(new NumberPressed());
		plusButton.addActionListener(new OperatorPressed());
		zeroButton.addActionListener(new NumberPressed());
		dotButton.addActionListener(new DotPressed());
		changeSignButton.addActionListener(new ChangeSignPressed());
		equalsButton.addActionListener(new EqualsPressed());	
	}
	
	public void defaultWhiteMode() throws IOException {
		menuFieldStandart.setBackground(colorDarkWhite);
		nameStandart.setBackground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		switchPanelStandart.setBackground(colorDarkWhite);
		standartCalcButtonStandart.setBackground(colorDarkWhite);
		scientificCalcButtonStandart.setBackground(colorDarkWhite);
		derivativesCalcButtonStandart.setBackground(colorDarkWhite);
		integralsCalcButtonStandart.setBackground(colorDarkWhite);
		outputFieldStandart.setBackground(colorDarkWhite);
		buttonsLabelStandart.setBackground(colorWhite);
		oneButton.setBackground(colorDarkWhite);
		twoButton.setBackground(colorDarkWhite);
		threeButton.setBackground(colorDarkWhite);
		fourButton.setBackground(colorDarkWhite);
		fiveButton.setBackground(colorDarkWhite);
		sixButton.setBackground(colorDarkWhite);
		sevenButton.setBackground(colorDarkWhite);
		eightButton.setBackground(colorDarkWhite);
		nineButton.setBackground(colorDarkWhite);
		zeroButton.setBackground(colorDarkWhite);
		deleteAllButton.setBackground(colorDarkWhite);
		deleteOneButton.setBackground(colorDarkWhite);
		persentButton.setBackground(colorDarkWhite);
		equalsButton.setBackground(colorDarkWhite);
		changeSignButton.setBackground(colorDarkWhite);
		dotButton.setBackground(colorDarkWhite);
		plusButton.setBackground(colorDarkWhite);
		minusButton.setBackground(colorDarkWhite);
		multipleButton.setBackground(colorDarkWhite);
		divideButton.setBackground(colorDarkWhite);
		
		oneButton.setForeground(colorBlack);
		twoButton.setForeground(colorBlack);
		threeButton.setForeground(colorBlack);
		fourButton.setForeground(colorBlack);
		fiveButton.setForeground(colorBlack);
		sixButton.setForeground(colorBlack);
		sevenButton.setForeground(colorBlack);
		eightButton.setForeground(colorBlack);
		nineButton.setForeground(colorBlack);
		zeroButton.setForeground(colorBlack);
		deleteAllButton.setForeground(colorBlack);
		deleteOneButton.setForeground(colorBlack);
		persentButton.setForeground(colorBlack);
		equalsButton.setForeground(colorBlack);
		changeSignButton.setForeground(colorBlack);
		dotButton.setForeground(colorBlack);
		plusButton.setForeground(colorBlack);
		minusButton.setForeground(colorBlack);
		multipleButton.setForeground(colorBlack);
		divideButton.setForeground(colorBlack);
		menuFieldStandart.setForeground(colorBlack);
		nameStandart.setForeground(colorBlack);
		darkThemeButtonDefaultStandart.setForeground(colorBlack);
		lightThemeButtonDefaultStandart.setForeground(colorBlack);
		switchPanelStandart.setForeground(colorBlack);
		standartCalcButtonStandart.setForeground(colorBlack);
		scientificCalcButtonStandart.setForeground(colorBlack);
		derivativesCalcButtonStandart.setForeground(colorBlack);
		integralsCalcButtonStandart.setForeground(colorBlack);
		outputFieldStandart.setForeground(colorBlack);
	}
	
	public void startAndShowCalc() {
		
		standartFrame.setSize(450, 700);
		standartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		standartFrame.setLayout(new GridLayout(2, 0));
		standartFrame.add(mainPanelStandart);
		standartFrame.add(buttonsLabelStandart);
		standartFrame.setVisible(true);
	}
	
	public static BufferedImage resize(BufferedImage img, int newW, int newH) {
		Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();

	    return dimg;
	}
}

					/******************/
					/*Action Listeners*/
					/******************/

class DotPressed extends Standart implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		writeDot(str);
	}
	
	public void writeDot(String str) {
		if(str.isEmpty()) {
			System.out.println("Can`t start expression with dot.");
		} else {
			// Checking last char
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
class DeletePressed extends Standart implements ActionListener{
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
class NumberPressed extends Standart implements ActionListener{
	
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

class OperatorPressed extends Standart implements ActionListener{
	
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

class EqualsPressed extends Standart implements ActionListener{
	
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

class ChangeSignPressed extends Standart implements ActionListener{
	
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


/*One string solution*/
/**/
/*
class ChangeSignPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldStandart.getText();
		
		char charAtEnd = str.charAt(str.length() - 1);
		
		if(!str.isEmpty() && !(str.contains("%") || str.contains("*") || str.contains("/") || str.contains("-") || str.contains("+")) ) {

			if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
				Standart.outputFieldStandart.setText("-" + str);
			} 
			
		} else if(str.length() == 1 && charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			Standart.outputFieldStandart.setText("-" + str);
		} else {
			Standart.outputFieldStandart.setText("-");
		}
	}
}

class EqualsPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String fullStringOfInput = outputFieldStandart.getText();
		char charAtEnd = fullStringOfInput.charAt(fullStringOfInput.length() - 1);
		
		if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			
			ArrayList<String> arrayOfNumbers = new ArrayList<String>();
			ArrayList<String> arrayOfOperators = new ArrayList<String>();

			Double answer = 0.0;
			
			int i = 0;
			if(fullStringOfInput.charAt(0) == '-') {
				i = 1;
			}
			for(; i < fullStringOfInput.length(); ++i) {
				
				String substr = fullStringOfInput.substring(i, i+1); 
				
				if("+".equals(substr) || "-".equals(substr) || "/".equals(substr) || "*".equals(substr) || "%".equals(substr)) {
					String substr2 = fullStringOfInput.substring(0,i);
					
					arrayOfNumbers.add(substr2);
					arrayOfOperators.add(substr);
					
					fullStringOfInput = fullStringOfInput.substring(i+1, fullStringOfInput.length());
					i = 0;
				}
			}
			arrayOfNumbers.add(fullStringOfInput);
			
			System.out.println(arrayOfNumbers);
			System.out.println(arrayOfOperators);
			
			//System.out.println(answer);
			
			while(!arrayOfNumbers.isEmpty() || !arrayOfOperators.isEmpty() ) {
				//System.out.println(arrayOfNumbers.isEmpty());
				//System.out.println(arrayOfOperators.isEmpty());

				
				if(arrayOfOperators.contains("%") || arrayOfOperators.contains("*") || arrayOfOperators.contains("/")) {
					
					//System.out.println(arrayOfOperators.contains("%"));
					
					int index1 = 1000, index2 = 1000, index3 = 1000;
					
					if(arrayOfOperators.contains("%")) {
						index1 = arrayOfOperators.indexOf("%");
					}
					if(arrayOfOperators.contains("*")) {
						index2 = arrayOfOperators.indexOf("*");
					}
					if(arrayOfOperators.contains("/")) {
						index3 = arrayOfOperators.indexOf("/");
					}
					
					if(index1 < index2) {
						if(index1 < index3) {
							
							double x = Double.parseDouble(arrayOfNumbers.get(index1));
							double y = Double.parseDouble(arrayOfNumbers.get(index1+1));

							arrayOfNumbers.set(index1, Double.toString(x%y));
							arrayOfNumbers.remove(index1+1);
							
							arrayOfOperators.remove(index1);
							
						} else {
							double x = Double.parseDouble(arrayOfNumbers.get(index3));
							double y = Double.parseDouble(arrayOfNumbers.get(index3+1));

							arrayOfNumbers.set(index3, Double.toString(x/y));
							arrayOfNumbers.remove(index3+1);
							
							arrayOfOperators.remove(index3);
						}
					} else {
						if(index2 < index3) {
							double x = Double.parseDouble(arrayOfNumbers.get(index2));
							double y = Double.parseDouble(arrayOfNumbers.get(index2+1));

							arrayOfNumbers.set(index2, Double.toString(x*y));
							arrayOfNumbers.remove(index2+1);
							
							arrayOfOperators.remove(index2);
						} else {
							double x = Double.parseDouble(arrayOfNumbers.get(index3));
							double y = Double.parseDouble(arrayOfNumbers.get(index3+1));

							arrayOfNumbers.set(index3, Double.toString(x/y));
							arrayOfNumbers.remove(index3+1);
							
							arrayOfOperators.remove(index3);
						}
					}
				} else if(arrayOfOperators.contains("+") || arrayOfOperators.contains("-")) {
					
					int index1 = 1000, index2 = 1000;
					
					if(arrayOfOperators.contains("+")) {
						index1 = arrayOfOperators.indexOf("+");
					}
					if(arrayOfOperators.contains("-")) {
						index2 = arrayOfOperators.indexOf("-");
					}
					
					if(index1 < index2) {
						double x = Double.parseDouble(arrayOfNumbers.get(index1));
						double y = Double.parseDouble(arrayOfNumbers.get(index1+1));

						arrayOfNumbers.set(index1, Double.toString(x+y));
						arrayOfNumbers.remove(index1+1);
						arrayOfOperators.remove(index1);
						
					} else {
						double x = Double.parseDouble(arrayOfNumbers.get(index2));
						double y = Double.parseDouble(arrayOfNumbers.get(index2+1));
						
						arrayOfNumbers.set(index2, Double.toString(x-y));
						arrayOfNumbers.remove(index2+1);
						arrayOfOperators.remove(index2);
					}

					//System.out.println(index);
					//System.out.println("current array: " + arrayOfNumbers);
					
				} else {
					//System.out.println("Something went wrong. Or we good.");
					
					answer = Double.parseDouble(arrayOfNumbers.get(0));
					
					arrayOfNumbers.remove(0);
				}
			}
		
			//System.out.println(arrayOfNumbers);
			
			if(answer == Math.floor(answer)) {
				int answerFinal = answer.intValue();
				System.out.println(answerFinal);
				outputFieldStandart.setText(Integer.toString(answerFinal));
				System.out.println("------");
			} else {
				System.out.println(answer);
				outputFieldStandart.setText(Double.toString(answer));
				System.out.println("------");
			}
		} else {
			System.out.println("Wrong end of input (after press equals)");
		}
	}
}
*/