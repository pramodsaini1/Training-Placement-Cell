import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class PkBiru extends JFrame implements ActionListener{
		    JLabel jl1,jl2,jl3 ,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,header,body;
		JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8 ,jm;
		JButton jb,jb1,jb2,jb3,jb4 ;
		JRadioButton jr,jr1,jr2,jr3,jr4,jr5;
		ButtonGroup  gender,branch ;
		int flag=0 ;
		Font f ;
   		public PkBiru(String s){
			super(s);
			 gender = new ButtonGroup();
			 branch = new ButtonGroup();
			setLayout(null);
			header = new JLabel(new ImageIcon("student.jpg"));
			body = new JLabel(new ImageIcon("pk.jpg"));
			f = new Font("Courier New Lucida Console",Font.BOLD,18);
			jl1 = new JLabel("Student-Id:");
			jt1 = new JTextField(20);
			jl1.setFont(f);
			jt1.setFont(f);
			
			jl2 = new JLabel("Student Name:");
			jt2 = new JTextField(20);
			jl2.setFont(f);
			jt2.setFont(f);
			
			jl3 = new JLabel("Father's Name:");
			jt3 = new JTextField(20);
			jl3.setFont(f);
			jt3.setFont(f);
			
			jl4 = new JLabel("Email-Id:");
			jt4 = new JTextField(20);
			jl4.setFont(f);
			jt4.setFont(f);
			
			jl5 = new JLabel("Phone No:");
			jt5 = new JTextField(20);
			jl5.setFont(f);
			jt5.setFont(f);
			
			jl6 = new JLabel("10th %:");
			jt6 = new JTextField(20);
			jl6.setFont(f);
			jt6.setFont(f);
			
			jl7 = new JLabel("12th %:");
			jt7 = new JTextField(20);
			jl7.setFont(f);
			jt7.setFont(f);
			
			jl8 = new JLabel("Backlog:");
			jt8 = new JTextField(20);
			jl8.setFont(f);
			jt8.setFont(f);
			
     		jl9 = new JLabel("Gender:");
			jr = new JRadioButton("Male");
			jr1 = new JRadioButton("Female");
			jl9.setFont(f);
			jr.setFont(f);
			jr1.setFont(f);
			
			jl10 = new JLabel("Branch:");
			jr2 = new JRadioButton("CSE");
			jr3 = new JRadioButton("IT");
			jr4 = new JRadioButton("CIVIl");
			jr5 = new JRadioButton("MECH.");
			jl10.setFont(f);
			jr2.setFont(f);
			jr3.setFont(f);
			jr4.setFont(f);
			jr5.setFont(f);
			
			jl11 = new JLabel("BTech %:");
			jm = new JTextField(20);
			jl11.setFont(f);
			jm.setFont(f);
 			
			jb = new JButton("Submit");
			jb.setFont(f);
			jb1=new JButton("Edit");
			jb1.setFont(f);
			jb2=new JButton("Delete");
			jb2.setFont(f);
			jb3 = new JButton("Logout");
			jb3.setFont(f);
			jb4 = new JButton("Exit");
			jb4.setFont(f);
			  
			  gender.add(jr);
			  gender.add(jr1);
			  
			  branch.add(jr2);
			  branch.add(jr3);
 			  branch.add(jr4);
			  branch.add(jr5);

			   
            header.setBounds(0,0,950,200);
		    body.setBounds(0,180,950,820);
			
			jl1.setBounds(50,250,140,30);
			jt1.setBounds(190,250,150,30);
			jb1.setBounds(370,250,150,30);
			
			jl2.setBounds(50,300,140,30);
			jt2.setBounds(190,300,150,30);
			jb2.setBounds(370,300,150,30);

			jl3.setBounds(50,350,140,30);
			jt3.setBounds(190,350,150,30);
			jb3.setBounds(370,350,150,30);
			
			jl4.setBounds(50,400,140,30);
			jt4.setBounds(190,400,150,30);
			jb4.setBounds(370,400,150,30);
			
			jl5.setBounds(50,450,140,30);
			jt5.setBounds(190,450,150,30);
			
			jl6.setBounds(50,500,140,30);
			jt6.setBounds(190,500,150,30);
			
			jl7.setBounds(50,550,140,30);
			jt7.setBounds(190,550,150,30);
			
			jl8.setBounds(50,600,140,30);
			jt8.setBounds(190,600,150,30);
			
	   		jl9.setBounds(50,650,140,30);
			jr.setBounds(190,650,80,30);
            jr1.setBounds(270,650,120,30);
			
			jl10.setBounds(50,700,140,30);
			jr2.setBounds(190,700,80,30);
            jr3.setBounds(270,700,80,30);
			jr4.setBounds(350,700,80,30);
            jr5.setBounds(430,700,100,30);
			
			jl11.setBounds(50,750,140,30);
			jm.setBounds(190,750,170,30);
			
			jb.setBounds(100,800,100,50);
			
			add(jl1);
			add(jt1);
			
			add(jl2);
			add(jt2);
			
			add(jl3);
			add(jt3);
			
			add(jl4);
			add(jt4);
			
			add(jl5);
			add(jt5);
			
			add(jl6);
			add(jt6);
			
			add(jl7);
			add(jt7);
			
			add(jl8);
			add(jt8);
			
			add(jl9);
			add(jr);
			add(jr1);
			
			add(jl10);
			add(jr2);
			add(jr3);
			add(jr4);
			add(jr5);
			
			add(jl11);
			add(jm);
			
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
	     if(et.getSource()==jb2){
			   try{
			         int student_id= Integer.parseInt(jt1.getText());
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from student where student_id="+student_id);
				if(rs.next()){
					jt2.setText(rs.getString(2));
				    jt3.setText(rs.getString(3));
					jt4.setText(rs.getString(4));
					jt5.setText(rs.getString(5));
					jt6.setText(rs.getInt(6)+"");
					jt7.setText(rs.getInt(7)+"");
					jt8.setText(rs.getInt(8)+"");
					String gender = rs.getString(9);
					if(gender.equals("Male")){
						jr.setSelected(true);
					}
                   else if(gender.equals("Female")){
						jr1.setSelected(true);
					}
					String branch = rs.getString(10);
					if(branch.equals("CSE")){
						jr2.setSelected(true);
					}
                   else if(branch.equals("IT")){
						jr3.setSelected(true);
					}
					else if(branch.equals("CIVIL")){
						jr4.setSelected(true);
					}
					else if(branch.equals("MECH.")){
						jr5.setSelected(true);
					}
					jm.setText(rs.getInt(11)+"");
					flag=2;
				}
				else{
					flag=0;
					JOptionPane.showMessageDialog(null,"Record not found");
					PkBiru d= new PkBiru("Insert Record");
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
		 else if(et.getSource()==jb3){
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
		    else if(et.getSource()==jb1){
			   try{
			         int student_id= Integer.parseInt(jt1.getText());
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				Statement st=cn.createStatement();
				ResultSet rs=st.executeQuery("select * from student where student_id="+student_id);
				if(rs.next()){
					jt2.setText(rs.getString(2));
				    jt3.setText(rs.getString(3));
					jt4.setText(rs.getString(4));
					jt5.setText(rs.getString(5));
					jt6.setText(rs.getInt(6)+"");
					jt7.setText(rs.getInt(7)+"");
					jt8.setText(rs.getInt(8)+"");
					String gender = rs.getString(9);
					if(gender.equals("Male")){
						jr.setSelected(true);
					}
                   else if(gender.equals("Female")){
						jr1.setSelected(true);
					}
					String branch = rs.getString(10);
					if(branch.equals("CSE")){
						jr2.setSelected(true);
					}
                   else if(branch.equals("IT")){
						jr3.setSelected(true);
					}
					else if(branch.equals("CIVIL")){
						jr4.setSelected(true);
					}
					else if(branch.equals("MECH.")){
						jr5.setSelected(true);
					}
					jm.setText(rs.getInt(11)+"");
					flag=1;
				}
				else{
					flag=0;
					JOptionPane.showMessageDialog(null,"Record not found");
					PkBiru d= new PkBiru("Insert Record");
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
		   else{
			             int student_id= Integer.parseInt(jt1.getText());
						 String student_name = jt2.getText();
						 String father_name = jt3.getText();
						 String email = jt4.getText();
						 String phone = jt5.getText();
						 int mark_10 = Integer.parseInt(jt6.getText());
						 int mark_12 = Integer.parseInt(jt7.getText());
						 int back   = Integer.parseInt(jt8.getText());
						 String gender=null;
						 String branch=null ;
						 int btech_aggr= Integer.parseInt(jm.getText());
						 
						 if(jr.isSelected()){
							 gender=  jr.getText();
						 }
						 else if(jr1.isSelected()){
							  gender = jr1.getText();
						 }
						 if(jr2.isSelected()){
							 branch=  jr2.getText();
						 }
						 else if(jr3.isSelected()){
							  branch = jr3.getText();
						 }
						 else if(jr4.isSelected()){
							  branch = jr4.getText();
						 }
						 else if(jr5.isSelected()){
							  branch = jr5.getText();
						 }
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				PreparedStatement ps=null;
				String msg="";
				if(flag==0){
   					ps=cn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?)");
					            ps.setInt(1,student_id);
								ps.setString(2,student_name);
								ps.setString(3,father_name);
								ps.setString(4,email);
								ps.setString(5,phone);
								ps.setInt(6, mark_10);
								ps.setInt(7, mark_12);
								ps.setInt(8,back);
								ps.setString(9, gender);
								ps.setString(10, branch);
								ps.setInt(11,btech_aggr);
					msg="Record Inserted";
				}	
                else if(flag==1){
                      ps=cn.prepareStatement("update student set student_name=?,father_name=?,email=?,phone=?,10th=?,12th=?,back=?,gender=?,branch=?,btech_aggr=? where student_id=?");
					ps.setString(1,student_name);
					ps.setString(2,father_name);
					ps.setString(3,email);
					ps.setString(4,phone);
					ps.setInt(5,mark_10);
					ps.setInt(6,mark_12);
					ps.setInt(7,back);
					ps.setString(8,gender);
					ps.setString(9,branch);
					ps.setInt(10,btech_aggr);
					ps.setInt(11,student_id);

					msg="Record Updated";
					

                }		
                   else if(flag==2){
                      ps=cn.prepareStatement("delete from student where student_id=?");
				     ps.setInt(1,student_id);
					msg="Record Deleted";
					

                }						
						
				if(ps.executeUpdate()>0){
				   JOptionPane.showMessageDialog(null,msg); 
				   PkBiru d= new PkBiru("Insert Record");
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
				System.out.println("Driver : "+ e.getMessage());
			}
			catch(SQLException e){
				System.out.println("SQL :  "+e.getMessage());
			} 
	   }			
			       
	 }
	  
	  
	   
	   
} 



