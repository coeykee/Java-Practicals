
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class page extends JFrame implements ActionListener{
   JTextField tf1, tf2;
   JButton b1,b2;
   JLabel l1, l2;
   JMenuBar mb;
   JMenu file, edit;
   JMenuItem save, open, cut, copy, paste, selectAll;
   JTextArea ta; 
   FileWriter fr=null;
   FileReader read=null;
   BufferedReader br=null;

   public page(){
   	setTitle("Contact Maneger");
   	setSize(700,600);
      setLayout(new FlowLayout());
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	setComponents();
   	//setActions();
   	setVisible(true);

   }

   		void setComponents(){
            mb=new JMenuBar();
            mb.setBounds(0,0,20,700);
            add(mb);

            file=new JMenu("File");
            mb.add(file);

            edit=new JMenu("Edit");
            mb.add(edit);
		
	    save=new JMenuItem("save");
            file.add(save);
	    open=new JMenuItem("open");
	    file.add(open);

            cut=new JMenuItem("cut");
            edit.add(cut);

            copy=new JMenuItem("copy");
            edit.add(copy);

            paste=new JMenuItem("paste");
            //paste.setAccelerator(keystroke.getkeystroke("ctrl v"));
            edit.add(paste);

            selectAll=new JMenuItem("select all");
            //selectAll.setAccelerator(keystroke.getkeystroke("ctrl a"));
            edit.add(selectAll);

   	    /*b1=new JButton("Save");
   	    add(b1);
            b2=new JButton("View");
            add(b2);*/
   	    save.addActionListener(this);
            open.addActionListener(this);

            ta=new JTextArea(30,50);
	    ta.setBounds(20, 30, 680, 590);
            add(ta);

   		}

 
   		public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
   				String name=ta.getText();
   				try{
   				  try{
   					 fr=new FileWriter("document.txt",true);
   				  }
   				  catch(FileNotFoundException ev){
   					 System.out.println(ev);
   				  }

   				  fr.write(""+name+"\n");
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
                     read=new FileReader("document.txt");
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

public class menuBar{

   public static void main(String args[]){
            page vv=new page();
   }

}
