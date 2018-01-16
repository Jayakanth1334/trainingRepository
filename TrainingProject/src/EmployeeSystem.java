import java.util.ArrayList;
import java.util.List;

public class EmployeeSystem {

	public static void main(String[] args) {

	
		generateEmployee("tom", "jerry", "A", "December", "12213");
		generateEmployee("kamal", "Hassan", "A", "Novemeber","32323");
		
		System.out.println(Employee.count);

	}

	private static void generateEmployee(String firstName, String lastName, String grade, String joiningMonth,
			String salary) {

	

		Employee emp = new Employee();
		
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setGrade(grade);
		emp.setJoiningMonth(joiningMonth);
		emp.setSalary(salary);
		
	System.out.println(emp.getFirstName()+" "+emp.getGrade());
		

	}

}
