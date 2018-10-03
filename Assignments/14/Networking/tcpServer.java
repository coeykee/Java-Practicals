//Server Side
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class tcpServer {
	public static void main(String args[]){
		String rc, rw;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		InputStream is=null;
		OutputStream os=null;
		Scanner sc=new Scanner(System.in);

		try{
			ServerSocket s=new ServerSocket(1500);
			Socket so=s.accept();
			is=so.getInputStream();
			os=so.getOutputStream();
			dis=new DataInputStream(is);
			dos=new DataOutputStream(os);

			do{
				System.out.print("\nData Recorded:");
				rc=dis.readUTF();
				System.out.print(rc);
				System.out.print("\nData to send:");
				rw=sc.nextLine();
				dos.writeUTF(rw);
			}while(!rc.equals("stop"));
		}
		catch(Exception e){
				System.out.print(e);

		}


	}
}