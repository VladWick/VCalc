package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.border.*;

public class Standart {
	
				/**********************/
				/**Neutral components**/
				/**********************/
	
	public static ArrayList<Character> operators = new ArrayList<Character>();
	
	Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
	
	Font font18 = new Font(Font.SANS_SERIF,  Font.BOLD, 18);
	Font font20 = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
	Font font25 = new Font(Font.SANS_SERIF,  Font.BOLD, 25);
	
	/*Dark mode*/
	Color colorBlack = new Color(0, 0, 0);
	Color colorDarkGrey = new Color(12, 12, 12);
	Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	
	/*Light mode*/
	Color colorWhite = new Color(255, 255, 255);
	Color colorDarkWhite = new Color(250, 250, 250);
	Color colorDeeperDarkWhite = new Color(245, 245, 245);
	
	/*Example colors*/
	Color colorRed = new Color(255, 0, 0);
	Color colorGreen = new Color(0, 255, 0);
	Color colorBlue = new Color(0, 0, 255);
	
				/***********************/
				/*********Frames********/
				/***********************/
	
	public static JFrame standartFrame = new JFrame();
	public static JFrame scientificFrame = new JFrame();
	public static JFrame derivativesFrame = new JFrame();
	public static JFrame integralsFrame = new JFrame(); 
				
				/**************************/
				/*StandartFrame components*/
				/**************************/

	public JPanel mainPanelStandart = new JPanel();
	
	public static JPanel menuFieldStandart = new JPanel();
	public static JLabel nameStandart = new JLabel("Standart");
	public static JButton darkThemeButtonDefaultStandart = new JButton();
	public static JButton lightThemeButtonDefaultStandart = new JButton();
	//public static JButton darkThemeButtonDark = new JButton();
	//public static JButton lightThemeButtonDark = new JButton();
	
	public static JPanel switchPanelStandart = new JPanel();
	public static JButton standartCalcButtonStandart = new JButton();
	public static JButton scientificCalcButtonStandart = new JButton();
	public static JButton derivativesCalcButtonStandart = new JButton();
	public static JButton integralsCalcButtonStandart = new JButton();
	
	public static JLabel outputFieldStandart = new JLabel();
	
	/*Calculators`s buttons*/
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

	
	public void createStandartCalc() throws IOException {
		
		operators.add('+');
		operators.add('-');
		operators.add('*');
		operators.add('/');
		operators.add('%');

		/*Main Panel options*/
		//mainPanelStandart.setBounds(30,100, 50, 50);
		mainPanelStandart.setLayout(new GridLayout(3,1));
		
		/*****************************************/
		/****************Upper menu***************/
		/*****************************************/
		
		nameStandart.setText("Standart Calc");
		nameStandart.setFont(font20);
		nameStandart.setVerticalAlignment(JLabel.CENTER);
		nameStandart.setHorizontalAlignment(JLabel.CENTER);
		
		/*Default theme buttons*/
		BufferedImage buttonIconDark = ImageIO.read(new File("src/images/iconDarkTheme.png"));
		buttonIconDark = resize(buttonIconDark, 50, 50);
		darkThemeButtonDefaultStandart = new JButton(new ImageIcon(buttonIconDark));
		darkThemeButtonDefaultStandart.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDefaultStandart.setContentAreaFilled(false);
		darkThemeButtonDefaultStandart.addActionListener(new darkThemeButtonDefaultStandartPressed());
				
		BufferedImage buttonIconLight = ImageIO.read(new File("src/images/iconlightTheme.png"));
		buttonIconLight = resize(buttonIconLight, 50, 50);
		lightThemeButtonDefaultStandart = new JButton(new ImageIcon(buttonIconLight));
		lightThemeButtonDefaultStandart.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDefaultStandart.setContentAreaFilled(false);
		lightThemeButtonDefaultStandart.addActionListener(new lightThemeButtonDefaultStandartPressed());
		
		/*Dark theme images*/
		/*
		BufferedImage buttonIconDarkInDarkMode = ImageIO.read(new File("src/images/iconDarkModeWhite.png"));
		buttonIconDarkInDarkMode = resize(buttonIconDarkInDarkMode, 50, 50);
		darkThemeButtonDark = new JButton(new ImageIcon(buttonIconDarkInDarkMode));
		darkThemeButtonDark.setBorder(BorderFactory.createEmptyBorder());
		darkThemeButtonDark.setContentAreaFilled(false);
		//darkThemeButtonDark.addActionListener(new darkThemeButtonDarkPressed());
		darkThemeButtonDark.setBackground(colorWhite);
		darkThemeButtonDark.setVisible(false);
		
		BufferedImage buttonIconLightInDarkMode = ImageIO.read(new File("src/images/iconLightThemeWhite.png"));
		buttonIconLightInDarkMode = resize(buttonIconLightInDarkMode, 50, 50);
		lightThemeButtonDark = new JButton(new ImageIcon(buttonIconLightInDarkMode));
		lightThemeButtonDark.setBorder(BorderFactory.createEmptyBorder());
		lightThemeButtonDark.setContentAreaFilled(false);
		//lightThemeButtonDark.addActionListener(new darkThemeButtonDarkPressed());
		lightThemeButtonDark.setVisible(false);
		*/
		
		menuFieldStandart.add(nameStandart);
		menuFieldStandart.add(darkThemeButtonDefaultStandart);
		menuFieldStandart.add(lightThemeButtonDefaultStandart);
		//menuFieldStandart.add(darkThemeButtonDark);
		//menuFieldStandart.add(lightThemeButtonDark);
		
		menuFieldStandart.setLayout(new GridLayout(1, 3));
		
					/*****************************************/
					/**************Switch buttons*************/
					/*****************************************/
		
		standartCalcButtonStandart.setText("Standart");
		standartCalcButtonStandart.addActionListener(new StandartMenuPressed());
		standartCalcButtonStandart.setFont(font18);
		
		scientificCalcButtonStandart.setText("Scientific");
		scientificCalcButtonStandart.addActionListener(new ScientificMenuPressed());
		scientificCalcButtonStandart.setFont(font18);

		derivativesCalcButtonStandart.setText("Derivatives");
		derivativesCalcButtonStandart.addActionListener(new DerivativesMenuPressed());
		derivativesCalcButtonStandart.setFont(font18);

		integralsCalcButtonStandart.setText("Integrals");
		integralsCalcButtonStandart.addActionListener(new IntegralsMenuPressed());
		integralsCalcButtonStandart.setFont(font18);
		
		switchPanelStandart.add(standartCalcButtonStandart);
		switchPanelStandart.add(scientificCalcButtonStandart);
		switchPanelStandart.add(derivativesCalcButtonStandart);
		switchPanelStandart.add(integralsCalcButtonStandart);
		switchPanelStandart.setLayout(new GridLayout(4, 1));
	
		/*Output field*/
		outputFieldStandart.setBounds(30,100, 50, 50);
		outputFieldStandart.setBackground(colorGreen);
		outputFieldStandart.setFont(font20);
		outputFieldStandart.setBorder(solidBorder);
		outputFieldStandart.setVerticalAlignment(JLabel.CENTER);
		outputFieldStandart.setHorizontalAlignment(JLabel.CENTER);
		
		mainPanelStandart.add(menuFieldStandart);
		mainPanelStandart.add(switchPanelStandart);
		mainPanelStandart.add(outputFieldStandart);
		
		/*All the calculation buttons*/
		buttonsLabelStandart.setBounds(40, 50, 0, 0);
		
		deleteAllButton.setText("AC");
		deleteAllButton.addActionListener(new DeleteAllPressed());
		deleteAllButton.setFont(font20);
		
		BufferedImage buttonIconDelete = ImageIO.read(new File("src/images/iconDelete.png"));
		buttonIconDelete = resize(buttonIconDelete, 35, 35);
		deleteOneButton = new JButton(new ImageIcon(buttonIconDelete));
		//deleteOneButton.setBorder(BorderFactory.createEmptyBorder());
		//deleteOneButton.setContentAreaFilled(false);
		deleteOneButton.addActionListener(new DeleteOnePressed());
		
		persentButton.setText("%");
		persentButton.addActionListener(new PersentPressed());
		persentButton.setFont(font20);

		divideButton.setText("/");
		divideButton.addActionListener(new DividePressed());
		divideButton.setFont(font20);
	
		sevenButton.setText("7");
		sevenButton.addActionListener(new SevenPressed());
		sevenButton.setFont(font20);
		
		eightButton.setText("8");
		eightButton.addActionListener(new EightPressed());
		eightButton.setFont(font20);
		eightButton.setBackground(colorRed);
		
		/*Image behind the button*/
		/*
		BufferedImage buttonIcon = ImageIO.read(new File("src/images/icon1.png"));
		eightButton = new JButton(new ImageIcon(buttonIcon));
		eightButton.setBorder(BorderFactory.createEmptyBorder());
		eightButton.setContentAreaFilled(false);
		*/
		
		nineButton.setText("9");
		nineButton.addActionListener(new NinePressed());
		nineButton.setFont(font20);
		
		multipleButton.setText("*");
		multipleButton.addActionListener(new MultiplyPressed());
		multipleButton.setFont(font20);
		
		fourButton.setText("4");
		fourButton.addActionListener(new FourPressed());
		fourButton.setFont(font20);
		
		fiveButton.setText("5");
		fiveButton.addActionListener(new FivePressed());
		fiveButton.setFont(font20);
		
		sixButton.setText("6");
		sixButton.addActionListener(new SixPressed());
		sixButton.setFont(font20);
		
		minusButton.setText("-");
		minusButton.addActionListener(new MinusPressed());
		minusButton.setFont(font20);
	
		oneButton.setText("1");
		oneButton.addActionListener(new OnePressed());
		oneButton.setFont(font20);
		
		twoButton.setText("2");
		twoButton.addActionListener(new TwoPressed());
		twoButton.setFont(font20);
		
		threeButton.setText("3");
		threeButton.addActionListener(new ThreePressed());
		threeButton.setFont(font20);
	
		plusButton.setText("+");
		plusButton.addActionListener(new PlusPressed());
		plusButton.setFont(font20);
		
		zeroButton.setText("0");
		zeroButton.addActionListener(new ZeroPressed());
		zeroButton.setFont(font20);
		
		dotButton.setText(".");
		dotButton.addActionListener(new DotPressed());
		dotButton.setFont(font20);
		
		changeSignButton.setText("+/-");
		changeSignButton.addActionListener(new ChangeSignPressed());
		changeSignButton.setFont(font20);
		
		equalsButton.setText("=");
		equalsButton.addActionListener(new EqualsPressed());
		equalsButton.setFont(font20);

		//buttonsLabelStandart
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
	
		buttonsLabelStandart.setLayout(new GridLayout(5, 4, 3, 3));

		/*Standart frame setup*/
		standartFrame.setSize(450, 700);
		standartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		standartFrame.setLayout(new GridLayout(2, 0));
		
		standartFrame.add(mainPanelStandart);
		standartFrame.add(buttonsLabelStandart);
		
		standartFrame.setVisible(true);
		

					/***********************************/
					/*********Default white mode********/
					/***********************************/
		
		/*background*/
		menuFieldStandart.setBackground(colorDarkWhite);
		nameStandart.setBackground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		switchPanelStandart.setBackground(colorDarkWhite);
		standartCalcButtonStandart.setBackground(colorDarkWhite);
		scientificCalcButtonStandart.setBackground(colorDarkWhite);
		derivativesCalcButtonStandart.setBackground(colorDarkWhite);
		integralsCalcButtonStandart.setBackground(colorDarkWhite);
		outputFieldStandart.setBackground(colorDarkWhite);
		buttonsLabelStandart.setBackground(colorWhite);
		
		oneButton.setBackground(colorDarkWhite);
		twoButton.setBackground(colorDarkWhite);
		threeButton.setBackground(colorDarkWhite);
		fourButton.setBackground(colorDarkWhite);
		fiveButton.setBackground(colorDarkWhite);
		sixButton.setBackground(colorDarkWhite);
		sevenButton.setBackground(colorDarkWhite);
		eightButton.setBackground(colorDarkWhite);
		nineButton.setBackground(colorDarkWhite);
		zeroButton.setBackground(colorDarkWhite);
		deleteAllButton.setBackground(colorDarkWhite);
		deleteOneButton.setBackground(colorDarkWhite);
		persentButton.setBackground(colorDarkWhite);
		equalsButton.setBackground(colorDarkWhite);
		changeSignButton.setBackground(colorDarkWhite);
		dotButton.setBackground(colorDarkWhite);
		plusButton.setBackground(colorDarkWhite);
		minusButton.setBackground(colorDarkWhite);
		multipleButton.setBackground(colorDarkWhite);
		divideButton.setBackground(colorDarkWhite);
		
		/*font color*/
		oneButton.setForeground(colorBlack);
		twoButton.setForeground(colorBlack);
		threeButton.setForeground(colorBlack);
		fourButton.setForeground(colorBlack);
		fiveButton.setForeground(colorBlack);
		sixButton.setForeground(colorBlack);
		sevenButton.setForeground(colorBlack);
		eightButton.setForeground(colorBlack);
		nineButton.setForeground(colorBlack);
		zeroButton.setForeground(colorBlack);
		deleteAllButton.setForeground(colorBlack);
		deleteOneButton.setForeground(colorBlack);
		persentButton.setForeground(colorBlack);
		equalsButton.setForeground(colorBlack);
		changeSignButton.setForeground(colorBlack);
		dotButton.setForeground(colorBlack);
		plusButton.setForeground(colorBlack);
		minusButton.setForeground(colorBlack);
		multipleButton.setForeground(colorBlack);
		divideButton.setForeground(colorBlack);
		
		menuFieldStandart.setForeground(colorBlack);
		nameStandart.setForeground(colorBlack);
		darkThemeButtonDefaultStandart.setForeground(colorBlack);
		lightThemeButtonDefaultStandart.setForeground(colorBlack);
		switchPanelStandart.setForeground(colorBlack);
		standartCalcButtonStandart.setForeground(colorBlack);
		scientificCalcButtonStandart.setForeground(colorBlack);
		derivativesCalcButtonStandart.setForeground(colorBlack);
		integralsCalcButtonStandart.setForeground(colorBlack);
		outputFieldStandart.setForeground(colorBlack);
		
	}
	
	public static BufferedImage resize(BufferedImage img, int newW, int newH) {
		Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();

	    return dimg;
	}
}

					/******************/
					/*Action Listeners*/
					/******************/

/*Numbers*/
class OnePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "1";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "1");
		}
	}
}
class TwoPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "2";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "2");
		}
	}
}
class ThreePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "3";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "3");
		}
	}
}
class FourPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "4";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "4");
		}
	}
}
class FivePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "5";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "5");
		}
	}
}
class SixPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "6";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "6");
		}
	}
}
class SevenPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "7";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "7");
		}
	}
}
class EightPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "8";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "8");
		}
	}
}
class NinePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.length() == 1 && str.charAt(0) == '0') {
			str = "9";
			Standart.outputFieldStandart.setText(str);
		} else {
			Standart.outputFieldStandart.setText(str + "9");
		}
	}
}
class ZeroPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		
		if(!str.isEmpty() && str.charAt(0) == '0') {
			System.out.println("Double zero. Incorrect.");
		} else {
			Standart.outputFieldStandart.setText(str + "0");
		}
	}
}


/*Operators*/
class PlusPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "+");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MinusPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "-");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class MultiplyPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "*");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DividePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "/");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class PersentPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + "%");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}

class DotPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 

		String str = outputFieldStandart.getText();
		if(!str.isEmpty()) {
			char lastChar = str.charAt(str.length()-1);
			if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%' || lastChar == '.') {
				System.out.println("Incorrect. Double operator.");
			} else {
				Standart.outputFieldStandart.setText(str + ".");
			}
		} else {
			System.out.println("Wrong start of input");
		}
	}
}
class DeleteOnePressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = outputFieldStandart.getText();
		Standart.outputFieldStandart.setText(str.substring(0, str.length()-1));
	}
}
class DeleteAllPressed  extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		Standart.outputFieldStandart.setText("");
	}
}
class ChangeSignPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String str = outputFieldStandart.getText();
		
		char charAtEnd = str.charAt(str.length() - 1);
		
		if(!str.isEmpty() && !(str.contains("%") || str.contains("*") || str.contains("/") || str.contains("-") || str.contains("+")) ) {

			if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
				Standart.outputFieldStandart.setText("-" + str);
			} 
			
		} else if(str.length() == 1 && charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			Standart.outputFieldStandart.setText("-" + str);
		} else {
			Standart.outputFieldStandart.setText("-");
		}
	}
}

class EqualsPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String fullStringOfInput = outputFieldStandart.getText();
		char charAtEnd = fullStringOfInput.charAt(fullStringOfInput.length() - 1);
		
		if(charAtEnd != '%' && charAtEnd != '*' && charAtEnd != '/' && charAtEnd != '+' && charAtEnd != '-') {
			
			ArrayList<String> arrayOfNumbers = new ArrayList<String>();
			ArrayList<String> arrayOfOperators = new ArrayList<String>();

			Double answer = 0.0;
			
			int i = 0;
			if(fullStringOfInput.charAt(0) == '-') {
				i = 1;
			}
			for(; i < fullStringOfInput.length(); ++i) {
				
				String substr = fullStringOfInput.substring(i, i+1); 
				
				if("+".equals(substr) || "-".equals(substr) || "/".equals(substr) || "*".equals(substr) || "%".equals(substr)) {
					String substr2 = fullStringOfInput.substring(0,i);
					
					arrayOfNumbers.add(substr2);
					arrayOfOperators.add(substr);
					
					fullStringOfInput = fullStringOfInput.substring(i+1, fullStringOfInput.length());
					i = 0;
				}
			}
			arrayOfNumbers.add(fullStringOfInput);
			
			System.out.println(arrayOfNumbers);
			System.out.println(arrayOfOperators);
			
			//System.out.println(answer);
			
			while(!arrayOfNumbers.isEmpty() || !arrayOfOperators.isEmpty() ) {
				//System.out.println(arrayOfNumbers.isEmpty());
				//System.out.println(arrayOfOperators.isEmpty());
				
				/*
				if(arrayOfOperators.get(0) == "-" && !arrayOfNumbers.isEmpty()) {
					arrayOfOperators.remove(0);
					System.out.println("cringe");
				} 
				*/
				
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
				outputFieldStandart.setText(Integer.toString(answerFinal));
				System.out.println("------");
			} else {
				System.out.println(answer);
				outputFieldStandart.setText(Double.toString(answer));
				System.out.println("------");
			}
		} else {
			System.out.println("Wrong end of input (after press equals)");
		}
	}
}

/*Switch to standart calculator*/
class StandartMenuPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}
/*Switch to scientific calculator*/
class ScientificMenuPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		scientificFrame.setVisible(true);
	}
}

/*Switch to calculator of the derivatives*/
class DerivativesMenuPressed extends Standart implements ActionListener{

	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		scientificFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		derivativesFrame.setVisible(true);
	}
}

/*Switch to calculator of the integrals*/
class IntegralsMenuPressed extends Standart implements ActionListener{
	
	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		
		integralsFrame.setVisible(true);
	}
}





/*Design side*/
class darkThemeButtonDefaultStandartPressed extends Standart implements ActionListener {
	public void actionPerformed(ActionEvent e) {

		/*Change background color*/
		menuFieldStandart.setBackground(colorSlightlyDarkGrey);
		nameStandart.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultStandart.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultStandart.setBackground(colorSlightlyDarkGrey);
		
		switchPanelStandart.setBackground(colorSlightlyDarkGrey);
		standartCalcButtonStandart.setBackground(colorSlightlyDarkGrey);
		scientificCalcButtonStandart.setBackground(colorSlightlyDarkGrey);
		derivativesCalcButtonStandart.setBackground(colorSlightlyDarkGrey);
		integralsCalcButtonStandart.setBackground(colorSlightlyDarkGrey);
		outputFieldStandart.setBackground(colorSlightlyDarkGrey);
		
		buttonsLabelStandart.setBackground(colorBlack);
		
		oneButton.setBackground(colorSlightlyDarkGrey);
		twoButton.setBackground(colorSlightlyDarkGrey);
		threeButton.setBackground(colorSlightlyDarkGrey);
		fourButton.setBackground(colorSlightlyDarkGrey);
		fiveButton.setBackground(colorSlightlyDarkGrey);
		sixButton.setBackground(colorSlightlyDarkGrey);
		sevenButton.setBackground(colorSlightlyDarkGrey);
		eightButton.setBackground(colorSlightlyDarkGrey);
		nineButton.setBackground(colorSlightlyDarkGrey);
		zeroButton.setBackground(colorSlightlyDarkGrey);
		deleteAllButton.setBackground(colorSlightlyDarkGrey);
		deleteOneButton.setBackground(colorSlightlyDarkGrey);
		persentButton.setBackground(colorSlightlyDarkGrey);
		equalsButton.setBackground(colorSlightlyDarkGrey);
		changeSignButton.setBackground(colorSlightlyDarkGrey);
		dotButton.setBackground(colorSlightlyDarkGrey);
		plusButton.setBackground(colorSlightlyDarkGrey);
		minusButton.setBackground(colorSlightlyDarkGrey);
		multipleButton.setBackground(colorSlightlyDarkGrey);
		divideButton.setBackground(colorSlightlyDarkGrey);
		
		
		/*Change font color*/
		oneButton.setForeground(colorDarkWhite);
		twoButton.setForeground(colorDarkWhite);
		threeButton.setForeground(colorDarkWhite);
		fourButton.setForeground(colorDarkWhite);
		fiveButton.setForeground(colorDarkWhite);
		sixButton.setForeground(colorDarkWhite);
		sevenButton.setForeground(colorDarkWhite);
		eightButton.setForeground(colorDarkWhite);
		nineButton.setForeground(colorDarkWhite);
		zeroButton.setForeground(colorDarkWhite);
		deleteAllButton.setForeground(colorDarkWhite);
		deleteOneButton.setForeground(colorDarkWhite);
		persentButton.setForeground(colorDarkWhite);
		equalsButton.setForeground(colorDarkWhite);
		changeSignButton.setForeground(colorDarkWhite);
		dotButton.setForeground(colorDarkWhite);
		plusButton.setForeground(colorDarkWhite);
		minusButton.setForeground(colorDarkWhite);
		multipleButton.setForeground(colorDarkWhite);
		divideButton.setForeground(colorDarkWhite);
		
		menuFieldStandart.setForeground(colorDarkWhite);
		nameStandart.setForeground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setForeground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setForeground(colorDarkWhite);
		switchPanelStandart.setForeground(colorDarkWhite);
		standartCalcButtonStandart.setForeground(colorDarkWhite);
		scientificCalcButtonStandart.setForeground(colorDarkWhite);
		derivativesCalcButtonStandart.setForeground(colorDarkWhite);
		integralsCalcButtonStandart.setForeground(colorDarkWhite);
		//outputFieldStandart.setForeground(colorDarkWhite);
		
		/*Here is changing image colors...*/

		
		
		
	}
}
class lightThemeButtonDefaultStandartPressed extends Standart implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		/*Change background color*/
		menuFieldStandart.setBackground(colorDarkWhite);
		nameStandart.setBackground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		switchPanelStandart.setBackground(colorDarkWhite);
		standartCalcButtonStandart.setBackground(colorDarkWhite);
		scientificCalcButtonStandart.setBackground(colorDarkWhite);
		derivativesCalcButtonStandart.setBackground(colorDarkWhite);
		integralsCalcButtonStandart.setBackground(colorDarkWhite);
		outputFieldStandart.setBackground(colorDarkWhite);
		
		buttonsLabelStandart.setBackground(colorWhite);
		
		oneButton.setBackground(colorDarkWhite);
		twoButton.setBackground(colorDarkWhite);
		threeButton.setBackground(colorDarkWhite);
		fourButton.setBackground(colorDarkWhite);
		fiveButton.setBackground(colorDarkWhite);
		sixButton.setBackground(colorDarkWhite);
		sevenButton.setBackground(colorDarkWhite);
		eightButton.setBackground(colorDarkWhite);
		nineButton.setBackground(colorDarkWhite);
		zeroButton.setBackground(colorDarkWhite);
		deleteAllButton.setBackground(colorDarkWhite);
		deleteOneButton.setBackground(colorDarkWhite);
		persentButton.setBackground(colorDarkWhite);
		equalsButton.setBackground(colorDarkWhite);
		changeSignButton.setBackground(colorDarkWhite);
		dotButton.setBackground(colorDarkWhite);
		plusButton.setBackground(colorDarkWhite);
		minusButton.setBackground(colorDarkWhite);
		multipleButton.setBackground(colorDarkWhite);
		divideButton.setBackground(colorDarkWhite);
		
		/*Change font color*/
		oneButton.setForeground(colorBlack);
		twoButton.setForeground(colorBlack);
		threeButton.setForeground(colorBlack);
		fourButton.setForeground(colorBlack);
		fiveButton.setForeground(colorBlack);
		sixButton.setForeground(colorBlack);
		sevenButton.setForeground(colorBlack);
		eightButton.setForeground(colorBlack);
		nineButton.setForeground(colorBlack);
		zeroButton.setForeground(colorBlack);
		deleteAllButton.setForeground(colorBlack);
		deleteOneButton.setForeground(colorBlack);
		persentButton.setForeground(colorBlack);
		equalsButton.setForeground(colorBlack);
		changeSignButton.setForeground(colorBlack);
		dotButton.setForeground(colorBlack);
		plusButton.setForeground(colorBlack);
		minusButton.setForeground(colorBlack);
		multipleButton.setForeground(colorBlack);
		divideButton.setForeground(colorBlack);
		
		menuFieldStandart.setForeground(colorBlack);
		nameStandart.setForeground(colorBlack);
		darkThemeButtonDefaultStandart.setForeground(colorBlack);
		lightThemeButtonDefaultStandart.setForeground(colorBlack);
		switchPanelStandart.setForeground(colorBlack);
		standartCalcButtonStandart.setForeground(colorBlack);
		scientificCalcButtonStandart.setForeground(colorBlack);
		derivativesCalcButtonStandart.setForeground(colorBlack);
		integralsCalcButtonStandart.setForeground(colorBlack);
		outputFieldStandart.setForeground(colorBlack);
	
	}
}

