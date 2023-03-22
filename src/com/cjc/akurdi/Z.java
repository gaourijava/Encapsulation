package com.cjc.akurdi;

import com.cjc.karve.A;

public class Z extends X
{
	public void zz()
	{
		Z z=new Z();
		z.m1();
		//z.m2();  default method cannot access 
		//z.m3();  private method cannot access
		z.m4();
	
		X x=new X();
		x.m1();
		//x.m2();
		//x.m3();
		//.m4();
		A a=new A();
		a.m1();
		//a.m2();
		//a.m3();
		//a.m4();
	}
	
	public static void main(String args[])
	{
		Z z=new Z();
		z.aa();
		
		}
}
		
		
	
			
	
		
		
	
	
	
	
		
	


