package by.tc.jb24.t5;

public class task5 {

	public static void main (String[] args) {
				
		FractionArray arrayX = new FractionArray (3);
		
		arrayX.addFraction(new Fraction (5,7));
		arrayX.addFraction(new Fraction (2,5));
		arrayX.addFraction(new Fraction (8, 9));
		
		arrayX.print();

	}
}

