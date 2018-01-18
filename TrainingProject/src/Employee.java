import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String salary;
	private String grade;
	private Date joiningDate;
	private Employee emp;
	
	static long count =0;
	
	
	{ 
		// test comment new
		count++;
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
	public void setEmployee(Employee emp) {
		this.emp = emp;
		
		// TODO Auto-generated method stub
		
	}
	


	}
	
	
	
	
	
	

