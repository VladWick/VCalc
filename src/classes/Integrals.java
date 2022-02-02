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

public class Integrals extends Standart{
	
						/***************************/
						/*IntegralsFrame components*/
						/***************************/

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
	
	/*Integrals workspace*/
	public static JPanel buttonsPanelIntegrals = new JPanel();
	
	public static JPanel inputLabelIntegrals = new JPanel();
	public static JLabel iconFuncIntegrals = new JLabel();
	public static JPanel inputLabelFuncIntegrals = new JPanel();
	public static JTextField inputFuncIntegrals = new JTextField(12);
	
	public static JPanel workButtonsPanel = new JPanel();
	public static JButton solveButtonIntegrals = new JButton();
	public static JButton clearButtonIntegrals = new JButton();
	
	public static JPanel outputLabelIntegrals = new JPanel();
	public static JLabel iconIntegral = new JLabel();
	public static JLabel outputFuncIntegrals = new JLabel();
	
	public void createIntegralsCalc() throws IOException {

		
					/*********************************************/
					/****************Name/mode menu***************/
					/*********************************************/
		
		nameIntegrals.setText("Integrals Calc");
		nameIntegrals.setFont(font20);
		nameIntegrals.setVerticalAlignment(JLabel.CENTER);
		nameIntegrals.setHorizontalAlignment(JLabel.CENTER);
		
		/*Default theme buttons*/
		BufferedImage buttonIconDarkIntegrals = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDarkIntegrals = resize(buttonIconDarkIntegrals, 50, 50);
		darkThemeButtonDefaultIntegrals = new JButton(new ImageIcon(buttonIconDarkIntegrals));
		darkThemeButtonDefaultIntegrals.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultIntegrals.setContentAreaFilled(false);
		darkThemeButtonDefaultIntegrals.addActionListener(new darkThemeButtonDefaultIntegralsPressed());
				
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultIntegrals = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultIntegrals.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultIntegrals.setContentAreaFilled(false);
		lightThemeButtonDefaultIntegrals.addActionListener(new lightThemeButtonDefaultIntegralsPressed());
		
		menuFieldIntegrals.add(nameIntegrals);
		menuFieldIntegrals.add(darkThemeButtonDefaultIntegrals);
		menuFieldIntegrals.add(lightThemeButtonDefaultIntegrals);
		
		menuFieldIntegrals.setLayout(new GridLayout(1, 3));
		
		
					/******************************************/
					/****************Switch menu***************/
					/******************************************/
		
		mainPanelIntegrals.setBounds(30,100, 50, 50);
		mainPanelIntegrals.setLayout(new GridLayout(3,1));
		
		nameIntegrals.setText("Integrals Calc");
		nameIntegrals.setFont(font20);
		nameIntegrals.setVerticalAlignment(JLabel.CENTER);
		nameIntegrals.setHorizontalAlignment(JLabel.CENTER);
		
		standartCalcButtonIntegrals.setText("Standart");
		standartCalcButtonIntegrals.addActionListener(new StandartMenuPressed());
		standartCalcButtonIntegrals.setFont(font18);
		
		scientificCalcButtonIntegrals.setText("Scientific");
		scientificCalcButtonIntegrals.addActionListener(new ScientificMenuPressed());
		scientificCalcButtonIntegrals.setFont(font18);
		
		derivativesCalcButtonIntegrals.setText("Derivatives");
		derivativesCalcButtonIntegrals.addActionListener(new DerivativesMenuPressed());
		derivativesCalcButtonIntegrals.setFont(font18);
		
		integralsCalcButtonIntegrals.setText("Integrals");
		integralsCalcButtonIntegrals.addActionListener(new IntegralsMenuPressed());
		integralsCalcButtonIntegrals.setFont(font18);
		
		switchPanelIntegrals.add(standartCalcButtonIntegrals);
		switchPanelIntegrals.add(scientificCalcButtonIntegrals);
		switchPanelIntegrals.add(derivativesCalcButtonIntegrals);
		switchPanelIntegrals.add(integralsCalcButtonIntegrals);
		switchPanelIntegrals.setLayout(new GridLayout(4, 1));
	
		
					/******************************************/
					/****************Output menu***************/
					/******************************************/
		
		outputFieldIntegrals.setBounds(30,100, 50, 50);
		outputFieldIntegrals.setBackground(colorGreen);
		outputFieldIntegrals.setFont(font20);
		outputFieldIntegrals.setBorder(solidBorder);
		outputFieldIntegrals.setVerticalAlignment(JLabel.CENTER);
		outputFieldIntegrals.setHorizontalAlignment(JLabel.CENTER);
		
		mainPanelIntegrals.add(menuFieldIntegrals);
		mainPanelIntegrals.add(switchPanelIntegrals);
		mainPanelIntegrals.add(outputFieldIntegrals);
		
					/******************************************/
					/*********Integrals workspace********/
					/******************************************/

		BufferedImage labelIconFunc = ImageIO.read(new File("src/images/iconFunc.png"));
		labelIconFunc = resize(labelIconFunc, 100, 100);
		iconFuncIntegrals = new JLabel(new ImageIcon(labelIconFunc));
		
		inputFuncIntegrals.setMaximumSize( inputFuncIntegrals.getPreferredSize() );
		inputFuncIntegrals.setFont(font25);
		inputLabelFuncIntegrals.add(inputFuncIntegrals);
		
		/*Making better layout for TextField*/
		inputLabelIntegrals.add(iconFuncIntegrals);
		inputLabelIntegrals.add(inputLabelFuncIntegrals);
		inputLabelIntegrals.setLayout(new GridLayout(0, 2));
		//Add better style for TextField here 
		
		/**/
		/*Two main buttons*/
		solveButtonIntegrals.setText("Find Integral");
		solveButtonIntegrals.addActionListener(new FindIntegralPressed());
		solveButtonIntegrals.setFont(font20);
		
		clearButtonIntegrals.setText("Clear");
		clearButtonIntegrals.addActionListener(new ClearIntegralsPressed());
		clearButtonIntegrals.setFont(font20);
		
		workButtonsPanel.add(solveButtonIntegrals);
		workButtonsPanel.add(clearButtonIntegrals);
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		
		/*Third MenuItem*/
		BufferedImage labelIconIntegral = ImageIO.read(new File("src/images/iconIntegral.png"));
		labelIconIntegral = resize(labelIconIntegral, 180, 100);
		iconIntegral = new JLabel(new ImageIcon(labelIconIntegral));
		
		outputFuncIntegrals.setFont(font20);
		
		outputLabelIntegrals.add(iconIntegral);
		outputLabelIntegrals.add(outputFuncIntegrals);
		outputLabelIntegrals.setLayout(new GridLayout(0, 2));
		
		buttonsPanelIntegrals.add(inputLabelIntegrals);
		buttonsPanelIntegrals.add(workButtonsPanel);
		buttonsPanelIntegrals.add(outputLabelIntegrals);
		buttonsPanelIntegrals.setLayout(new GridLayout(3, 0));
		
		
					/************************************************/
					/****************Main frame options**************/
					/************************************************/
		
		integralsFrame.setSize(600, 700);
		integralsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		integralsFrame.setLayout(new GridLayout(2, 0));
		integralsFrame.add(mainPanelIntegrals);
		integralsFrame.add(buttonsPanelIntegrals);
		integralsFrame.setVisible(false);
		
		
							/********************/
							/*Default white mode*/
							/********************/
		/*background*/
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
		
		/*font*/
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
		
		/*Workspace*/
		
		/*background*/
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
		
		/*font*/
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
}

					/******************/
					/*Action Listeners*/
					/******************/

class FindIntegralPressed extends Integrals implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String str = inputFuncIntegrals.getText();
		
		/*Stupid table for now*/
		List<String> subStrings = Arrays.asList("x^n", "x^2", "sqrt(x)", "1/x", 
												"e^(x)", "a^(x)",  
												"sin(x)", "cos(x)", "1/(cos(x))^(2)", "1/(sin(x))^(2)", 
												
												"1/(sqrt(a^2-x^2)", "1/(a^2 + x^2)", 
												
												"1/sqrt(x^2-a^2)", "arcctg(x)", "1/sqrt(x^2+a^2)", 
												"1/(a^2-x^2)");
		
		List<String> answers =    Arrays.asList("x^(n+1)/(n+1) + C", "x^3/3 + C", "2*x*sqrt(x)*3 + C", "ln(x) + C", 
												"e^(x) + C", "a^(x)/ln(a) + C", 
												"-cos(x)", "sin(x)", "-ctg(x) + C", "tg(x) + C" ,
												
												"arcsin(x/a) + C    (x < abs(a))" , "(1/a)*arctg(x/a) + C", 
												"ln(abs(x+sqrt(x^2-a^2)) + C", "ln(abs(x+sqrt(x^2+a^2)) + C", 
												"(1/2a)*ln(abs((a+x)/(a-x))) + C   (abs(x) != a)");
		
		int len = subStrings.size();

		for(int i = 0 ; i < len; ++i) {
			String substr = subStrings.get(i);
			if(substr.equals(str)) {
				outputFuncIntegrals.setText(answers.get(i));
			}
		}
		if((outputFuncIntegrals.getText()).isEmpty()) {
			outputFuncIntegrals.setText("Inappropriate input");
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

class ClearIntegralsPressed extends Integrals implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		inputFuncIntegrals.setText("");
		outputFuncIntegrals.setText("");
	}
}


