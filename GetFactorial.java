//This program gets you factorail of given number


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Frame extends Jframe implements ActionListener{


	public JButton jb1;
	public JTextField tf1;
	public  JLabel lb1;
	public Frame(){
		setTitle("Factorial Machine");
		setLayout(new FlowLayout());
		setLabels();
		setTextFields();
		setButtons();
		setActions();
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void setLabels(){
		lb1=new JLabel("Enter a integer:");
		lb1.add();
	}

	void  setTextFields(){
		tf1=new JTextField();
		tf1.add();
	}
	void setButtons(){
		jb1=new JButton("Get Factorial");
		jb1.add();

	}

	void setActions(){
		jb1.addActionListener(this);
	}
  
  	public void actionPerformed(ActionEvent ev){
  		if(ev.getSource()==jb1){
  			int fact=1,num=Integer.parseInt(tf1.getText());
  			for(int i=1;i<=num;i++){
  				fact*=i;
  			}
  			 JOptionPane.showMessageDialog(rootPane, "Hello User, Welcome!");
    	}
  	}


}

public class GetFactorial{
	public static void main(String[] args) {
		        Frame frame = new Frame();

	}
}
