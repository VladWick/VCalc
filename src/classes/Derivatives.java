package classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
	public static JTextField inputFuncDerivatives = new JTextField(12);
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
		standartCalcButtonDerivatives.addActionListener(new StandartMenuPressed());
		standartCalcButtonDerivatives.setFont(font18);
		scientificCalcButtonDerivatives.setText("Scientific");
		scientificCalcButtonDerivatives.addActionListener(new ScientificMenuPressed());
		scientificCalcButtonDerivatives.setFont(font18);
		derivativesCalcButtonDerivatives.setText("Derivatives");
		derivativesCalcButtonDerivatives.addActionListener(new DerivativesMenuPressed());
		derivativesCalcButtonDerivatives.setFont(font18);
		integralsCalcButtonDerivatives.setText("Integrals");
		integralsCalcButtonDerivatives.addActionListener(new IntegralsMenuPressed());
		integralsCalcButtonDerivatives.setFont(font18);
		switchPanelDerivatives.setLayout(new GridLayout(4, 1));
		
		outputFieldDerivatives.setBounds(30,100, 50, 50);
		outputFieldDerivatives.setBackground(colorGreen);
		outputFieldDerivatives.setFont(font20);
		outputFieldDerivatives.setBorder(solidBorder);
		outputFieldDerivatives.setVerticalAlignment(JLabel.CENTER);
		outputFieldDerivatives.setHorizontalAlignment(JLabel.CENTER);
		
		BufferedImage labelIconFunc = ImageIO.read(new File("src/images/iconFunc.png"));
		labelIconFunc = resize(labelIconFunc, 100, 100);
		iconFuncDerivatives = new JLabel(new ImageIcon(labelIconFunc));
		inputFuncDerivatives.setMaximumSize( inputFuncDerivatives.getPreferredSize() );
		inputFuncDerivatives.setFont(font25);
		inputLabelDerivatives.setLayout(new GridLayout(0, 2));
		
		solveButtonDerivatives.setText("Find Derivative");
		solveButtonDerivatives.addActionListener(new FindDerivativePressed());
		solveButtonDerivatives.setFont(font20);
		clearButtonDerivatives.setText("Clear");
		clearButtonDerivatives.addActionListener(new ClearDerivativesPressed());
		clearButtonDerivatives.setFont(font20);
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		
		BufferedImage labelIconDeriv = ImageIO.read(new File("src/images/iconDeriv.png"));
		labelIconDeriv = resize(labelIconDeriv, 100, 100);
		iconDerivative = new JLabel(new ImageIcon(labelIconDeriv));
		
		outputFuncDerivatives.setFont(font20);

	}
	

	public void actionListenersDerivatives() {	
		
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
		
		derivativesFrame.setSize(600, 700);
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

/*Literal Workspace*/
class FindDerivativePressed extends Derivatives implements ActionListener {
	public FindDerivativePressed() throws IOException {
		super();
	}

	public void actionPerformed(ActionEvent e) {
		String str = inputFuncDerivatives.getText();
		
		/*Stupid table for now*/
		List<String> subStrings = Arrays.asList("x^n", "x^2", "sqrt(x)", "1/x", "ln(x)", "log(x)", 
												"e^(x)", "a^(x)",  
												"sin(x)", "cos(x)", "tg(x)", "ctg(x)", 
												"arcsin(x)", "arccos(x)", "arctg(x)", "arcctg(x)", 
												"sh(x)", "ch(x)", "th()", "cth()");
		
		List<String> answers =    Arrays.asList("n*x^(n-1)", "2x", "-1/sqrt(x)", "-1/x^2", "1/x", "1/(x*ln(a))", 
												"e^(x)", "a^(x)*ln(a)", 
												"cos(x)", "-sin(x)", "1/(cos(x))^(2)", "-1/(sin(x))^(2)" ,
												"1/(sqrt(1-x^(2)))", "-1/(sqrt(1-x^(2)))", "1/(1+x^(2))", "-1/(1+x^(2))",
												"ch(x)", "sh(x)", "1/(ch(x))^(2)", "-1/(sh(x))^(2)");
		
		int len = subStrings.size();

		for(int i = 0 ; i < len; ++i) {
			String substr = subStrings.get(i);
			if(substr.equals(str)) {
				outputFuncDerivatives.setText(answers.get(i));
			}
		}
		if((outputFuncDerivatives.getText()).isEmpty()) {
			outputFuncDerivatives.setText("Inappropriate input");
		}
		
		/*A little bit advanced*/
		/*
		if(!str.contains("x")) {
			outputFuncDerivatives.setText("0");
		} else if(str.contains("x^")) {
			
			int j = str.indexOf("x");
			int k = str.indexOf("^");
			int f = str.indexOf("x");
			
			String str1 = str.substring(0, j);
			
			if(str.charAt(k+1) == '1') {
				...
			}
			
			outputFuncDerivatives.setText(str1 + );
		}
		*/	
	}
}

class ClearDerivativesPressed extends Derivatives implements ActionListener {
	public ClearDerivativesPressed() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		inputFuncDerivatives.setText("");
		outputFuncDerivatives.setText("");
	}
}



