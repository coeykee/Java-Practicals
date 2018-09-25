import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ClickCounter extends JFrame implements ActionListener{
    
    private JButton jb1;
    private JTextField tf1;
    private int count=0;
    ClickCounter()
    {
        setTitle("ClickCounter");
        setLayout(new FlowLayout());
        setButtons();
        setTextFields();
        setAction();
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setButtons()
    {
        jb1 = new JButton("ClickMe!");
        add(jb1);
    }
    
    private void setTextFields(){
        tf1=new JTextField(20);
        add(tf1);
    }

    private void setAction()
    {
        jb1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource() == jb1)
            count++;
            tf1.setText(""+count);
           // JOptionPane.showMessageDialog(rootPane, "Hello User, Welcome!");
    }

    public static void main(String[] args) {
        
       ClickCounter frame = new ClickCounter();
    }

}


   
    