import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Management extends JFrame implements ActionListener{
	     JButton jb,jb1,jb2 ,jb3 ;
		 JLabel header,body ;
		 Font f ;
		 Management(String s){
			  super(s);
			 header = new JLabel(new ImageIcon("MK.jpg"));
			 body = new JLabel(new ImageIcon("man_body.jpg"));
			f = new Font("Courier New Lucida Console",Font.BOLD,18);
			  setLayout(null);
			  jb = new JButton("Student");
			  jb.setFont(f);
			  jb1 = new JButton("Company");
			  jb1.setFont(f);
			  jb2 = new JButton("Search");
			  jb2.setFont(f);
			  jb3 = new JButton("Logout");
			  jb3.setFont(f);
			  
			   
			  header.setBounds(0,0,950,200);
			  body.setBounds(0,200,950,800);
			  
			  jb.setBounds(50,350,150,30);
			  jb1.setBounds(210,350,150,30);
			  jb2.setBounds(370,350,150,30);
			  jb3.setBounds(540,350,150,30);

			  add(jb);
			  add(jb1);
			  add(jb2);
			  add(jb3);
			  add(header);
			  add(body);
			  jb.addActionListener(this);
			  jb1.addActionListener(this);			  
			  jb2.addActionListener(this);
			  jb3.addActionListener(this);
		 }
		 public void actionPerformed(ActionEvent e){
			 if(e.getSource()==jb){
				 PkBiru d = new PkBiru("Student Record");
				 d.setSize(950,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			 }
			 else if(e.getSource()==jb3){
				 Login d = new Login("Login ");
				 d.setSize(1000,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			 }
			 else if(e.getSource()==jb2){
				 Search d = new Search("Search Details");
				 d.setSize(950,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			 }
			 else if(e.getSource()==jb1){
				 ECB d = new ECB("Company Details");
				 d.setSize(950,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			 }
		 }
		  
		 
 
}
