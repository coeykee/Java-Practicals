import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame extends JFrame implements ActionListener{
    
    private JButton jb1,jb2,jb3;
    
    Frame()
    {
        setTitle("getSource");
        setLayout(new FlowLayout());
        setButtons();
        setAction();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setButtons()
    {
        jb1 = new JButton("JButton01");
        jb2 = new JButton("JButton02");
        jb3 = new JButton("JButton03");
        add(jb1);
        add(jb2);
        add(jb3);
    }
    
    private void setAction()
    {
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource() == jb1)
            JOptionPane.showMessageDialog(rootPane, "JButton01 Pressed");
        else if(eve.getSource() == jb2)
            JOptionPane.showMessageDialog(rootPane, "JButton02 Pressed");
        else if(eve.getSource() == jb3)
            JOptionPane.showMessageDialog(rootPane, "JButton03 Pressed");
    } 
}

public class GetSrcEx {
   
    public static void main(String[] args) {
        
        Frame frame = new Frame();
    }
}