package statistical;
import java.util.Arrays;
public class Median{
	public double getMedian(int [] a){
	double median=0;
	Arrays.sort(a);
	/*System.out.println("Sorted("+a.length+"):");
	for(int i=0;i<a.length;i++){
	System.out.print(" "+a[i]);}*/
	int med=a.length/2;
		if(a.length%2==0){
			//System.out.println("\nmea="+a[med]+"\nmed-1="+a[med-1]);
			median=(a[med]+a[med-1])*0.5;
		}
		else{
			median=a[med];
		}
	return median;
	}
}
