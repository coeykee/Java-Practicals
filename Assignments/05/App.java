import statistical.*;
import java.util.Scanner;
import java.util.Arrays;
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
		System.out.println("Average="+AVG);
		Mean mn=new Mean();
		System.out.println("Mean="+mn.getMean(data));
		Median md=new Median();
Arrays.sort(data);
		System.out.println("Median="+md.getMedian(data));

	}



}
