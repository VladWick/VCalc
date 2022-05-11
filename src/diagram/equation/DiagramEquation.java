package diagram.equation;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import diagram.DiagramPanel;
import standart.Standart;

public class DiagramEquation extends Standart {
	
	public static JPanel optionsPanel_EquationDiagram = new JPanel();
	
	public static JPanel menuModes_EquationDiagram = new JPanel();
	public static JPanel buttonsPanel_EquationDiagram = new JPanel();
	public static JButton calcButton_EquationDiagram = new JButton();
	public static JButton pointsDiagramButton = new JButton();
	public static JLabel menuModesText_EquationDiagram = new JLabel();
	
	public static JPanel equationPanel = new JPanel();
	public static JLabel equationLabel = new JLabel();
	public static JTextField equationInput = new JTextField(25);
	public static JLabel equationException = new JLabel();
	
	public static JPanel menuButtons_EquationDiagram = new JPanel();
	public static JButton clearButton_EquationDiagram = new JButton();
	public static JButton drawButton_EquationDiagram = new JButton();
	
	public static JPanel graphPanel_EquationDiagram = new JPanel();
	static List<Integer> dataX = new ArrayList<>(Arrays.asList(0, 500, 1000, 3000, 5000, 8000, 10000, 30000, 60000));
	static List<Integer> dataY =  new ArrayList<>(Arrays.asList(0, 10, 20, 30, 50, 100, 160, 300));
	
	public void customizeComponents() {
		buttonsPanel_EquationDiagram.setLayout(new GridLayout(0, 2));
		menuModes_EquationDiagram.setLayout(new GridLayout(2, 0));
		
		equationPanel.setLayout(new GridLayout(3,0));
		
		menuButtons_EquationDiagram.setLayout(new GridLayout(0, 2));
		optionsPanel_EquationDiagram.setLayout(new GridLayout(3, 0));
		graphPanel_EquationDiagram = new DiagramPanel(dataX, dataY);
		
		calcButton_EquationDiagram.setText("Back to Calculator");
		calcButton_EquationDiagram.setFont(font20);
		
		pointsDiagramButton.setText("Points Diagram");
		pointsDiagramButton.setFont(font20);
		
		menuModesText_EquationDiagram.setText("Draw diagram from the equationPanel");
		menuModesText_EquationDiagram.setHorizontalAlignment(SwingConstants.CENTER);
		menuModesText_EquationDiagram.setFont(font20);
		
		equationLabel.setText("Enter equation here:");
		equationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equationLabel.setFont(font20);
		
		equationInput.setFont(font20);
		
		clearButton_EquationDiagram.setText("Clear");
		clearButton_EquationDiagram.setFont(font25);
		drawButton_EquationDiagram.setText("Draw");
		drawButton_EquationDiagram.setFont(font25);
	}
	
	public void addingComponentsInTheRightOrder() {
		
		buttonsPanel_EquationDiagram.add(calcButton_EquationDiagram);
		buttonsPanel_EquationDiagram.add(pointsDiagramButton);
		menuModes_EquationDiagram.add(buttonsPanel_EquationDiagram);
		menuModes_EquationDiagram.add(menuModesText_EquationDiagram);
		
		equationPanel.add(equationLabel);
		equationPanel.add(equationInput);
		equationPanel.add(equationException);
		
		menuButtons_EquationDiagram.add(clearButton_EquationDiagram);
		menuButtons_EquationDiagram.add(drawButton_EquationDiagram);
		
		optionsPanel_EquationDiagram.add(menuModes_EquationDiagram);
		optionsPanel_EquationDiagram.add(equationPanel);
		optionsPanel_EquationDiagram.add(menuButtons_EquationDiagram);
		
	}
	
	public void defaultWhiteMode() {
		
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
	
	public void actionListeners() {
		calcButton_EquationDiagram.addActionListener(new CalcButtonPressed());
		pointsDiagramButton.addActionListener(new PointsDiagramButtonPressed());
		clearButton_EquationDiagram.addActionListener(new ClearButtonPressed());
		drawButton_EquationDiagram.addActionListener(new DrawButtonPressed());
	}
	
	public void startAndShowCalc() {
		diagramEquationFrame.setSize(1200, 600);
		diagramEquationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		diagramEquationFrame.setLayout(new GridLayout(0, 2));
		diagramEquationFrame.add(optionsPanel_EquationDiagram);
		diagramEquationFrame.add(graphPanel_EquationDiagram);
		diagramEquationFrame.setVisible(false);
	}
}

class CalcButtonPressed extends DiagramEquation implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}

class EquationDiagramButtonPressed extends DiagramEquation implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		
		diagramEquationFrame.setVisible(true);
	}
}

class PointsDiagramButtonPressed extends DiagramEquation implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		diagramPointsFrame.setVisible(true);
	}
}

class DrawButtonPressed extends DiagramEquation implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = equationInput.getText();
		System.out.println(str);
		
	}
}

class ClearButtonPressed extends DiagramEquation implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		equationInput.setText("");
	}
}

