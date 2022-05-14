package diagram.equation;

import java.awt.Color;

public class DiagramEquation_ActionListeners_Design extends DiagramEquation_ActionListeners {
	public static Color colorBlack = new Color(0, 0, 0);
	public static Color colorDarkWhite = new Color(250, 250, 250);
	
	public static void setUpDefaultWhiteMode() {
		optionsPanel_EquationDiagram.setBackground(colorDarkWhite);
		menuModes_EquationDiagram.setBackground(colorDarkWhite);
		buttonsPanel_EquationDiagram.setBackground(colorDarkWhite);
		calcButton_EquationDiagram.setBackground(colorDarkWhite);
		pointsDiagramButton.setBackground(colorDarkWhite);
		menuModesText_EquationDiagram.setBackground(colorDarkWhite);
		equationPanel.setBackground(colorDarkWhite);
		menuButtons_EquationDiagram.setBackground(colorDarkWhite);
		clearButton_EquationDiagram.setBackground(colorDarkWhite);
		drawButton_EquationDiagram.setBackground(colorDarkWhite);
		
		optionsPanel_EquationDiagram.setForeground(colorBlack);
		menuModes_EquationDiagram.setForeground(colorBlack);
		buttonsPanel_EquationDiagram.setForeground(colorBlack);
		calcButton_EquationDiagram.setForeground(colorBlack);
		pointsDiagramButton.setForeground(colorBlack);
		menuModesText_EquationDiagram.setForeground(colorBlack);
		equationPanel.setForeground(colorBlack);
		menuButtons_EquationDiagram.setForeground(colorBlack);
		clearButton_EquationDiagram.setForeground(colorBlack);
		drawButton_EquationDiagram.setForeground(colorBlack);
	}
}
