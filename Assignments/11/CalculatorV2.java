/*11. Develop a Swing GUI based standard calculator program.*/

import javax.swing.*;
import java.awt.event.*;
class WindowDef extends JFrame implements ActionListener{
	JLabel lNum1,lNum2,lResult;
	JTextField txf1,txf2,txfResult;
	JButton addB,negB,mulB,divB,modB;
	JFrame f;
	public WindowDef(){
		f=new JFrame();
 		f.setTitle("Machine that does calculations");
		f.setSize(400,420);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lNum1=new JLabel("Number: ");
		lNum1.setBounds(10,30,40,30);
		lNum2=new JLabel("Number: ");
		lNum1.setBounds(10,50,40,30);
		lResult=new JLabel("Result: ");
		txf1=new JTextField();
		txf1.setBounds(100,30,40, 30);

		txf2=new JTextField();
 		txf2.setBounds(100,50,40, 30);

		txfResult=new JTextField();
		txfResult.setBounds(130,100,100, 40);

		addB=new JButton("+");
		addB.setBounds(130,100,100, 40);

		negB=new JButton("-");
		negB.setBounds(130,100,100, 40);

		mulB=new JButton("*");
		mulB.setBounds(130,100,100, 40);

		divB=new JButton("/");
		divB.setBounds(130,100,100, 40);
		//JPanel JP=new JPanel();
		f.add(lNum1); f.add(txf1);

		f.add(lNum2); f.add(txf2);
		f.add(lResult); f.add(txfResult);
		addB.addActionListener(this);
		negB.addActionListener(this);
		mulB.addActionListener(this);
		divB.addActionListener(this);
	          
    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
	
	}

	public void actionPerformed(ActionEvent e){
	
	}

	public static void main(String args[]){
		WindowDef Calc=new WindowDef();
	}

}
