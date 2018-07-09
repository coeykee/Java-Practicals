//math operations using class and objects
class math
	{
		double n1;
		double n2;
		double add(double A,double B)
		 {
			n1=A;n2=B;
			return n1+n2;}
		double mult(double multiplicant,double multiplier)
		 {
			n1=multiplicant;n2=multiplier;
			return n1*n2;}
		double sub(double A,double B)
		 {	
			n1=A;n2=B;
			return n1-n2;}
		double div(double A, double divisor)
		 {
			n1=A;n2=divisor;
			return n1/n2;}
	}//classends

class math_op
	{
	 public static void main(String a[])
		{
			math o1=new math();
			o1.n1=4;
			o1.n2=2;
			System.out.println("n1="+o1.n1+"\nn2="+o1.n2);
			System.out.println("Addition="+o1.add(o1.n1,o1.n2));
			System.out.println("Multiplication="+o1.mult(o1.n1,o1.n2));
			System.out.println("Subsraction="+o1.sub(o1.n1,o1.n2));
			System.out.println("Division="+o1.div(o1.n1,o1.n2));

		}//mainends
}//classends
