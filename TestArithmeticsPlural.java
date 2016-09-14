package com;

/*
 * IT WORKS
 */
public class TestArithmeticsPlural {
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are equal to 1
	 */
	
	public int TestMethod1 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1==1 && myvar2==1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are greater than 1
	 */
	
	public int TestMethod2 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1>1 && myvar2>1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are less than 1
	 */
	
	public int TestMethod3 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1<1 &&myvar2<1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are not equal to 1
	 */
	
	public int TestMethod4 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1!=1 && myvar2!=1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are greater than or equal to 1
	 */
	
	public int TestMethod5 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1>=1 && myvar2>=1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	/**
	 * 
	 * @param myvar1
	 * @param myvar2
	 * @return
	 * @throws IllegalArgumentException if myvar1 and myvar2 are less than or equal to 1
	 */
	
	public int TestMethod6 (int myvar1, int myvar2) throws IllegalArgumentException {
				if(myvar1<=1 && myvar2<=1) throw new IllegalArgumentException();
		return myvar2;
		
	}
	
	

}
