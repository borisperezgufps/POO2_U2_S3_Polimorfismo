package ufps.poo2.demo2;

public class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Constructor Overloading.***");
		
		ConstructorOverloadEx ob1 = new ConstructorOverloadEx();
		
		ob1.myMethod(true, true);
		ob1.myMethod(1);
		ob1.myMethod(1, 3);		
		ob1.myMethod(1,5,3,5,7,7,5);
		
		/*
		 	Inside myMethod(boolean... c)
			Inside myMethod(int... a)
			Inside myMethod(int a, int b)
			Inside myMethod(int... a)
		 */
		
		
//		ConstructorOverloadEx ob2 = new ConstructorOverloadEx(2);
//		ConstructorOverloadEx ob3 = new ConstructorOverloadEx(2, 3.7);
//		
//		ConstructorOverloadEx ob1 = new ConstructorOverloadEx();
//		ob1.ConstructorOverloadEx();
	}
	
	

}
