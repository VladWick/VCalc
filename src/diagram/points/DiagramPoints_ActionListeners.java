package diagram.points;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagramPoints_ActionListeners extends DiagramPoints {
	public static Color colorRed = new Color(255, 0, 0);
	public static Color colorGreen = new Color(0, 255, 0);
	static List<Character> operators = new ArrayList<>(
			Arrays.asList('+', '-', '*', '/'));
	static List<Character> supportedSymbols = new ArrayList<>(
			Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ','));
}

 
class CalcButtonPressed extends DiagramPoints_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		diagramEquationFrame.setVisible(false);
		
		standartFrame.setVisible(true);
	}
}

class EquationDiagramButtonPressed extends DiagramPoints_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		scientificFrame.setVisible(false);
		derivativesFrame.setVisible(false);
		integralsFrame.setVisible(false);
		standartFrame.setVisible(false);
		diagramPointsFrame.setVisible(false);
		
		diagramEquationFrame.setVisible(true);
	}
}

class DrawButtonPressed extends DiagramPoints_ActionListeners implements ActionListener{
	
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
	
	public static int amountOfCommas(String str) {
		int amount = 0;
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == ',') {
				amount++;
			}
		}
		return amount;
	}
	
	public static void inputCheck(String xString, String yString) throws Exception {
		if(xString.isEmpty() || yString.isEmpty()) {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("Coordinates can not be empty!");
			throw new Exception("Coordinates can not be empty!");
			
		} else if(xString.charAt(0) == ',') {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("`x` coordinates can not START with an operator!");
			throw new Exception("`x` coordinates can not START with an operator!");
			
		} else if(xString.charAt(xString.length()-1) == ',') {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("`x` coordinates can not END with an operator!");
			throw new Exception("`x` coordinates can not END with an operator!");
			
		} else if(yString.charAt(0) == ',') {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("`y` coordinates can not START with an operator!");
			throw new Exception("`y` coordinates can not START with an operator!");
			
		} else if(yString.charAt(yString.length()-1) == ',') {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("`y` coordinates can not END with an operator!");
			throw new Exception("`y` coordinates can not END with an operator!");
			
		} else if(amountOfCommas(xString) != amountOfCommas(yString)) {
			exceptionLabel_PointsDiagram.setForeground(colorRed);
			exceptionLabel_PointsDiagram.setText("`x` and `y` coordinates should be equal!");
			throw new Exception("`x` and `y` coordinates should be equal!");
			
		} else {
			boolean xFlag = checkForUnsupportedSymbols(xString);
			boolean yFlag = checkForUnsupportedSymbols(yString);
			if(!xFlag || !yFlag) {
				exceptionLabel_PointsDiagram.setForeground(colorRed);
				exceptionLabel_PointsDiagram.setText("Unsupported symbols!");
				throw new Exception("Unsupported symbols!");
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		String xString = pointsX_PointsDiagram.getText();
		String yString = pointsY_PointsDiagram.getText();
		
		try {
			inputCheck(xString, yString);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

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
		
		List<Integer> scoresX_PointsDiagram_new = new ArrayList<>();
		List<Integer> scoresY_PointsDiagram_new =  new ArrayList<>();
		for(int i = 0; i < xArray.size(); ++i) {
			scoresX_PointsDiagram_new.add(Integer.parseInt(xArray.get(i)));
		}
		for(int i = 0; i < yArray.size(); ++i) {
			scoresY_PointsDiagram_new.add(Integer.parseInt(yArray.get(i)));
		}
		scoresX_PointsDiagram = scoresX_PointsDiagram_new;
		scoresY_PointsDiagram = scoresY_PointsDiagram_new;
		
		diagramPointsFrame.remove(graphPanel_PointsDiagram);
		startAndShowCalc();
		exceptionLabel_PointsDiagram.setForeground(colorGreen);
		exceptionLabel_PointsDiagram.setText("Correct!");
		diagramPointsFrame.setVisible(true);
	}
}

class ClearButtonPressed extends DiagramPoints_ActionListeners implements ActionListener{
	public void actionPerformed(ActionEvent e) { 
		pointsX_PointsDiagram.setText("");
		pointsY_PointsDiagram.setText("");
		exceptionLabel_PointsDiagram.setText("");
	}
}

