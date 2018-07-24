/*Using super to access superclass methods*/

import java.util.Scanner;

class Computer{
	int cpu;
	int ram;
	Computer(int c, int r){
		cpu=c;
		ram=r;
	}
	
	void getDetails(){
		System.out.println("\n***Computer Details***\nCPU:"+cpu+"cores\nRAM:"+ram+"GB");
	}

}

class GamingComputer extends Computer{
	int gpu;
	GamingComputer(int c, int r, int g){
		super(c,r);
		gpu=g;
	}
	void getDetails(){
		super.getDetails();
		System.out.println("\n***Gaming Computer Details***\nCPU:"+cpu+"cores\nRAM:"+ram+"GB\nGPU:"+gpu+"GB");
	}

}

class usesuper{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CPU cores,RAM and GPU Details:"); 
		GamingComputer g=new GamingComputer(sc.nextInt(),sc.nextInt(),sc.nextInt());
		g.getDetails();
	}

}
