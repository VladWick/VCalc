package standart;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Standart_ActionListeners_Design extends Standart_ActionListeners { 
	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	public static Color colorWhite = new Color(255, 255, 255);
	public static Color colorDarkWhite = new Color(250, 250, 250);
	
	public static void setUpdefaultWhiteMode() {
		menuFieldStandart.setBackground(colorDarkWhite);
		nameStandart.setBackground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		switchBetweenModes_Standart.setBackground(colorDarkWhite);
		diagramButtonStandart.setBackground(colorDarkWhite);
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
		switchBetweenModes_Standart.setForeground(colorBlack);
		diagramButtonStandart.setForeground(colorBlack);
		switchPanelStandart.setForeground(colorBlack);
		standartCalcButtonStandart.setForeground(colorBlack);
		scientificCalcButtonStandart.setForeground(colorBlack);
		derivativesCalcButtonStandart.setForeground(colorBlack);
		integralsCalcButtonStandart.setForeground(colorBlack);
		outputFieldStandart.setForeground(colorBlack);
	}
}

class darkThemeButtonDefaultStandartPressed extends Standart_ActionListeners_Design implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		menuFieldStandart.setBackground(colorSlightlyDarkGrey);
		nameStandart.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultStandart.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultStandart.setBackground(colorSlightlyDarkGrey);
		
		switchBetweenModes_Standart.setBackground(colorSlightlyDarkGrey);
		diagramButtonStandart.setBackground(colorSlightlyDarkGrey);
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
		switchBetweenModes_Standart.setForeground(colorDarkWhite);
		diagramButtonStandart.setForeground(colorDarkWhite);
		switchPanelStandart.setForeground(colorDarkWhite);
		standartCalcButtonStandart.setForeground(colorDarkWhite);
		scientificCalcButtonStandart.setForeground(colorDarkWhite);
		derivativesCalcButtonStandart.setForeground(colorDarkWhite);
		integralsCalcButtonStandart.setForeground(colorDarkWhite);
	}
}
class lightThemeButtonDefaultStandartPressed extends Standart_ActionListeners_Design implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		menuFieldStandart.setBackground(colorDarkWhite);
		nameStandart.setBackground(colorDarkWhite);
		darkThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		lightThemeButtonDefaultStandart.setBackground(colorDarkWhite);
		switchBetweenModes_Standart.setBackground(colorDarkWhite);
		diagramButtonStandart.setBackground(colorDarkWhite);
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
		switchBetweenModes_Standart.setForeground(colorBlack);
		diagramButtonStandart.setForeground(colorBlack);
		switchPanelStandart.setForeground(colorBlack);
		standartCalcButtonStandart.setForeground(colorBlack);
		scientificCalcButtonStandart.setForeground(colorBlack);
		derivativesCalcButtonStandart.setForeground(colorBlack);
		integralsCalcButtonStandart.setForeground(colorBlack);
		outputFieldStandart.setForeground(colorBlack);
	}
}

