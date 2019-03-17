package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private int mailBoxCapavity;
	private String alternateEmail;
	
	
	//Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email confirmed: "+this.firstName+" "+this.lastName);
		
		
		// call a method asking for a department name
		
		this.department = setDepartment();
		System.out.println("the choosen department is: "+ this.department);
	
		this.password = generateRandomPassword(defaultPasswordLength);
		System.out.println("the default password is: "+this.password);
	}
	
	

	
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.print("Enter the department code\n1 for Sales\n2 For Development \n3 for Accounting\n0 for none");
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
	
	
	
	
	//Set the mailbox capacity
	
	
	
	
	
	//Set alternate email
	
	
	
	//Change password
	

}

