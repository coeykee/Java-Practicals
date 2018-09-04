import javax.swing.*;
import java.awt.event.*;
class factorial extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	public factorial(){
		setTitle("Factorial Generator");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Number: ");
		l1.setBounds(10,10,100, 30);
		t1=new JTextField();
		t1.setBounds(10,120,400, 30);


		l2=new JLabel("Factorial: ");
		l2.setBounds(10,180,100, 30);
		t2=new JTextField();
		t2.setBounds(10,300,400, 30);

		b1=new JButton("Get factorial");
		b1.setBounds(10,320,100,50);	
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);
		b1.addActionListener(this);
    	setVisible(true);//making the frame visible  
	}

	public void actionPerformed(ActionEvent e){
		if( e.getSource() == b1){
				int num=Integer.parseInt(t1.getText());
				int fact=1;
				for(int i=1;i<=num;i++)
					fact*=i;
				t2.setText(String.valueOf(fact));
				setVisible(true);
		}
	}

	public static void main(String a[]){
		factorial ff=new factorial();
	}
}
