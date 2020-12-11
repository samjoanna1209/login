package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import model.Model;

public class Dao {

	static final String jdbc_driver="com.mysql.jdbc.Driver";
	static final String Db_url="jdbc:mysql://localhost/empolyees";
	static final String user="root";
	static final String pwd="";
	static Connection con=null;
	static PreparedStatement pre=null;
	
	public Boolean save(Model model) {
try {
			
				Class.forName(jdbc_driver);
				System.out.println("selected database");
				con=DriverManager.getConnection(Db_url,user,pwd);
				System.out.println("Connected database successfully");
				PreparedStatement pre=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			
			pre.setString(1,model.getFirstname());
			pre.setString(2,model.getLastname());
			pre.setString(3,model.getDob());
			pre.setString(4,model.getGender());
		    pre.setString(5,model.getEmail());
		    pre.setString(6,model.getPhonenumber());
		    pre.setString(7,model.getPassword());
						
		
			int re=pre.executeUpdate();
			
			
			if(re==1){
				return true;
			}else{
				return false;	
			}
		} catch (Exception e) { 
			e.printStackTrace();
			return false;
		}	
		
	}

}
