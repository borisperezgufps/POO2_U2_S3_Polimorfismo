package ufps.poo2.demoX;

public class MainClass {
	public static void main(String[] args) {
		
		A a = new B();
		System.out.println("A");
		System.out.println(a.i);
		a.printI();		
		
		B b = (B)a;
		System.out.println("B");
		System.out.println(b.i);
		b.printI();
		
	}	
	/*
	 * 	A
		10
		B.i = 20
		B
		20
		B.i = 20
	 */
	
}







