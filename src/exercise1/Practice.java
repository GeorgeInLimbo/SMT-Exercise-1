package exercise1;

/****

<b>Title:</b> Practice.java<br>
<b>Project:</b> Primitive Variables Exercise<br>
<b>Description: This is a class that contains values from some primitive data types. These variables are displayed in the console.</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author George Clam
@version 1.0
@since Jan 05 2023
@updates: ****/

public class Practice {
	
	private int one = 1;
	private double two = 2.0;
	private float three = 3.0F;
	private char four = '4';
	private boolean trueOrFalse = true;
	
	/** 
	 * @param args
	 */
	 
	public static void main(String[] args) {
		
		Practice data = new Practice();
		
		System.out.println("This is a int data type: " + data.getOne());
		System.out.println("This is a double data type: " + data.getTwo());
		System.out.println("This is a float data type: " + data.getThree());
		System.out.println("This is a char data type: " + data.getFour());
		System.out.println("This is a boolean data type: " + data.getBool());
	}
	
	/**
	 * getter for the int variable
	 * @return
	 */
	public int getOne() {
		return one;
	}
	
	/**
	 * getter for the double variable
	 * @return
	 */
	public double getTwo() {
		return two;
	}
	
	/**
	 * getter for the float variable
	 * @return
	 */
	public float getThree() {
		return three;
	}
	
	/**
	 * getter for the char variable
	 * @return
	 */
	public char getFour() {
		return four;
	}
	
	/**
	 * getter for the boolean variable
	 * @return
	 */
	public boolean getBool() {
		return trueOrFalse;
	}

}
