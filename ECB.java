import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ECB extends JFrame implements ActionListener{
	    JLabel jl1,jl2,jl3,jl4,jl5,jl6 ,header,body;
		JTextField jt1,jt2,jt3,jt4,jt5 ;
		JButton jb,jb1,jb2,jb3,jb4 ;
		JCheckBox jr,jr1,jr2,jr3 ;	
       int flag=0;
         Font f ;	   
		ECB(String s){
			super(s);
			setLayout(null);
			header = new JLabel(new ImageIcon("compan_panel.jpg"));
			body = new JLabel(new ImageIcon("company_body.jpg"));
			f = new Font("Courier New Lucida Console",Font.BOLD,16);
			
 			jl1 = new JLabel("Company Name:");
			jt1 = new JTextField(20);
			jl1.setFont(f);
			jt1.setFont(f);
			
			jl2 = new JLabel("Package:");
			jt2 = new JTextField(20);
			jl2.setFont(f);
			jt2.setFont(f);
			
			jl3 = new JLabel("Branch");
			jr = new JCheckBox("CSE");
			jr1 = new JCheckBox("IT");
			jr2 = new JCheckBox("CIVIL");
			jr3 = new JCheckBox("MECH.");
			jl3.setFont(f);
			jr.setFont(f);
			jr1.setFont(f);
			jr2.setFont(f);
			jr3.setFont(f);
			
			jl4 = new JLabel(" MAX-Backlogs:");
			jt3 = new JTextField(20);
			jl4.setFont(f);
			jt3.setFont(f);
			
			
			jl5 = new JLabel("Aggr.Percentage:");
			jt4 = new JTextField(20);
			jl5.setFont(f);
			jt4.setFont(f);
			
			jl6 = new JLabel("Location:");
			jt5 = new JTextField(20);
			jl6.setFont(f);
			jt5.setFont(f);
			
			jb = new JButton("Submit");
			jb.setFont(f);
			jb1 = new JButton("Logout");
			jb1.setFont(f);
			jb2 = new JButton("Edit");
			jb2.setFont(f);
			jb3 = new JButton("Delete");
			jb3.setFont(f);
			jb4 = new JButton("Exit");
			jb4.setFont(f);
			 
			header.setBounds(0,0,950,180);
	     	body.setBounds(0,180,950,820);
			jl1.setBounds(150,250,140,30);
			jt1.setBounds(300,250,140,30);
			jb1.setBounds(450,250,100,30);
			
			jl2.setBounds(150,300,140,30);
			jt2.setBounds(300,300,140,30);
			jb2.setBounds(450,300,100,30);
			
			jl3.setBounds(150,350,140,30);
			jr.setBounds(300,350,80,30);
			jr1.setBounds(390,350,80,30);
			jr2.setBounds(480,350,80,30);
			jr3.setBounds(570,350,80,30);
			
			jl4.setBounds(150,400,140,30);
			jt3.setBounds(300,400,140,30);
			jb3.setBounds(450,400,100,30);

			
			jl5.setBounds(150,450,140,30);
			jt4.setBounds(300,450,140,30);
			jb4.setBounds(450,450,100,30);
			
			jl6.setBounds(150,500,140,30);
			jt5.setBounds(300,500,140,30);
			
			jb.setBounds(200,570,130,30);
			
			add(jl1);
			add(jt1);
			
			add(jl2);
			add(jt2);
			
			add(jl3);
			add(jr);
			add(jr1);
			add(jr2);
			add(jr3);
			
			add(jl4);
			add(jt3);
			
			add(jl5);
			add(jt4);
			
			add(jl6);
			add(jt5);
			
			add(jb);
			add(jb1);
			add(jb2);
			add(jb3);
			add(jb4);
			add(header);
			add(body);
			jb.addActionListener(this);
			jb1.addActionListener(this);
			jb2.addActionListener(this);
			jb3.addActionListener(this);
			jb4.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent et){
			if(et.getSource()==jb3){
			   try{
				   String c_name = jt1.getText();
				 Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				Statement sp=cn.createStatement();
				ResultSet rp=sp.executeQuery("select * from branch where company_name='"+c_name+"'");
				  				while(rp.next()){
                                    String branch = rp.getString(2);
									if(branch.equals("CSE")){
						                    jr.setSelected(true);
					                }
									if(branch.equals("IT")){
						                    jr1.setSelected(true);
					                }
									if(branch.equals("CIVIL")){
						                    jr2.setSelected(true);
					                }
									if(branch.equals("MECH.")){
						                    jr3.setSelected(true);
					                }
 								
								}
				
				
				   Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from company where company_name='"+c_name+"'");
				if(rs.next()){
				         jt2.setText(rs.getInt(2)+"");
				         jt3.setText(rs.getInt(3)+"");
				         jt4.setText(rs.getInt(4)+"");
				         jt5.setText(rs.getString(5)+"");
                       flag=2 ;
						  
				}
				else{
					    flag=0;
					JOptionPane.showMessageDialog(null,"Record not found");
					ECB d= new ECB("Insert Record");
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
			else if(et.getSource()==jb2){
				     try{
				   String c_name = jt1.getText();
				 Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				Statement sp=cn.createStatement();
				ResultSet rp=sp.executeQuery("select * from branch where company_name='"+c_name+"'");
				  				while(rp.next()){
                                    String branch = rp.getString(2);
									if(branch.equals("CSE")){
						                    jr.setSelected(true);
					                }
									if(branch.equals("IT")){
						                    jr1.setSelected(true);
					                }
									if(branch.equals("CIVIL")){
						                    jr2.setSelected(true);
					                }
									if(branch.equals("MECH.")){
						                    jr3.setSelected(true);
					                }
 								
								}
				
				   Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from company where company_name='"+c_name+"'");
				if(rs.next()){
				         jt2.setText(rs.getInt(2)+"");
				         jt3.setText(rs.getInt(3)+"");
				         jt4.setText(rs.getInt(4)+"");
				         jt5.setText(rs.getString(5)+"");
                       flag=1 ;
						  
				}
				else{
					    flag=0;
					JOptionPane.showMessageDialog(null,"Record not found");
					ECB d= new ECB("Insert Record");
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
			else if(et.getSource()==jb1){
				    Login d = new Login("Login Frame");
				    d.setSize(1000,1000);
				    d.setVisible(true);
				    this.setVisible(false);
				 
			}
			else if(et.getSource()==jb4){
				    Management d = new Management("Management Record");
				    d.setSize(950,1000);
				    d.setVisible(true);
				    this.setVisible(false);
				 
			}
			else{
				
			   String c_name= jt1.getText();
			   int pkg = Integer.parseInt(jt2.getText());
			   int back =Integer.parseInt(jt3.getText());
			   int agg = Integer.parseInt(jt4.getText());
			   String loc = jt5.getText();
			   String branch= " ";
			   String msg = " " ;
			   try{
				     Class.forName("com.mysql.jdbc.Driver");
					  Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
					   PreparedStatement ps= cn.prepareStatement("insert into branch values(?,?)");
					   if(jr.isSelected()){
						   ps.setString(1,c_name);
						   ps.setString(2,"CSE");
						   ps.execute();
						    
					   }
					   if(jr1.isSelected()){
						   ps.setString(1,c_name);
						   ps.setString(2,"IT");
						   ps.execute();
						    
					   }
					   if(jr2.isSelected()){
						   ps.setString(1,c_name);
						   ps.setString(2,"CIVIL");
						   ps.execute();
						    
					   }
					   if(jr3.isSelected()){
						   ps.setString(1,c_name);
						   ps.setString(2,"MECH.");
						   ps.execute();
						    
					   }
					   
					   
				   	   PreparedStatement py= null ;
 					   if(flag==0){
			   	         py=cn.prepareStatement("delete from company where company_name=?");
					    PreparedStatement pt=cn.prepareStatement("delete from branch where company_name=?");						 
					    py = cn.prepareStatement("insert into company values(?,?,?,?,?)");
						py.setString(1,c_name);
						py.setInt(2,pkg);
						py.setInt(3,back);
						py.setInt(4,agg);
						py.setString(5,loc);
					   py.executeUpdate();
					   pt.setString(1,c_name);
					 pt.executeUpdate();
						msg="Record Inserted";
					   }
					   else if(flag==2){
			   	         py=cn.prepareStatement("delete from company where company_name=?");
					  
					 PreparedStatement pt=cn.prepareStatement("delete from branch where company_name=?");
				     pt.setString(1,c_name);
					 pt.executeUpdate();
				     py.setString(1,c_name);
					 msg="Record Deleted";
					    JOptionPane.showMessageDialog(null,"Record Delete");
						
					
						   
					   }
					   else if(flag==1){
						      PreparedStatement pt=cn.prepareStatement("delete from branch where company_name=?");
				                 pt.setString(1,c_name);
					             pt.executeUpdate();
						   	    JOptionPane.showMessageDialog(null,"Record Delete");
						         ps= cn.prepareStatement("insert into branch values(?,?)");
							   if(jr.isSelected()){
								   ps.setString(1,c_name);
								   ps.setString(2,"CSE");
								   ps.execute();
									
							   }
							   if(jr1.isSelected()){
								   ps.setString(1,c_name);
								   ps.setString(2,"IT");
								   ps.execute();
									
							   }
							   if(jr2.isSelected()){
								   ps.setString(1,c_name);
								   ps.setString(2,"CIVIL");
								   ps.execute();
									
							   }
							   if(jr3.isSelected()){
								   ps.setString(1,c_name);
								   ps.setString(2,"MECH.");
								   ps.execute();
									
							   }
							    
                                py=cn.prepareStatement("update company set pkg=?,back=?,percentage=?,location=? where company_name=?");
 							   py.setInt(1,pkg);
							   py.setInt(2,back);
							   py.setInt(3,agg);
							   py.setString(4,loc);
							   py.setString(5,c_name);
							   
							   msg = "Record Updated" ;
					   }
					    
						 
						 if(py.executeUpdate()>0){
						   JOptionPane.showMessageDialog(null,msg); 
						   ECB d= new ECB("Insert Record");
						   d.setSize(950,1000);
						   d.setVisible(true);
                           this.setVisible(false);						   
				       }
						else{
							JOptionPane.showMessageDialog(null,"Try Again"); 
						}
				cn.close();
				 
			   }
			   catch(ClassNotFoundException e){
				   System.out.println("Driver:"+e.getMessage());
			   }
			   catch(SQLException e){
				   System.out.println("SQL:"+e.getMessage());
			   }
		}
			   
			 
		}
		  
		  	 
		  
		 

}
			
			
			
			

			
			 
