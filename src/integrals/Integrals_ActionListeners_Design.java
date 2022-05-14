package integrals;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Integrals_ActionListeners_Design extends Integrals_ActionListeners {
	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorSlightlyDarkGrey = new Color(75, 75, 75);
	public static Color colorWhite = new Color(255, 255, 255);
	public static Color colorDarkWhite = new Color(250, 250, 250);

	public static void setUpDefaultWhiteMode() {
		menuFieldIntegrals.setBackground(colorDarkWhite);
		nameIntegrals.setBackground(colorDarkWhite);
		darkThemeButtonDefaultIntegrals.setBackground(colorDarkWhite);
		lightThemeButtonDefaultIntegrals.setBackground(colorDarkWhite);
		switchPanelIntegrals.setBackground(colorDarkWhite);
		standartCalcButtonIntegrals.setBackground(colorDarkWhite);
		scientificCalcButtonIntegrals.setBackground(colorDarkWhite);
		derivativesCalcButtonIntegrals.setBackground(colorDarkWhite);
		integralsCalcButtonIntegrals.setBackground(colorDarkWhite);
		diagramButtonIntegrals.setBackground(colorDarkWhite);
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
		diagramButtonIntegrals.setForeground(colorBlack);
		outputFieldIntegrals.setForeground(colorBlack);
		
		buttonsPanelIntegrals.setBackground(colorDarkWhite);
		inputLabelIntegrals.setBackground(colorDarkWhite);
		iconFuncIntegrals.setBackground(colorDarkWhite);
		inputLabelFuncIntegrals.setBackground(colorDarkWhite);
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

class darkThemeButtonDefaultIntegralsPressed extends Integrals_ActionListeners_Design implements ActionListener {
	
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
		diagramButtonIntegrals.setBackground(colorSlightlyDarkGrey);
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
		diagramButtonIntegrals.setForeground(colorDarkWhite);
		
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
class lightThemeButtonDefaultIntegralsPressed extends Integrals_ActionListeners_Design implements ActionListener {
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
		diagramButtonIntegrals.setBackground(colorDarkWhite);
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
		diagramButtonIntegrals.setForeground(colorBlack);
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