package by.tc.jb24.t5;

public class Fraction {
	private int m;
	private int n;
	
	public Fraction(int m, int n){
		this.m = m;
		this.n = n;
	}
	
	public int getNumerator(){
		return m;
	}
	
	public void setNumerator (int m){
		this.m = m;
	}
	
	public int getDenominator(){
		return n;
	}
	
	public void setDenominator(int n){
		this.n = n;
	}
	
	public void print(){
		System.out.println(m + "/" + n);
	}
}
