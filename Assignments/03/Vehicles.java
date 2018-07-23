/*
3. Create Vehicle Interface with name, maxPassanger, and maxSpeed variables. Create
LandVehicle and SeaVehicle Inteface from Vehicle interface. LandVehicle has
numWheels variable and drive method. SeaVehicle has displacement variable and launch
method. Create Car class from LandVehicle, HoverCraft from LandVehicle and
SeaVehicle interface. Also create Ship from SeaVehicle. Provide additional methods in
HoverCraft as enterLand and enterSea. Similarly provide other methods for class Car and
Ship. Demonstrate all classes in a application.
*/

import java.util.*;
interface Vehicle {
	String name="Qudracycle";
	int maxPassanger=4;
	double maxSpeed=30;
	} 

interface LandVehicle extends Vehicle {
	int numWheels=4;
	void drive();
	}

interface SeaVehicle extends Vehicle {
	double displacement=30;
	void launch();
	}

class Car implements LandVehicle {
		
		public void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassanger+"\nmaxSpeed:"+maxSpeed+"\nNumWheels:"+numWheels);
		}

		public void drive() {
		System.out.println("\n****Driving !****");
		}
		
		public void getOnRoad() {
		System.out.println("Your on Highway now");
		}

	}

class HoverCraft implements LandVehicle, SeaVehicle{
	public void launch() {
		System.out.println("\nLaunching!");
		}

	void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassanger+"\nmaxSpeed:"+maxSpeed+"\nNumWheels:"+numWheels);
		}

	public void Drive() {
		System.out.println("Your hovering now!");
		}

	public void enterLand() {
		System.out.println("Your on Land now!");
		}

	public void enterSea(){
		System.out.println("Your on Water, look out for whales");
		}
	public void drive() {
		System.out.println("\n****Driving !****");
		}
		
	}

class Ship implements SeaVehicle {

	void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassanger+"\nmaxSpeed:"+maxSpeed+"\nDisplacement:"+displacement);
		}

	public void launch() {
		System.out.println("\nInitiating Sequence!");
		}
        
	void sailTheSea() {
		System.out.println("Sailing Sea!");
		}
	}

class Vehicles{
	public static void main(String a[]){
		Car c=new Car();
		c.getDetails();
		c.drive();
		c.getOnRoad();

		HoverCraft h=new HoverCraft();
		h.getDetails();
		h.launch();
		h.enterSea();
		h.Drive();

		h.enterLand();
		Ship s=new Ship();
		s.getDetails();
		s.launch();
		s.sailTheSea();
	}

}


