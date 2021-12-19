import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	    JLabel jl1,jl2,jl3 ;
		JTextField jt1 ;
		JPasswordField jp ;
		JButton jb ;
		Font f ;
		
		Login(String s){
			 super(s);
			 setLayout(null);
			 jl1 = new JLabel("Email:");
			 jl2 = new JLabel("Password:");
			 jt1 = new JTextField(20);
			 jp  = new JPasswordField(20);
			 jb = new JButton("Login:");
			 jl3 = new JLabel(new ImageIcon("Em.jpg"));
			 f = new Font("Brush Script MT",Font.BOLD,35);
			 
			 jl1.setBounds(350,300,160,30);
 			 jt1.setBounds(510,300,240,30);
			 jl1.setFont(f);
			 jt1.setFont(f);
			 
			 jl2.setBounds(350,350,160,30);
 			 jp.setBounds(510,350,240,30);
			 jl2.setFont(f);
			 jp.setFont(f);
			 
			 jb.setBounds(490,400,150,30);
			 jb.setFont(f);
			 
			 jl3.setBounds(0,0,1000,1000);
			 add(jl1);
			 add(jt1);
			 add(jl2);
			 add(jl3);
			 add(jp);
			 add(jb);
 			 jb.addActionListener(this);
		}
		public void actionPerformed(ActionEvent et){
			 String email = jt1.getText();
			 String pass = jp.getText();
			 try{
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				  Statement st = cn.createStatement();
				  ResultSet rs = st.executeQuery("Select*from admin where email='"+email+"'");
				  if(rs.next()){
					     if(rs.getString(2).equals(pass)){
							  Management d = new Management("Management Record");
							  d.setSize(950,1000);
							  d.setVisible(true);
							  this.setVisible(false);
							 
							 
						 }
						 else{
							 
							  JOptionPane.showMessageDialog(null,"Invalid Password");
						 }
				  }
				  else{
					   JOptionPane.showMessageDialog(null,"Invalid Email-Id");
					  
				  }
				 
			 }
			catch(ClassNotFoundException e){
				 System.out.println("Driver:"+e.getMessage());
			}
			catch(SQLException e){
				 System.out.println("SQL:"+e.getMessage());
			}
			
		}
		public static void main(String[]arr){
			 Login l = new Login("Login");
			 l.setSize(1000,1000);
			 l.setVisible(true);
		}
}
