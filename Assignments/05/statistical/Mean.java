package statistical;
import java.util.Scanner;
public class Mean{
public double getMean(int [] a){
		double mn=0;
		for(int i=0;i<a.length;i++)
			mn+=a[i];
		return (mn/a.length);
	}
}
