
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class frame extends JFrame implements ActionListener{
   JTextField tf1, tf2;
   JButton b1,b2;
   JLabel l1, l2;
   JMenuBar mb;
   JMenuItem cut, copy, paste, selectAll;
   JTextArea ta; 
   FileWriter fr=null;
   FileReader read=null;
   BufferedReader br=null;

   public frame(){
   	setTitle("Contact Maneger");
   	setSize(700,600);
   	setLayout(new FlowLayout());
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	setComponents();
   	//setActions();
   	setVisible(true);

   }

   		void setComponents(){
   			l1=new JLabel("Contact Name:");
   			tf1=new JTextField(20);
   			add(l1);
   			add(tf1);
			   l2=new JLabel("Contact Number:");
   			tf2=new JTextField(20);
   			add(l2);
   			add(tf2);

   			b1=new JButton("Save");
   			add(b1);
            b2=new JButton("View");
            add(b2);
   			b1.addActionListener(this);
            b2.addActionListener(this);

            ta=new JTextArea(30,50);
            add(ta);

   		}

 
   		public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
   				String name=tf1.getText();
   				String number=tf2.getText();
   				try{
   				  try{
   					 fr=new FileWriter("contacts.txt",true);
   				  }
   				  catch(FileNotFoundException ev){
   					 System.out.println(ev);
   				  }

   				  fr.write("Name:"+name+"\n");
   				  fr.write("Number:"+number+"\n\n");
   				  fr.close();
   				  JOptionPane.showMessageDialog(rootPane, "Saved");
   				}
   				catch(IOException even){
   				  System.out.println(even);
   				}
   			}

            if(e.getSource()==b2){
              try{
                  try{
                     read=new FileReader("contacts.txt");
                     br=new BufferedReader(read);
                   }
                  catch(FileNotFoundException b2ex){
                     System.out.println(b2ex);
                   }

                  String str1,str="";
                  while((str1=br.readLine())!=null){
                    str=(str+str1+"\n");
                  }
                  ta.setText(str);
               }
               catch(IOException b2ex2){
                  System.out.println(b2ex2);
               }
            }
         }

}

public class vcard{

   public static void main(String args[]){
            frame vv=new frame();
   }

}
