//Client Side
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class tcpClient {
	public static void main(String args[]){
		String rc, rw;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		InputStream is=null;
		OutputStream os=null;
		Scanner sc=new Scanner(System.in);

		try{
			Socket s=new Socket("127.0.0.1",1500);
			//Socket so=s.receive();
			is=s.getInputStream();
			os=s.getOutputStream();
			dis=new DataInputStream(is);
			dos=new DataOutputStream(os);

			do{
					System.out.print("\nData to send:");
					rw=sc.nextLine();
					if(rw=="stop")
						break;
					dos.writeUTF(rw);
					if(dis.readUTF()!=null){
						System.out.print("\nData Recorded:");
						rc=dis.readUTF();
						System.out.print(rc);
					}
			}while(!rw.equals("stop"));
		}
		catch(Exception e){
				System.out.print(e);

		}


	}
}