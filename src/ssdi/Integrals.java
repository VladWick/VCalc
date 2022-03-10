package ssdi;

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

public class Integrals extends Standart{

	public JPanel mainPanelIntegrals = new JPanel();
	
	public static JPanel menuFieldIntegrals = new JPanel();
	public static JLabel nameIntegrals = new JLabel("Integrals");
	public static JButton darkThemeButtonDefaultIntegrals = new JButton();
	public static JButton lightThemeButtonDefaultIntegrals = new JButton();
	
	public static JPanel switchPanelIntegrals = new JPanel();
	public static JButton standartCalcButtonIntegrals = new JButton();
	public static JButton scientificCalcButtonIntegrals = new JButton();
	public static JButton derivativesCalcButtonIntegrals = new JButton();
	public static JButton integralsCalcButtonIntegrals = new JButton();
	
	public static JLabel outputFieldIntegrals = new JLabel("Type a function and then press 'Find integral'");
	
	public static JPanel buttonsPanelIntegrals = new JPanel();
	public static JPanel inputLabelIntegrals = new JPanel();
	public static JLabel iconFuncIntegrals = new JLabel();
	public static JPanel inputLabelFuncIntegrals = new JPanel();
	public static JTextField inputFuncIntegrals = new JTextField(20);
	
	public static JPanel workButtonsPanel = new JPanel();
	public static JButton solveButtonIntegrals = new JButton();
	public static JButton clearButtonIntegrals = new JButton();
	
	public static JPanel outputLabelIntegrals = new JPanel();
	public static JLabel iconIntegral = new JLabel();
	public static JLabel outputFuncIntegrals = new JLabel();
	
	public void addingComponentsInTheRightOrder() {
		menuFieldIntegrals.add(nameIntegrals);
		menuFieldIntegrals.add(darkThemeButtonDefaultIntegrals);
		menuFieldIntegrals.add(lightThemeButtonDefaultIntegrals);
		
		switchPanelIntegrals.add(standartCalcButtonIntegrals);
		switchPanelIntegrals.add(scientificCalcButtonIntegrals);
		switchPanelIntegrals.add(derivativesCalcButtonIntegrals);
		switchPanelIntegrals.add(integralsCalcButtonIntegrals);
		
		mainPanelIntegrals.add(menuFieldIntegrals);
		mainPanelIntegrals.add(switchPanelIntegrals);
		mainPanelIntegrals.add(outputFieldIntegrals);
		
		inputLabelFuncIntegrals.add(inputFuncIntegrals);

		inputLabelIntegrals.add(iconFuncIntegrals);
		inputLabelIntegrals.add(inputLabelFuncIntegrals);
		
		workButtonsPanel.add(solveButtonIntegrals);
		workButtonsPanel.add(clearButtonIntegrals);
		
		outputLabelIntegrals.add(iconIntegral);
		outputLabelIntegrals.add(outputFuncIntegrals);

		buttonsPanelIntegrals.add(inputLabelIntegrals);
		buttonsPanelIntegrals.add(workButtonsPanel);
		buttonsPanelIntegrals.add(outputLabelIntegrals);
	}
	
	public void customizeComponents() throws IOException {	
		mainPanelIntegrals.setLayout(new GridLayout(3,1));
		
		nameIntegrals.setText("Integrals Calc");
		nameIntegrals.setFont(font20);
		nameIntegrals.setVerticalAlignment(JLabel.CENTER);
		nameIntegrals.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage buttonIconDarkIntegrals = ImageIO.read(new File("src/ssdi/images/iconDarkTheme.png"));
		buttonIconDarkIntegrals = resize(buttonIconDarkIntegrals, 50, 50);
		darkThemeButtonDefaultIntegrals = new JButton(new ImageIcon(buttonIconDarkIntegrals));
		darkThemeButtonDefaultIntegrals.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultIntegrals.setContentAreaFilled(false);
		darkThemeButtonDefaultIntegrals.addActionListener(new darkThemeButtonDefaultIntegralsPressed());
		BufferedImage buttonIconLight = ImageIO.read(new File("src/ssdi/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultIntegrals = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultIntegrals.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultIntegrals.setContentAreaFilled(false);
		lightThemeButtonDefaultIntegrals.addActionListener(new lightThemeButtonDefaultIntegralsPressed());
		menuFieldIntegrals.setLayout(new GridLayout(1, 3));
				
		standartCalcButtonIntegrals.setText("Standart");
		standartCalcButtonIntegrals.setFont(font18);
		scientificCalcButtonIntegrals.setText("Scientific");
		scientificCalcButtonIntegrals.setFont(font18);
		derivativesCalcButtonIntegrals.setText("Derivatives");
		derivativesCalcButtonIntegrals.setFont(font18);
		integralsCalcButtonIntegrals.setText("Integrals");
		
		integralsCalcButtonIntegrals.setFont(font18);
		switchPanelIntegrals.setLayout(new GridLayout(4, 1));
		
		outputFieldIntegrals.setBounds(30,100, 50, 50);
		outputFieldIntegrals.setBackground(colorGreen);
		outputFieldIntegrals.setFont(font20);
		outputFieldIntegrals.setBorder(solidBorder);
		outputFieldIntegrals.setVerticalAlignment(JLabel.CENTER);
		outputFieldIntegrals.setHorizontalAlignment(JLabel.CENTER);

		BufferedImage labelIconFunc = ImageIO.read(new File("src/ssdi/images/iconFunc.png"));
		labelIconFunc = resize(labelIconFunc, 100, 100);
		iconFuncIntegrals = new JLabel(new ImageIcon(labelIconFunc));
		inputFuncIntegrals.setMaximumSize( inputFuncIntegrals.getPreferredSize() );
		inputFuncIntegrals.setFont(font25);
		inputLabelIntegrals.setLayout(new GridLayout(0, 2));

		solveButtonIntegrals.setText("Find Integral");
		solveButtonIntegrals.setFont(font20);
		clearButtonIntegrals.setText("Clear");
		clearButtonIntegrals.setFont(font20);
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		
		BufferedImage labelIconIntegral = ImageIO.read(new File("src/ssdi/images/iconIntegral.png"));
		labelIconIntegral = resize(labelIconIntegral, 180, 100);
		iconIntegral = new JLabel(new ImageIcon(labelIconIntegral));
		
		outputFuncIntegrals.setFont(font20);
		outputLabelIntegrals.setLayout(new GridLayout(0, 2));
		
		buttonsPanelIntegrals.setLayout(new GridLayout(3, 0));
	}
	
	public void actionListenersIntegrals() {	
		standartCalcButtonIntegrals.addActionListener(new StandartMenuPressed());
		scientificCalcButtonIntegrals.addActionListener(new ScientificMenuPressed());
		derivativesCalcButtonIntegrals.addActionListener(new DerivativesMenuPressed());
		integralsCalcButtonIntegrals.addActionListener(new IntegralsMenuPressed());
		
		solveButtonIntegrals.addActionListener(new FindIntegralPressed());
		clearButtonIntegrals.addActionListener(new ClearIntegralsPressed());
		
	}

	public void defaultWhiteMode() {
		menuFieldIntegrals.setBackground(colorDarkWhite);
		nameIntegrals.setBackground(colorDarkWhite);
		darkThemeButtonDefaultIntegrals.setBackground(colorDarkWhite);
		lightThemeButtonDefaultIntegrals.setBackground(colorDarkWhite);
		switchPanelIntegrals.setBackground(colorDarkWhite);
		standartCalcButtonIntegrals.setBackground(colorDarkWhite);
		scientificCalcButtonIntegrals.setBackground(colorDarkWhite);
		derivativesCalcButtonIntegrals.setBackground(colorDarkWhite);
		integralsCalcButtonIntegrals.setBackground(colorDarkWhite);
		outputFieldIntegrals.setBackground(colorDarkWhite);
		
		menuFieldIntegrals.setForeground(colorBlack);
		nameIntegrals.setForeground(colorBlack);
		darkThemeButtonDefaultIntegrals.setForeground(colorBlack);
		lightThemeButtonDefaultIntegrals.setForeground(colorBlack);
		switchPanelIntegrals.setForeground(colorBlack);
		standartCalcButtonIntegrals.setForeground(colorBlack);
		scientificCalcButtonIntegrals.setForeground(colorBlack);
		derivativesCalcButtonIntegrals.setForeground(colorBlack);
		integralsCalcButtonIntegrals.setForeground(colorBlack);
		outputFieldIntegrals.setForeground(colorBlack);
		
		buttonsPanelIntegrals.setBackground(colorDarkWhite);
		inputLabelIntegrals.setBackground(colorDarkWhite);
		iconFuncIntegrals.setBackground(colorDarkWhite);
		inputLabelFuncIntegrals.setBackground(colorDarkWhite);
		inputFuncIntegrals.setBackground(colorDarkWhite);
		workButtonsPanel.setBackground(colorDarkWhite);
		solveButtonIntegrals.setBackground(colorDarkWhite);
		clearButtonIntegrals.setBackground(colorDarkWhite);
		outputLabelIntegrals.setBackground(colorDarkWhite);
		iconIntegral.setBackground(colorDarkWhite);
		outputFuncIntegrals.setBackground(colorDarkWhite);
		
		buttonsPanelIntegrals.setForeground(colorBlack);
		inputLabelIntegrals.setForeground(colorBlack);
		iconFuncIntegrals.setForeground(colorBlack);
		inputLabelFuncIntegrals.setForeground(colorBlack);
		inputFuncIntegrals.setForeground(colorBlack);
		workButtonsPanel.setForeground(colorBlack);
		solveButtonIntegrals.setForeground(colorBlack);
		clearButtonIntegrals.setForeground(colorBlack);
		outputLabelIntegrals.setForeground(colorBlack);
		iconIntegral.setForeground(colorBlack);
		outputFuncIntegrals.setForeground(colorBlack);
	}
	
	public void startAndShowCalc() {
		integralsFrame.setSize(1350, 700);
		integralsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		integralsFrame.setLayout(new GridLayout(2, 0));
		integralsFrame.add(mainPanelIntegrals);
		integralsFrame.add(buttonsPanelIntegrals);
		integralsFrame.setVisible(false);
	}
}

					/******************/
					/*Action Listeners*/
					/******************/

class ClearIntegralsPressed extends Integrals implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		inputFuncIntegrals.setText("");
		outputFuncIntegrals.setText("");
	}
}

class FindIntegralPressed extends Integrals implements ActionListener {
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
