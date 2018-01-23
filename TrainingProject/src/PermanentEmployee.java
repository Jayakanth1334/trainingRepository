import java.util.Date;

public class PermanentEmployee extends Employee {

	private Mediclaim mclaim = new Mediclaim();

	public Mediclaim getMclaim() {
		return mclaim;
	}

	public void setMclaim(Mediclaim mclaim) {
		this.mclaim = mclaim;
	}

	static long countPermanentEmployee = 0;

	{
		countPermanentEmployee++;
	}

	public PermanentEmployee(String fName, String lName, String grade, Date date, double salary) {
		this(fName, lName);
		this.setGrade(grade);
		this.setJoiningDate(date);
		this.setSalary(salary);
	}

	public PermanentEmployee(String firstName, String lastname) {
		super(firstName, lastname);

		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(String firstName, String lastname, String grade, Date date) {
		this(firstName, lastname);
		this.setGrade(grade);
		this.setJoiningDate(date);
		
	}

}
