import javax.swing.*;
import java.awt.event.*;
class factorial extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	JFrame f;
	public factorial(){
	f=new JFrame();
		setTitle("Factorial Generator");
		setSize(400,420);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Number: ");
		l1.setBounds(10,10,100, 30);

		l2=new JLabel("Factorial: ");
		l2.setBounds(10,35,100, 30);

		t1=new JTextField();
		t1.setBounds(120,10,40, 30);

		t2=new JTextField();
		t2.setBounds(120,25,40, 30);

		b1=new JButton("Get factorial");
		b1.setBounds(130,100,100, 40);	
		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(b1);
	          
    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
	}

	public void actionPerformed(ActionEvent e){
	//if(e.getSource==b1){
		int num=Integer.parseInt(t1.getText());
		int fact=1;
		for(int i=num;i>0;i--){
			fact*=i;
		}
		t2.setText(String.valueOf(12445));

	}

	public static void main(String a[]){
		factorial ff=new factorial();
		//ff.actionPerformed();
	}
}
