package com;

public class TestSingularPlural {

	/**
	 * @param myvar2
	 * @param myvar
	 * @throws IllegalArgumentException if myvar and myvar2 are null
	 */
	public void TestMethod1(Integer myvar, Integer myvar2) throws IllegalArgumentException {
		if(myvar==null && myvar2==null) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 are negative
	 */
	public void TestMethod2(int myvar, int myvar2) throws IllegalArgumentException {
		if(myvar<0 && myvar2<0) throw new IllegalArgumentException();
	}
	
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 are positive
	 */
	public void TestMethod3(int myvar, int myvar2) throws IllegalArgumentException {
		if(myvar>0 && myvar2>0) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 are true
	 */
	public void TestMethod4(boolean myvar, boolean myvar2) throws IllegalArgumentException {
		if(myvar&&myvar2) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 are false
	 */
	public void TestMethod5(boolean myvar, boolean myvar2) throws IllegalArgumentException {
		if(!(myvar&& myvar2)) throw new IllegalArgumentException();
	}
	
	
	/**
	 * @param myvar2
	 * @param myvar
	 * @throws IllegalArgumentException if myvar and myvar2 is null
	 */
	public void TestMethod1b(Integer myvar, Integer myvar2) throws IllegalArgumentException {
		if(myvar==null && myvar2==null) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 is negative
	 */
	public void TestMethod2b(int myvar, int myvar2) throws IllegalArgumentException {
		if(myvar<0 && myvar2<0) throw new IllegalArgumentException();
	}
	
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 is positive
	 */
	public void TestMethod3b(int myvar, int myvar2) throws IllegalArgumentException {
		if(myvar>0 && myvar2>0) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 is true
	 */
	public void TestMethod4b(boolean myvar, boolean myvar2) throws IllegalArgumentException {
		if(myvar&&myvar2) throw new IllegalArgumentException();
	}
	
	/**
	 * 
	 * @param myvar
	 * @param myvar2
	 * @throws IllegalArgumentException if myvar and myvar2 is false
	 */
	public void TestMethod5b(boolean myvar, boolean myvar2) throws IllegalArgumentException {
		if(!(myvar&& myvar2)) throw new IllegalArgumentException();
	}
	
	
	
	
	
}
