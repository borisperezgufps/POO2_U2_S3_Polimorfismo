package ufps.poo2.demo6;

public class Demostration6 {

	
	/*
	 * - Tiene dos clases: ParentClass y ChildClass. Como el nombre sugiere, 
	 * ChildClass es una clase derivada que se deriva de su padre, ParentClass.
	 * - Un método llamado showMe() con la misma firma y tipo de retorno está definido 
	 * tanto en la ParentClass como en la ChildClass. Simplemente significa que la ChildClass 
	 * quiere redefinir el método showMe() que ya está presente en la ParentClass, 
	 * pero está bien con el otro método, doNotChangeMe().
	 * - En el método main(), se crea un objeto de la clase hija childOb. Cuando se invoca 
	 * el método doNotChangeMe() a través de este objeto, se llama al método que está definido 
	 * en la ParentClass (siguiendo la propiedad de herencia). 
	 * - Cuando se invoca el método showMe() a través de este objeto, se llama a la versión de showMe() 
	 * definida en la ChildClass; es decir, se sobrescribe la versión del método padre. 
	 * De ahí que el escenario se conozca como overriding de métodos.
	 * - El método showMe() en la ParentClass se llama método overridden, y el showMe() 
	 * en la ChildClass se llama método overriding.
	 */
	
	public static void main(String[] args) {
		System.out.println("*** Method overriding demonstration.***"); 
		
		ParentClass childOb = new ChildClass(); 
		childOb.doNotChangeMe();
		childOb.showMe();//Will display the overridden method
		
		/*
		 * 	Inside ParentClass.doNotChangeMe().
			Inside ChildClass.showMe().
		 */
	}
}
