/*change background color on clicking a button*/

import javax.swing.*;
import java.awt.event.*;

class ChangeBG extends JFrame{
	JButton jb1,jb2,jb3;
	JPanel jp;

	public ChangeBG(){
		setTitle("ChangeBG");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb1=new JButton("Yellow");
		jb2=new JButton("Red");
		jb3=new JButton("Green");
		jp=new JPanel();
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		add(jp);

		coloraction ya=new coloraction(color.YELLOW);
		coloraction ra=new coloraction(color.RED);
		coloraction ga=new coloraction(color.GREEN);

		jb1.addActionListener();
		jb2.addActionListener();
		jb3.addActionListener();


	}

	public static void main(String args[]){
		ChangeBG cc=new ChangeBG();
	}

}
class coloraction implements ActionListener{

	Color background;
	public coloraction(Color c){
		background=c;
	}

	public void actionPerformed(ActionEvent e){
		jp.setBackground(background);
	}

}




