package emailApplication;

public class EmailApp {
	
	/**
	 * Scenario : you are an IT support administrator specialist and are charged to create email 
	 *            accounts for new hired employees.
	 *  
	 *  Your application should do the following:
	 *          1. Generate an email with the following syntax ( firstName.lastName@department.company.com
	 *          2. Determine the department (sales, development, accounting), if non leaves blank.
	 *          3. Generate a random string for a password.
	 *          4. Have set method to change the password and set the mailbox capacity, and define alternate email address.
	 *          5. Have get method the display the name, email and capacity.
	 *          
	 *          
	 */

	public static void main(String[] args) {
		
		EmailBackup em1 = new EmailBackup("Jhon", "Smith");
		System.out.println(em1.getEmployeeInfo());
		

	}

}
