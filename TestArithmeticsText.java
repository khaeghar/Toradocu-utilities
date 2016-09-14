package com;

public class TestArithmeticsText {

	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is less than 1
	 */
	public int TestMethod1 (int b) throws IllegalArgumentException{
				if(b<1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is more than 1
	 */
	public int TestMethod2 (int b) throws IllegalArgumentException{
				if(b>1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is equal to 1
	 */
	public int TestMethod3 (int b) throws IllegalArgumentException{
				if(b==1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is not equal to 1
	 */
	public int TestMethod4 (int b) throws IllegalArgumentException{
				if(b!=1) throw new IllegalArgumentException();			
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is more than or equal to 1
	 */
	public int TestMethod5 (int b) throws IllegalArgumentException{
		if(b>=1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b is less than or equal to 1
	 */
	public int TestMethod5b (int b) throws IllegalArgumentException{
		if(b<=1) throw new IllegalArgumentException();		
		return b;
	}
	
	
}
