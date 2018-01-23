import java.text.SimpleDateFormat;
import java.util.Date;

public class Contractor {

	private double ratePerHour;

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	static long countContractEmployee = 0;
	static long countTechnicalAssociate = 0;

	/*
	 * { countContractEmployee++; }
	 */

	Employee addTechnicalAssociate(String fName, String lName, String grade, Date date, double rate, int noHour) {

		return this.new TechnicalAssociate(fName, lName, grade, date, rate, noHour);

	}

	public class TechnicalAssociate extends ContractBasedEmployee {

		private double salary;
		private double wage = 100;

		{

			countTechnicalAssociate++;
		}

		public TechnicalAssociate(String firstName, String lastName, String grade, Date date, double rate, int noHour) {

			super(firstName, lastName, grade, date, rate, noHour);

		}

		public TechnicalAssociate(String fName, String lName, String grade, Date date, double hour) {
			super(fName, lName, grade, date);
			this.setSalary(hour);

			// TODO Auto-generated constructor stub
		}

		public void setSalary(double hour) {
			if (hour <= 40) {
				this.salary = wage * hour;
			} else {
				this.salary = wage * 40 + (hour - 40) * wage * 2;

			}

		}

		public double getSalary() {
			// TODO Auto-generated method stub

			return salary;
		}
		
		@Override
		public String[] retrieveListOfCertification() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String toString() {
			return this.getFirstName() + "Medical Claim: " + " Salary:" + this.getSalary();
		}

		

	}

	public abstract class ContractBasedEmployee extends Employee {

		private int noHours;

		public int getNoHours() {
			return noHours;
		}

		public void setNoHours(int noHours) {
			this.noHours = noHours;
		}

		{
			// test comment new
			countContractEmployee++;
		}

		public ContractBasedEmployee(String firstName, String lastName, String grade, Date date, double rate,
				int noHours) {
			setFirstName(firstName);
			setLastName(lastName);
			setGrade(grade);
			setJoiningDate(date);
			setRatePerHour(rate);
			setNoHours(noHours);

		}

		public ContractBasedEmployee(String fName, String lName, String grade, Date date) {
			// TODO Auto-generated constructor stub
			setFirstName(fName);
			setLastName(lName);
			setGrade(grade);
			setJoiningDate(date);

		}

		public long getCount() {
			return count;
		}

		@Override
		public double getSalary() {
			// TODO Auto-generated method stub
			double sal = noHours * Contractor.this.ratePerHour;
			return sal;
		}

		@Override
		public String toString() {
			return this.getFirstName() + "Medical Claim: " + " Salary:" + this.getSalary();
		}

	}

	public Employee addTechnicalAssociate(String fName, String lName, String grade, Date date, double hour) {
		// TODO Auto-generated method stub

		return this.new TechnicalAssociate(fName, lName, grade, date, hour);
	}

}
