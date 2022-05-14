package derivatives;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Derivatives_ActionListeners_Design extends Derivatives_ActionListeners {
	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	public static Color colorWhite = new Color(255, 255, 255);
	public static Color colorDarkWhite = new Color(250, 250, 250);
	
	public static void setUpDefaultWhiteMode() {
		menuFieldDerivatives.setBackground(colorDarkWhite);
		nameDerivatives.setBackground(colorDarkWhite);
		darkThemeButtonDefaultDerivatives.setBackground(colorDarkWhite);
		lightThemeButtonDefaultDerivatives.setBackground(colorDarkWhite);
		switchPanelDerivatives.setBackground(colorDarkWhite);
		standartCalcButtonDerivatives.setBackground(colorDarkWhite);
		scientificCalcButtonDerivatives.setBackground(colorDarkWhite);
		derivativesCalcButtonDerivatives.setBackground(colorDarkWhite);
		integralsCalcButtonDerivatives.setBackground(colorDarkWhite);
		diagramButtonDerivatives.setBackground(colorDarkWhite);
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
		diagramButtonDerivatives.setForeground(colorBlack);
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

class darkThemeButtonDefaultDerivativesPressed extends Derivatives_ActionListeners_Design implements ActionListener {
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
		diagramButtonDerivatives.setBackground(colorSlightlyDarkGrey);
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
		diagramButtonDerivatives.setForeground(colorDarkWhite);

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

class lightThemeButtonDefaultDerivativesPressed extends Derivatives_ActionListeners_Design implements ActionListener {
	
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
		diagramButtonDerivatives.setBackground(colorDarkWhite);
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
		diagramButtonDerivatives.setForeground(colorBlack);
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
