package com.cjc.karve;

public class C extends A
{
	public void cc()
	{
		A a=new A();
		a.m1();
		a.m2();
		//a.m3();  private method can access within a package
		a.m4();
		
		C c=new C();
		a.m1();
		a.m2();
		//a.m3();
		a.m4();
	}
	
		
	

}
