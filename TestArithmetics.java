package com;

/*
 * DOESN'T WORK
 */

public class TestArithmetics {

	
	/*
	 * Length: 1 | 1+
	 * 
	 * Spaces: Y | N
	 * 
	 * Symbols: >, <, ==, !=, >=, <=
	 * 
	 * 
	 */
	
	
	/*
	 * L: 1
	 * S: N
	 */
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b<1
	 */
	public int TestMethod1 (int b) throws IllegalArgumentException{
				if(b<1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b>1
	 */
	public int TestMethod2 (int b) throws IllegalArgumentException{
				if(b>1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b==1
	 */
	public int TestMethod3 (int b) throws IllegalArgumentException{
				if(b==1) throw new IllegalArgumentException();
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b!=1
	 */
	public int TestMethod4 (int b) throws IllegalArgumentException{
				if(b!=1) throw new IllegalArgumentException();			
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b>=1
	 */
	public int TestMethod5 (int b) throws IllegalArgumentException{
		if(b>=1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b<=1
	 */
	public int TestMethod5b (int b) throws IllegalArgumentException{
		if(b<=1) throw new IllegalArgumentException();		
		return b;
	}
	
	/*
	 * L: 1+
	 * S: N 
	 */
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable<1
	 */
	public int TestMethod6 (int myvariable) throws IllegalArgumentException{
		if(myvariable<1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable>1
	 */
	public int TestMethod7 (int myvariable) throws IllegalArgumentException{
		if(myvariable>1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable==1
	 */
	public int TestMethod8 (int myvariable) throws IllegalArgumentException{
		if(myvariable==1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable!=1
	 */
	public int TestMethod9 (int myvariable) throws IllegalArgumentException{
		if(myvariable!=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable>=1
	 */
	public int TestMethod10 (int myvariable) throws IllegalArgumentException{
		if(myvariable>=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable<=1
	 */
	public int TestMethod11 (int myvariable) throws IllegalArgumentException{
		if(myvariable<=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/*
	 * L: 1
	 * S: Y
	 */
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b < 1
	 */
	public int TestMethod12 (int b) throws IllegalArgumentException{
		if(b<1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b > 1
	 */
	public int TestMethod13 (int b) throws IllegalArgumentException{
		if(b>1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b == 1
	 */
	public int TestMethod14 (int b) throws IllegalArgumentException{
		if(b==1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b != 1
	 */
	public int TestMethod15 (int b) throws IllegalArgumentException{
		if(b!=1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b >= 1
	 */
	public int TestMethod16 (int b) throws IllegalArgumentException{
		if(b>=1) throw new IllegalArgumentException();		
		return b;
	}
	
	/**
	 * 
	 * @param b
	 * @throws IllegalArgumentException if b <= 1
	 */
	public int TestMethod17 (int b) throws IllegalArgumentException{
		if(b<=1) throw new IllegalArgumentException();		
		return b;
	}
	
	
	/*
	 * L: 1+
	 * S: Y
	 */
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable < 1
	 */
	public int TestMethod18 (int myvariable) throws IllegalArgumentException{
		if(myvariable<1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable > 1
	 */
	public int TestMethod19 (int myvariable) throws IllegalArgumentException{
		if(myvariable>1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable == 1
	 */
	public int TestMethod20 (int myvariable) throws IllegalArgumentException{
		if(myvariable==1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable != 1
	 */
	public int TestMethod21 (int myvariable) throws IllegalArgumentException{
		if(myvariable!=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable >= 1
	 */
	public int TestMethod22 (int myvariable) throws IllegalArgumentException{
		if(myvariable>=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	/**
	 * 
	 * @param myvariable
	 * @throws IllegalArgumentException if myvariable <= 1
	 */
	public int TestMethod23(int myvariable) throws IllegalArgumentException{
		if(myvariable<=1) throw new IllegalArgumentException();		
		return myvariable;
	}
	
	
	
	
	
	
	
	
	
	
	
}
