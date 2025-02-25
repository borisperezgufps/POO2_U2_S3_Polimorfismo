package ufps.poo2.demo10;

import java.util.Random;

public class Demonstration10 {

	public static void main(String[] args) {
		System.out.println("***Demonstration 10.A case study with runtime polymorphism ***\n");
		
		Vehicle10 obVehicle;
		int count = 0;
		
		Random random = new Random();
		
		// Considering 5 choices
		while (count < 5) {
			
			int tick = random.nextInt(10);// 0 to 9
			
			if (tick % 2 == 0) {
				obVehicle = new Bus10();
			} else {
				obVehicle = new Taxi10();
			}
			
			obVehicle.showMe();// Output will be determined at runtime count++;
			count++;
		}
		
		/*
		 * 	Inside Taxi.showMe()
			Inside Bus.showMe()
			Inside Bus.showMe()
			Inside Bus.showMe()
			Inside Taxi.showMe()
		 */
		
		
		
	}
	
	

}
