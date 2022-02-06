package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.border.*;

public class Standart {
	
	public static JFrame standartFrame = new JFrame();
	public static JFrame scientificFrame = new JFrame();
	public static JFrame derivativesFrame = new JFrame();
	public static JFrame integralsFrame = new JFrame(); 

	public JPanel mainPanelStandart = new JPanel();
	
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
		BufferedImage buttonIconDark = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDark = resize(buttonIconDark, 50, 50);
		darkThemeButtonDefaultStandart = new JButton(new ImageIcon(buttonIconDark));
		darkThemeButtonDefaultStandart.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultStandart.setContentAreaFilled(false);	
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
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
		
		BufferedImage buttonIconDelete = ImageIO.read(new File("src/images/iconDelete.png"));
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
		plusButton.addActionListener(new OperatorPressed());
		zeroButton.addActionListener(new NumberPressed());
		dotButton.addActionListener(new OperatorPressed());
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

class NumberPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldStandart.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		int nameInt = Integer.parseInt(name);
		
		//Crutch
		int ref = 0;
		
		/*Clear string if operator was pressed in the previous move*/
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			for(int i = 0 ; i < operators.size(); ++i) {
				if(lastChar == operators.get(i)) {
					currentOperator = operators.get(i);
					//Crutch
					ref = 1;
					//System.out.println(currentOperator);
					
					/*Adding first operation here to prevent problems in 'ChangeSign'*/
					String substr = str.substring(0, str.length()-1);
					double firstOperation = Double.parseDouble(substr); 
					operations[0] = firstOperation;
					break;
				}
			}
		}

		/*Write number*/
		for(int i = 0 ; i < numbers.size(); ++i) {
			if(nameInt == numbers.get(i)) {
				if(ref == 0) {
					Standart.outputFieldStandart.setText(str + numbers.get(i));
				} else if (ref == 1){
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
		
		if(!str.isEmpty()) {
			
			/*Adding first operation number*/
			String lastChar = str.substring(str.length()-1);
			//double lastCharDouble = Double.parseDouble(lastChar);
			
			/*provide problems with 'ChangeSign'*/
			/*
			for(int i = 0 ; i < numbers.size(); ++i) {
				if(lastCharDouble == numbers.get(i)) {
					String substr = str.substring(0, str.length());
					double firstOperation = Double.parseDouble(substr); 
					operations[0] = firstOperation;
					break;
				}
			}
			*/
			
			for(int i = 0 ; i < operators.size(); ++i) {
				if(name.charAt(0) == operators.get(i)) {
					Standart.outputFieldStandart.setText(str + operators.get(i));
				} 
			}
		} else {
			System.out.println("Expression can`t start with the operator.");
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
class EqualsPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
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
		switch(currentOperator) {
			case '*': {
				double x = operations[0];
				double y = operations[1];
				double answer = x*y;
				Standart.outputFieldStandart.setText(Double.toString(answer));
				
				operations[0] = answer;
				operations[1] = 0.0;
	
				break;
			}
			case '/': {
				double x = operations[0];
				double y = operations[1];
				double answer = x/y;
				Standart.outputFieldStandart.setText(Double.toString(answer));
				
				operations[0] = answer;
				operations[1] = 0.0;
				
				break;
			}
			case '+': {
				double x = operations[0];
				double y = operations[1];
				double answer = x+y;
				Standart.outputFieldStandart.setText(Double.toString(answer));
				
				operations[0] = answer;
				operations[1] = 0.0;
				
				break;
			}
			case '-': {
				double x = operations[0];
				double y = operations[1];
				double answer = x-y;
				Standart.outputFieldStandart.setText(Double.toString(answer));
				
				operations[0] = answer;
				operations[1] = 0.0;
				
				break;
			}
			case '%': {
				double x = operations[0];
				double y = operations[1];
				double answer = x%y;
				Standart.outputFieldStandart.setText(Double.toString(answer));
				
				operations[0] = answer;
				operations[1] = 0.0;
				
				break;
			}
		}
		
	}
}

class ChangeSignPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		String firstChar = str.substring(0,1);
		
		if(!firstChar.equals("-")) {
			Standart.outputFieldStandart.setText("-" + str);
		} else {
			Standart.outputFieldStandart.setText(str.substring(1, str.length()));
		} 
	}
}

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

/*Clac 0.1*/
/*
class OnePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "1";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "1");
		}
	}
}
class TwoPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "2";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "2");
		}
	}
}
class ThreePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "3";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "3");
		}
	}
}
class FourPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "4";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "4");
		}
	}
}
class FivePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "5";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "5");
		}
	}
}
class SixPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "6";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "6");
		}
	}
}
class SevenPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "7";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "7");
		}
	}
}
class EightPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "8";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "8");
		}
	}
}
class NinePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "9";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "9");
		}
	}
}
class ZeroPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.charAt(0) == '0') {
			System.out.println("Double zero. Incorrect.");
		} else {
			Standart.outputFieldStandart.setText(str + "0");
		}
	}
}
*/
/*Operators*/
/*
class PlusPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "+");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MinusPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "-");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MultiplyPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "*");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DividePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "/");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class PersentPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "%");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DotPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + ".");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
*/
