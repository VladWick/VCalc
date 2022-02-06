package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Design {
	
}

/*Switching between calculators*/
class StandartMenuPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}
class ScientificMenuPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		scientificFrame.setVisible(true);
	}
}
class DerivativesMenuPressed extends Standart implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		scientificFrame.setVisible(false);
		integralsFrame.setVisible(false);
		
		derivativesFrame.setVisible(true);
	}
}
class IntegralsMenuPressed extends Standart implements ActionListener{

	public void actionPerformed(ActionEvent e) { 
		
		standartFrame.setVisible(false);
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		
		integralsFrame.setVisible(true);
	}
}
/*StandartCalc dark and light mode*/
class darkThemeButtonDefaultStandartPressed extends Standart implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {

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
	}
}
class lightThemeButtonDefaultStandartPressed extends Standart implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
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
/*Scientific Calc dark and light mode*/
class darkThemeButtonDefaultScientificPressed extends Scientific implements ActionListener {
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

/*DerivativesCalc dark and light mode*/
class darkThemeButtonDefaultDerivativesPressed extends Derivatives implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {

		menuFieldDerivatives.setBackground(colorSlightlyDarkGrey);
		nameDerivatives.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultDerivatives.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultDerivatives.setBackground(colorSlightlyDarkGrey);
		
		switchPanelDerivatives.setBackground(colorSlightlyDarkGrey);
		standartCalcButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		scientificCalcButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		derivativesCalcButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		integralsCalcButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		outputFieldDerivatives.setBackground(colorSlightlyDarkGrey);
		
		menuFieldDerivatives.setForeground(colorDarkWhite);
		nameDerivatives.setForeground(colorDarkWhite);
		darkThemeButtonDefaultDerivatives.setForeground(colorDarkWhite);
		lightThemeButtonDefaultDerivatives.setForeground(colorDarkWhite);
		switchPanelDerivatives.setForeground(colorDarkWhite);
		standartCalcButtonDerivatives.setForeground(colorDarkWhite);
		scientificCalcButtonDerivatives.setForeground(colorDarkWhite);
		derivativesCalcButtonDerivatives.setForeground(colorDarkWhite);
		integralsCalcButtonDerivatives.setForeground(colorDarkWhite);

		buttonsPanelDerivatives.setBackground(colorSlightlyDarkGrey);
		inputLabelDerivatives.setBackground(colorSlightlyDarkGrey);
		iconFuncDerivatives.setBackground(colorSlightlyDarkGrey);
		inputLabelFuncDerivatives.setBackground(colorSlightlyDarkGrey);
		workButtonsPanel.setBackground(colorSlightlyDarkGrey);
		solveButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		clearButtonDerivatives.setBackground(colorSlightlyDarkGrey);
		outputLabelDerivatives.setBackground(colorSlightlyDarkGrey);
		iconDerivative.setBackground(colorSlightlyDarkGrey);
		outputFuncDerivatives.setBackground(colorSlightlyDarkGrey);
		
		buttonsPanelDerivatives.setForeground(colorDarkWhite);
		inputLabelDerivatives.setForeground(colorDarkWhite);
		iconFuncDerivatives.setForeground(colorDarkWhite);
		inputLabelFuncDerivatives.setForeground(colorDarkWhite);
		workButtonsPanel.setForeground(colorDarkWhite);
		solveButtonDerivatives.setForeground(colorDarkWhite);
		clearButtonDerivatives.setForeground(colorDarkWhite);
		outputLabelDerivatives.setForeground(colorDarkWhite);
		iconDerivative.setForeground(colorDarkWhite);
		outputFuncDerivatives.setForeground(colorDarkWhite);	
	}
}
class lightThemeButtonDefaultDerivativesPressed extends Derivatives implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
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
}

/*Integrals Calc dark and light mode*/
class darkThemeButtonDefaultIntegralsPressed extends Integrals implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		menuFieldIntegrals.setBackground(colorSlightlyDarkGrey);
		nameIntegrals.setBackground(colorSlightlyDarkGrey);
		darkThemeButtonDefaultIntegrals.setBackground(colorSlightlyDarkGrey);
		lightThemeButtonDefaultIntegrals.setBackground(colorSlightlyDarkGrey);
		
		switchPanelIntegrals.setBackground(colorSlightlyDarkGrey);
		standartCalcButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		scientificCalcButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		derivativesCalcButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		integralsCalcButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		outputFieldIntegrals.setBackground(colorSlightlyDarkGrey);
		
		menuFieldIntegrals.setForeground(colorDarkWhite);
		nameIntegrals.setForeground(colorDarkWhite);
		darkThemeButtonDefaultIntegrals.setForeground(colorDarkWhite);
		lightThemeButtonDefaultIntegrals.setForeground(colorDarkWhite);
		switchPanelIntegrals.setForeground(colorDarkWhite);
		standartCalcButtonIntegrals.setForeground(colorDarkWhite);
		scientificCalcButtonIntegrals.setForeground(colorDarkWhite);
		derivativesCalcButtonIntegrals.setForeground(colorDarkWhite);
		integralsCalcButtonIntegrals.setForeground(colorDarkWhite);
		
		buttonsPanelIntegrals.setBackground(colorSlightlyDarkGrey);
		inputLabelIntegrals.setBackground(colorSlightlyDarkGrey);
		iconFuncIntegrals.setBackground(colorSlightlyDarkGrey);
		inputLabelFuncIntegrals.setBackground(colorSlightlyDarkGrey);
		workButtonsPanel.setBackground(colorSlightlyDarkGrey);
		solveButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		clearButtonIntegrals.setBackground(colorSlightlyDarkGrey);
		outputLabelIntegrals.setBackground(colorSlightlyDarkGrey);
		iconIntegral.setBackground(colorSlightlyDarkGrey);
		outputFuncIntegrals.setBackground(colorSlightlyDarkGrey);

		buttonsPanelIntegrals.setForeground(colorDarkWhite);
		inputLabelIntegrals.setForeground(colorDarkWhite);
		iconFuncIntegrals.setForeground(colorDarkWhite);
		inputLabelFuncIntegrals.setForeground(colorDarkWhite);
		workButtonsPanel.setForeground(colorDarkWhite);
		solveButtonIntegrals.setForeground(colorDarkWhite);
		clearButtonIntegrals.setForeground(colorDarkWhite);
		outputLabelIntegrals.setForeground(colorDarkWhite);
		iconIntegral.setForeground(colorDarkWhite);
		outputFuncIntegrals.setForeground(colorDarkWhite);
	}
}
class lightThemeButtonDefaultIntegralsPressed extends Integrals implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
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

		buttonsPanelIntegrals.setBackground(colorDarkWhite);
		inputLabelIntegrals.setBackground(colorDarkWhite);
		iconFuncIntegrals.setBackground(colorDarkWhite);
		inputFuncIntegrals.setBackground(colorDarkWhite);
		inputFuncIntegrals.setBackground(colorDarkWhite);
		workButtonsPanel.setBackground(colorDarkWhite);
		solveButtonIntegrals.setBackground(colorDarkWhite);
		clearButtonIntegrals.setBackground(colorDarkWhite);
		outputLabelIntegrals.setBackground(colorDarkWhite);
		iconIntegral.setBackground(colorDarkWhite);
		outputFuncIntegrals.setBackground(colorDarkWhite);

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