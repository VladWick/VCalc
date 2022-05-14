package derivatives;

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
import javax.swing.JTextField;

import standart.Standart;

public class Derivatives extends Standart {

	public JPanel mainPanelDerivatives = new JPanel();
	
	public static JPanel menuFieldDerivatives = new JPanel();
	public static JLabel nameDerivatives = new JLabel("Derivatives");
	public static JButton darkThemeButtonDefaultDerivatives = new JButton();
	public static JButton lightThemeButtonDefaultDerivatives = new JButton();
	
	public static JPanel switchBetweenModes_Derivatives = new JPanel();
	public static JPanel switchPanelDerivatives = new JPanel();
	public static JButton standartCalcButtonDerivatives = new JButton();
	public static JButton scientificCalcButtonDerivatives = new JButton();
	public static JButton integralsCalcButtonDerivatives = new JButton();
	public static JButton derivativesCalcButtonDerivatives = new JButton();
	public static JButton diagramButtonDerivatives = new JButton();
	
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
		
		switchBetweenModes_Derivatives.add(switchPanelDerivatives);
		switchBetweenModes_Derivatives.add(diagramButtonDerivatives);
		switchPanelDerivatives.add(standartCalcButtonDerivatives);
		switchPanelDerivatives.add(scientificCalcButtonDerivatives);
		switchPanelDerivatives.add(derivativesCalcButtonDerivatives);
		switchPanelDerivatives.add(integralsCalcButtonDerivatives);
		
		mainPanelDerivatives.add(menuFieldDerivatives);
		mainPanelDerivatives.add(switchBetweenModes_Derivatives);
		mainPanelDerivatives.add(outputFieldDerivatives);
		
		inputLabelFuncDerivatives.add(inputFuncDerivatives);
		
		inputLabelDerivatives.add(iconFuncDerivatives);
		inputLabelDerivatives.add(inputLabelFuncDerivatives);
		
		workButtonsPanel.add(solveButtonDerivatives);
		workButtonsPanel.add(clearButtonDerivatives);
		
		outputLabelDerivatives.add(iconDerivative);
		outputLabelDerivatives.add(outputFuncDerivatives);
		
		buttonsPanelDerivatives.add(inputLabelDerivatives);
		buttonsPanelDerivatives.add(workButtonsPanel);
		buttonsPanelDerivatives.add(outputLabelDerivatives);
	}
	
	public void customizeComponents() throws IOException {
		
		mainPanelDerivatives.setLayout(new GridLayout(3,1));
		menuFieldDerivatives.setLayout(new GridLayout(1, 3));
		switchBetweenModes_Derivatives.setLayout(new GridLayout(1, 2));
		switchPanelDerivatives.setLayout(new GridLayout(4, 1));
		inputLabelDerivatives.setLayout(new GridLayout(0, 2));
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		outputLabelDerivatives.setLayout(new GridLayout(0, 2));
		buttonsPanelDerivatives.setLayout(new GridLayout(3, 0));
		
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
		
		standartCalcButtonDerivatives.setText("Standart");
		standartCalcButtonDerivatives.setFont(font18);
		scientificCalcButtonDerivatives.setText("Scientific");
		scientificCalcButtonDerivatives.setFont(font18);
		derivativesCalcButtonDerivatives.setText("Derivatives");
		derivativesCalcButtonDerivatives.setFont(font18);
		integralsCalcButtonDerivatives.setText("Integrals");
		integralsCalcButtonDerivatives.setFont(font18);
		diagramButtonDerivatives.setText("Diagram");
		diagramButtonDerivatives.setFont(font18);
		
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
		
		solveButtonDerivatives.setText("Find Derivative");
		solveButtonDerivatives.setFont(font20);
		clearButtonDerivatives.setText("Clear");
		clearButtonDerivatives.setFont(font20);
		
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
		diagramButtonDerivatives.addActionListener(new DiagramMenuPressed());
		
		solveButtonDerivatives.addActionListener(new FindDerivativePressed());
		clearButtonDerivatives.addActionListener(new ClearDerivativesPressed());
	}
	
	public void defaultWhiteMode() {
		Derivatives_ActionListeners_Design.setUpDefaultWhiteMode();
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