package ufps.poo2.demo2;

public class ConstructorOverloadEx {

	// ===================================
	// ===================================
	
	public void myMethod(int... a) {
		System.out.println("Inside myMethod(int... a)");
	}
	
	public void myMethod(int a, int b) {
		System.out.println("Inside myMethod(int a, int b)");
	}
	
	public void myMethod(boolean... c) {
		System.out.println("Inside myMethod(boolean... c)");
	}
	
	// ===================================
	// ===================================
	
	public ConstructorOverloadEx(int a) {
		System.out.println("Constructor can accept one integer argument: " + a);
	}

	public ConstructorOverloadEx(int a, double b) {
		System.out.println("Constructor can accept one integer argument: " + a + 
				" and one double argument: " + b);
	}
	
	public ConstructorOverloadEx() {
		System.out.println("Constructor cannot accept any argument.");
	}
	
	public void ConstructorOverloadEx() {
		System.out.println("Esto es un método.");
	}
	
	
	
	
	

}






