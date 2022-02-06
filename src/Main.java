import java.io.IOException;

import classes.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		createCalc();
	}
	
	public static void createCalc() throws IOException {
		
		Standart frameStandart = new Standart();
		Scientific frameScientific = new Scientific();
		Derivatives frameDerivatives = new Derivatives();
		Integrals frameIntegrals = new Integrals();
		
		frameStandart.customizeComponents();
		frameStandart.addingComponentsInTheRightOrder();
		frameStandart.actionListeners();
		frameStandart.defaultWhiteMode();
		frameStandart.startAndShowCalc();
		
		frameScientific.customizeComponents();
		frameScientific.addingComponentsInTheRightOrder();
		frameScientific.actionListeners();
		frameScientific.defaultWhiteMode();
		frameScientific.startAndShowCalc();
		
		frameDerivatives.customizeComponents();
		frameDerivatives.addingComponentsInTheRightOrder();
		frameDerivatives.actionListeners();
		frameDerivatives.defaultWhiteMode();
		frameDerivatives.startAndShowCalc();
		
		frameIntegrals.customizeComponents();
		frameIntegrals.addingComponentsInTheRightOrder();
		frameIntegrals.actionListeners();
		frameIntegrals.defaultWhiteMode();
		frameIntegrals.startAndShowCalc();
		
		Design design = new Design();
	}
	
}
