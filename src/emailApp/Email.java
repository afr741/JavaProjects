package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "zozocorporation.com";
	
	//Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	//	System.out.println("Email confirmed: "+this.firstName+" "+this.lastName);
		
		
		// call a method asking for a department name
		
		this.department = setDepartment();
	// System.out.println("the choosen department is: "+ this.department);
	
		this.password = generateRandomPassword(defaultPasswordLength);
		System.out.println("the default password is: "+this.password);
		
		//Combine elements to generate email
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
	//	System.out.println("your email is "+email);
		
	}
	 
	

	
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.print("New worker: "+firstName+". "+"\nDepartment codes: \n1 for Sales\n2 For Development \n3 for Accounting\n0 for none");
	Scanner in = new Scanner(System.in);
	in.nextInt();
	int depChoice = in.nextInt();
	if(depChoice == 1)
	{return "sales";}
	if(depChoice ==2 )
	{
		return "devs";
	}
	if(depChoice ==3)
	{
		return "accs";
	}
	else
	{return " ";}
	
	}
	
	
	//Generate the Random Password
	
	private String generateRandomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIKJLMNOPQRSTUWXYZ01234567890";
		char[] password = new char[length];
		for (int i=0;i<length;i++)
		{
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	
	
	//set Mailbox capacity
	public void seteMailboxCapacity(int capacity)
	{
	this.mailBoxCapacity = capacity;	
	}
	
	//set Alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword(String passwordCurrent)
	{
		
		this.password = passwordCurrent;
	}
	
	
	
	//getter methods for above setters
	public int getMailBoxCapacity()
	{
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}

	
	public String getChangePassword()
	
	{
		return password;
		
	}
	
	public String showInfo()
	{
		
	return "DISPLAY NAME: "+firstName+" "+lastName+
			"\nCOMPANY EMAIL: "+email+
			"\nMAILBOX CAPACITY: "+mailBoxCapacity+"mb";
	}
}

