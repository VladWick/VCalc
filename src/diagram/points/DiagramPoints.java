package diagram.points;

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

public class DiagramPoints extends Standart {
	
	// Points
	// Equation
	
	public static JPanel optionsPanel = new JPanel();
	
	public static JPanel menuModes = new JPanel();
	public static JPanel buttonsPanel = new JPanel();
	public static JButton calcButton = new JButton();
	public static JButton equationDiagramButton = new JButton();
	public static JLabel menuModesText = new JLabel();
	
	public static JPanel menuPointsPanel = new JPanel();
	public static JPanel panelPoints = new JPanel();
	public static JPanel panelX = new JPanel();
	public static JLabel labelX = new JLabel();
	public static JTextField pointsX = new JTextField(25);
	public static JPanel panelY = new JPanel();
	public static JLabel labelY = new JLabel();
	public static JTextField pointsY = new JTextField(25);
	public static JLabel exceptionLabel = new JLabel();
	
	public static JPanel menuButtons = new JPanel();
	public static JButton clearButton = new JButton();
	public static JButton drawButton = new JButton();
	
	public static JPanel graphPanel = new JPanel();
	static List<Integer> dataX = new ArrayList<>(Arrays.asList(0, 500, 1000, 3000, 5000, 8000, 10000, 30000, 60000));
	static List<Integer> dataY =  new ArrayList<>(Arrays.asList(0, 10, 20, 30, 50, 100, 160, 300));
	
	
	public void customizeComponents() {
		buttonsPanel.setLayout(new GridLayout(0, 2));
		menuModes.setLayout(new GridLayout(2, 0));
		
		menuPointsPanel.setLayout(new GridLayout(2, 0));
		panelPoints.setLayout(new GridLayout(0, 2));
		panelX.setLayout(new GridLayout(2, 0));
		panelY.setLayout(new GridLayout(2, 0));
		menuButtons.setLayout(new GridLayout(0, 2));
		optionsPanel.setLayout(new GridLayout(3, 0));
		//graphPanel = new DiagramPanel(dataX, dataY);
		
		calcButton.setText("Back to Calculator");
		calcButton.setFont(font20);
		
		equationDiagramButton.setText("Equation Diagram");
		equationDiagramButton.setFont(font20);
		
		menuModesText.setText("Draw diagram from two arrays of coordinates");
		menuModesText.setHorizontalAlignment(SwingConstants.CENTER);
		menuModesText.setFont(font20);
		
		labelX.setText("`x` coordinates");
		labelX.setHorizontalAlignment(SwingConstants.CENTER);
		labelX.setFont(font20);
		labelY.setText("`y` coordinates");
		labelY.setHorizontalAlignment(SwingConstants.CENTER);
		labelY.setFont(font20);
		
		pointsX.setFont(font20);
		pointsY.setFont(font20);
		
		exceptionLabel.setText("");
		exceptionLabel.setFont(font20);
		exceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		clearButton.setText("Clear");
		clearButton.setFont(font25);
		drawButton.setText("Draw");
		drawButton.setFont(font25);
	}
	
	public void addingComponentsInTheRightOrder() {
		
		buttonsPanel.add(calcButton);
		buttonsPanel.add(equationDiagramButton);
		menuModes.add(buttonsPanel);
		menuModes.add(menuModesText);
		
		panelX.add(labelX);
		panelX.add(pointsX);
		panelY.add(labelY);
		panelY.add(pointsY);
		panelPoints.add(panelX);
		panelPoints.add(panelY);
		menuPointsPanel.add(panelPoints);
		menuPointsPanel.add(exceptionLabel);
		
		menuButtons.add(clearButton);
		menuButtons.add(drawButton);
		
		optionsPanel.add(menuModes);
		optionsPanel.add(menuPointsPanel);
		optionsPanel.add(menuButtons);
		
	}
	
	public void defaultWhiteMode() {
		optionsPanel.setBackground(colorDarkWhite);
		menuModes.setBackground(colorDarkWhite);
		calcButton.setBackground(colorDarkWhite);
		equationDiagramButton.setBackground(colorDarkWhite);
		menuModes.setBackground(colorGray);
		panelPoints.setBackground(colorDarkWhite);
		panelX.setBackground(colorDarkWhite);
		labelX.setBackground(colorDarkWhite);
		pointsX.setBackground(colorDarkWhite);
		panelY.setBackground(colorDarkWhite);
		labelY.setBackground(colorDarkWhite);
		pointsY.setBackground(colorDarkWhite);
		menuButtons.setBackground(colorDarkWhite);
		clearButton.setBackground(colorDarkWhite);
		drawButton.setBackground(colorDarkWhite);
		graphPanel.setBackground(colorDarkWhite);
		
		optionsPanel.setForeground(colorBlack);
		menuModes.setForeground(colorBlack);
		calcButton.setForeground(colorBlack);
		equationDiagramButton.setForeground(colorBlack);
		// menuModesText.setForeground(colorBlack);
		panelPoints.setForeground(colorBlack);
		panelX.setForeground(colorBlack);
		labelX.setForeground(colorBlack);
		pointsX.setForeground(colorBlack);
		panelY.setForeground(colorBlack);
		labelY.setForeground(colorBlack);
		pointsY.setForeground(colorBlack);
		menuButtons.setForeground(colorBlack);
		clearButton.setForeground(colorBlack);
		drawButton.setForeground(colorBlack);
		graphPanel.setForeground(colorBlack);
	}
	
	public void actionListeners() {
		calcButton.addActionListener(new CalcButtonPressed());
		equationDiagramButton.addActionListener(new EquationDiagramButtonPressed());
		clearButton.addActionListener(new ClearButtonPressed());
		drawButton.addActionListener(new DrawButtonPressed());
	}
	
	public void startAndShowCalc() {
		diagramPointsFrame.setSize(1200, 600);
		diagramPointsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		diagramPointsFrame.setLayout(new GridLayout(0, 2));
		diagramPointsFrame.add(optionsPanel);
		graphPanel = new DiagramPanel(dataX, dataY);
		diagramPointsFrame.add(graphPanel);
		diagramPointsFrame.setVisible(false);
	}
}

class CalcButtonPressed extends DiagramPoints implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}

class EquationDiagramButtonPressed extends DiagramPoints implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		
		diagramEquationFrame.setVisible(true);
	}
}

class DrawButtonPressed extends DiagramPoints implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		
		String xString = pointsX.getText();
		String yString = pointsY.getText();
		
		if(xString.isEmpty() || yString.isEmpty()) {
			exceptionLabel.setForeground(colorRed);
			exceptionLabel.setText("Coordinates can not be empty!");
			
		} else {
			exceptionLabel.setForeground(colorGreen);
			exceptionLabel.setText("Correct!");
			
			ArrayList<String> xArray = new ArrayList<>();
			String copyX = xString;
			int k_x = 0;
			for(int i = 0; i < xString.length(); ++i) {
				char current = xString.charAt(i);
				if(current == ',') {
					xArray.add(xString.substring(k_x, i));
					k_x = i+1;
					copyX = xString.substring(k_x, xString.length());
				}
				
			}
			xArray.add(copyX);
			
			ArrayList<String> yArray = new ArrayList<>();
			String copyY = yString;
			int k_y = 0;
			for(int i = 0; i < yString.length(); ++i) {
				char current = yString.charAt(i);
				if(current == ',') {
					yArray.add(yString.substring(k_y, i));
					k_y = i+1;
					copyY = yString.substring(k_y, yString.length());
				}
				
			}
			yArray.add(copyY);	
			
			List<Integer> dataX_new = new ArrayList<>();
			List<Integer> dataY_new =  new ArrayList<>();
			for(int i = 0; i < xArray.size(); ++i) {
				dataX_new.add(Integer.parseInt(xArray.get(i)));
			}
			for(int i = 0; i < yArray.size(); ++i) {
				dataY_new.add(Integer.parseInt(yArray.get(i)));
			}
			dataX = dataX_new;
			dataY = dataY_new;
			
			diagramPointsFrame.remove(graphPanel);
			startAndShowCalc();
			diagramPointsFrame.setVisible(true);
		}
	}
}

class ClearButtonPressed extends DiagramPoints implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		pointsX.setText("");
		pointsY.setText("");
	}
}


