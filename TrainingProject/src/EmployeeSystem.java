import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeSystem {

	public static void main(String[] args)   {
	    
		Employee[] employeeList = new Employee[10];
		Contractor contractor = new Contractor();
		
		try {
			employeeList[0]=new TechnicalAssociatePermanent("jerry","max", "A", new DateFormat().convertor("05-07-1969"), 12213);
			employeeList[1]=new TechnicalAssociatePermanent("jerry","lauler", "A", new DateFormat().convertor("05-07-1969"), 1,3);
			employeeList[2]=contractor.addTechnicalAssociate("tom","marvin","A",new DateFormat().convertor("35-02-1969"),10.4,8);
			employeeList[3]=contractor.addTechnicalAssociate("justin","moulder","A",new DateFormat().convertor("35-02-1969"),39);
			employeeList[4]=new ProjectManager("jerry","max", "A", new DateFormat().convertor("05-07-1969"), 10);			
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	
		System.out.println(Employee.count);
		System.out.println("There are "+Contractor.countContractEmployee+ " contract employees");
		System.out.println("There are "+PermanentEmployee.countPermanentEmployee+ " permanent employees");	
		try {
			Employee retrievedEmployee =retrieveEmployee(5,employeeList);
			System.out.println("The employee's details are "+retrievedEmployee);
			
		} catch (EmployeeNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	private static Employee retrieveEmployee(int id, Employee[] employeeList) throws EmployeeNotFoundException {
		for(int i =0;i<employeeList.length-1;i++){
			if(employeeList[i]!=null&&employeeList[i].getUniqueId()==id){	
				System.out.println("The employee name of " +i+1+  " uniqueId is "+employeeList[i].getFirstName());	
				return employeeList[i];
			}
		}
			throw new EmployeeNotFoundException("Employee of this unique Id is not found");
	}

	private static Employee generateEmployee(Employee emp, Date date,
			double salary) {
		
		//emp.setGrade(grade);
		emp.setJoiningDate(date);
		emp.setSalary(salary);
			
	System.out.println(emp.getFirstName()+" "+emp.getGrade()+" "+ emp.getJoiningDate());
		
	return emp;
	}

}
