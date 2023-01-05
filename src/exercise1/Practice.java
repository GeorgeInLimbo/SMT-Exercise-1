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
		data.execute();
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
	public boolean isBool() {
		return trueOrFalse;
	}
	
	public void execute() {
		System.out.println("This is a int data type: " + getOne());
		System.out.println("This is a double data type: " + getTwo());
		System.out.println("This is a float data type: " + getThree());
		System.out.println("This is a char data type: " + getFour());
		System.out.println("This is a boolean data type: " + isBool());
	}

}
