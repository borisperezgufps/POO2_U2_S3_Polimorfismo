package ufps.poo2.demo8;

public class Demonstration8 {

	public static void main(String[] args) {
		System.out.println("***Demonstration 8.Experimenting runtime polymorphism.***\n");
		
		// Parent class reference is pointing to a child object
		Vehicle obVehicle = new Bus();// ok
		
		// Bus obBus = new Vehicle(); //Compilation Error
		
		obVehicle.showMe(); // Inside Bus.showMe()
		
//		obVehicle.busSpecificMethod(); //Error
		
		((Bus) obVehicle).busSpecificMethod(); // Ok... but, what is that thing? Go back to the slide
	}

}
