/*4. Create Separate Engine, Tyre, and Door Class. Create a Car class using these classes.
And show functionality of each component in the car.*/

import java.util.*;

interface pointo{}

class Engine implements pointo {
	double hoursPower;
	double torque;
	int stroke;
	String type;

	Engine(double hp, double tq, int st, String s){
	hoursPower=hp;
	torque=tq;
	stroke=st;
	type=s;
	}

	public void getEngineDetails(){
	System.out.println("\nEngine Details:\n\tType:"+type+"\n\tStrokes:"+stroke+"\n\tHP:"+hoursPower+"\n\tTorque:"+torque);
	}

}

class Tyre implements pointo {
	int numTyre;
	double tyrePressure;
	Tyre(int t, int p){
	numTyre=t;
	tyrePressure=p;
	}
	void display(){
	System.out.println("\nNumber of tyres="+numTyre);
	System.out.println("Tyre Pressure="+tyrePressure);
	}

}

class Door implements pointo {
	int numDoors;
	String opens;
	
	Door(int n, String o){
	numDoors=n;
	opens=o;
	}

	void getDoorsInfo(){
	System.out.println("\nNumber of Doors:"+numDoors);
	System.out.println("Doors open:"+opens);

	}
	}
class Car{
public static void main(String n[]){
/*	Engine en=new Engine(40,40,4,"Diesel");
	Tyre t=new Tyre(4,12);
	Door d=new Door(4,"Verticlly");
System.out.println("***************** Car Information **********************");
	en.getEngineDetails();
	t.display();
	d.getDoorsInfo();*/
	
	pointo get;
	get=new Engine(50,50,4,"petrol");
	((Engine)get).getEngineDetails();
	get=new Tyre(4,45);
	((Tyre)get).display();
	get=new Door(4,"vertically");
	((Door)get).getDoorsInfo();
		

}


	}
