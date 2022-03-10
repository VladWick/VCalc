import java.io.IOException;

import ssdi.*;

/*VCalc
 * 
 * 1_VCalc_SSDI
 * 2_VCalc_2
 * 
*/
public class Main {
	
	public static void main(String[] args) throws IOException {

		// first attempt
		VCalcSSDI();
		
		// mmm?
		
		
		
	}
	
	public static void VCalcSSDI() throws IOException {
		
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
		
	}
	
}
