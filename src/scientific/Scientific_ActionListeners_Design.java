package scientific;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scientific_ActionListeners_Design extends Scientific_ActionListeners {
	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	public static Color colorDarkWhite = new Color(250, 250, 250);
	
	public static void setUpdefaultWhiteMode() {
		menuFieldScientific.setBackground(colorDarkWhite);
		nameScientific.setBackground(colorDarkWhite);
		darkThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		lightThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		switchPanelScientific.setBackground(colorDarkWhite);
		standartCalcButtonScientific.setBackground(colorDarkWhite);
		scientificCalcButtonScientific.setBackground(colorDarkWhite);
		derivativesCalcButtonScientific.setBackground(colorDarkWhite);
		integralsCalcButtonScientific.setBackground(colorDarkWhite);
		diagramButtonScientific.setBackground(colorDarkWhite);
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
		diagramButtonScientific.setForeground(colorBlack);
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
}

class darkThemeButtonDefaultScientificPressed extends Scientific_ActionListeners_Design implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		menuFieldScientific.setBackground(colorSlightlyDarkGrey);
		nameScientific.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultScientific.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultScientific.setBackground(colorSlightlyDarkGrey);
		switchPanelScientific.setBackground(colorSlightlyDarkGrey);
		standartCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		scientificCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		derivativesCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		integralsCalcButtonScientific.setBackground(colorSlightlyDarkGrey);
		diagramButtonScientific.setBackground(colorSlightlyDarkGrey);
		outputFieldScientific.setBackground(colorSlightlyDarkGrey);
		
		menuFieldScientific.setForeground(colorDarkWhite);
		nameScientific.setForeground(colorDarkWhite);
		darkThemeButtonDefaultScientific.setForeground(colorDarkWhite);
		lightThemeButtonDefaultScientific.setForeground(colorDarkWhite);
		switchPanelScientific.setForeground(colorDarkWhite);
		standartCalcButtonScientific.setForeground(colorDarkWhite);
		scientificCalcButtonScientific.setForeground(colorDarkWhite);
		derivativesCalcButtonScientific.setForeground(colorDarkWhite);
		integralsCalcButtonScientific.setForeground(colorDarkWhite);
		diagramButtonScientific.setForeground(colorDarkWhite);
		buttonsLabelScientific.setBackground(colorBlack);
		
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
class lightThemeButtonDefaultScientificPressed extends Scientific_ActionListeners_Design implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		menuFieldScientific.setBackground(colorDarkWhite);
		nameScientific.setBackground(colorDarkWhite);
		darkThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		lightThemeButtonDefaultScientific.setBackground(colorDarkWhite);
		
		switchPanelScientific.setBackground(colorDarkWhite);
		standartCalcButtonScientific.setBackground(colorDarkWhite);
		scientificCalcButtonScientific.setBackground(colorDarkWhite);
		derivativesCalcButtonScientific.setBackground(colorDarkWhite);
		integralsCalcButtonScientific.setBackground(colorDarkWhite);
		diagramButtonScientific.setBackground(colorDarkWhite);
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
		diagramButtonScientific.setForeground(colorBlack);
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
}
