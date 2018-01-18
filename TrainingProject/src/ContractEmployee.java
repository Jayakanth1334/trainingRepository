import java.text.SimpleDateFormat;
import java.util.Date;

public class ContractEmployee extends Employee {
	
	private String firstName;
	private String lastName;
	private String salary;
	private String grade;
	private Date joiningDate;
	
	static long countContractEmployee =0;
	
	
	{ 
		// test comment new
		countContractEmployee++;
	}
	
	
	public ContractEmployee(String firstName) {
		this.firstName = firstName;
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getJoiningDate() {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		return sdf.format(joiningDate);
	}
	
	public long getCount() {
		return count;
	}
	public void setJoiningDate(Date date) {
		// TODO Auto-generated method stub
		this.joiningDate = date;
	}
	
	
	
	
	
	
	

}
