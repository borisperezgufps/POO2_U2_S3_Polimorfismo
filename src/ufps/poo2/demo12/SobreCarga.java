package ufps.poo2.demo12;

public class SobreCarga {

	public void myMethod(int... a) {
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
	
	public void myMethod(int a, int b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	
	
}
