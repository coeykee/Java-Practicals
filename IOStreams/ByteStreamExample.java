import java.io.*;
import java.util.Scanner;
class ByteStreamExample{
	public static void main(String args[]) throws IOException{
		
		FileOutputStream fout=null;
		DataOutputStream dout=null;

		try{
			fout=new FileOutputStream("one.txt");
			dout=new DataOutputStream(fout);
		}
		catch(FileNotFoundException e){System.out.println(e);}

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll:");
		int rn=sc.nextInt();
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		dout.writeInt(rn);
		dout.writeUTF(name);
		fout.close(); 

		FileInputStream fin=null;
		DataInputStream din=null;
		try{
		fin=new FileInputStream("one.txt");
		din=new DataInputStream(fin);
		}
		catch(FileNotFoundException e1){System.out.println(e1);}
		rn=din.readInt();
		name=din.readUTF();
		System.out.println("Roll No:"+rn+"\nName:"+name);
	}


}
