/*program to copy .txt file*/
import java.io.*;
class CopyTxt{
	public static void main(String args[])throws IOException{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try{
			fin=new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}
		try{
			fout=new FileOutputStream(args[1]);
		}
		catch(FileNotFoundException e1){
			System.out.println("File Not Found!");
		}
		while(fin.read()!=-1){
			int ch=fin.read();
			fout.write(ch);
		}
		fin.close();
		fout.close();
	}

}