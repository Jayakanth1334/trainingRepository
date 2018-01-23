import java.util.Date;

public class ProjectManager extends PermanentEmployee {

	static long countPermanentEmployee = 0;
	private double salary;

	{
		// test comment new
		countPermanentEmployee++;
	}

	public ProjectManager(String firstName, String lastname, String grade, Date date, double salary) {
		super(firstName, lastname, grade, date, salary);
		getMclaim().setRate(100);

	}

	public ProjectManager(String firstName, String lastname, String grade, Date date, int year) {
		super(firstName, lastname, grade, date);
		this.setSalary(year);
		getMclaim().setRate(100);

	}

	public void setSalary(double year) {
		this.salary = year * 10000;
	}

	public double getSalary() {
		return salary;
	}

	public double calculateMediclain() {

		return getMclaim().mediclaimCalc(getSalary());
	}
	
	@Override
	public String[] retrieveListOfCertification() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return this.getFirstName() + "Medical Claim: " + this.calculateMediclain() 
		+ " Salary:" + this.getSalary()+ "Designation:PM";
	}

}