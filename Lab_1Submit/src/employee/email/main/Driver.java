package employee.email.main;

	import java.util.Scanner;

	import employee.email.model.Employee;
	import employee.email.service.CredentialService;
	import employee.email.service.CredentialServiceImpl;

	public class Driver {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			CredentialService service = new CredentialServiceImpl();
			
			Employee emp = new Employee("Ila", "Mishra");	
			System.out.println("Please Enter Department from the following: ");
			System.out.println("Technical");
			System.out.println("Admin");
			System.out.println("Human Resources");
			System.out.println("Legal");
			int choice = sc.nextInt();
			String department = null;
			switch(choice) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "legal";
				break;
			default:
				System.out.println("Please choose valid option");
			}
			if(department != null) {
				emp.setDepartment(department);
			}

				String emailAddress = service.generateEmailAddress(emp);
				emp.setEmailAddress(emailAddress);
				
				String password = service.generatePassword();
				emp.setPassword(password);
				
				service.showCredentials(emp);
			
		}

	}
