package standart;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.border.*;

public class Standart {
	
	public static JFrame standartFrame = new JFrame();
	public static JFrame scientificFrame = new JFrame();
	public static JFrame derivativesFrame = new JFrame();
	public static JFrame integralsFrame = new JFrame(); 
	public static JFrame diagramPointsFrame = new JFrame(); 
	public static JFrame diagramEquationFrame = new JFrame(); 

	public static JPanel mainPanelStandart = new JPanel();
	
	public static JPanel menuFieldStandart = new JPanel();
	public static JLabel nameStandart = new JLabel("Standart"); 
	public static JButton darkThemeButtonDefaultStandart = new JButton();
	public static JButton lightThemeButtonDefaultStandart = new JButton();
	
	public static JPanel switchBetweenModes_Standart = new JPanel();
	public static JPanel switchPanelStandart = new JPanel();
	public static JButton standartCalcButtonStandart = new JButton();
	public static JButton scientificCalcButtonStandart = new JButton();
	public static JButton derivativesCalcButtonStandart = new JButton();
	public static JButton integralsCalcButtonStandart = new JButton();
	public static JButton diagramButtonStandart = new JButton();
	
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
	
	public static Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
	public static Font font18 = new Font(Font.SANS_SERIF,  Font.BOLD, 18);
	public static Font font20 = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
	public static Font font25 = new Font(Font.SANS_SERIF,  Font.BOLD, 25); 
	
	public void addingComponentsInTheRightOrder() {
		menuFieldStandart.add(nameStandart);
		menuFieldStandart.add(darkThemeButtonDefaultStandart);
		menuFieldStandart.add(lightThemeButtonDefaultStandart);
		
		switchBetweenModes_Standart.add(switchPanelStandart);
		switchBetweenModes_Standart.add(diagramButtonStandart);
		switchPanelStandart.add(standartCalcButtonStandart);
		switchPanelStandart.add(scientificCalcButtonStandart);
		switchPanelStandart.add(derivativesCalcButtonStandart);
		switchPanelStandart.add(integralsCalcButtonStandart);
		
		mainPanelStandart.add(menuFieldStandart);
		mainPanelStandart.add(switchBetweenModes_Standart);
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
		menuFieldStandart.setLayout(new GridLayout(1, 3));
		switchPanelStandart.setLayout(new GridLayout(4, 1));
		switchBetweenModes_Standart.setLayout(new GridLayout(1,2));
		buttonsLabelStandart.setLayout(new GridLayout(5, 4, 3, 3));	
		
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

		standartCalcButtonStandart.setText("Standart");
		standartCalcButtonStandart.setFont(font18);
		scientificCalcButtonStandart.setText("Scientific");
		scientificCalcButtonStandart.setFont(font18);
		derivativesCalcButtonStandart.setText("Derivatives");
		derivativesCalcButtonStandart.setFont(font18);
		integralsCalcButtonStandart.setText("Integrals");
		integralsCalcButtonStandart.setFont(font18);
		diagramButtonStandart.setText("Diagram");
		diagramButtonStandart.setFont(font18);
		
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
	}
	
	public void actionListeners() {
		darkThemeButtonDefaultStandart.addActionListener(new darkThemeButtonDefaultStandartPressed());
		lightThemeButtonDefaultStandart.addActionListener(new lightThemeButtonDefaultStandartPressed());
		
		standartCalcButtonStandart.addActionListener(new StandartMenuPressed());
		scientificCalcButtonStandart.addActionListener(new ScientificMenuPressed());
		derivativesCalcButtonStandart.addActionListener(new DerivativesMenuPressed());
		integralsCalcButtonStandart.addActionListener(new IntegralsMenuPressed());
		
		diagramButtonStandart.addActionListener(new DiagramMenuPressed());
		
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
		threeButton.addActionListener(new NumberPressed());
		plusButton.addActionListener(new OperatorPressed());
		zeroButton.addActionListener(new NumberPressed());
		dotButton.addActionListener(new DotPressed());
		changeSignButton.addActionListener(new ChangeSignPressed());
		equalsButton.addActionListener(new EqualsPressed());	
	}
	
	public void defaultWhiteMode() throws IOException {
		Standart_ActionListeners_Design.setUpdefaultWhiteMode();
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
	
	public class StandartMenuPressed extends Standart implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			scientificFrame.setVisible(false);
			derivativesFrame.setVisible(false);
			integralsFrame.setVisible(false);
			diagramPointsFrame.setVisible(false);
			diagramEquationFrame.setVisible(false);
			
			standartFrame.setVisible(true);
		}
	}
	public class ScientificMenuPressed extends Standart implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			standartFrame.setVisible(false);
			derivativesFrame.setVisible(false);
			integralsFrame.setVisible(false);
			diagramPointsFrame.setVisible(false);
			diagramEquationFrame.setVisible(false);
			
			scientificFrame.setVisible(true);
		}
	}
	public class DerivativesMenuPressed extends Standart implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			standartFrame.setVisible(false);
			scientificFrame.setVisible(false);
			integralsFrame.setVisible(false);
			diagramPointsFrame.setVisible(false);
			diagramEquationFrame.setVisible(false);
			
			derivativesFrame.setVisible(true);
		}
	}
	public class IntegralsMenuPressed extends Standart implements ActionListener{

		public void actionPerformed(ActionEvent e) { 
			standartFrame.setVisible(false);
			scientificFrame.setVisible(false);
			derivativesFrame.setVisible(false);
			diagramPointsFrame.setVisible(false);
			diagramEquationFrame.setVisible(false);
			
			integralsFrame.setVisible(true);
		}
	}
	public class DiagramMenuPressed extends Standart implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			standartFrame.setVisible(false);
			scientificFrame.setVisible(false);
			derivativesFrame.setVisible(false);
			integralsFrame.setVisible(false);
			diagramEquationFrame.setVisible(false);
			
			diagramPointsFrame.setVisible(true);
		} 
	}
	
	
}