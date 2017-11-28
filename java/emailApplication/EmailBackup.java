package emailApplication;

import java.util.Scanner;

public class EmailBackup {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity;
    private String alternateEmail;
	private String email;
	private String companyName = "am-group.com";

	// constructor to receive firstName and lastName
	public EmailBackup(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED : " + this.firstName + " " +
		// this.lastName);

		// call the method which sets the department and returns department
		this.department = setDepartment();
		//System.out.println("Department : " + this.department);

		// call the method which generates random password
		this.password = setPassword(defaultPasswordLength);
		//System.out.println("Your Password is : " + this.password);

		// combine variables to make the whole email structure
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName;
		//System.out.println("Your Emmail Address is " + email);

		// set the email capacity
		setCapacity(500);
				
	}

	// Ask for the department
	public String setDepartment() {
		String depID = "";
		System.out.println(
				"Department Ids\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter deparment code:");
		Scanner scan = new Scanner(System.in);

		int depChoice = scan.nextInt();
		if (depChoice == 1) {
			depID = "Sales";
		} else if (depChoice == 2) {
			depID = "Development";
		} else if (depChoice == 3) {
			depID = "Accounting";
		} else if (depChoice == 4) {
			depID = "NONE";
		}
		scan.close();
		return depID;

	}

	// Generate a random password
	public String setPassword(int length) {
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] passWord = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passSet.length());
			passWord[i] = passSet.charAt(rand);
		}
		return new String(passWord);
	}
	// Set mailbox capacity
	public void setCapacity(int capacity){
		this.mailboxCapacity=capacity;
	}
	// Set the alternate email
	public void setAlternateEmail(String alternate){
		this.alternateEmail=alternate;
	}
	// Change the password
	public void changePassword(String password){
		this.password=password;
	}

	public int getMailboxCapacity(){
		return this.mailboxCapacity;
	}
	public String getPassword(){
		return this.password;
	}
	public String getEmail(){
		return this.email;
	}
	public String getAlternateEmail(){
		return this.alternateEmail;
	}
	public String getDepartment(){
		return this.department;
	}
	
	public String getEmployeeInfo(){
		return "Name : " + firstName+"."+lastName+
				"\nCompany Email : " + email+
				"\nInitial Password : "+ password+
				"\nMailBox Capacity : " +mailboxCapacity+"MB";
	}
}
