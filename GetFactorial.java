//This program gets you factorail of given number


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Frame extends Jframe implements ActionListener{


	 JButton jb1;
	 JTextField tf1;
	 JLabel lb1;
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
		add(lb1);
	}

	void  setTextFields(){
		tf1=new JTextField();
		add(tf1);
	}
	void setButtons(){
		jb1=new JButton("Get Factorial");
		add(jb1);

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