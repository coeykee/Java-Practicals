package statistical;
import statistical.Mean;
import java.lang.*;
public class stdDeviation{
	public double getStdDeviation(int [] a){
		Mean mn=new Mean();
		double mean=mn.getMean(a);
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum=Math.pow(a[i]-mean,2);
		}
	return (Math.pow(sum/a.length,-1/2));
	}

}
