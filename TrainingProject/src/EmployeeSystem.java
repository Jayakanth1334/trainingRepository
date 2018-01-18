import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeSystem {

	public static void main(String[] args) throws ParseException {
	    
		generateEmployee(new ContractEmployee("tom"), "jerry", "A", new DateFormat().convertor("05-07-1969"), "12213");
		//generateEmployee("kamal", "Hassan", "A", new DateFormat().convertor("05-07-1998"),"32323");	
		System.out.println(Employee.count);
		System.out.println(ContractEmployee.count);

	}

	private static void generateEmployee(Employee emp, String lastName, String grade, Date date,
			String salary) {
		
		
		emp.setFirstName(emp.getFirstName());
		emp.setLastName(lastName);
		emp.setGrade(grade);
		emp.setJoiningDate(date);
		emp.setSalary(salary);
		
	System.out.println(emp.getFirstName()+" "+emp.getGrade()+" "+ emp.getJoiningDate());
		

	}

}
