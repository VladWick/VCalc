package diagram.equation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

public class DiagramEquation_ActionListeners extends DiagramEquation {
	
	static List<Character> operators = new ArrayList<>(
			Arrays.asList('+', '-', '*', '/'));
	static List<Character> supportedSymbols = new ArrayList<>(
			Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'+', '-', '*', '/',
					'x'));
	
	public static Color colorRed = new Color(255, 0, 0);
	public static Color colorGreen = new Color(0, 255, 0);
}

class CalcButtonPressed extends DiagramEquation_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}

class EquationDiagramButtonPressed extends DiagramEquation_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		
		diagramEquationFrame.setVisible(true);
	}
}

class PointsDiagramButtonPressed extends DiagramEquation_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		diagramPointsFrame.setVisible(true);
	}
}

class ClearButtonPressed extends DiagramEquation_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		equationInput.setText("");
		exceptionLabel_EquationDiagram.setText("");
	}
}

class DrawButtonPressed extends DiagramEquation_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		String str = equationInput.getText();
		try {
			inputCheck(str);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		List<Integer> scoresX_EquationDiagram_new =  new ArrayList<>();
		int amountOfPoints = 12;
		for(int i = 0 ; i < amountOfPoints; ++i) {
			scoresX_EquationDiagram_new.add(i);
		}
		
		List<Integer> scoresY_EquationDiagram_new =  new ArrayList<>();
		int xIndex = str.indexOf('x');
		// xIndex==0
			// size() == 1 -> x
			// size() != 1 -> x + b
		// xIndex!=0
			// xIndex == end -> ax
			// xIndex != end -> ax + b		
		if(xIndex == 0) {
			if(str.length() == 1) {
				for(int i = 0 ; i < amountOfPoints; ++i) {
					scoresY_EquationDiagram_new.add(i);
				}
				updateGraph(scoresX_EquationDiagram_new, scoresY_EquationDiagram_new);
				startAndShowCalc();
				diagramEquationFrame.setVisible(true);
				exceptionLabel_EquationDiagram.setText("Appropriate equation!");
				exceptionLabel_EquationDiagram.setForeground(colorGreen);
			} else {
				char operatorAfterX = str.charAt(xIndex+1);
				int numberAfterOperator = Integer.parseInt(str.substring(xIndex+2, str.length()));
				for(int i = 0 ; i < amountOfPoints; ++i) {
					int yPoint = i;
					if(operatorAfterX == '+') {
						yPoint += numberAfterOperator;
					} else if(operatorAfterX == '-') {
						yPoint -= numberAfterOperator;
					} else if(operatorAfterX == '*') {
						yPoint *= numberAfterOperator;
					} else if(operatorAfterX == '/') {
						yPoint /= numberAfterOperator;
					} else {
						System.out.println("Something went wrong");
					}
					scoresY_EquationDiagram_new.add(yPoint);
				}
				updateGraph(scoresX_EquationDiagram_new, scoresY_EquationDiagram_new);
				startAndShowCalc();
				diagramEquationFrame.setVisible(true);
				exceptionLabel_EquationDiagram.setText("Appropriate equation!");
				exceptionLabel_EquationDiagram.setForeground(colorGreen);
			}
		} else {
			int coefBeforeX = Integer.parseInt(str.substring(0, xIndex));
			if(xIndex == str.length()-1) {
				for(int i = 0 ; i < amountOfPoints; ++i) {
					scoresY_EquationDiagram_new.add(coefBeforeX*i);
				}
				updateGraph(scoresX_EquationDiagram_new, scoresY_EquationDiagram_new);
				startAndShowCalc();
				diagramEquationFrame.setVisible(true);
				exceptionLabel_EquationDiagram.setText("Appropriate equation!");
				exceptionLabel_EquationDiagram.setForeground(colorGreen);
			} else {
				char operatorAfterX = str.charAt(xIndex+1);
				int numberAfterOperator = Integer.parseInt(str.substring(xIndex+2, str.length()));
				for(int i = 0 ; i < amountOfPoints; ++i) {
					int yPoint = coefBeforeX * i;
					if(operatorAfterX == '+') {
						yPoint += numberAfterOperator;
					} else if(operatorAfterX == '-') {
						yPoint -= numberAfterOperator;
					} else if(operatorAfterX == '*') {
						yPoint *= numberAfterOperator;
					} else if(operatorAfterX == '/') {
						yPoint /= numberAfterOperator;
					} else {
						System.out.println("Something went wrong");
					}
					scoresY_EquationDiagram_new.add(yPoint);
				}
				updateGraph(scoresX_EquationDiagram_new, scoresY_EquationDiagram_new);
				startAndShowCalc();
				diagramEquationFrame.setVisible(true);
				exceptionLabel_EquationDiagram.setText("Appropriate equation!");
				exceptionLabel_EquationDiagram.setForeground(colorGreen);
			}
		}
	}
	
	public static boolean checkContainingInTheArray(char charToCheck, char[] array) {
		for(int i = 0 ; i < array.length; ++i) {
			if(charToCheck == array[i]) {
				return true;
			}
		} 
		return false;
	}
	
	public static boolean checkForUnsupportedSymbols(String str) {
		boolean flag = false;
		for(int i = 0; i < str.length(); ++i) {
			flag = false;
			char xCurrent = str.charAt(i);
			for(int j = 0 ; j < supportedSymbols.size(); ++j) {
				if(xCurrent == supportedSymbols.get(j)) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				break;
			}
		}
		return flag;
	}
	
	public static void inputCheck(String str) throws Exception {
		if(str.isEmpty()) {
			exceptionLabel_EquationDiagram.setText("Equation can not be empty!");
			exceptionLabel_EquationDiagram.setForeground(colorRed);
			throw new Exception("Equation can not be empty!");
		}
		
		char lastChar = str.charAt(str.length()-1);
		for(int i = 0 ; i < operators.size(); ++i) {
			if(lastChar == operators.get(i)) {
				exceptionLabel_EquationDiagram.setText("Equation can not end with an operator!");
				exceptionLabel_EquationDiagram.setForeground(colorRed);
				throw new Exception("Equation can not end with an operator!");
			}
		}
		
		char firstChar = str.charAt(0);
		for(int i = 0 ; i < operators.size(); ++i) {
			if(firstChar == operators.get(i)) {
				exceptionLabel_EquationDiagram.setText("Equation can not start with an operator!");
				exceptionLabel_EquationDiagram.setForeground(colorRed);
				throw new Exception("Equation can not start with an operator!");
			}
		}
		
		boolean flag = checkForUnsupportedSymbols(str);
		if(!flag) {
			exceptionLabel_EquationDiagram.setText("Inappropriate symbols in equation!");
			exceptionLabel_EquationDiagram.setForeground(colorRed);
			throw new Exception("Inappropriate symbols in equation!");
		}
	}
	
	public static void updateGraph(List<Integer> scoresX_EquationDiagram_new, List<Integer> scoresY_EquationDiagram_new) {
		scoresX_EquationDiagram.clear();
		scoresY_EquationDiagram.clear();
		scoresX_EquationDiagram = scoresX_EquationDiagram_new;
		scoresY_EquationDiagram = scoresY_EquationDiagram_new;
		diagramEquationFrame.remove(graphPanel_EquationDiagram);
	}
}
