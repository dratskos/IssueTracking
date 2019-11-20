package IssueTrack;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class User extends PTracking {
     public String name;
     public int id;
     public static String DateOfBirth;
     public String job;
     private int password;
     public String email;
     private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
 	
    
     
	 public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}


    @SuppressWarnings("deprecation")
	public void CreateNewUser() throws SQLException {

    	Date mydate;
    	Date date = new Date(0);
        System.out.println(sdf.format(date));
    	
        
        mydate=date.valueOf("2019-03-04");
    	Scanner keyScanner;
    	keyScanner = new Scanner(System.in);
    	
    	
    	
    	System.out.println("Set the Name of the User");
    	setName(keyScanner.nextLine());
    	
    	
    	System.out.println("Set the ID of the User");
    	setId(keyScanner.nextInt());
    	
    	System.out.println("Set Date Of Birth of the User");
    	setDateOfBirth(keyScanner.nextLine());
    	
    	
    	System.out.println("Set the Job of the User");
    	setJob(keyScanner.nextLine());
    	
    	System.out.println("Set the Password of the User");
    	setPassword(keyScanner.nextInt());
    	
    	System.out.println("Set the Email of the User");
    	setEmail(keyScanner.nextLine());
    	
    	
    	
    	System.out.println("Succesfull SignUp");
    	
    	
   //____________________________ Connect with Database_________________________
    	
    	String sql= "INSERT INTO user (UserID,UserName,UserDateOfBirth,UserDepartment,UserPassword,UserEmail) VALUES (?,?,?,?,?,?)";
		
	    PreparedStatement statement=(PreparedStatement) conn.prepareStatement(sql);
		
	    statement.setInt(1,getId());
		statement.setString(2,getName());
	    statement.setDate(3,mydate);
		statement.setString(4,getJob());
		statement.setInt(5,getPassword());
		statement.setString(6,getEmail());
		
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
        }
    }
}