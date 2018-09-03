/*10. Write a program to remove whitespaces from a text file. Name of the file is given using
command line.*/

/*8.  Take file name as input to your program, If file is existing the open and display contents of the file. After displaying contents of file ask user – do you want to add the data at the end of file. If a user gives yes as response, then accept data from user and append it to file. If file in not existing then create a fresh new file and store user data into it. User should type exit on new line to stop the program. */

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
			System.out.println("Where's ur file!");
		}
		String str,str1;

		while((str1=br.readLine())!=null){
			System.out.println(str1);
		}

		br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Want to Remove all white spaces(y/n): ");
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