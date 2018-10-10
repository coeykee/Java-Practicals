import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class firstPage implements ActionListener{
	JFrame f;
	JLabel name, rollno, marks;
	JTextField tname, trollno, tmarks;
	JButton insert, display, update, delete;
	JTextArea tarea;

	public firstPage(){
		f=new JFrame();
		f.setTitle("Student Database");
		f.setSize(300,480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		setEles();
		setButtons();
		setTextArea();
		f.setVisible(true);

	}

	void setEles(){
		name=new JLabel("    Name:");
		f.add(name);
		tname=new JTextField(15);
		f.add(tname);

		rollno=new JLabel("    ROll No:");
		f.add(rollno);
		trollno=new JTextField(15);
		f.add(trollno);

		marks=new JLabel("    Marks:");
		f.add(marks);
		tmarks=new JTextField(15);
		f.add(tmarks);
	}

	void setButtons(){
		insert=new JButton("Insert");
		f.add(insert);
		insert.addActionListener(this);

		display=new JButton("Display");
		f.add(display);
		display.addActionListener(this);

		update=new JButton("Update");
		f.add(update);
		update.addActionListener(this);

		delete=new JButton("Delete");
		f.add(delete);
		delete.addActionListener(this);

	}

	void setTextArea(){

		tarea=new JTextArea(20,500);
		f.add(tarea);
	}

	public void actionPerformed(ActionEvent e){

      String rn, mks, nm;
      Statement st=null;

      nm=tname.getText();
      rn=trollno.getText();
      mks=tmarks.getText();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/cse", "root", "user");

			st=con.createStatement();

			if(e.getSource()==insert){

				st.execute("insert into student(rollno, name, marks) values ("+rn+", '"+nm+"', "+mks+");");
				JOptionPane.showMessageDialog(f,"Record inserted!");
			}

			if(e.getSource()==update){
				st.executeUpdate("update student set marks="+mks+" where rollno="+rn+"");
				JOptionPane.showMessageDialog(f, "Record updated!");

			}

			if(e.getSource()==display){
				ResultSet rs=st.executeQuery("select * from student;");
					while (rs.next()){
						rn=String.valueOf(rs.getInt(1));
						nm=rs.getString(2);
						mks=String.valueOf(rs.getInt(3));
						System.out.println(rn+"\t"+nm+"\t"+mks+"");
					}
			
			}

			if(e.getSource()==delete){
				st.execute("delete from student where rollno="+rn+"");
				JOptionPane.showMessageDialog(f, "Record deleted!");
			}

		}
		catch(Exception ev){System.out.println(ev);}


	}


}

class GUIdb {
	public static void main(String args[]){
 		firstPage fp=new firstPage();
	}
}