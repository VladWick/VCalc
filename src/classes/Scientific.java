package classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scientific extends Standart{
	
	public JPanel mainPanelScientific = new JPanel();
	
	public static JPanel menuFieldScientific = new JPanel();
	public static JLabel nameScientific = new JLabel("Scientific");
	public static JButton darkThemeButtonDefaultScientific = new JButton();
	public static JButton lightThemeButtonDefaultScientific = new JButton();
	
	public static JPanel switchPanelScientific = new JPanel();
	public static JButton standartCalcButtonScientific = new JButton();
	public static JButton scientificCalcButtonScientific = new JButton();
	public static JButton derivativesCalcButtonScientific = new JButton();
	public static JButton integralsCalcButtonScientific = new JButton();
	
	public static JLabel outputFieldScientific = new JLabel();
	
	public static JPanel buttonsLabelScientific = new JPanel();
	public static JButton deleteAllButtonScientific = new JButton();
	public static JButton deleteOneButtonScientific = new JButton();
	public static JButton persentButtonScientific = new JButton();
	public static JButton divideButtonScientific = new JButton();
	public static JButton sevenButtonScientific = new JButton();
	public static JButton eightButtonScientific = new JButton();
	public static JButton nineButtonScientific = new JButton();
	public static JButton multipleButtonScientific = new JButton();
	public static JButton fourButtonScientific = new JButton();
	public static JButton fiveButtonScientific = new JButton();
	public static JButton sixButtonScientific = new JButton();	
	public static JButton minusButtonScientific = new JButton();
	public static JButton oneButtonScientific = new JButton();
	public static JButton twoButtonScientific = new JButton();
	public static JButton threeButtonScientific = new JButton();
	public static JButton plusButtonScientific = new JButton();
	public static JButton zeroButtonScientific = new JButton();
	public static JButton dotButtonScientific = new JButton();
	public static JButton equalsButtonScientific = new JButton();
	public static JButton changeSignButtonScientific = new JButton();
	public static JButton lnButtonScientific = new JButton();
	public static JButton lgButtonScientific = new JButton();
	public static JButton sinButtonScientific = new JButton();
	public static JButton cosButtonScientific = new JButton();
	public static JButton tgButtonScientific = new JButton();
	public static JButton piButtonScientific = new JButton();
	public static JButton eButtonScientific = new JButton();
	public static JButton absButtonScientific = new JButton();
	public static JButton factorialButtonScientific = new JButton();
	public static JButton leftParButtonScientific = new JButton();
	public static JButton rightParButtonScientific = new JButton();
	public static JButton sqrtButtonScientific = new JButton();
	public static JButton squareButtonScientific = new JButton();
	public static JButton reverseButtonScientific = new JButton();
	public static JButton exponentButtonScientific = new JButton();
	
	// Calculation variables
	public static List<Character> operators = Arrays.asList('+', '-', '*', '/', '%');
	public static List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	public static List<String> functions = Arrays.asList("sin", "cos", "tg", "sqrt", "reverse", "exponent", 
															"square", "factorial", "abs", "lg", "ln");

	public static double[] operations = {0.0, 0.0};
	public static char currentOperator = ' ';
	
	public static double[] exponentOperations = {0.0, 0.0};
	
	public final Double PI = 3.14159265359;
	public final Double E = 2.71828;
	
	public void customizeComponents() throws IOException {
		
		mainPanelScientific.setLayout(new GridLayout(3,1));
		
		nameScientific.setText("Scientific Calc");
		nameScientific.setFont(font20);
		nameScientific.setVerticalAlignment(JLabel.CENTER);
		nameScientific.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage buttonIconDarkScientific = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDarkScientific = resize(buttonIconDarkScientific, 50, 50);
		darkThemeButtonDefaultScientific = new JButton(new ImageIcon(buttonIconDarkScientific));
		darkThemeButtonDefaultScientific.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultScientific.setContentAreaFilled(false);
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultScientific = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultScientific.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultScientific.setContentAreaFilled(false);
		menuFieldScientific.setLayout(new GridLayout(1, 3));
		
		standartCalcButtonScientific.setText("Standart");
		standartCalcButtonScientific.setFont(font18);
		scientificCalcButtonScientific.setText("Scientific");
		scientificCalcButtonScientific.setFont(font18);
		derivativesCalcButtonScientific.setText("Derivatives");
		derivativesCalcButtonScientific.setFont(font18);
		integralsCalcButtonScientific.setText("Integrals");
		integralsCalcButtonScientific.setFont(font18);
		switchPanelScientific.setLayout(new GridLayout(4, 1));
		
		outputFieldScientific.setBounds(30,100, 50, 50);
		outputFieldScientific.setBackground(colorGreen);
		outputFieldScientific.setFont(font20);
		outputFieldScientific.setBorder(solidBorder);
		outputFieldScientific.setVerticalAlignment(JLabel.CENTER);
		outputFieldScientific.setHorizontalAlignment(JLabel.CENTER);
		
		deleteAllButtonScientific.setName("deleteAll");
		deleteAllButtonScientific.setText("AC");
		deleteAllButtonScientific.setFont(font20);
		
		BufferedImage buttonIconDelete = ImageIO.read(new File("src/images/iconDelete.png"));
		buttonIconDelete = resize(buttonIconDelete, 35, 35);
		deleteOneButtonScientific = new JButton(new ImageIcon(buttonIconDelete));
		deleteOneButtonScientific.setBackground(colorWhite);
		deleteOneButtonScientific.setName("deleteOne");
		
		persentButtonScientific.setName("%");
		persentButtonScientific.setText("%");
		persentButtonScientific.setFont(font20);
		
		divideButtonScientific.setName("/");
		divideButtonScientific.setText("/");
		divideButtonScientific.setFont(font20);
		
		sevenButtonScientific.setName("7");
		sevenButtonScientific.setText("7");
		sevenButtonScientific.setFont(font20);
		
		eightButtonScientific.setName("8");
		eightButtonScientific.setText("8");
		eightButtonScientific.setFont(font20);
		
		nineButtonScientific.setName("9");
		nineButtonScientific.setText("9");
		nineButtonScientific.setFont(font20);
		
		multipleButtonScientific.setName("*");
		multipleButtonScientific.setText("*");
		multipleButtonScientific.setFont(font20);
		
		fourButtonScientific.setName("4");
		fourButtonScientific.setText("4");
		fourButtonScientific.setFont(font20);
		
		fiveButtonScientific.setName("5");
		fiveButtonScientific.setText("5");
		fiveButtonScientific.setFont(font20);
		
		sixButtonScientific.setName("6");
		sixButtonScientific.setText("6");
		sixButtonScientific.setFont(font20);
		
		minusButtonScientific.setName("-");
		minusButtonScientific.setText("-");
		minusButtonScientific.setFont(font20);
		
		oneButtonScientific.setName("1");
		oneButtonScientific.setText("1");
		oneButtonScientific.setFont(font20);
		
		twoButtonScientific.setName("2");
		twoButtonScientific.setText("2");
		twoButtonScientific.setFont(font20);
		
		threeButtonScientific.setName("3");
		threeButtonScientific.setText("3");
		threeButtonScientific.setFont(font20);
		
		plusButtonScientific.setName("+");
		plusButtonScientific.setText("+");
		plusButtonScientific.setFont(font20);
		
		zeroButtonScientific.setName("0");
		zeroButtonScientific.setText("0");
		zeroButtonScientific.setFont(font20);
		
		dotButtonScientific.setName(".");
		dotButtonScientific.setText(".");
		dotButtonScientific.setFont(font20);
		
		changeSignButtonScientific.setName("changeSign");
		changeSignButtonScientific.setText("+/-");
		changeSignButtonScientific.setFont(font20);
		
		equalsButtonScientific.setText("equals");
		equalsButtonScientific.setText("=");
		equalsButtonScientific.setFont(font20);
		
		lnButtonScientific.setName("ln");
		lnButtonScientific.setText("ln");
		lnButtonScientific.setFont(font20);
		
		lgButtonScientific.setName("lg");
		lgButtonScientific.setText("lg");
		lgButtonScientific.setFont(font20);
		
		sinButtonScientific.setName("sin");
		sinButtonScientific.setText("sin");
		sinButtonScientific.setFont(font20);
		
		cosButtonScientific.setName("cos");
		cosButtonScientific.setText("cos");
		cosButtonScientific.setFont(font20);
		
		tgButtonScientific.setName("tg");
		tgButtonScientific.setText("tg");
		tgButtonScientific.setFont(font20);
		
		piButtonScientific.setName("pi");
		piButtonScientific.setText("pi");
		piButtonScientific.setFont(font20);
		
		eButtonScientific.setName("e");
		eButtonScientific.setText("e");
		eButtonScientific.setFont(font20);
		
		absButtonScientific.setName("abs");
		absButtonScientific.setText("abs");
		absButtonScientific.setFont(font20);
		
		factorialButtonScientific.setName("factorial");
		factorialButtonScientific.setText("!");
		factorialButtonScientific.setFont(font20);
		
		leftParButtonScientific.setName("(");
		leftParButtonScientific.setText("(");
		leftParButtonScientific.setFont(font20);
		leftParButtonScientific.setEnabled(false);
		
		rightParButtonScientific.setName(")");
		rightParButtonScientific.setText(")");
		rightParButtonScientific.setFont(font20);
		rightParButtonScientific.setEnabled(false);
		
		sqrtButtonScientific.setName("sqrt");
		sqrtButtonScientific.setText("sqrt");
		sqrtButtonScientific.setFont(font20);
		
		reverseButtonScientific.setName("reverse");
		reverseButtonScientific.setText("1/x");
		reverseButtonScientific.setFont(font20);
		
		squareButtonScientific.setName("square");
		squareButtonScientific.setText("x^2");
		squareButtonScientific.setFont(font20);
		
		exponentButtonScientific.setName("exponent");
		exponentButtonScientific.setText("x^y");
		exponentButtonScientific.setFont(font20);
		
		buttonsLabelScientific.setLayout(new GridLayout(7, 5, 3, 3));
	}
	
	public void addingComponentsInTheRightOrder() {
		
		menuFieldScientific.add(nameScientific);
		menuFieldScientific.add(darkThemeButtonDefaultScientific);
		menuFieldScientific.add(lightThemeButtonDefaultScientific);
		
		switchPanelScientific.add(standartCalcButtonScientific);
		switchPanelScientific.add(scientificCalcButtonScientific);
		switchPanelScientific.add(derivativesCalcButtonScientific);
		switchPanelScientific.add(integralsCalcButtonScientific);

		buttonsLabelScientific.add(factorialButtonScientific);
		buttonsLabelScientific.add(leftParButtonScientific);
		buttonsLabelScientific.add(rightParButtonScientific);
		buttonsLabelScientific.add(deleteAllButtonScientific);
		buttonsLabelScientific.add(deleteOneButtonScientific);
				
		buttonsLabelScientific.add(reverseButtonScientific);
		buttonsLabelScientific.add(tgButtonScientific);
		buttonsLabelScientific.add(sinButtonScientific);
		buttonsLabelScientific.add(cosButtonScientific);
		buttonsLabelScientific.add(persentButtonScientific);
				
		buttonsLabelScientific.add(sqrtButtonScientific);
		buttonsLabelScientific.add(absButtonScientific);
		buttonsLabelScientific.add(piButtonScientific);
		buttonsLabelScientific.add(eButtonScientific);
		buttonsLabelScientific.add(divideButtonScientific);

		buttonsLabelScientific.add(squareButtonScientific);
		buttonsLabelScientific.add(sevenButtonScientific);
		buttonsLabelScientific.add(eightButtonScientific);
		buttonsLabelScientific.add(nineButtonScientific);
		buttonsLabelScientific.add(multipleButtonScientific);
				
		buttonsLabelScientific.add(exponentButtonScientific);
		buttonsLabelScientific.add(fourButtonScientific);
		buttonsLabelScientific.add(fiveButtonScientific);
		buttonsLabelScientific.add(sixButtonScientific);
		buttonsLabelScientific.add(minusButtonScientific);
				
		buttonsLabelScientific.add(lnButtonScientific);
		buttonsLabelScientific.add(oneButtonScientific);
		buttonsLabelScientific.add(twoButtonScientific);
		buttonsLabelScientific.add(threeButtonScientific);
		buttonsLabelScientific.add(plusButtonScientific);
		
		buttonsLabelScientific.add(lgButtonScientific);
		buttonsLabelScientific.add(zeroButtonScientific);
		buttonsLabelScientific.add(dotButtonScientific);
		buttonsLabelScientific.add(changeSignButtonScientific);
		buttonsLabelScientific.add(equalsButtonScientific);
		
		mainPanelScientific.add(menuFieldScientific);
		mainPanelScientific.add(switchPanelScientific);
		mainPanelScientific.add(outputFieldScientific);
		mainPanelScientific.add(buttonsLabelScientific);
	}
	
	public void actionListenersScientific() {
		
		darkThemeButtonDefaultScientific.addActionListener(new darkThemeButtonDefaultScientificPressed());
		lightThemeButtonDefaultScientific.addActionListener(new lightThemeButtonDefaultScientificPressed());

		standartCalcButtonScientific.addActionListener(new StandartMenuPressed());
		scientificCalcButtonScientific.addActionListener(new ScientificMenuPressed());
		derivativesCalcButtonScientific.addActionListener(new DerivativesMenuPressed());
		integralsCalcButtonScientific.addActionListener(new IntegralsMenuPressed());
		
		zeroButtonScientific.addActionListener(new NumberPressedScientific());
		oneButtonScientific.addActionListener(new NumberPressedScientific());
		twoButtonScientific.addActionListener(new NumberPressedScientific());
		threeButtonScientific.addActionListener(new NumberPressedScientific());
		fourButtonScientific.addActionListener(new NumberPressedScientific());
		fiveButtonScientific.addActionListener(new NumberPressedScientific());
		sixButtonScientific.addActionListener(new NumberPressedScientific());
		sevenButtonScientific.addActionListener(new NumberPressedScientific());
		eightButtonScientific.addActionListener(new NumberPressedScientific());
		nineButtonScientific.addActionListener(new NumberPressedScientific());
		
		piButtonScientific.addActionListener(new ConstPressed());
		eButtonScientific.addActionListener(new ConstPressed());
		
		deleteAllButtonScientific.addActionListener(new DeletePressedScientific());
		deleteOneButtonScientific.addActionListener(new DeletePressedScientific());
		
		dotButtonScientific.addActionListener(new DotPressedScientific());

		changeSignButtonScientific.addActionListener(new ChangeSignPressedScientific());
		equalsButtonScientific.addActionListener(new EqualsPressedScientific());
		
		//leftParButtonScientific.addActionListener(new LeftParPressed());
		//rightParButtonScientific.addActionListener(new RightParPressed());
		
		persentButtonScientific.addActionListener(new OperatorPressedScientific());
		divideButtonScientific.addActionListener(new OperatorPressedScientific());
		multipleButtonScientific.addActionListener(new OperatorPressedScientific());
		plusButtonScientific.addActionListener(new OperatorPressedScientific());
		minusButtonScientific.addActionListener(new OperatorPressedScientific());

		lnButtonScientific.addActionListener(new FunctionPressedScientific());
		lgButtonScientific.addActionListener(new FunctionPressedScientific());
		sinButtonScientific.addActionListener(new FunctionPressedScientific());
		cosButtonScientific.addActionListener(new FunctionPressedScientific());
		tgButtonScientific.addActionListener(new FunctionPressedScientific());		
		absButtonScientific.addActionListener(new FunctionPressedScientific());
		factorialButtonScientific.addActionListener(new FunctionPressedScientific());
		sqrtButtonScientific.addActionListener(new FunctionPressedScientific());
		reverseButtonScientific.addActionListener(new FunctionPressedScientific());
		squareButtonScientific.addActionListener(new FunctionPressedScientific());
		exponentButtonScientific.addActionListener(new FunctionPressedScientific());
	}
	
	public void defaultWhiteMode() {
		
		menuFieldScientific.setBackground(colorDarkWhite);
		nameScientific.setBackground(colorDarkWhite);
		darkThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		lightThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		switchPanelScientific.setBackground(colorDarkWhite);
		standartCalcButtonScientific.setBackground(colorDarkWhite);
		scientificCalcButtonScientific.setBackground(colorDarkWhite);
		derivativesCalcButtonScientific.setBackground(colorDarkWhite);
		integralsCalcButtonScientific.setBackground(colorDarkWhite);
		outputFieldScientific.setBackground(colorDarkWhite);
		
		menuFieldScientific.setForeground(colorBlack);
		nameScientific.setForeground(colorBlack);
		darkThemeButtonDefaultScientific.setForeground(colorBlack);
		lightThemeButtonDefaultScientific.setForeground(colorBlack);
		switchPanelScientific.setForeground(colorBlack);
		standartCalcButtonScientific.setForeground(colorBlack);
		scientificCalcButtonScientific.setForeground(colorBlack);
		derivativesCalcButtonScientific.setForeground(colorBlack);
		integralsCalcButtonScientific.setForeground(colorBlack);
		outputFieldScientific.setForeground(colorBlack);
		
		buttonsLabelScientific.setBackground(colorDarkWhite);
		absButtonScientific.setBackground(colorDarkWhite);
		piButtonScientific.setBackground(colorDarkWhite);
		eButtonScientific.setBackground(colorDarkWhite);
		deleteAllButtonScientific.setBackground(colorDarkWhite);
		deleteOneButtonScientific.setBackground(colorDarkWhite);
		absButtonScientific.setForeground(colorBlack);
		piButtonScientific.setForeground(colorBlack);
		eButtonScientific.setForeground(colorBlack);
		deleteAllButtonScientific.setForeground(colorBlack);
		deleteOneButtonScientific.setForeground(colorBlack);
		
		reverseButtonScientific.setBackground(colorDarkWhite);
		persentButtonScientific.setBackground(colorDarkWhite);
		sinButtonScientific.setBackground(colorDarkWhite);
		cosButtonScientific.setBackground(colorDarkWhite);
		tgButtonScientific.setBackground(colorDarkWhite);
		reverseButtonScientific.setForeground(colorBlack);
		persentButtonScientific.setForeground(colorBlack);
		sinButtonScientific.setForeground(colorBlack);
		cosButtonScientific.setForeground(colorBlack);
		tgButtonScientific.setForeground(colorBlack);
		
		sqrtButtonScientific.setBackground(colorDarkWhite);
		leftParButtonScientific.setBackground(colorDarkWhite);
		rightParButtonScientific.setBackground(colorDarkWhite);
		factorialButtonScientific.setBackground(colorDarkWhite);
		divideButtonScientific.setBackground(colorDarkWhite);
		sqrtButtonScientific.setForeground(colorBlack);
		leftParButtonScientific.setForeground(colorBlack);
		rightParButtonScientific.setForeground(colorBlack);
		factorialButtonScientific.setForeground(colorBlack);
		divideButtonScientific.setForeground(colorBlack);
		
		squareButtonScientific.setBackground(colorDarkWhite);
		sevenButtonScientific.setBackground(colorDarkWhite);
		eightButtonScientific.setBackground(colorDarkWhite);
		nineButtonScientific.setBackground(colorDarkWhite);
		multipleButtonScientific.setBackground(colorDarkWhite);
		squareButtonScientific.setForeground(colorBlack);
		sevenButtonScientific.setForeground(colorBlack);
		eightButtonScientific.setForeground(colorBlack);
		nineButtonScientific.setForeground(colorBlack);
		multipleButtonScientific.setForeground(colorBlack);
		
		exponentButtonScientific.setBackground(colorDarkWhite);
		fourButtonScientific.setBackground(colorDarkWhite);
		fiveButtonScientific.setBackground(colorDarkWhite);
		sixButtonScientific.setBackground(colorDarkWhite);
		minusButtonScientific.setBackground(colorDarkWhite);
		exponentButtonScientific.setForeground(colorBlack);
		fourButtonScientific.setForeground(colorBlack);
		fiveButtonScientific.setForeground(colorBlack);
		sixButtonScientific.setForeground(colorBlack);
		minusButtonScientific.setForeground(colorBlack);
		
		lnButtonScientific.setBackground(colorDarkWhite);
		oneButtonScientific.setBackground(colorDarkWhite);
		twoButtonScientific.setBackground(colorDarkWhite);
		threeButtonScientific.setBackground(colorDarkWhite);
		plusButtonScientific.setBackground(colorDarkWhite);
		lnButtonScientific.setForeground(colorBlack);
		oneButtonScientific.setForeground(colorBlack);
		twoButtonScientific.setForeground(colorBlack);
		threeButtonScientific.setForeground(colorBlack);
		plusButtonScientific.setForeground(colorBlack);
		
		lgButtonScientific.setBackground(colorDarkWhite);
		zeroButtonScientific.setBackground(colorDarkWhite);
		dotButtonScientific.setBackground(colorDarkWhite);
		changeSignButtonScientific.setBackground(colorDarkWhite);
		equalsButtonScientific.setBackground(colorDarkWhite);
		lgButtonScientific.setForeground(colorBlack);
		zeroButtonScientific.setForeground(colorBlack);
		dotButtonScientific.setForeground(colorBlack);
		changeSignButtonScientific.setForeground(colorBlack);
		equalsButtonScientific.setForeground(colorBlack);
	}
	
	public void startAndShowCalc() {
		scientificFrame.setSize(500, 700);
		scientificFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scientificFrame.setLayout(new GridLayout(2, 0));
		scientificFrame.add(mainPanelScientific);
		scientificFrame.add(buttonsLabelScientific);
		scientificFrame.setVisible(false);
	}
}

					/******************/
					/*Action Listeners*/
					/******************/


//ChangeSignPressed
//EqualsPressed

//NumberPressed
//OperatorPressed

//DeletePressed
//DotPressed

// functions = ("sin", "cos", "tg", "sqrt", "reverse", "exponent",  "square", "factorial", "abs", "lg", "ln");

class DotPressedScientific extends Scientific implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldScientific.getText();
		
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
}

class DeletePressedScientific extends Scientific implements ActionListener{
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

class NumberPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldScientific.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		int nameInt = Integer.parseInt(name);

		String type = "number";
		/*if operator was pressed in the previous move -> change 'type' to operator to clear string at the end*/
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

		/*Write number*/
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
}
class ConstPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldScientific.getText();
		
		/*Get the number of the button*/
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

class OperatorPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldScientific.getText();
		
		/*Get the number of the button*/
		JButton o = (JButton)e.getSource();
		String name = o.getName();
		char nameChar = name.charAt(0);
		
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
}

class FunctionPressedScientific extends Scientific implements ActionListener{
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

class EqualsPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
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

class ChangeSignPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldScientific.getText();
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
}

/*from Scientific Calc*/
/*Numbers*/
/*
class NinePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "9";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "9");
		}
	}
}
class EightPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "8";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "8");
		}
	}
}
class SevenPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "7";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "7");
		}
	}
}
class SixPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "6";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "6");
		}
	}
}
class FivePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "5";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "5");
		}
	}
}
class FourPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "4";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "4");
		}
	}
}
class ThreePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "3";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "3");
		}
	}
}
class TwoPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "2";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "2");
		}
	}
}
class OnePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "1";
			Scientific.outputFieldScientific.setText(str);
		} else {
			Scientific.outputFieldScientific.setText(str + "1");
		}
	}
}
class ZeroPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		if(!str.isEmpty() && str.charAt(0) == '0') {
			System.out.println("Double zero. Incorrect.");
		} else {
			Scientific.outputFieldScientific.setText(str + "0");
		}
	}
}
*/
/*Operators*/
/*
class PlusPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' && lastChar == '-' && lastChar == '*' && lastChar == '/' && lastChar == '%' && lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + "+");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MinusPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + "-");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MultiplyPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + "*");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DividePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + "/");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class PersentPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + "%");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DeleteOnePressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		Scientific.outputFieldScientific.setText(str.substring(0, str.length()-1));
	}
}
class DeleteAllPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		Scientific.outputFieldScientific.setText("");
	}
}
class DotPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Scientific.outputFieldScientific.setText(str + ".");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
*/
/*Scientific operators*/
/*
class LnPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "ln");
	}
}
class LgPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "lg");

	}
}
class SinPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "sin");
	}
}
class CosPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "cos");

	}
}
class TgPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "tg");
	}
}
class PiPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "pi");
	}
}
class EPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "e");

	}
}
class LeftParPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "(");
	}
}
class RightParPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + ")");

	}
}
class ReversePressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "^(-1)");

	}
}
class AbsPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "abs");
	}
}
class SquarePressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "^(2)");
	}
}
class SqrtPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "sqrt");

	}
}
class ExponentPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();
		
		Scientific.outputFieldScientific.setText(str + "^");
	}
}
class FactorialPressed extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldScientific.getText();

		Scientific.outputFieldScientific.setText(str + "!");
	}
}
*/
/*Main workspace*/
/**/
/*
class ChangeSignPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldScientific.getText();
		
		char charAtEnd = str.charAt(str.length() - 1);
		
		if(!str.isEmpty() && !(str.contains("%") || str.contains("*") || str.contains("/") || str.contains("-") || str.contains("+")) ) {

			if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
				Scientific.outputFieldScientific.setText("-" + str);
			} 
			
		} else if(str.length() == 1 && charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			Scientific.outputFieldScientific.setText("-" + str);
		} else {
			Scientific.outputFieldScientific.setText("-");
		}
	}
}
*/

/*
 * +
 * -
 * *
 * divide 
 * %
 * 
 * 1/x
 * sqrt
 * x^2
 * x^y
 * ln
 * lg
 * 
 * abs
 * pi
 * e
 * 
 * sin
 * cos
 * tg
 * 
 * ()
 * 
 * !
 *
 */

/*, 
"x^n", "x^2", "sqrt(x)", "1/x", "ln(x)", "log(x)", 
"e^(x)", "a^(x)",  
"sin(x)", "cos(x)", "tg(x)", "ctg(x)", 
"arcsin(x)", "arccos(x)", "arctg(x)", "arcctg(x)", 
"sh(x)", "ch(x)", "th()", "cth()");*/

/*
class EqualsPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String fullStringOfInput = outputFieldScientific.getText();
		char charAtEnd = fullStringOfInput.charAt(fullStringOfInput.length() - 1);
		
		
		List<String> subStrings = Arrays.asList("+", "-", "*", "/",  "%");
		
		if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			
			ArrayList<String> arrayOfNumbers = new ArrayList<String>();
			ArrayList<String> arrayOfOperators = new ArrayList<String>();

			if(fullStringOfInput.contains("sin(")) {
				int it1 = fullStringOfInput.indexOf("sin(");
				int it2 = fullStringOfInput.indexOf(")");
				
				//int k = it2 - it1;
				String argument = null;
				for(int iter = 0; iter < it2 - it1; ++iter) {
					argument += fullStringOfInput.charAt(it1 + iter);
				}
				double argumentDouble = Double.parseDouble(argument);
				double equationToNumber = 0.0;
				equationToNumber = Math.sin(argumentDouble);
				
				String simpleReplace = Double.toString(equationToNumber);
				
				int length = fullStringOfInput.length();
				fullStringOfInput = fullStringOfInput.substring(0, it1) + simpleReplace + fullStringOfInput.substring(it2+1, length);

			}
			
			System.out.println("flag");
			
			int i = 0;
			if(fullStringOfInput.charAt(0) == '-') {
				i = 1;
			}
			for(; i < fullStringOfInput.length(); ++i) {
				
				String substr = fullStringOfInput.substring(i, i+1); 
				
				for(int j = 0; j < subStrings.size(); ++i) {
					String substr2 = fullStringOfInput.substring(0,i);
					
					if(subStrings.equals(substr2)) {
						
						arrayOfNumbers.add(substr2);
						arrayOfOperators.add(substr);
						
						fullStringOfInput = fullStringOfInput.substring(i+1, fullStringOfInput.length());
						i = 0;
					}
				}
			}
			arrayOfNumbers.add(fullStringOfInput);
			
			System.out.println(arrayOfNumbers);
			System.out.println(arrayOfOperators);
	
			Double answer = 0.0;
			
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
				outputFieldScientific.setText(Integer.toString(answerFinal));
				System.out.println("------");
			} else {
				System.out.println(answer);
				outputFieldScientific.setText(Double.toString(answer));
				System.out.println("------");
			}
		} else {
			System.out.println("Wrong end of input (after press equals)");
		}
		
	}
}
*/
/**/
