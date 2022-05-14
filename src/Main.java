import java.io.IOException;

import derivatives.Derivatives;
import diagram.equation.DiagramEquation;
import diagram.points.DiagramPoints;
import integrals.Integrals;
import scientific.Scientific;
import standart.Standart;

/*VCalc 2.2
 * 
*/
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		VCalc();
		
	}
	
	public static void VCalc() throws IOException {
		
		Standart frameStandart = new Standart();
		frameStandart.customizeComponents();
		frameStandart.addingComponentsInTheRightOrder();
		frameStandart.actionListeners();
		frameStandart.defaultWhiteMode();
		frameStandart.startAndShowCalc();
		
		Scientific frameScientific = new Scientific();
		frameScientific.customizeComponents();
		frameScientific.addingComponentsInTheRightOrder();
		frameScientific.actionListenersScientific();
		frameScientific.defaultWhiteMode();
		frameScientific.startAndShowCalc();
		 
		Derivatives frameDerivatives = new Derivatives();
		frameDerivatives.customizeComponents();
		frameDerivatives.addingComponentsInTheRightOrder();
		frameDerivatives.actionListenersDerivatives();
		frameDerivatives.defaultWhiteMode();
		frameDerivatives.startAndShowCalc();
		
		Integrals frameIntegrals = new Integrals();
		frameIntegrals.customizeComponents();
		frameIntegrals.addingComponentsInTheRightOrder();
		frameIntegrals.actionListenersIntegrals();
		frameIntegrals.defaultWhiteMode();
		frameIntegrals.startAndShowCalc();
		
		DiagramPoints frameDiagramPoints = new DiagramPoints();
		frameDiagramPoints.customizeComponents();
		frameDiagramPoints.addingComponentsInTheRightOrder();
		frameDiagramPoints.actionListeners();
		frameDiagramPoints.defaultWhiteMode();
		frameDiagramPoints.startAndShowCalc();
		
		DiagramEquation frameDiagramEquation = new DiagramEquation();
		frameDiagramEquation.customizeComponents();
		frameDiagramEquation.addingComponentsInTheRightOrder();
		frameDiagramEquation.actionListeners();
		frameDiagramEquation.defaultWhiteMode();
		frameDiagramEquation.startAndShowCalc();
		
	}
	
}
