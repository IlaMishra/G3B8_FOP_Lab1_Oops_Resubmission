package employee.email.service;
import employee.email.model.Employee;
public interface CredentialService {
	public String generateEmailAddress(Employee employee);
	public String generatePassword();
	public String showCredentials(Employee employee);
}
	

