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
	String name="";
	int maxPassanger=0;
	double maxSpeed=0.0;
	} 

interface LandVehicle extends Vehicle {
	int numWheels=0;
	void drive();

	}

interface SeaVehicle extends Vehicle {
	double displacement=0.0;
	void launch();
	}

class Car implements LandVehicle {
	String name;
	int maxPassanger;
	double maxSpeed;
	int numWheels;

		Car(String n, int p, double s, int w){
		name=n;
		maxPassanger=p;
		maxSpeed=s;
		numWheels=w;
		}
		
		void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassanger+"\nmaxSpeed:"+maxSpeed+"\nNumWheels:"+numWheels);
		}

		public void drive() {
		System.out.println("\n****Driving !****");
		}
		
		void getOnRoad() {
		System.out.println("Your on Highway now");
		}

	}

class HoverCraft{
	String name;
	int maxPassangers;
	double maxSpeed;
	int numWheels;
	double displacement;

		HoverCraft(String n, int p, double s, int w, double d){
		name=n;
		maxPassangers=p;
		maxSpeed=s;
		numWheels=w;
		displacement=d;
		}

	public void launch() {
		System.out.println("\nLaunching!");
		}

	void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassangers+"\nmaxSpeed:"+maxSpeed+"\nNumWheels:"+numWheels);
		}

	public void Drive() {
		System.out.println("Your hovering now!");
		}

	void enterLand() {
		System.out.println("Your on Land now!");
		}

	void enterSea() {
		System.out.println("Your on Water, look out for whales");
		}
	}

class Ship{
	String name;
	int maxPassangers;
	double maxSpeed;
	double displacement;

		Ship(String n, int p, double s, double d) {
		name=n;
		maxPassangers=p;
		maxSpeed=s;
		displacement=d;
		}

	void getDetails(){
			System.out.println("\n\nVehicle Details:");
			System.out.printf("Name:"+name+"\nmaxPassengers:"+maxPassangers+"\nmaxSpeed:"+maxSpeed+"\nDisplacement:"+displacement);
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
		Car c=new Car("Donald",4,45,45);
		c.getDetails();
		c.drive();
		c.getOnRoad();

		HoverCraft h=new HoverCraft("Quadracycle",2,60,4,45);
		h.getDetails();
		h.launch();
		h.enterSea();
		h.Drive();

		h.enterLand();
		Ship s=new Ship("Titan",250,100.0,100.1);
		s.getDetails();
		s.launch();
		s.sailTheSea();
	}

}


