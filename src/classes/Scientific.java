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
	
						/***************************/
						/*Scientific Frame components*/
						/***************************/

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
	
	/*From Standart Calc*/
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
	
	/*New buttons*/
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
	
	public void createScientificCalc() throws IOException {

		
					/*********************************************/
					/************Upper name/mode menu*************/
					/*********************************************/
		
		nameScientific.setText("Scientific Calc");
		nameScientific.setFont(font20);
		nameScientific.setVerticalAlignment(JLabel.CENTER);
		nameScientific.setHorizontalAlignment(JLabel.CENTER);
		
		/*Default theme buttons*/
		BufferedImage buttonIconDarkScientific = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDarkScientific = resize(buttonIconDarkScientific, 50, 50);
		darkThemeButtonDefaultScientific = new JButton(new ImageIcon(buttonIconDarkScientific));
		darkThemeButtonDefaultScientific.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultScientific.setContentAreaFilled(false);
		darkThemeButtonDefaultScientific.addActionListener(new darkThemeButtonDefaultScientificPressed());
				
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultScientific = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultScientific.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultScientific.setContentAreaFilled(false);
		lightThemeButtonDefaultScientific.addActionListener(new lightThemeButtonDefaultScientificPressed());
		
		menuFieldScientific.add(nameScientific);
		menuFieldScientific.add(darkThemeButtonDefaultScientific);
		menuFieldScientific.add(lightThemeButtonDefaultScientific);
		
		menuFieldScientific.setLayout(new GridLayout(1, 3));
		
		
					/******************************************/
					/****************Switch menu***************/
					/******************************************/
		
		mainPanelScientific.setBounds(30,100, 50, 50);
		mainPanelScientific.setLayout(new GridLayout(3,1));
		
		nameScientific.setText("Scientific Calc");
		nameScientific.setFont(font20);
		nameScientific.setVerticalAlignment(JLabel.CENTER);
		nameScientific.setHorizontalAlignment(JLabel.CENTER);
		
		standartCalcButtonScientific.setText("Standart");
		standartCalcButtonScientific.addActionListener(new StandartMenuPressed());
		standartCalcButtonScientific.setFont(font18);
		
		scientificCalcButtonScientific.setText("Scientific");
		scientificCalcButtonScientific.addActionListener(new ScientificMenuPressed());
		scientificCalcButtonScientific.setFont(font18);
		
		derivativesCalcButtonScientific.setText("Derivatives");
		derivativesCalcButtonScientific.addActionListener(new DerivativesMenuPressed());
		derivativesCalcButtonScientific.setFont(font18);
		
		integralsCalcButtonScientific.setText("Integrals");
		integralsCalcButtonScientific.addActionListener(new IntegralsMenuPressed());
		integralsCalcButtonScientific.setFont(font18);
		
		switchPanelScientific.add(standartCalcButtonScientific);
		switchPanelScientific.add(scientificCalcButtonScientific);
		switchPanelScientific.add(derivativesCalcButtonScientific);
		switchPanelScientific.add(integralsCalcButtonScientific);
		switchPanelScientific.setLayout(new GridLayout(4, 1));
	
		
					/******************************************/
					/****************Output menu***************/
					/******************************************/
		
		outputFieldScientific.setBounds(30,100, 50, 50);
		outputFieldScientific.setBackground(colorGreen);
		outputFieldScientific.setFont(font20);
		outputFieldScientific.setBorder(solidBorder);
		outputFieldScientific.setVerticalAlignment(JLabel.CENTER);
		outputFieldScientific.setHorizontalAlignment(JLabel.CENTER);
		
					/******************************************/
					/****************Buttons menu**************/
					/******************************************/
		
		/*All the calculation buttons*/
		buttonsLabelScientific.setBounds(40, 50, 0, 0);
		
		deleteAllButtonScientific.setText("AC");
		deleteAllButtonScientific.addActionListener(new DeleteAllPressedScientific());
		deleteAllButtonScientific.setFont(font20);
		
		BufferedImage buttonIconDelete = ImageIO.read(new File("src/images/iconDelete.png"));
		buttonIconDelete = resize(buttonIconDelete, 35, 35);
		deleteOneButtonScientific = new JButton(new ImageIcon(buttonIconDelete));
		//deleteOneButton.setBorder(BorderFactory.createEmptyBorder());
		//deleteOneButton.setContentAreaFilled(false);
		deleteOneButtonScientific.addActionListener(new DeleteOnePressedScientific());
		
		persentButtonScientific.setText("%");
		persentButtonScientific.addActionListener(new PersentPressedScientific());
		persentButtonScientific.setFont(font20);

		divideButtonScientific.setText("/");
		divideButtonScientific.addActionListener(new DividePressedScientific());
		divideButtonScientific.setFont(font20);
	
		sevenButtonScientific.setText("7");
		sevenButtonScientific.addActionListener(new SevenPressedScientific());
		sevenButtonScientific.setFont(font20);
		
		eightButtonScientific.setText("8");
		eightButtonScientific.addActionListener(new EightPressedScientific());
		eightButtonScientific.setFont(font20);
		eightButtonScientific.setBackground(colorRed);
		
		nineButtonScientific.setText("9");
		nineButtonScientific.addActionListener(new NinePressedScientific());
		nineButtonScientific.setFont(font20);
		
		multipleButtonScientific.setText("*");
		multipleButtonScientific.addActionListener(new MultiplyPressedScientific());
		multipleButtonScientific.setFont(font20);
		
		fourButtonScientific.setText("4");
		fourButtonScientific.addActionListener(new FourPressedScientific());
		fourButtonScientific.setFont(font20);
		
		fiveButtonScientific.setText("5");
		fiveButtonScientific.addActionListener(new FivePressedScientific());
		fiveButtonScientific.setFont(font20);
		
		sixButtonScientific.setText("6");
		sixButtonScientific.addActionListener(new SixPressedScientific());
		sixButtonScientific.setFont(font20);
		
		minusButtonScientific.setText("-");
		minusButtonScientific.addActionListener(new MinusPressedScientific());
		minusButtonScientific.setFont(font20);
	
		oneButtonScientific.setText("1");
		oneButtonScientific.addActionListener(new OnePressedScientific());
		oneButtonScientific.setFont(font20);
		
		twoButtonScientific.setText("2");
		twoButtonScientific.addActionListener(new TwoPressedScientific());
		twoButtonScientific.setFont(font20);
		
		threeButtonScientific.setText("3");
		threeButtonScientific.addActionListener(new ThreePressedScientific());
		threeButtonScientific.setFont(font20);
	
		plusButtonScientific.setText("+");
		plusButtonScientific.addActionListener(new PlusPressedScientific());
		plusButtonScientific.setFont(font20);
		
		zeroButtonScientific.setText("0");
		zeroButtonScientific.addActionListener(new ZeroPressedScientific());
		zeroButtonScientific.setFont(font20);
		
		dotButtonScientific.setText(".");
		dotButtonScientific.addActionListener(new DotPressedScientific());
		dotButtonScientific.setFont(font20);
		
		changeSignButtonScientific.setText("+/-");
		changeSignButtonScientific.addActionListener(new ChangeSignPressedScientific());
		changeSignButtonScientific.setFont(font20);
		
		equalsButtonScientific.setText("=");
		equalsButtonScientific.addActionListener(new EqualsPressedScientific());
		equalsButtonScientific.setFont(font20);
		
		/*Scientific buttons*/
		lnButtonScientific.setText("ln");
		lnButtonScientific.addActionListener(new LnPressed());
		lnButtonScientific.setFont(font20);
		
		lgButtonScientific.setText("lg");
		lgButtonScientific.addActionListener(new LgPressed());
		lgButtonScientific.setFont(font20);
		
		sinButtonScientific.setText("sin");
		sinButtonScientific.addActionListener(new SinPressed());
		sinButtonScientific.setFont(font20);
		
		cosButtonScientific.setText("cos");
		cosButtonScientific.addActionListener(new CosPressed());
		cosButtonScientific.setFont(font20);
		
		tgButtonScientific.setText("tg");
		tgButtonScientific.addActionListener(new TgPressed());
		tgButtonScientific.setFont(font20);
		
		piButtonScientific.setText("pi");
		piButtonScientific.addActionListener(new PiPressed());
		piButtonScientific.setFont(font20);
		
		eButtonScientific.setText("e");
		eButtonScientific.addActionListener(new EPressed());
		eButtonScientific.setFont(font20);
		
		absButtonScientific.setText("abs");
		absButtonScientific.addActionListener(new AbsPressed());
		absButtonScientific.setFont(font20);
		
		factorialButtonScientific.setText("!");
		factorialButtonScientific.addActionListener(new FactorialPressed());
		factorialButtonScientific.setFont(font20);
		
		leftParButtonScientific.setText("(");
		leftParButtonScientific.addActionListener(new LeftParPressed());
		leftParButtonScientific.setFont(font20);
		
		rightParButtonScientific.setText(")");
		rightParButtonScientific.addActionListener(new RightParPressed());
		rightParButtonScientific.setFont(font20);
		
		sqrtButtonScientific.setText("sqrt(x)");
		sqrtButtonScientific.addActionListener(new LgPressed());
		sqrtButtonScientific.setFont(font20);
		
		reverseButtonScientific.setText("1/x");
		reverseButtonScientific.addActionListener(new ReversePressed());
		reverseButtonScientific.setFont(font20);
		
		squareButtonScientific.setText("x^2");
		squareButtonScientific.addActionListener(new SquarePressed());
		squareButtonScientific.setFont(font20);
		
		exponentButtonScientific.setText("x^y");
		exponentButtonScientific.addActionListener(new ExponentPressed());
		exponentButtonScientific.setFont(font20);

		//buttonsLabelStandart
		buttonsLabelScientific.add(absButtonScientific);
		buttonsLabelScientific.add(piButtonScientific);
		buttonsLabelScientific.add(eButtonScientific);
		buttonsLabelScientific.add(deleteAllButtonScientific);
		buttonsLabelScientific.add(deleteOneButtonScientific);
		
		buttonsLabelScientific.add(reverseButtonScientific);
		buttonsLabelScientific.add(persentButtonScientific);
		buttonsLabelScientific.add(sinButtonScientific);
		buttonsLabelScientific.add(cosButtonScientific);
		buttonsLabelScientific.add(tgButtonScientific);
		
		buttonsLabelScientific.add(sqrtButtonScientific);
		buttonsLabelScientific.add(leftParButtonScientific);
		buttonsLabelScientific.add(rightParButtonScientific);
		buttonsLabelScientific.add(factorialButtonScientific);
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
	
		buttonsLabelScientific.setLayout(new GridLayout(7, 5, 3, 3));
		
		/************************************************/
		
		mainPanelScientific.add(menuFieldScientific);
		mainPanelScientific.add(switchPanelScientific);
		mainPanelScientific.add(outputFieldScientific);
		mainPanelScientific.add(buttonsLabelScientific);
		
		
					/************************************************/
					/****************Main frame options**************/
					/************************************************/
		
		scientificFrame.setSize(500, 700);
		scientificFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scientificFrame.setLayout(new GridLayout(2, 0));
		scientificFrame.add(mainPanelScientific);
		scientificFrame.add(buttonsLabelScientific);
		scientificFrame.setVisible(false);
		
		
							/********************/
							/*Default white mode*/
							/********************/
		/*background*/
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
		
		/*font*/
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
		
		/*Buttons*/
		buttonsLabelScientific.setBackground(colorDarkWhite);
		
		/* 1 line */
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
		
		/* 2 line */
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
		
		/* 3 line */
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
		
		/* 4 line */
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
		
		/* 5 line */
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
		
		/* 6 line */
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
		
		/* 7 line */
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
}

					/******************/
					/*Action Listeners*/
					/******************/

/*from Scientific Calc*/
/*Numbers*/
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
/*Operators*/
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

/*Scientific operators*/
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

/*Dark and white mode*/
class darkThemeButtonDefaultScientificPressed extends Scientific implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		//colorSlightlyDarkGrey
		//colorDarkWhite
		
							/*Menu*/
		/*background*/
		menuFieldScientific.setBackground(colorSlightlyDarkGrey);
		nameScientific.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultScientific.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultScientific.setBackground(colorSlightlyDarkGrey);
		
		switchPanelScientific.setBackground(colorSlightlyDarkGrey);
		standartCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		scientificCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		derivativesCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		integralsCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		outputFieldScientific.setBackground(colorSlightlyDarkGrey);
		
		/*font*/
		menuFieldScientific.setForeground(colorDarkWhite);
		nameScientific.setForeground(colorDarkWhite);
		darkThemeButtonDefaultScientific.setForeground(colorDarkWhite);
		lightThemeButtonDefaultScientific.setForeground(colorDarkWhite);
		switchPanelScientific.setForeground(colorDarkWhite);
		standartCalcButtonScientific.setForeground(colorDarkWhite);
		scientificCalcButtonScientific.setForeground(colorDarkWhite);
		derivativesCalcButtonScientific.setForeground(colorDarkWhite);
		integralsCalcButtonScientific.setForeground(colorDarkWhite);
		//outputFieldScientific.setForeground(colorDarkWhite);
		
							/*Buttons*/
		buttonsLabelScientific.setBackground(colorBlack);
		
		/* 1 line */
		absButtonScientific.setBackground(colorSlightlyDarkGrey);
		piButtonScientific.setBackground(colorSlightlyDarkGrey);
		eButtonScientific.setBackground(colorSlightlyDarkGrey);
		deleteAllButtonScientific.setBackground(colorSlightlyDarkGrey);
		deleteOneButtonScientific.setBackground(colorSlightlyDarkGrey);
		absButtonScientific.setForeground(colorDarkWhite);
		piButtonScientific.setForeground(colorDarkWhite);
		eButtonScientific.setForeground(colorDarkWhite);
		deleteAllButtonScientific.setForeground(colorDarkWhite);
		deleteOneButtonScientific.setForeground(colorDarkWhite);
		
		/* 2 line */
		reverseButtonScientific.setBackground(colorSlightlyDarkGrey);
		persentButtonScientific.setBackground(colorSlightlyDarkGrey);
		sinButtonScientific.setBackground(colorSlightlyDarkGrey);
		cosButtonScientific.setBackground(colorSlightlyDarkGrey);
		tgButtonScientific.setBackground(colorSlightlyDarkGrey);
		reverseButtonScientific.setForeground(colorDarkWhite);
		persentButtonScientific.setForeground(colorDarkWhite);
		sinButtonScientific.setForeground(colorDarkWhite);
		cosButtonScientific.setForeground(colorDarkWhite);
		tgButtonScientific.setForeground(colorDarkWhite);
		
		/* 3 line */
		sqrtButtonScientific.setBackground(colorSlightlyDarkGrey);
		leftParButtonScientific.setBackground(colorSlightlyDarkGrey);
		rightParButtonScientific.setBackground(colorSlightlyDarkGrey);
		factorialButtonScientific.setBackground(colorSlightlyDarkGrey);
		divideButtonScientific.setBackground(colorSlightlyDarkGrey);
		sqrtButtonScientific.setForeground(colorDarkWhite);
		leftParButtonScientific.setForeground(colorDarkWhite);
		rightParButtonScientific.setForeground(colorDarkWhite);
		factorialButtonScientific.setForeground(colorDarkWhite);
		divideButtonScientific.setForeground(colorDarkWhite);
		
		/* 4 line */
		squareButtonScientific.setBackground(colorSlightlyDarkGrey);
		sevenButtonScientific.setBackground(colorSlightlyDarkGrey);
		eightButtonScientific.setBackground(colorSlightlyDarkGrey);
		nineButtonScientific.setBackground(colorSlightlyDarkGrey);
		multipleButtonScientific.setBackground(colorSlightlyDarkGrey);
		squareButtonScientific.setForeground(colorDarkWhite);
		sevenButtonScientific.setForeground(colorDarkWhite);
		eightButtonScientific.setForeground(colorDarkWhite);
		nineButtonScientific.setForeground(colorDarkWhite);
		multipleButtonScientific.setForeground(colorDarkWhite);
		
		/* 5 line */
		exponentButtonScientific.setBackground(colorSlightlyDarkGrey);
		fourButtonScientific.setBackground(colorSlightlyDarkGrey);
		fiveButtonScientific.setBackground(colorSlightlyDarkGrey);
		sixButtonScientific.setBackground(colorSlightlyDarkGrey);
		minusButtonScientific.setBackground(colorSlightlyDarkGrey);
		exponentButtonScientific.setForeground(colorDarkWhite);
		fourButtonScientific.setForeground(colorDarkWhite);
		fiveButtonScientific.setForeground(colorDarkWhite);
		sixButtonScientific.setForeground(colorDarkWhite);
		minusButtonScientific.setForeground(colorDarkWhite);
		
		/* 6 line */
		lnButtonScientific.setBackground(colorSlightlyDarkGrey);
		oneButtonScientific.setBackground(colorSlightlyDarkGrey);
		twoButtonScientific.setBackground(colorSlightlyDarkGrey);
		threeButtonScientific.setBackground(colorSlightlyDarkGrey);
		plusButtonScientific.setBackground(colorSlightlyDarkGrey);
		lnButtonScientific.setForeground(colorDarkWhite);
		oneButtonScientific.setForeground(colorDarkWhite);
		twoButtonScientific.setForeground(colorDarkWhite);
		threeButtonScientific.setForeground(colorDarkWhite);
		plusButtonScientific.setForeground(colorDarkWhite);
		
		/* 7 line */
		lgButtonScientific.setBackground(colorSlightlyDarkGrey);
		zeroButtonScientific.setBackground(colorSlightlyDarkGrey);
		dotButtonScientific.setBackground(colorSlightlyDarkGrey);
		changeSignButtonScientific.setBackground(colorSlightlyDarkGrey);
		equalsButtonScientific.setBackground(colorSlightlyDarkGrey);
		lgButtonScientific.setForeground(colorDarkWhite);
		zeroButtonScientific.setForeground(colorDarkWhite);
		dotButtonScientific.setForeground(colorDarkWhite);
		changeSignButtonScientific.setForeground(colorDarkWhite);
		equalsButtonScientific.setForeground(colorDarkWhite);
		
	}
}
class lightThemeButtonDefaultScientificPressed extends Scientific implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		/*background*/
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
		
		/*font*/
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
		
		/*Buttons*/
		buttonsLabelScientific.setBackground(colorDarkWhite);
		
		/* 1 line */
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
		
		/* 2 line */
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
		
		/* 3 line */
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
		
		/* 4 line */
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
		
		/* 5 line */
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
		
		/* 6 line */
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
		
		/* 7 line */
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
}

/*Main workspace*/
/**/
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
class EqualsPressedScientific extends Scientific implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

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
		
		//"sin("
		//find ")"
		//put it into the arrayOfNumbers 
		//solve it 
		
		//for now just one char argument 
		//
		
		String fullStringOfInput = outputFieldScientific.getText();
		char charAtEnd = fullStringOfInput.charAt(fullStringOfInput.length() - 1);
		
		
		List<String> subStrings = Arrays.asList("+", "-", "*", "/",  "%"); /*, 
												"x^n", "x^2", "sqrt(x)", "1/x", "ln(x)", "log(x)", 
												"e^(x)", "a^(x)",  
												"sin(x)", "cos(x)", "tg(x)", "ctg(x)", 
												"arcsin(x)", "arccos(x)", "arctg(x)", "arcctg(x)", 
												"sh(x)", "ch(x)", "th()", "cth()");*/
		
		if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			
			ArrayList<String> arrayOfNumbers = new ArrayList<String>();
			ArrayList<String> arrayOfOperators = new ArrayList<String>();

			
			/*Firstly - simplify string*/
			if(fullStringOfInput.contains("sin(")) {
				int it1 = fullStringOfInput.indexOf("sin(");
				int it2 = fullStringOfInput.indexOf(")");
				
				int k = it2 - it1;
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

/**/
