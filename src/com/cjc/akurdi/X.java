package com.cjc.akurdi;

import com.cjc.karve.A;

public class X extends A
{
	public void xx()
	{
		A a=new A();
		a.m1();
		//a.m2();  default method can access within a package
		//a.m3();  private can access within a class
		X x=new X();          //child class object after extending
		x.m4();
	
	}


}
