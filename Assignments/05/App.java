import statistical.*;
import java.util.Scanner;
class App{
	public static void main(String args[]){
		System.out.println("Enter data size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] data=new int[size];
		System.out.println("Enter numeric values only ("+size+"):");
		for(int i=0;i<size;i++){
			data[i]=sc.nextInt();
		}
		Average getAvg=new Average();
		double AVG=getAvg.getAverage(data);
		System.out.print("Average="+String.format("%.2f",AVG)+"\n");
		Mean mn=new Mean();
		System.out.print("Mean="+String.format("%.2f",mn.getMean(data))+"\n");
		Median md=new Median();
		System.out.println("Median="+md.getMedian(data));
		stdDeviation stdD=new stdDeviation();
		System.out.println("StdDeviation="+stdD.getStdDeviation(data));
	}



}
