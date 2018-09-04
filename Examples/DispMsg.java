/*Display message after clicking on button*/
import javax.swing.*;
import java.awt.event.*;

class DispMsg extends JFrame implements ActionListener{
	JTextField t;
	JButton b;

	public DispMsg(){
		setSize(400,400);
		setTitle("First Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t=new JTextField();
		t.setBounds(10,10,200,200);
		b=new JButton("Check What's New");
		b.setBounds(10,300,200,20);
		add(t);add(b);
		b.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b)
		t.setText("Nothings here, Sorry!");
	}

	public static void main(String args[]){
		DispMsg dm=new DispMsg();
	}
}