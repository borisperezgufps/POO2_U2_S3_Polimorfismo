package ufps.poo2.demo1;

public class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Method overloading example***");
		
		Addition additionOb = new Addition();
		
		int sumOfIntergers = additionOb.sum(10, 20);		
		System.out.println("10 + 20 is :" + sumOfIntergers);
		
		double sumOfDoubles = additionOb.sum(10.5, 20.7);		
		System.out.println("10.5 + 20.7 is :" + sumOfDoubles);
		
		String sumOfStrings = additionOb.sum("Smith", "Turner");
		System.out.println("'Smith' + 'Turner' is :" + sumOfStrings);
		
		additionOb.sum(10, 20);
	}

	/*
	 * 	10 + 20 is :30
		10.5 + 20.7 is :31.2
		'Smith' + 'Turner' is :SmithTurner
	 */
	
	/*
	 * Cuando se hace este tipo de codificación, se llama sobrecarga de métodos. 
	 * En la sobrecarga de métodos, los nombres de los métodos son los mismos, 
	 * pero las firmas de los métodos son diferentes. 
	 * 
	 * En este contexto, la especificación del lenguaje Java (11) dice que 
	 * "una clase no puede tener múltiples métodos con la misma firma y 
	 * diferentes tipos de retorno primitivos".
	 * 
	 * Y ¿qué es la firma de un método?
	 * 
	 * En general, un nombre de método con el número, tipos y orden de los parámetros 
	 * constituye su firma. 
	 * La documentación de Oracle Java confirma lo mismo, diciendo que dos de los 
	 * componentes de una declaración de método 
	 * constituyen la firma del método: el nombre del método y los tipos de los 
	 * parámetros.
	 * 
	 * Así, el compilador de Java puede distinguir entre métodos con el mismo nombre pero diferentes listas de parámetros; 
	 * por ejemplo, para el compilador de Java, el método double add(int x, double y){} es diferente del método 
	 * double add(double x, int y) {} o double add(int x, int y, int z).

	 */
	
}
