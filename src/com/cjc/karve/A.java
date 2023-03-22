package com.cjc.karve;

public class A 
{
	public void m1()
	{
		System.out.println("public   m1   A");
	}
	void m2()
	{
		System.out.println("default   m2   A");
	}
	private void m3()
	{
		System.out.println("private   m3   A");
	}
	protected void m4()
	{
		System.out.println("protected  m4   A");
	}
	public void aa()
	{
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}

	
	
	
	

	
		
	
		
		
		
		
		
			
		
	


