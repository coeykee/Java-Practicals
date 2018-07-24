
import java.util.Scanner;
abstract class figure{
	double dim1,dim2;
	figure(double d1, double d2){
		dim1=d1;
		dim2=d2;
	}
	abstract double compute();
}

class Rectangle extends figure{
	Rectangle(double d1, double d2){
		super(d1, d2);
	}
	double compute(){
		return dim1*dim2;
	}
}

class Triangle extends figure{
	Triangle(double d1,double d2){
		super(d1, d2);
	}
	double compute(){
		return (dim1*dim2)/2;	
	}
}

class AbstractExample{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rectangle Dimension");
		Rectangle r=new Rectangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("Rectangle Area="+r.compute());
		System.out.println("\nEnter Triangle Dimension");
		Triangle t=new Triangle(sc.nextDouble(), sc.nextDouble());
		System.out.println("Triangle Area="+t.compute());
	}


}
