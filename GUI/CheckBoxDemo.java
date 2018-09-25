import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CheckBoxDemo extends JFrame implements ItemListener{
    
    private JButton jb1;
    private JCheckBox jcb1,jcb2,jcb3;
    private JTextField jtf1;
    CheckBoxDemo()
    {
        setTitle("CheckBoxDemo");
        setLayout(new FlowLayout());
       // setButtons();
        setCheckBoxes();
        setTextFields();
        //setAction();
        setItemListeners();
        setSize(700, 600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    
    private void setCheckBoxes(){
        jcb1=new JCheckBox("C");
        add(jcb1);

        jcb2=new JCheckBox("C++");
        add(jcb2);

        jcb3=new JCheckBox("Java");
        add(jcb3);

    }

    private void setTextFields(){
        jtf1=new JTextField(50);
        add(jtf1);

    }

    private void setButtons()
    {
        jb1 = new JButton("New Here");
        add(jb1);
    }

    private void setItemListeners(){
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
    }
    
   /* private void setAction()
    {
        jb1.addActionListener(this);
    }*/
    
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource() == jb1)
            JOptionPane.showMessageDialog(rootPane, "Hello User, Welcome!");
    }

    public void itemStateChanged(ItemEvent e){
        JCheckBox cb=(JCheckBox)e.getItem();
        String s=jtf1.getText()+cb.getText();
        jtf1.setText(s);
    }
    

    public static void main(String[] args) {
        
        CheckBoxDemo frame = new CheckBoxDemo();
    }
}


