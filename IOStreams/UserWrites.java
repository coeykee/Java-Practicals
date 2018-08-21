/*mak euser enter data in file*/
import java.io.*;
public class UserWrites{
	public static void main(String args[]) throws IOException{
		FileReader fr=null;
		BufferedReader br=null;
		BufferedReader br1=null;
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
		System.out.println("Want to Write(y/n): ");
		char ch=(char)br1.read();
		if(ch=='y'){
			fr.close();
			fw=new FileWriter(args[0],true);
			System.out.println("Enter DATA ('exit' to stop): ");
			while(!(br1.readLine()).equals("exit")){
				fw.write(br1.readLine());
				fw.write("\r\n");
			}
			fw.close();
		}

	}
}
