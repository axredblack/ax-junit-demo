package main;

public class Calc {
	
	private CalcService cservice;
	
	public int add(int i, int j) {
		return cservice.add(i, j);
	}
	
	public int subtract(int i, int j) {
		return cservice.subtract(i, j);
	}

	public int divide(int i, int j) {
		return cservice.divide(i, j);
	}

	public int multiply(int i, int j) {
		return cservice.multiply(i, j);
	}

}
