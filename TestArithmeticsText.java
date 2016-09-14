package com;

/*
 * IT WORKS
 */

public class TestArithmeticsText {

	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is less than 1
	 */
	public int TestMethod1 (int myvar) throws IllegalArgumentException{
				if(myvar<1) throw new IllegalArgumentException();
		return myvar;
	}
	
	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is greater than 1
	 */
	public int TestMethod2 (int myvar) throws IllegalArgumentException{
				if(myvar>1) throw new IllegalArgumentException();
		return myvar;
	}
	
	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is equal to 1
	 */
	public int TestMethod3 (int myvar) throws IllegalArgumentException{
				if(myvar==1) throw new IllegalArgumentException();
		return myvar;
	}
	
	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is not equal to 1
	 */
	public int TestMethod4 (int myvar) throws IllegalArgumentException{
				if(myvar!=1) throw new IllegalArgumentException();			
		return myvar;
	}
	
	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is greater than or equal to 1
	 */
	public int TestMethod5 (int myvar) throws IllegalArgumentException{
		if(myvar>=1) throw new IllegalArgumentException();		
		return myvar;
	}
	
	/**
	 * 
	 * @param myvar
	 * @throws IllegalArgumentException if myvar is less than or equal to 1
	 */
	public int TestMethod5b (int myvar) throws IllegalArgumentException{
		if(myvar<=1) throw new IllegalArgumentException();		
		return myvar;
	}
	
	
}
