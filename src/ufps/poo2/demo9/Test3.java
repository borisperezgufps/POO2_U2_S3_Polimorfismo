package ufps.poo2.demo9;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("***Test Demonstration.Demonstration-9. Downcasting involves risk.***\n");
		
		// Upcasting
		Vehicle obVehicle = new Train();// ok 
		
		obVehicle.showMe();//Output: Inside Vehicle.showMe()
		
//		obVehicle.specificMethod(); //error
		
		// Creating two subtype(one Bus and one Train) object
		Bus obBus = new Bus();
		Train obTrain = new Train();
		
		// Downcasting example:Casting to a subtype 
//		obBus = (Bus) obVehicle; //Run-time error:Train cannot be cast to Bus
		
		obTrain = (Train) obVehicle;// Ok, this time it is ok.
		obTrain.specificMethod();// also ok
		
		// Vuelva al PowerPoint
	}

}
