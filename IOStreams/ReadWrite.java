/*Read words from 1 file and write it into another*/
import java.io.*;
import java.util.*;
class ReadWrite {
	public static void main(String args[])throws IOException{
		FileWriter fw=null;
		FileReader fr=null;
		BufferedReader br=null;
		try{
			fr=new FileReader(args[0]);
			fw=new FileWriter(args[1]);
			br=new BufferedReader(fr);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}
		String str="";
		do{
			str=br.readLine();
			fw.write(str);
		}while(str!=null);
		fw.close();
		fr.close();
	}
}