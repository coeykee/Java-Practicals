package statistical;
import java.util.Scanner;
public class Average{
	public double getAverage(int [] a){
		double avrg=0;
		for(int i=0;i<a.length;i++)
			avrg+=a[i];
		return (avrg/a.length);
	}
}
