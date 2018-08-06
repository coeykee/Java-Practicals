package statistical;
import java.util.Scanner;
public class Median{
	public double getMedian(int [] a){
		/*for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]>a[i]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	System.out.println("Sorted");}*/
	for(int i=0;i<a.length;i++){
	System.out.print(" "+a[i]);}
	int med=a.length/2;
		if(a.length%2==0){
			System.out.println("\nmea="+a[med]+"\nmed+1="+a[med+1]);
			return (a[med]+a[med+1])/2;
		}
		else{
			return a[med];
			}
	}
}
