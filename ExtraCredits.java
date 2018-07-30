/*use interface and class for application*/

import java.util.Scanner;
interface NSSmarks{
int NSSmarks=10;
}

class Marks{

	double sub1;
	double sub2;
	double totalMarks;
	Marks(double s1, double s2){sub1=s1;sub2=s2;totalMarks=s1+s2;}
	void getResult(){
		System.out.println("***Marksheet***\n\tSub1:"+sub1+"\n\tSub2:"+sub2+"\n\tTotal Marks:"+totalMarks);
	}

}

class ExtraCredits extends Marks implements NSSmarks{
	ExtraCredits(double s, double s1){super(s, s1);}
	double getExtraCredits(){
	return super.totalMarks+NSSmarks;
	}
	public static void main(String args[]){
	ExtraCredits EC=new ExtraCredits(76,65);
	EC.getResult();
	System.out.println("\tTotal(with Credits):"+EC.getExtraCredits());
	}


}
