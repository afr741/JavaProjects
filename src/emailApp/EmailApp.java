package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter first name");
	Scanner in = new Scanner(System.in);
	String firstN = in.nextLine();
	System.out.println("Enter last name");
	Scanner in1 = new Scanner(System.in);
	String lastN = in.nextLine();
	
		Email em1 = new Email(firstN, lastN);
	System.out.println(em1.showInfo());
	}

}
