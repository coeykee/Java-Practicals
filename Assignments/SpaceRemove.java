/*10. Write a program to remove whitespaces from a text file. Name of the file is given using
command line.*/

import java.io.*;
import java.io.FileInputStream.*;
public class SpaceRemove{
	public static void main(String args[])throws IOException{
		FileReader fr=null;
		BufferedReader br=null,br1=null;
		FileWriter fw=null;

		try{
			fr=new FileReader(args[0]);
			br=new BufferedReader(fr);
		}
		catch(FileNotFoundException e){
			System.out.println("file not found!");
		}
		String str,str1;

		while((str1=br.readLine())!=null){
			System.out.println(str1);
		}

		br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Remove extra white spaces(y/n): ");
		char ch=(char)br1.read();
		if(ch=='\0'){
			fw=new FileWriter(args[0],true);
			while(!(br1.readLine()).equals('\0')){
				fw.write(getChannel(br1), "");

			}
			fw.close();
			fr.close();
		}
	}
}
