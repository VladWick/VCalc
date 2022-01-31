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
		
		frameStandart.createStandartCalc();
		frameScientific.createScientificCalc();
		frameDerivatives.createDerivativesCalc();
		frameIntegrals.createIntegralsCalc();
		
		System.out.println("asd");
		System.out.println("asd");
	}
}