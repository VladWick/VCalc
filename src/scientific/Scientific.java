package scientific;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import standart.Standart;

public class Scientific extends Standart {
	
	public JPanel mainPanelScientific = new JPanel();
	
	public static JPanel menuFieldScientific = new JPanel();
	public static JLabel nameScientific = new JLabel("Scientific");
	public static JButton darkThemeButtonDefaultScientific = new JButton();
	public static JButton lightThemeButtonDefaultScientific = new JButton();
	
	public static JPanel switchBetweenModes_Scientific = new JPanel();
	public static JPanel switchPanelScientific = new JPanel();
	public static JButton standartCalcButtonScientific = new JButton();
	public static JButton scientificCalcButtonScientific = new JButton();
	public static JButton derivativesCalcButtonScientific = new JButton();
	public static JButton integralsCalcButtonScientific = new JButton();
	public static JButton diagramButtonScientific = new JButton();
	
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
	
	public static Color colorGreen = new Color(0, 255, 0);
	public static Color colorWhite = new Color(255, 255, 255);
	
	public void customizeComponents() throws IOException {
		
		mainPanelScientific.setLayout(new GridLayout(3,1));
		menuFieldScientific.setLayout(new GridLayout(1, 3));
		switchBetweenModes_Scientific.setLayout(new GridLayout(1, 2));
		switchPanelScientific.setLayout(new GridLayout(4, 1));
		buttonsLabelScientific.setLayout(new GridLayout(7, 5, 3, 3));
		
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
		
		standartCalcButtonScientific.setText("Standart");
		standartCalcButtonScientific.setFont(font18);
		scientificCalcButtonScientific.setText("Scientific");
		scientificCalcButtonScientific.setFont(font18);
		derivativesCalcButtonScientific.setText("Derivatives");
		derivativesCalcButtonScientific.setFont(font18);
		integralsCalcButtonScientific.setText("Integrals");
		integralsCalcButtonScientific.setFont(font18);
		diagramButtonScientific.setText("Diagram");
		diagramButtonScientific.setFont(font18);
		
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
	}
	
	public void addingComponentsInTheRightOrder() {
		menuFieldScientific.add(nameScientific);
		menuFieldScientific.add(darkThemeButtonDefaultScientific);
		menuFieldScientific.add(lightThemeButtonDefaultScientific);
		
		switchBetweenModes_Scientific.add(switchPanelScientific);
		switchBetweenModes_Scientific.add(diagramButtonScientific);
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
		mainPanelScientific.add(switchBetweenModes_Scientific);
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
		diagramButtonScientific.addActionListener(new DiagramMenuPressed());
		
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
		Scientific_ActionListeners_Design.setUpdefaultWhiteMode();
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
