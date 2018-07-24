/*Example of abstract class*/
import java.util.Scanner;

abstract class A{
	abstract void display();
	void show(){
		System.out.println("Not an Abstract method ");
	}
}

class B extends A{
	void display(){
		System.out.println("Implementing an Abstract method ");
	}
}

class Abstract{
	public static void main (String a[]){
		B b1=new B();
		b1.display();
		b1.show();
	}
}
