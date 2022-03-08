package ufps.poo2.demo6;

public class ChildClass extends ParentClass {
	
	// Overriding method
	public void showMe() {
		System.out.println("Inside ChildClass.showMe().");
	}
	
	/*
	 * Importante: Si reduce la visibilidad del método sobreescrito, el compilador
	 * le arrojará un error. La visibilidad siempre debe aumentarse en los hijos.
	 */

}
