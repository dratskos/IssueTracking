package IssueTrack;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

public class Issue extends PTracking {
            public String Tittle;
            public String Description;
            public String Kind ;
            public String AssignedTo;
            public String DateOfCreated;
            public String DateOfProccess;
            public String LastUserOfProccess;
            public String UserOfCreated;
            public String Status;
            
            
            
            
        	public String getTittle() {
				return Tittle;
			}
			public void setTittle(String tittle) {
				Tittle = tittle;
			}
			public String getDescription() {
				return Description;
			}
			public void setDescription(String description) {
				Description = description;
			}
			public String getKind() {
				return Kind;
			}
			public void setKind(String kind) {
				Kind = kind;
			}
			public String getAssignedTo() {
				return AssignedTo;
			}
			public void setAssignedTo(String assignedTo) {
				AssignedTo = assignedTo;
			}
			public String getDateOfCreated() {
				return DateOfCreated;
			}
			public void setDateOfCreated(String dateOfCreated) {
				DateOfCreated = dateOfCreated;
			}
			public String getDateOfProccess() {
				return DateOfProccess;
			}
			public void setDateOfProccess(String dateOfProccess) {
				DateOfProccess = dateOfProccess;
			}
			public String getLastUserOfProccess() {
				return LastUserOfProccess;
			}
			public void setLastUserOfProccess(String lastUserOfProccess) {
				LastUserOfProccess = lastUserOfProccess;
			}
			public String getUserOfCreated() {
				return UserOfCreated;
			}
			public void setUserOfCreated(String userOfCreated) {
				UserOfCreated = userOfCreated;
			}
			public String getStatus() {
				return Status;
			}
			public void setStatus(String status) {
				Status = status;
			}
            
            @SuppressWarnings("resource")
			public void CreateAnIssue() {
            	//System.out.println(getTittle());
            	
            	Scanner keyScanner;
            	keyScanner = new Scanner(System.in);
            	LocalDate date = LocalDate.now();
            	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            	
            	
            	String sql= "INSERT INTO user (UserID,UserName,UserDateOfBirth,UserDepartment,UserPassword,UserEmail) VALUES (?,?,?,?,?,?)";
            	
            	
            	
            	
            	
            	System.out.println("Enter the Tittle of the Issue");
        		setTittle(keyScanner.nextLine());
        		
        		//System.out.println(getTittle());
        		
        		System.out.println("Enter the Description of the Issue");
        		setDescription(keyScanner.nextLine()) ;
        		
        		
        		System.out.println("Enter the Kind of the Issue");
        		setKind(keyScanner.nextLine());
        		
        		System.out.println("Issue is AssignedTo");
        		setAssignedTo(keyScanner.nextLine());
        		
        		System.out.println("Enter the Date that Issue Created");
        		
        		setDateOfCreated(date.format(formatter));
        		setDateOfProccess(date.format(formatter));
        		
        		System.out.println("Set Last User That Processing the Issue");
        		setLastUserOfProccess(keyScanner.nextLine());
        		
        		System.out.println("Set the User That Create the Issue");
        		setUserOfCreated(keyScanner.nextLine());
        		
        		System.out.println("Set the Status of the Issue");
        		setStatus(keyScanner.nextLine());
        		
                
        		
            
            }
            
            
	           
}
