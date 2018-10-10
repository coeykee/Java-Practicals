import java.util.Scanner;
import java.sql.*;

public class database{
	public static void main (String args[]){
		int option;
		String name;
		int rollno,marks;
		Statement st=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/cse", "root", "user");

			st=con.createStatement();
		

		Scanner sc=new Scanner (System.in);
		while(true){
			System.out.println("\n 1.Create Table \n 2.Insert \n 3.Display \n 4.Update \n 5.Delete \n 6.Exit ");
			System.out.println("Enter the option:");
			option=sc.nextInt();
			switch(option){
				case 1:{
					st.execute("create table student (rollno int, name varchar(10), marks int);");
					break;
				}
				case 2:
					System.out.print("Enter name:");
					name=sc.next();
					System.out.print("Enter roll no:");
					rollno=sc.nextInt();
					System.out.print("Enter marks");
					marks=sc.nextInt();

					st.execute("insert into student(rollno, name, marks) values ("+rollno+", \""+name+"\", "+marks+");");
					System.out.println("Record inserted!");			

					break;

				case 3:
					ResultSet rs=st.executeQuery("select * from student;");
					while (rs.next()){
						rollno=rs.getInt(1);
						name=rs.getString(2);
						marks=rs.getInt(3);
						System.out.println(rollno+"\t"+name+"\t"+marks+"");
					}
					break;

				case 4:
					System.out.println("To update enter rollno of record: ");
					rollno=sc.nextInt();
					System.out.println("Enter new marks: ");
					marks=sc.nextInt();
					st.executeUpdate("update student set marks="+marks+" where rollno="+rollno+"");
					System.out.println("Record updated!");
					break;

				case 5:
					System.out.println("To delete enter rollno of record: ");			
					rollno=sc.nextInt();
					st.execute("delete from student where rollno="+rollno+"");
					System.out.println("Record deleted!");			
					break;

				case 6:
					System.exit(0);

				default:
					System.out.println("Invalid Option");
			}

		}
		}//try
		catch(Exception e){System.out.println(e);}

	}
}
