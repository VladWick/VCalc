import java.io.IOException;

import classes.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		createCalc();
	}
	
	public static void createCalc() throws IOException {
		
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
		
		Design design = new Design();
	}
	
}
