/*9. Take Student information such as name, age, weight, height, city, phone from user and
store it in the file using DataOutputStream and FileOutputStream and Retrive data using
DataInputStream and FileInputStream and display the result.*/

import java.io.*;
import java.util.Scanner;

class StudentInfo{
	public static void main(String args[])throws IOException{
		FileOutputStream fout=null;
		DataOutputStream dout=null;

		System.out.println("***Enter Student Information***");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Roll No: ");
		int rollno=sc.nextInt();
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		System.out.print("Enter weight: ");
		int weight=sc.nextInt();
		System.out.print("Enter height: ");
		int height=sc.nextInt();

		try{
			fout=new FileOutputStream("StudentInfo.txt");
			dout=new DataOutputStream(fout);
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}

		dout.writeUTF(name);
		dout.writeInt(rollno);
		dout.writeInt(age);
		dout.writeInt(weight);
		dout.writeInt(height);
		fout.close();

		FileInputStream fin=null;
		DataInputStream din=null;

		try{
			fin=new FileInputStream("StudentInfo.txt");
			din=new DataInputStream(fin);
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}	
		System.out.println("\n\n***Student Information***");
	  	System.out.println("Name: "+din.readUTF());
	  	System.out.println("Roll No: "+din.readInt());
	  	System.out.println("Age: "+din.readInt());
	  	System.out.println("Weight: "+din.readInt());
	  	System.out.println("Height: "+din.readInt());
	  	fin.close();
	}

}
