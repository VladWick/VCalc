package integrals;

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
import javax.swing.JTextField;

import standart.Standart;

public class Integrals extends Standart{

	public JPanel mainPanelIntegrals = new JPanel();
	
	public static JPanel menuFieldIntegrals = new JPanel();
	public static JLabel nameIntegrals = new JLabel("Integrals");
	public static JButton darkThemeButtonDefaultIntegrals = new JButton();
	public static JButton lightThemeButtonDefaultIntegrals = new JButton();
	
	public static JPanel switchBetweenModes_Integrals = new JPanel();
	public static JPanel switchPanelIntegrals = new JPanel();
	public static JButton standartCalcButtonIntegrals = new JButton();
	public static JButton scientificCalcButtonIntegrals = new JButton();
	public static JButton derivativesCalcButtonIntegrals = new JButton();
	public static JButton integralsCalcButtonIntegrals = new JButton();
	public static JButton diagramButtonIntegrals = new JButton();
	
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
	
	public static Color colorGreen = new Color(0, 255, 0);
	
	public void addingComponentsInTheRightOrder() {
		menuFieldIntegrals.add(nameIntegrals);
		menuFieldIntegrals.add(darkThemeButtonDefaultIntegrals);
		menuFieldIntegrals.add(lightThemeButtonDefaultIntegrals);
		
		switchBetweenModes_Integrals.add(switchPanelIntegrals);
		switchBetweenModes_Integrals.add(diagramButtonIntegrals);
		switchPanelIntegrals.add(standartCalcButtonIntegrals);
		switchPanelIntegrals.add(scientificCalcButtonIntegrals);
		switchPanelIntegrals.add(derivativesCalcButtonIntegrals);
		switchPanelIntegrals.add(integralsCalcButtonIntegrals);

		mainPanelIntegrals.add(menuFieldIntegrals);
		mainPanelIntegrals.add(switchBetweenModes_Integrals);
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
		menuFieldIntegrals.setLayout(new GridLayout(1, 3));
		switchBetweenModes_Integrals.setLayout(new GridLayout(1, 2));
		switchPanelIntegrals.setLayout(new GridLayout(4, 1));
		inputLabelIntegrals.setLayout(new GridLayout(0, 2));
		workButtonsPanel.setLayout(new GridLayout(0, 2));
		outputLabelIntegrals.setLayout(new GridLayout(0, 2));
		buttonsPanelIntegrals.setLayout(new GridLayout(3, 0));
		
		nameIntegrals.setText("Integrals Calc");
		nameIntegrals.setFont(font20);
		nameIntegrals.setVerticalAlignment(JLabel.CENTER);
		nameIntegrals.setHorizontalAlignment(JLabel.CENTER);
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
		
		standartCalcButtonIntegrals.setText("Standart");
		standartCalcButtonIntegrals.setFont(font18);
		scientificCalcButtonIntegrals.setText("Scientific");
		scientificCalcButtonIntegrals.setFont(font18);
		derivativesCalcButtonIntegrals.setText("Derivatives");
		derivativesCalcButtonIntegrals.setFont(font18);
		integralsCalcButtonIntegrals.setText("Integrals");
		diagramButtonIntegrals.setFont(font18);
		diagramButtonIntegrals.setText("Diagram");
		
		integralsCalcButtonIntegrals.setFont(font18);
		
		outputFieldIntegrals.setBounds(30,100, 50, 50);
		outputFieldIntegrals.setBackground(colorGreen);
		outputFieldIntegrals.setFont(font20);
		outputFieldIntegrals.setBorder(solidBorder);
		outputFieldIntegrals.setVerticalAlignment(JLabel.CENTER);
		outputFieldIntegrals.setHorizontalAlignment(JLabel.CENTER);

		BufferedImage labelIconFunc = ImageIO.read(new File("src/images/iconFunc.png"));
		labelIconFunc = resize(labelIconFunc, 100, 100);
		iconFuncIntegrals = new JLabel(new ImageIcon(labelIconFunc));
		inputFuncIntegrals.setMaximumSize( inputFuncIntegrals.getPreferredSize() );
		inputFuncIntegrals.setFont(font25);

		solveButtonIntegrals.setText("Find Integral");
		solveButtonIntegrals.setFont(font20);
		clearButtonIntegrals.setText("Clear");
		clearButtonIntegrals.setFont(font20);
		
		BufferedImage labelIconIntegral = ImageIO.read(new File("src/images/iconIntegral.png"));
		labelIconIntegral = resize(labelIconIntegral, 180, 100);
		iconIntegral = new JLabel(new ImageIcon(labelIconIntegral));
		
		outputFuncIntegrals.setFont(font20);
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
		Integrals_ActionListeners_Design.setUpDefaultWhiteMode();
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