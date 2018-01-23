import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee implements Certification {
	
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private Date joiningDate;
	private long uniqueId;
	
	
	public Employee(String fName,String lName){
		this();
		this.firstName=fName;
		this.lastName=lName;
	}
	
	static long count =0;
	
	
	{ 
		// test comment new
		count++;
	}
	
	public Employee(){
		this.uniqueId = count;
		
	}
	
	
	public long getUniqueId() {
		return uniqueId;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
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
	
	
	
	
	
	

