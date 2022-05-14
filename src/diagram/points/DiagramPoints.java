package diagram.points;

import java.awt.GridLayout;
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
	
	public static JPanel optionsPanel_PointsDiagram = new JPanel();
	
	public static JPanel menuModes_PointsDiagram = new JPanel();
	public static JPanel buttonsPanel_PointsDiagram = new JPanel();
	public static JButton calcButton_PointsDiagram = new JButton();
	public static JButton equationDiagramButton = new JButton();
	public static JLabel menuModes_PointsDiagramText = new JLabel();
	
	public static JPanel menuPointsPanel_PointsDiagram = new JPanel();
	public static JPanel panelPoints_PointsDiagram = new JPanel();
	public static JPanel panelX_PointsDiagram = new JPanel();
	public static JLabel labelX_PointsDiagram = new JLabel();
	public static JTextField pointsX_PointsDiagram = new JTextField(25);
	public static JPanel panelY_PointsDiagram = new JPanel();
	public static JLabel labelY_PointsDiagram = new JLabel();
	public static JTextField pointsY_PointsDiagram = new JTextField(25);
	public static JLabel exceptionLabel_PointsDiagram = new JLabel();
	
	public static JPanel menuButtons_PointsDiagram = new JPanel();
	public static JButton clearButton_PointsDiagram = new JButton();
	public static JButton drawButton_PointsDiagram = new JButton();
	
	public static JPanel graphPanel_PointsDiagram = new JPanel();
	static List<Integer> scoresX_PointsDiagram = new ArrayList<>(Arrays.asList(0, 500, 1000, 3000, 5000, 8000, 10000, 30000, 60000));
	static List<Integer> scoresY_PointsDiagram =  new ArrayList<>(Arrays.asList(0, 10, 20, 30, 50, 100, 160, 300));
	
	public void customizeComponents() {
		buttonsPanel_PointsDiagram.setLayout(new GridLayout(0, 2));
		menuModes_PointsDiagram.setLayout(new GridLayout(2, 0));
		menuPointsPanel_PointsDiagram.setLayout(new GridLayout(2, 0));
		panelPoints_PointsDiagram.setLayout(new GridLayout(0, 2));
		panelX_PointsDiagram.setLayout(new GridLayout(2, 0));
		panelY_PointsDiagram.setLayout(new GridLayout(2, 0));
		menuButtons_PointsDiagram.setLayout(new GridLayout(0, 2));
		optionsPanel_PointsDiagram.setLayout(new GridLayout(3, 0));

		calcButton_PointsDiagram.setText("Back to Calculator");
		calcButton_PointsDiagram.setFont(font20);
		
		equationDiagramButton.setText("Equation Diagram");
		equationDiagramButton.setFont(font20);
		
		menuModes_PointsDiagramText.setText("Draw diagram from two arrays of coordinates");
		menuModes_PointsDiagramText.setHorizontalAlignment(SwingConstants.CENTER);
		menuModes_PointsDiagramText.setFont(font20);
		
		labelX_PointsDiagram.setText("`x` coordinates");
		labelX_PointsDiagram.setHorizontalAlignment(SwingConstants.CENTER);
		labelX_PointsDiagram.setFont(font20);
		labelY_PointsDiagram.setText("`y` coordinates");
		labelY_PointsDiagram.setHorizontalAlignment(SwingConstants.CENTER);
		labelY_PointsDiagram.setFont(font20);
		
		pointsX_PointsDiagram.setFont(font20);
		pointsY_PointsDiagram.setFont(font20);
		
		exceptionLabel_PointsDiagram.setText("");
		exceptionLabel_PointsDiagram.setFont(font20);
		exceptionLabel_PointsDiagram.setHorizontalAlignment(SwingConstants.CENTER);
		
		clearButton_PointsDiagram.setText("Clear");
		clearButton_PointsDiagram.setFont(font25);
		drawButton_PointsDiagram.setText("Draw");
		drawButton_PointsDiagram.setFont(font25);
	}
	
	public void addingComponentsInTheRightOrder() {
		
		buttonsPanel_PointsDiagram.add(calcButton_PointsDiagram);
		buttonsPanel_PointsDiagram.add(equationDiagramButton);
		menuModes_PointsDiagram.add(buttonsPanel_PointsDiagram);
		menuModes_PointsDiagram.add(menuModes_PointsDiagramText);
		
		panelX_PointsDiagram.add(labelX_PointsDiagram);
		panelX_PointsDiagram.add(pointsX_PointsDiagram);
		panelY_PointsDiagram.add(labelY_PointsDiagram);
		panelY_PointsDiagram.add(pointsY_PointsDiagram);
		panelPoints_PointsDiagram.add(panelX_PointsDiagram);
		panelPoints_PointsDiagram.add(panelY_PointsDiagram);
		menuPointsPanel_PointsDiagram.add(panelPoints_PointsDiagram);
		menuPointsPanel_PointsDiagram.add(exceptionLabel_PointsDiagram);
		
		menuButtons_PointsDiagram.add(clearButton_PointsDiagram);
		menuButtons_PointsDiagram.add(drawButton_PointsDiagram);
		
		optionsPanel_PointsDiagram.add(menuModes_PointsDiagram);
		optionsPanel_PointsDiagram.add(menuPointsPanel_PointsDiagram);
		optionsPanel_PointsDiagram.add(menuButtons_PointsDiagram);
		
	}
	
	public void defaultWhiteMode() {
		DiagramPoints_ActionListeners_Design.setUpdefaultWhiteMode();
	}
	
	public void actionListeners() {
		calcButton_PointsDiagram.addActionListener(new CalcButtonPressed());
		equationDiagramButton.addActionListener(new EquationDiagramButtonPressed());
		clearButton_PointsDiagram.addActionListener(new ClearButtonPressed());
		drawButton_PointsDiagram.addActionListener(new DrawButtonPressed());
	}
	
	public void startAndShowCalc() {
		diagramPointsFrame.setSize(1200, 600);
		diagramPointsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		diagramPointsFrame.setLayout(new GridLayout(0, 2));
		diagramPointsFrame.add(optionsPanel_PointsDiagram);
		graphPanel_PointsDiagram = new DiagramPanel(scoresX_PointsDiagram, scoresY_PointsDiagram);
		diagramPointsFrame.add(graphPanel_PointsDiagram);
		diagramPointsFrame.setVisible(false);
	}
}