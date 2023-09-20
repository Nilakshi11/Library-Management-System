import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame implements ActionListener
{
	JButton btnCan,btnOk;
	JLabel hn,hn1,lg,un,pa;
	JTextField txtun;
	JPasswordField txtpa;
	JLabel Background;
	Login()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		ImageIcon img= new ImageIcon("Login.jpg");
		Background = new JLabel(img);
		
		hn = new JLabel("LIBRARY SYSTEM");		
		lg = new JLabel("LOGIN");		
		un = new JLabel("USERNAME");		
		pa = new JLabel("PASSWORD");		
		txtun=new JTextField();
		txtpa=new JPasswordField();
		btnOk=new JButton("OK");
		btnCan=new JButton("CANCEL");
		
		Font f1=new Font("Arial",Font.BOLD,30);
		pa.setFont(f1);
		lg.setFont(f1);
		un.setFont(f1);		
		
		Font f2=new Font("Arial",Font.BOLD|Font.ITALIC,50);
		hn.setFont(f2);
		
		hn.setForeground(Color.yellow);
		lg.setForeground(Color.blue);
		un.setForeground(Color.black);
		pa.setForeground(Color.black);
		
		Background.setBounds(0,0,750,700);		
		hn.setBounds(150,100,600,100);
		lg.setBounds(330,200,600,100);
		un.setBounds(150,300,600,100);
		pa.setBounds(150,370,600,100);
		txtun.setBounds(450,340,200,30);
		txtpa.setBounds(450,405,200,30);
		btnOk.setBounds(250,570,100,40);
		btnCan.setBounds(400,570,100,40);		
		
		btnOk.addActionListener(this);
		btnCan.addActionListener(this);
				
		c.add(Background);
		Background.add(hn);
		Background.add(lg);
		Background.add(un);
		Background.add(pa);
		Background.add(txtun);
		Background.add(txtpa);
		Background.add(btnOk);
		Background.add(btnCan);
	}
	public void actionPerformed(ActionEvent e) 
	{ 
		String user = txtun.getText();
		String pass = txtpa.getText();
		if(user.equals("Admin") && pass.equals("TYCM4"))
		{
			if(e.getSource()==btnOk)
			{
				JOptionPane.showMessageDialog(null, "Successfully Login!!");
				setVisible(false);
				new LibraryHome();
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Username & Password");
		}
	}	
	public static void main(String args[])
	{
		Login lh1=new Login();
		lh1.setSize(750,700);
		lh1.setVisible(true);
		lh1.setTitle("Library Management System");
		lh1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
class LibraryHome extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1,l2;
	LibraryHome()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		ImageIcon iix=new ImageIcon("L1.jpeg");
		ImageIcon iiy=new ImageIcon("Head.png");
		ImageIcon ii1=new ImageIcon("AddUser.jpeg");
		ImageIcon ii2=new ImageIcon("AddBook.jpeg");
		ImageIcon ii3=new ImageIcon("Statistics.jpeg");
		ImageIcon ii4=new ImageIcon("Issue.jpeg");
		ImageIcon ii5=new ImageIcon("Return.jpeg");
		ImageIcon ii6=new ImageIcon("Logout.jpeg");
		
		l1= new JLabel(iix);
		
		b1= new JButton("  New Student",ii1); 
		b2= new JButton("  New Book",ii2); 
		b3= new JButton("  Statistics",ii3); 
		b4= new JButton("  Issue Book",ii4); 
		b5= new JButton("  Return Book",ii5);
		b6= new JButton("  LogOut",ii6);
		
		l2= new JLabel(iiy);
		
		Font f1= new Font("Arial", Font.BOLD,25);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);

		l1.setBounds(0,0,1200,700);
		l2.setBounds(300,100,600,100);
		b1.setBounds(120,300,280,70);
		b2.setBounds(470,300,280,70);
		b3.setBounds(820,300,280,70);
		b4.setBounds(120,500,280,70);
		b5.setBounds(470,500,280,70);
		b6.setBounds(820,500,280,70);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		c.add(l1);
		l1.add(l2);
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		l1.add(b6);
		
		setVisible(true);
		setTitle("Library Home");
		setSize(1200,700);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			NewStudent ns1=new NewStudent();
		}
		else if(ae.getSource()==b2)
		{
			NewBook nb1=new NewBook();
		}
		else if(ae.getSource()==b3)
		{
			Statistics s1=new Statistics();
		}
		else if(ae.getSource()==b4)
		{
			IssueBook n1=new IssueBook();
		}
		else if(ae.getSource()==b5)
		{
			ReturnBook n1=new ReturnBook();
		}
		else if(ae.getSource()==b6)
		{
			int res=JOptionPane.showConfirmDialog(null,"Do you want to logout the serviece?");
			if(res==JOptionPane.OK_OPTION)
			{
				setVisible(false);
			}
		}
	}
}
class NewStudent extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	JButton btn1,btn2;
	NewStudent()
	{
		setLayout(null);	
		ImageIcon ic1=new ImageIcon("Frame.jpg");
		JLabel jl1=new JLabel(ic1);
		
		JLabel jl2=new JLabel("Student Name");
		JLabel jl3=new JLabel("Roll Number");
		JLabel jl4=new JLabel("Branch Name");
		JLabel jl5=new JLabel("Mobile Number");
		ImageIcon ic2=new ImageIcon("save.png");		
		btn1=new JButton("Save",ic2);
		ImageIcon ic3=new ImageIcon("Update.png");		
		btn2=new JButton("Update",ic3);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		
		JLabel jl6=new JLabel("Registration of New Student");
		Font f2=new Font("Arial",Font.BOLD|Font.ITALIC,30);
		jl6.setForeground(Color.yellow);
		jl6.setFont(f2);
		
		Font f1=new Font("Arial",Font.BOLD,25);
		jl2.setFont(f1);
		jl3.setFont(f1);
		jl4.setFont(f1);
		jl5.setFont(f1);
		btn1.setFont(f1);
		btn2.setFont(f1);
		
		jl1.setBounds(0,0,700,600);
		jl2.setBounds(100,150,200,50);
		jl3.setBounds(100,230,200,50);
		jl4.setBounds(100,310,200,50);
		jl5.setBounds(100,390,200,50);
		jl6.setBounds(150,30,600,50);
		btn1.setBounds(120,470,200,50);
		btn2.setBounds(350,470,200,50);
		tf1.setBounds(400,150,200,40);
		tf2.setBounds(400,230,200,40);
		tf3.setBounds(400,310,200,40);
		tf4.setBounds(400,390,200,40);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(jl1);
		jl1.add(jl2);
		jl1.add(jl3);
		jl1.add(jl4);
		jl1.add(jl5);
		jl1.add(jl6);
		jl1.add(btn1);
		jl1.add(btn2);
		jl1.add(tf1);
		jl1.add(tf2);
		jl1.add(tf3);
		jl1.add(tf4);
		
		setVisible(true);
		setTitle("Add New Student");
		setSize(700,600);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");	
			System.out.println("Database Connection Successfull!!!");
			
			Statement stmt=con.createStatement();
					
			if(ae.getSource()==btn1)
			{
				int cnt=stmt.executeUpdate("insert into Student values('"+tf1.getText()+"',"+Integer.parseInt(tf2.getText())+",'"+tf3.getText()+"',"+Double.parseDouble(tf4.getText())+")");			
				System.out.println("record insert successfully "+cnt);
				if(cnt>0)
					JOptionPane.showMessageDialog(null,"Record Saved Successfully!!!");
				else					
					JOptionPane.showMessageDialog(null,"Record Not Saved!!!");
			}
			else
			{
				int cnt=stmt.executeUpdate("update Student set sname='"+tf1.getText()+"',rollno="+Integer.parseInt(tf2.getText())+", branch='"+tf3.getText()+"',mobileno="+Integer.parseInt(tf4.getText())+" where rollno="+Integer.parseInt(tf2.getText()));
				System.out.println("record update successfully "+cnt);				
				if(cnt>0)
					JOptionPane.showMessageDialog(null,"Record Updated Successfully!!!");
				else					
					JOptionPane.showMessageDialog(null,"Record Not Updated!!!");
			}
			ResultSet rs=stmt.executeQuery("select * from Student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setVisible(false);
	}
}
class NewBook extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	JButton btn1,btn2;
	NewBook()
	{
		setLayout(null);	
		ImageIcon ic1=new ImageIcon("Frame.jpg");
		JLabel jl1=new JLabel(ic1);
		
		JLabel jl2=new JLabel("Book Name");
		JLabel jl3=new JLabel("Book ID");
		JLabel jl4=new JLabel("Author");
		JLabel jl5=new JLabel("Price");
		ImageIcon ic2=new ImageIcon("save.png");		
		btn1=new JButton("Save",ic2);
		ImageIcon ic3=new ImageIcon("Update.png");		
		btn2=new JButton("Update",ic3);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		
		JLabel jl6=new JLabel("Registration of New Book");
		Font f2=new Font("Arial",Font.BOLD|Font.ITALIC,30);
		jl6.setForeground(Color.yellow);
		jl6.setFont(f2);
		
		Font f1=new Font("Arial",Font.BOLD,25);
		jl2.setFont(f1);
		jl3.setFont(f1);
		jl4.setFont(f1);
		jl5.setFont(f1);
		btn1.setFont(f1);
		btn2.setFont(f1);
		
		jl1.setBounds(0,0,700,600);
		jl2.setBounds(100,150,200,50);
		jl3.setBounds(100,230,200,50);
		jl4.setBounds(100,310,200,50);
		jl5.setBounds(100,390,200,50);
		jl6.setBounds(150,30,600,50);
		btn1.setBounds(120,470,200,50);
		btn2.setBounds(350,470,200,50);
		tf1.setBounds(400,150,200,40);
		tf2.setBounds(400,230,200,40);
		tf3.setBounds(400,310,200,40);
		tf4.setBounds(400,390,200,40);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(jl1);
		jl1.add(jl2);
		jl1.add(jl3);
		jl1.add(jl4);
		jl1.add(jl5);
		jl1.add(jl6);
		jl1.add(btn1);
		jl1.add(btn2);
		jl1.add(tf1);
		jl1.add(tf2);
		jl1.add(tf3);
		jl1.add(tf4);
		
		setVisible(true);
		setTitle("Add New Book");
		setSize(700,600);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");	
			System.out.println("Database Connection Successfull!!!");
			
			Statement stmt=con.createStatement();
						
			if(ae.getSource()==btn1)
			{
				int cnt=stmt.executeUpdate("insert into Book values('"+tf1.getText()+"',"+Integer.parseInt(tf2.getText())+",'"+tf3.getText()+"',"+Integer.parseInt(tf4.getText())+")");			
				System.out.println("record insert successfully "+cnt);
				if(cnt>0)
					JOptionPane.showMessageDialog(null,"Book Record Saved Successfully!!!");
				else					
					JOptionPane.showMessageDialog(null,"Book Not Issued!!!");
			}
			else
			{
				int cnt=stmt.executeUpdate("update Book set bname='"+tf1.getText()+"',bid="+Integer.parseInt(tf2.getText())+", publisher='"+tf3.getText()+"',price="+Integer.parseInt(tf4.getText())+" where bid="+Integer.parseInt(tf2.getText()));
				System.out.println("record update successfully "+cnt);
				if(cnt>0)
					JOptionPane.showMessageDialog(null,"Record Updated Successfully!!!");
				else					
					JOptionPane.showMessageDialog(null,"Record Not Updated!!!");
			}
				
			ResultSet rs=stmt.executeQuery("select * from Book");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
			}
			con.close();	
        }
		catch(Exception e)
		{
			System.out.println(e);
		}
		setVisible(false);
	}
}
class Statistics extends JFrame
{
	JTable jt;
	JScrollPane jsp;
	Statistics()
	{
		setLayout(null);	
		ImageIcon ic1=new ImageIcon("Frame.jpg");
		JLabel jl1=new JLabel(ic1);
		JLabel jl2=new JLabel("Books Details");
		JLabel jl3=new JLabel("Issued Books Details");
		
		Font f1=new Font("Arial",Font.BOLD|Font.ITALIC,30);
		jl2.setForeground(Color.yellow);
		jl3.setForeground(Color.yellow);
		jl2.setFont(f1);
		jl3.setFont(f1);
		
		JTable j1=new JTable();
		JTable j2=new JTable();
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp1=new JScrollPane(j1,v,h);
		JScrollPane jsp2=new JScrollPane(j2,v,h);
								
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");	
			System.out.println("Database Connection Successfull!!!");
			
			Statement stmt1=con.createStatement();
			Statement stmt2=con.createStatement();
			
			ResultSet rs1=stmt1.executeQuery("select * from Book");
			ResultSet rs2=stmt2.executeQuery("select * from IssueBook");
			
			ResultSetMetaData rsmd1=rs1.getMetaData();
			ResultSetMetaData rsmd2=rs2.getMetaData();
			DefaultTableModel model1=(DefaultTableModel)j1.getModel();			
			DefaultTableModel model2=(DefaultTableModel)j2.getModel();			
			int cols1=rsmd1.getColumnCount();
			int cols2=rsmd2.getColumnCount();
			String[] colName1=new String[cols1];
			String[] colName2=new String[cols2];
			for(int i=0; i<cols1; i++)
			{
				colName1[i]=rsmd1.getColumnName(i+1);
			}
			for(int i=0; i<cols2; i++)
			{
				colName2[i]=rsmd2.getColumnName(i+1);
			}
			model1.setColumnIdentifiers(colName1);
			model2.setColumnIdentifiers(colName2);
			//fetching data
			while(rs1.next())
			{				
				String bname=rs1.getString(1);
				String bid=Integer.toString(rs1.getInt(2));
				String publisher=rs1.getString(3);
				String price=Integer.toString(rs1.getInt(4));
			    String tData1[]={bname,bid,publisher,price};
				model1.addRow(tData1);
			}
			while(rs2.next())
			{
				String bid=Integer.toString(rs2.getInt(1));
				String rollno=Integer.toString(rs2.getInt(2));
				String idate=rs2.getString(3);
				String ddate=rs2.getString(4);
			    String tData2[]={bid,rollno,idate,ddate};
				model2.addRow(tData2);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		jl1.setBounds(0,0,800,600);
		jl2.setBounds(150,30,600,50);
		jl3.setBounds(150,330,600,50);
		jsp1.setBounds(50,100,700,175);
		jsp2.setBounds(50,400,700,150);
		
		add(jl3);
		add(jl2);		
		add(jsp1);
		add(jsp2);
		add(jl1);
		
		setVisible(true);
		setTitle("statistics of Books");
		setSize(800,600);
	}
}
class IssueBook extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	JButton btn;
	IssueBook()
	{
		setLayout(null);	
		ImageIcon ic1=new ImageIcon("Frame.jpg");
		JLabel jl1=new JLabel(ic1);
		
		JLabel jl2=new JLabel("Book ID");
		JLabel jl3=new JLabel("Student ID");
		JLabel jl4=new JLabel("Issue Date(dd-MM-yyyy)");
		JLabel jl5=new JLabel("Due Date(dd-MM-yyyy");
		ImageIcon ic2=new ImageIcon("Issue.jpeg");		
		btn=new JButton("Issue",ic2);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		
		JLabel jl6=new JLabel("Issue Book to the Student");
		Font f2=new Font("Arial",Font.BOLD|Font.ITALIC,30);
		jl6.setForeground(Color.yellow);
		jl6.setFont(f2);
		
		Font f1=new Font("Arial",Font.BOLD,25);
		jl2.setFont(f1);
		jl3.setFont(f1);
		jl4.setFont(f1);
		jl5.setFont(f1);
		btn.setFont(f1);
		
		jl1.setBounds(0,0,700,600);
		jl2.setBounds(100,150,200,50);
		jl3.setBounds(100,230,200,50);
		jl4.setBounds(100,310,320,50);
		jl5.setBounds(100,390,325,50);
		jl6.setBounds(150,30,600,50);
		btn.setBounds(250,470,150,50);
		tf1.setBounds(400,150,200,40);
		tf2.setBounds(400,230,200,40);
		tf3.setBounds(400,310,200,40);
		tf4.setBounds(400,390,200,40);
		
		btn.addActionListener(this);
		
		add(jl1);
		jl1.add(jl2);
		jl1.add(jl3);
		jl1.add(jl4);
		jl1.add(jl5);
		jl1.add(jl6);
		jl1.add(btn);
		jl1.add(tf1);
		jl1.add(tf2);
		jl1.add(tf3);
		jl1.add(tf4);
		
		setVisible(true);
		setTitle("Issue Book");
		setSize(700,600);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");	
			System.out.println("Database Connection Successfull!!!");
			
			Statement stmt=con.createStatement();
					
			int cnt=stmt.executeUpdate("insert into IssueBook values("+Integer.parseInt(tf1.getText())+","+Integer.parseInt(tf2.getText())+",'"+tf3.getText()+"','"+tf4.getText()+"')");			
			System.out.println("record insert successfully "+cnt);
			if(cnt>0)
				JOptionPane.showMessageDialog(null,"Book Issued Successfully!!!");
			else					
				JOptionPane.showMessageDialog(null,"Book Not Issued!!!");
			
			ResultSet rs=stmt.executeQuery("select * from IssueBook");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setVisible(false);
	}
}
class ReturnBook extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	JButton btn;
	ReturnBook()
	{
		setLayout(null);	
		ImageIcon ic1=new ImageIcon("Frame.jpg");
		JLabel jl1=new JLabel(ic1);
		
		JLabel jl2=new JLabel("Book ID");
		JLabel jl3=new JLabel("Student ID");
		JLabel jl4=new JLabel("Issue Date(dd-MM-yyyy)");
		JLabel jl5=new JLabel("Due Date(dd-MM-yyyy");
		ImageIcon ic2=new ImageIcon("Return.jpeg");		
		btn=new JButton("Return",ic2);
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);
		
		JLabel jl6=new JLabel("Return Book to from Student");
		Font f2=new Font("Arial",Font.BOLD|Font.ITALIC,30);
		jl6.setForeground(Color.yellow);
		jl6.setFont(f2);
		
		Font f1=new Font("Arial",Font.BOLD,25);
		jl2.setFont(f1);
		jl3.setFont(f1);
		jl4.setFont(f1);
		jl5.setFont(f1);
		btn.setFont(f1);
		
		jl1.setBounds(0,0,700,600);
		jl2.setBounds(100,150,200,50);
		jl3.setBounds(100,230,200,50);
		jl4.setBounds(100,310,310,50);
		jl5.setBounds(100,390,310,50);
		jl6.setBounds(150,30,600,50);
		btn.setBounds(230,470,200,50);
		tf1.setBounds(400,150,200,40);
		tf2.setBounds(400,230,200,40);
		tf3.setBounds(400,310,200,40);
		tf4.setBounds(400,390,200,40);
		
		btn.addActionListener(this);
		
		add(jl1);
		jl1.add(jl2);
		jl1.add(jl3);
		jl1.add(jl4);
		jl1.add(jl5);
		jl1.add(jl6);
		jl1.add(btn);
		jl1.add(tf1);
		jl1.add(tf2);
		jl1.add(tf3);
		jl1.add(tf4);
		
		setVisible(true);
		setTitle("Return Book");
		setSize(700,600);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");	
			System.out.println("Database Connection Successfull!!!");
			
			Statement stmt=con.createStatement();
					
			//int cnt=stmt.executeUpdate("insert into IssueBook values("+Integer.parseInt(tf1.getText())+","+Integer.parseInt(tf2.getText())+",'"+tf3.getText()+"','"+tf4.getText()+"')");			
			int cnt=stmt.executeUpdate("delete from IssueBook where bid="+Integer.parseInt(tf1.getText()));
			System.out.println("record Deleted successfully "+cnt);
			if(cnt>0)
				JOptionPane.showMessageDialog(null,"Book Return Successfully!!!");
			else					
				JOptionPane.showMessageDialog(null,"Book Not Returned!!!");
			
			ResultSet rs=stmt.executeQuery("select * from IssueBook");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setVisible(false);
	}
}