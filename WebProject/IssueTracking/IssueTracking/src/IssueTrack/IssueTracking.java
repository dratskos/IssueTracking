package IssueTrack;


import java.rmi.registry.Registry;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import com.mysql.*;
import com.mysql.jdbc.PreparedStatement;
import java.util.Scanner;
import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IssueTracking {

	static String password="123321123";
	static Connection conn=null;
	private static Scanner keyboard;
	static boolean exit= true;
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
	
	public static void main(String[] args) throws SQLException  {
	
		try {
			
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/newschema?useSSL=false","root", password);
		   
			if(conn!=null) {
				System.out.println("Connected Successfully to Database");}
			
			
//--------------------------------Insert Sample Users to Database-----------------------------------------------------------
            
			/*
			
			String sql= "INSERT INTO user (UserID,UserName,UserDateOfBirth,UserDepartment,UserPassword,UserEmail) VALUES (?,?,?,?,?,?)";
			
		    PreparedStatement statement=(PreparedStatement) conn.prepareStatement(sql);
			statement.setInt(1,6650);
			statement.setString(2,"Bill Hicsks");
			statement.setDate(3,dt);
			statement.setString(4,"Development Team");
			statement.setInt(5,1546);
			statement.setString(6,"billhicks@gmail.com");
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			
			
			*/
			
//--------------------------------Print Sample Users From Database-----------------------------------------------------------
		/*	
			
			String sqlR = "SELECT * FROM user";
			 
			Statement statementR = conn.createStatement();
			ResultSet result = statementR.executeQuery(sqlR);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    Date Dt = result.getDate(3);
			    
			    //String fullname = result.getString("fullname");
			    String email = result.getString("UserEmail");
			    int pass = result.getInt(5);
			    String output = "User #%d: %s - %s - %s";
			    
			    System.out.println(String.format(output, ++count, name, pass, email));
			}
			
			
			*/
		
//--------------------------------Delete Sample Users From Database-----------------------------------------------------------
			
			String sqlD = "DELETE FROM user WHERE UserName=?";
			 
			PreparedStatement statementD = (PreparedStatement) conn.prepareStatement(sqlD);
			statementD.setString(1, "Bill Hicsks");
			 
			int rowsDeleted = statementD.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
			
			
			
			
			
		 } catch(SQLException e) {
	         e.printStackTrace();}
		
		
		  UserMenu();
		  
		
	} 
	
	
	@SuppressWarnings("deprecation")
	public static  void UserMenu() throws SQLException {
		Issue Iss=new Issue();
		User Usr=new User();
		
		Date mydate;
    	Date date = new Date(0);
        
    	
        mydate=date.valueOf("1993-03-05");
       // System.out.println(mydate);
        
		
    	
		while(exit) {
		System.out.println("Choose one of the following selection: ");
		System.out.println("Press: ");
		System.out.println("1: Signup");
		System.out.println("2: LogIn ");
		System.out.println("3: Create New Issue ");
		System.out.println("4: Print Issue List");
		System.out.println("5: Change an Issue ");
		System.out.println("6: Delete Issue ");
		System.out.println("9: Exit Application");
		
		
		keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = keyboard.nextInt();
		
		Issue pt=new Issue();
		
		
		pt.setTittle("1stName");
		//System.out.println(pt.getTittle());
		
		
		if (myint==9) {
			exit=false;
		} else if (myint==3){
			Iss.CreateAnIssue();
		
		} else if (myint==1){
			Usr.CreateNewUser();
		}
		
		
		}
		
	
	}
	public static void SignUp() {
		
	}
    public static void LogIn() {
		
	}
    
    
	
}
