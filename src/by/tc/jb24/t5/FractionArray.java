package by.tc.jb24.t5;

public class FractionArray {
	
	private Fraction[] array;
	private int freeCell = 0;
	public int length;
	
	public FractionArray(int size){
		array = new Fraction[size];
		}
	
	public boolean addFraction (Fraction newFraction){
		if (freeCell>=array.length){
			return false;
		}
		
		array[freeCell] = newFraction;
		freeCell++;
		return true;
	}
	
	public void print() {
		for (Fraction fr : array){
			fr.print();
			System.out.println(" ");
		}
	}	
}
		

