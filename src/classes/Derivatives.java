package classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Derivatives extends Standart{

	public JPanel mainPanelDerivatives = new JPanel();
	
	public static JPanel menuFieldDerivatives = new JPanel();
	public static JLabel nameDerivatives = new JLabel("Derivatives");
	public static JButton darkThemeButtonDefaultDerivatives = new JButton();
	public static JButton lightThemeButtonDefaultDerivatives = new JButton();
	
	public static JPanel switchPanelDerivatives = new JPanel();
	public static JButton standartCalcButtonDerivatives = new JButton();
	public static JButton scientificCalcButtonDerivatives = new JButton();
	public static JButton integralsCalcButtonDerivatives = new JButton();
	public static JButton derivativesCalcButtonDerivatives = new JButton();
	
	public static JLabel outputFieldDerivatives = new JLabel("Type a function and then press 'Find derivative'");
	
	public static JPanel buttonsPanelDerivatives = new JPanel();
	public static JPanel inputLabelDerivatives = new JPanel();
	public static JLabel iconFuncDerivatives = new JLabel();
	public static JPanel inputLabelFuncDerivatives = new JPanel();
	public static JTextField inputFuncDerivatives = new JTextField(20);
	public static JPanel workButtonsPanel = new JPanel();
	public static JButton solveButtonDerivatives = new JButton();
	public static JButton clearButtonDerivatives = new JButton();
	public static JPanel outputLabelDerivatives = new JPanel();
	public static JLabel iconDerivative = new JLabel();
	public static JLabel outputFuncDerivatives = new JLabel();
	
	public void addingComponentsInTheRightOrder() {
		menuFieldDerivatives.add(nameDerivatives);
		menuFieldDerivatives.add(darkThemeButtonDefaultDerivatives);
		menuFieldDerivatives.add(lightThemeButtonDefaultDerivatives);
		
		switchPanelDerivatives.add(standartCalcButtonDerivatives);
		switchPanelDerivatives.add(scientificCalcButtonDerivatives);
		switchPanelDerivatives.add(derivativesCalcButtonDerivatives);
		switchPanelDerivatives.add(integralsCalcButtonDerivatives);
		
		mainPanelDerivatives.add(menuFieldDerivatives);
		mainPanelDerivatives.add(switchPanelDerivatives);
		mainPanelDerivatives.add(outputFieldDerivatives);
		
		inputLabelFuncDerivatives.add(inputFuncDerivatives);
		
		inputLabelDerivatives.add(iconFuncDerivatives);
		inputLabelDerivatives.add(inputLabelFuncDerivatives);
		
		workButtonsPanel.add(solveButtonDerivatives);
		workButtonsPanel.add(clearButtonDerivatives);
		
		outputLabelDerivatives.add(iconDerivative);
		outputLabelDerivatives.add(outputFuncDerivatives);
		outputLabelDerivatives.setLayout(new GridLayout(0, 2));
		
		buttonsPanelDerivatives.add(inputLabelDerivatives);
		buttonsPanelDerivatives.add(workButtonsPanel);
		buttonsPanelDerivatives.add(outputLabelDerivatives);
		buttonsPanelDerivatives.setLayout(new GridLayout(3, 0));
	}
	
	public void customizeComponents() throws IOException {
		mainPanelDerivatives.setLayout(new GridLayout(3,1));
		
		nameDerivatives.setText("Derivatives Calc");
		nameDerivatives.setFont(font20);
		nameDerivatives.setVerticalAlignment(JLabel.CENTER);
		nameDerivatives.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage buttonIconDarkDerivatives = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDarkDerivatives = resize(buttonIconDarkDerivatives, 50, 50);
		darkThemeButtonDefaultDerivatives = new JButton(new ImageIcon(buttonIconDarkDerivatives));
		darkThemeButtonDefaultDerivatives.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultDerivatives.setContentAreaFilled(false);
		darkThemeButtonDefaultDerivatives.addActionListener(new darkThemeButtonDefaultDerivativesPressed());	
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultDerivatives = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultDerivatives.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultDerivatives.setContentAreaFilled(false);
		lightThemeButtonDefaultDerivatives.addActionListener(new lightThemeButtonDefaultDerivativesPressed());
		menuFieldDerivatives.setLayout(new GridLayout(1, 3));
		
		standartCalcButtonDerivatives.setText("Standart");
		standartCalcButtonDerivatives.setFont(font18);
		scientificCalcButtonDerivatives.setText("Scientific");
		scientificCalcButtonDerivatives.setFont(font18);
		derivativesCalcButtonDerivatives.setText("Derivatives");
		derivativesCalcButtonDerivatives.setFont(font18);
		integralsCalcButtonDerivatives.setText("Integrals");
		integralsCalcButtonDerivatives.setFont(font18);
		switchPanelDerivatives.setLayout(new GridLayout(4, 1));
		
		//outputFieldDerivatives.setBounds(30,100, 50, 50);
		//outputFieldDerivatives.setBackground(colorGreen);
		outputFieldDerivatives.setFont(font20);
		//outputFieldDerivatives.setBorder(solidBorder);
		outputFieldDerivatives.setVerticalAlignment(JLabel.CENTER);
		outputFieldDerivatives.setHorizontalAlignment(JLabel.CENTER);
		//outputFieldDerivatives.
		
		BufferedImage labelIconFunc = ImageIO.read(new File("src/images/iconFunc.png"));
		labelIconFunc = resize(labelIconFunc, 100, 100);
		iconFuncDerivatives = new JLabel(new ImageIcon(labelIconFunc));
		inputFuncDerivatives.setMaximumSize( inputFuncDerivatives.getPreferredSize() );
		inputFuncDerivatives.setFont(font25);
		inputLabelDerivatives.setLayout(new GridLayout(0, 2));
		
		solveButtonDerivatives.setText("Find Derivative");
		solveButtonDerivatives.setFont(font20);
		clearButtonDerivatives.setText("Clear");
		clearButtonDerivatives.setFont(font20);
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		
		BufferedImage labelIconDeriv = ImageIO.read(new File("src/images/iconDeriv.png"));
		labelIconDeriv = resize(labelIconDeriv, 100, 100);
		iconDerivative = new JLabel(new ImageIcon(labelIconDeriv));
		
		outputFuncDerivatives.setFont(font20);
	}
	

	public void actionListenersDerivatives() {	
		standartCalcButtonDerivatives.addActionListener(new StandartMenuPressed());
		scientificCalcButtonDerivatives.addActionListener(new ScientificMenuPressed());
		derivativesCalcButtonDerivatives.addActionListener(new DerivativesMenuPressed());
		integralsCalcButtonDerivatives.addActionListener(new IntegralsMenuPressed());
		
		solveButtonDerivatives.addActionListener(new FindDerivativePressed());
		clearButtonDerivatives.addActionListener(new ClearDerivativesPressed());
	}
	
	public void defaultWhiteMode() {
		menuFieldDerivatives.setBackground(colorDarkWhite);
		nameDerivatives.setBackground(colorDarkWhite);
		darkThemeButtonDefaultDerivatives.setBackground(colorDarkWhite);
		lightThemeButtonDefaultDerivatives.setBackground(colorDarkWhite);
		switchPanelDerivatives.setBackground(colorDarkWhite);
		standartCalcButtonDerivatives.setBackground(colorDarkWhite);
		scientificCalcButtonDerivatives.setBackground(colorDarkWhite);
		derivativesCalcButtonDerivatives.setBackground(colorDarkWhite);
		integralsCalcButtonDerivatives.setBackground(colorDarkWhite);
		outputFieldDerivatives.setBackground(colorDarkWhite);
		
		menuFieldDerivatives.setForeground(colorBlack);
		nameDerivatives.setForeground(colorBlack);
		darkThemeButtonDefaultDerivatives.setForeground(colorBlack);
		lightThemeButtonDefaultDerivatives.setForeground(colorBlack);
		switchPanelDerivatives.setForeground(colorBlack);
		standartCalcButtonDerivatives.setForeground(colorBlack);
		scientificCalcButtonDerivatives.setForeground(colorBlack);
		derivativesCalcButtonDerivatives.setForeground(colorBlack);
		integralsCalcButtonDerivatives.setForeground(colorBlack);
		outputFieldDerivatives.setForeground(colorBlack);
		
		buttonsPanelDerivatives.setBackground(colorDarkWhite);
		inputLabelDerivatives.setBackground(colorDarkWhite);
		iconFuncDerivatives.setBackground(colorDarkWhite);
		inputLabelFuncDerivatives.setBackground(colorDarkWhite);
		inputFuncDerivatives.setBackground(colorDarkWhite);
		workButtonsPanel.setBackground(colorDarkWhite);
		solveButtonDerivatives.setBackground(colorDarkWhite);
		clearButtonDerivatives.setBackground(colorDarkWhite);
		outputLabelDerivatives.setBackground(colorDarkWhite);
		iconDerivative.setBackground(colorDarkWhite);
		outputFuncDerivatives.setBackground(colorDarkWhite);
		
		buttonsPanelDerivatives.setForeground(colorBlack);
		inputLabelDerivatives.setForeground(colorBlack);
		iconFuncDerivatives.setForeground(colorBlack);
		inputLabelFuncDerivatives.setForeground(colorBlack);
		inputFuncDerivatives.setForeground(colorBlack);
		workButtonsPanel.setForeground(colorBlack);
		solveButtonDerivatives.setForeground(colorBlack);
		clearButtonDerivatives.setForeground(colorBlack);
		outputLabelDerivatives.setForeground(colorBlack);
		iconDerivative.setForeground(colorBlack);
		outputFuncDerivatives.setForeground(colorBlack);
	}
	
	public void startAndShowCalc() {
		
		derivativesFrame.setSize(1350, 700);
		derivativesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		derivativesFrame.setLayout(new GridLayout(2, 0));
		derivativesFrame.add(mainPanelDerivatives);
		derivativesFrame.add(buttonsPanelDerivatives);
		derivativesFrame.setVisible(false);
	}
}

					/******************/
					/*Action Listeners*/
					/******************/

class ClearDerivativesPressed extends Derivatives implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		inputFuncDerivatives.setText("");
		outputFuncDerivatives.setText("");
	}
}

class FindDerivativePressed extends Derivatives implements ActionListener {
	
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
				
				Double newCoefficient = (exponent*coefficient*coefficientOfX);

				answer = newCoefficient + "*" + newX + "^(" + (exponent-1) + ")";
				if(newCoefficient == Math.floor(newCoefficient)) {
					int newCoefficientInt = newCoefficient.intValue();	
					answer = newCoefficientInt + "*" + newX;
				}
				if(exponent == Math.floor(exponent)) {
					int exponentInt = exponent.intValue();			
					answer += "^(" + (exponentInt-1) + ")";
				} 
			} else {
				//5.6*(x-4)^(123.123)
				//C*(x-a)^(number)
				String newX = str.substring(indexOfLeftPar, indexOfExp);
				
				String exponentString = str.substring(indexOfExp+2, str.length()-1);
				Double exponent = Double.parseDouble(exponentString);
				String coefficientString = str.substring(0, indexOfX-2);
				Double coefficient = Double.parseDouble(coefficientString);
				Double newCoefficient = (exponent*coefficient);
				
				answer = newCoefficient + "*" + newX + "^(" + (exponent-1) + ")";
				if(newCoefficient == Math.floor(newCoefficient)) {
					int newCoefficientInt = newCoefficient.intValue();	
					answer = newCoefficientInt + "*" + newX;
				}
				if(exponent == Math.floor(exponent)) {
					int exponentInt = exponent.intValue();			
					answer += "^(" + (exponentInt-1) + ")";
				} 
			}
		} else if (amountOfParentheses == 1) {
			//7*x^(456)
			//C*x^(number)
			String coefficientString = str.substring(0, indexOfX-1);
			Double coefficient = Double.parseDouble(coefficientString);
			String exponentString = str.substring(indexOfX+3, str.length()-1);
			Double exponent = Double.parseDouble(exponentString);
			
			Double newCoefficient = (exponent*coefficient);
			
			answer = newCoefficient + "*" + "x^(" + (exponent-1) + ")";
			if(newCoefficient == Math.floor(newCoefficient)) {
				int newCoefficientInt = newCoefficient.intValue();			
				answer = newCoefficientInt + "*" + "x^";
			}
			if(exponent == Math.floor(exponent)) {
				int exponentInt = exponent.intValue();			
				answer += "(" + (exponentInt-1) + ")";
			} 				
		} else {
			System.out.println("Something went wrong.");
		}
		return answer;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String str = inputFuncDerivatives.getText();
		
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
				outputFuncDerivatives.setText(finalAnswer);
			} else {
				outputFuncDerivatives.setText(finalAnswer);
			}
			
			expressions.clear();
			operators.clear();
		} else {
			System.out.println("Unappropriate input. Missing 'x' or '^' of '(' of ')' " );
		}
	}
}