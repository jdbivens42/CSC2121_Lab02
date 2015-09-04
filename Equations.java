import matrix.*;

public class Equations {
	public static void main(String args[]) {
	
		MatrixOperationsInterface coefficients = MatrixCreator.create(3,3);
		MatrixOperationsInterface constants = MatrixCreator.create(3,1);

		//Coefficients row 1
		coefficients.setElement(1,1, 1.6);
		coefficients.setElement(1,2, 2.4);
		coefficients.setElement(1,3, -3.7);
	
		//Coefficents row 2
		coefficients.setElement(2,1, 17.6);
		coefficients.setElement(2,2, -5.6);
		coefficients.setElement(2,3, 0.05);

		//Coefficients row 3
		coefficients.setElement(3,1, -2);
		coefficients.setElement(3,2, 2);
		coefficients.setElement(3,3, 25.3);

		//Constants row 1 - 3
		constants.setElement(1,1, -22.10);
		constants.setElement(2,1, -4.35);
		constants.setElement(3,1, 233.70);

		MatrixOperationsInterface solution = coefficients.inverse().multiply(constants);
	
		for(int i = 1; i <= solution.getNumRows(); i++ ) {
			System.out.println("x" + i + "=" + solution.getElement(i,1));
		}
	
	}
}