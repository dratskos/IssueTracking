package IssueTrack;

import java.rmi.registry.Registry;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.mysql.jdbc.PreparedStatement;


public class MyConnection {
	static String password="123321123";
	
	public static Connection getConnection(){
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/newschema","root", password);
			
			
		} catch (Exception ex) {
            System.out.println(ex.getMessage());
            }
		
		return con;
	}
	
	/* // function to check if the username already exist in database table
	  public boolean checkUsername(String username)
	    {System.out.println("Name Checked");
	        PreparedStatement ps;
	        ResultSet rs;
	        boolean checkUser = false;
	        String query = "SELECT * FROM `the_app_users` WHERE `u_uname` =?";
	        
	        try {
	            ps = (PreparedStatement) MyConnection.getConnection().prepareStatement(query);
	            ps.setString(1, username);
	            
	            rs = ps.executeQuery();
	            
	            if(rs.next())
	            {
	                checkUser = true;
	            }
	        } catch (SQLException ex) {
	        	System.out.println("Name Checked");
	            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
	            System.out.println("Name Checked");
	        }
	         return checkUser;
	    }


*/
}