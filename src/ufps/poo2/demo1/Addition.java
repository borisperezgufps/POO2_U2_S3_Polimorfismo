package ufps.poo2.demo1;

public class Addition {

	public int sum(int x, int y) {
		return x + y;
	}
	
	public String sum(double x, int y) {
		return "";
	}

	// =========================================
	// =========================================
	
	public double sum(double x, double y) {
		return x + y;
	}

	public String sum(String s1, String s2) {
		return s1.concat(s2);
	}
	
	public boolean realizarOperacion(int a1, int a2, int a3, int a4) {
		profundizarOperacion(a1, a2, a3, a4);
		
		// ...
		return true;
	}
	
	public boolean realizarOperacion(int a1) {
		
		profundizarOperacion(a1, 0, 0, 0);
		
		// ...
		return true;
	}
	
	private boolean profundizarOperacion(int a1, int a2, int a3, int a4) {
		
		return true;
	}
	

}

