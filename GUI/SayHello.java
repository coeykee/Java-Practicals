import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame extends JFrame implements ActionListener{
    
    private JButton jb1;
    
    Frame()
    {
        setTitle("SayHello");
        setLayout(new FlowLayout());
        setButtons();
        setAction();
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setButtons()
    {
        jb1 = new JButton("New Here");
        add(jb1);
    }
    
    private void setAction()
    {
        jb1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource() == jb1)
            JOptionPane.showMessageDialog(rootPane, "Hello User, Welcome!");
    }
}

public class SayHello {
   
    public static void main(String[] args) {
        
        Frame frame = new Frame();
    }
}