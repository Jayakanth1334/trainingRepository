import java.util.Date;

public class TechnicalAssociatePermanent extends PermanentEmployee {

	static long countPermanentEmployee = 0;
	private Object salary;

	{
		// test comment new
		countPermanentEmployee++;
	}

	public TechnicalAssociatePermanent(String firstName, String lastname, String grade, Date date, double salary) {
		super(firstName, lastname, grade, date, salary);
		getMclaim().setRate(200);

	}
	
	public TechnicalAssociatePermanent(String firstName, String lastname, String grade, Date date, int year, int certifications) {
		super(firstName, lastname, grade, date);
		this.setSalary(year,certifications);
		getMclaim().setRate(200);

	}
	
	public void setSalary(int year,int certifications) {
		this.salary = 5000*year +1000*certifications;
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
        return this.getFirstName()+"Medical Claim: "
	+this.calculateMediclain()+" Salary:"+this.getSalary();
    }
}