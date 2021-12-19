import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel ;

public class Search extends JFrame implements ActionListener{
	      JButton jb ,jb1,jb2;
		  JLabel header,body;
		  JComboBox jc ;
		  String p[] = {};
		  int agg_percentage=0 ;
		  int backlog =0 ;
		  Font f ;
		  DefaultTableModel dtm = null ;
		  JTable jt = null ;
		  JScrollPane js = null ;
		  Search(String s){
			  super(s);
			  header = new JLabel(new ImageIcon("search_panel.jpg"));
			  body = new JLabel(new ImageIcon("search_body.jpg"));
			  f = new Font("Courier New Lucida Console",Font.BOLD,18);
			  setLayout(null);
			    jb = new JButton("Search");
				jb.setFont(f);
			    jb1 = new JButton("Exit");
				jb1.setFont(f);
				jb2 = new JButton("Logout");
				jb2.setFont(f);

				 jc = new JComboBox(p);
				 jc.setFont(f);
				 
				 dtm = new DefaultTableModel();
				 jt = new JTable();
				 jt.setFont(f);
				 dtm.addColumn("Student-Id");
				 dtm.addColumn("Student-Name");
				 dtm.addColumn("Email-Id");
				 dtm.addColumn("Phone");
				 
				header.setBounds(0,0,950,220);
				body.setBounds(0,220,950,780);
			   jc.setBounds(100,300,150,30);
			   jb.setBounds(290,300,100,30);
			   jb2.setBounds(420,300,120,30);
			   jb1.setBounds(550,300,120,30);
			   
		   
		       jt.setModel(dtm);
			   js = new JScrollPane(jt);
			   js.setBounds(50,380,700,250);
               add(js);			   
		   add(jc);
		   add(jb);
		    add(jb1);
		   add(jb2);
            add(header);
			add(body);
		   jb.addActionListener(this);
		   jb1.addActionListener(this);
		   jb2.addActionListener(this);
		   try{
 				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from company");
					while(rs.next()){
						 jc.addItem(rs.getString("company_name"));
					}
			} 
		   catch(ClassNotFoundException e){
				System.out.println("Driver : "+ e.getMessage());
			}
			catch(SQLException e){
					System.out.println("SQL :  "+e.getMessage());
			}   
		  }
		  public void actionPerformed(ActionEvent et){
			  dtm.setRowCount(0);
			 if(et.getSource()==jb1){
			     Management d = new Management("Management Record");
				 d.setSize(950,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			  
		    }
		    else if(et.getSource()==jb2){
			 Login d = new Login("Login Record");
				 d.setSize(1000,1000);
				 d.setVisible(true);
				 this.setVisible(false);
			  
		    }
		   else{
			          String company = (String)jc.getSelectedItem();
					  int flag=0 ;
						try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
						Statement st=cn.createStatement();
						ResultSet rs=st.executeQuery("select * from company where company_name='"+company+"'");
							if(rs.next()){
							 agg_percentage = rs.getInt("percentage");
							 backlog = rs.getInt("back");
							
							}
								Statement st1=cn.createStatement();
								ResultSet rs1=st1.executeQuery("select * from student where  10th>="+agg_percentage+" AND 12th>="+agg_percentage+" AND btech_aggr>="+agg_percentage+" AND back<="+backlog );
									while(rs1.next()){
										flag=1 ;
										/*int id = rs1.getInt("student_id");
										String sname = rs1.getString("student_name");
										String fname = rs1.getString("father_name");
										String email = rs1.getString("email");
										String phone = rs1.getString("phone");
										String gender = rs1.getString("gender");
										String branch = rs1.getString("branch");										
										System.out.println("Student-Id:"+id);
										System.out.println("Student-Name:'"+sname+"'");
										System.out.println("Father's-Name:'"+fname+"'");
										System.out.println("Email-Id:'"+email+"'");
										System.out.println("Phone:'"+phone+"'");
										System.out.println("Gender:'"+gender+"'");
										System.out.println("Branch:'"+branch+"'");
										System.out.println();
										System.out.println();
										System.out.println();*/
										
										
										dtm.addRow(new Object[]{rs1.getString(1),rs1.getString(2),rs1.getString(4),rs1.getString(5)});
 
									}
									if(flag==0){
										
										JOptionPane.showMessageDialog(null,"Record Not Found");
										Search d = new Search("Search");
										  d.setSize(950,1000);
										  d.setVisible(true);
										  this.setVisible(false);
									}
				       cn.close();
 
				       } 
						catch(ClassNotFoundException e){
						System.out.println("Driver : "+ e.getMessage());
						}
						catch(SQLException e){
							System.out.println("SQL :  "+e.getMessage());
						}   
		         }
	   }
	    
		  
	  
		     
}
