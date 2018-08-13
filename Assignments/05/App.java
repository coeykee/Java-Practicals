import statistical.*;
import statistical.convert.*;
import java.util.Scanner;
class App{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter choice(after #1):\n\t1.Statistical calculations \n\t2.Convertions(Numbers) \n\t3.Exit\n#1: ");
		int choice=sc.nextInt();
		while(choice!=3){
			switch(choice){
				case 1:{
					System.out.println("Enter data size");
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
					
					break;}

				case 2:{//converter
					System.out.print("Enter Conversion(after #2): \n\t1.Decimal to other system\n\t2. Binary to other \n\t3.Octal to \n\t4.Hexadecimal to \n\t5.Exit\n#2: ");
					int convChoice=sc.nextInt();
					while(convChoice!=5){
							if(convChoice==1){//dec2
							statistical.convert.dec2 D=new dec2();
							System.out.println("Enter a Decimal number:");
							int number=sc.nextInt();
							System.out.println("\tBinary== "+D.Binary(number));
							System.out.println("\tOctal== "+D.Octal(number));
							System.out.println("\tHexadecimal== "+D.Hexadecimal(number));
							}

						/*	case 2:{//bin2
							bin2 B=new bin2();
							System.out.println("Enter a Binary number:");
							String [] number=new String[8];
							for(int i=0;i<8;i++){number[i]=sc.next();}
							System.out.println("Decimal== "+B.Decimal(number));
							System.out.println("Octal== "+B.Octal(number));
							System.out.println("");
				
							break;}
		
							case 3:{//oct2
							oct2 O=new oct2();
							System.out.println("Enter a Octal number:");
							int number=sc.nextInt();
							System.out.println("");
							System.out.println("");
							System.out.println("");
							break;}

							case 4:{//hex2
							hex2  H=new hex2();
							System.out.println("Enter a Hexadecimal number:");
							int number=sc.nextInt();
							System.out.println("");
							System.out.println("");
							System.out.println("");
							break;}*/
					System.out.print("#2:");convChoice=sc.nextInt();
					}//innerwhile
				}

			default:{System.out.println("Invalid Choice");break;}
			}//switchend
		System.out.println("#1:");choice=sc.nextInt();}//whileend

	}//Main End



}//App End
