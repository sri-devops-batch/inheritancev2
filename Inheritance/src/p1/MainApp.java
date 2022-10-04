package p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import m1.Accountant;
import m1.Developer;
import m1.Employee;
import m1.Project;
import m1.Marketing;
public class MainApp {

	Employee allEmployees[] = new Employee[4];
	int entryNumber = 0;
	public static void main(String[] args) {
		
		MainApp hrapp = new MainApp();
		
		hrapp.addEmployee();
		hrapp.addEmployee();
		hrapp.addEmployee();
		hrapp.addEmployee();
		hrapp.displayAllEmployee();
		
		
		/*
		System.out.println("1");
		int x = new Scanner(System.in).nextInt();
		System.out.println(" 2 where x :- "+x);
		Employee e = hrapp.getEmployeeByID(x); // 80
		System.out.println(" 3:- e is "+e);
		hrapp.doSomeWork(e);
		*/
	}//end main
	
	
	public void doSomeWork(Employee e)
	{
		System.out.println(" Inside do Some work and e is "+e);
		if(e != null)
		{
			e.getSalary();
		}
		
	}
	
	
	
	
	
	
	public void addEmployee()
	{
		System.out.println("\n------------------------------------------\n");
		System.out.println("Enter Employee Name ");
		String empName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Employee Id ");
		int empId = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Salary ");
		int salary = new Scanner(System.in).nextInt();
		
		Employee e = new Employee(empName,empId,salary);
		
		
		System.out.println(" Which employee type u want to add <1/3> : ");
		int empType = new Scanner(System.in).nextInt();
		
		if(empType == 1)
		{
			System.out.println("Enter File Name");
			String fileName = new Scanner(System.in).nextLine();
			
			
			Accountant a = new Accountant(e.getName(), e.getId(), e.getSalary(), fileName);
			allEmployees[entryNumber++] = a;
		}
		if(empType==2) {
			System.out.println("Enter emailId");
		String emailId=new Scanner(System.in).nextLine();
		
		Marketing m=new Marketing(e.getName(), e.getId(), e.getSalary(),emailId);
		
		}
		else if(empType == 3)
		{
			System.out.println("\n Enter Project Name ");
			String projectName = new Scanner(System.in).nextLine();
			
			System.out.println("Enter Project Id ");
			int projectid = new Scanner(System.in).nextInt();
			
			System.out.println("Enter Allocated Days ");
			int noOfDays = new Scanner(System.in).nextInt();
			
			System.out.println("Enter Client Name ");
			String clientName = new Scanner(System.in).nextLine();
			
			System.out.println("Enter Project Domain ");
			String domainName = new Scanner(System.in).nextLine();
			
			Project p = new Project(projectName, noOfDays, projectid, clientName, domainName);
			Developer d = new Developer(e.getName(), e.getId(), e.getSalary(), p);
			
			allEmployees[entryNumber++] = d;
		}

		
	}
	
	public void displayAllEmployee()
	{
		System.out.println("\n\n=========== Employee Details ==================================\n");
		for (Employee e : allEmployees) {
			System.out.println(e.getName()+" - "+e.getId()+" - "+e.getSalary());
			// System.out.println(e.getFileName()); // error e do not have fileName details 
		
			if(e instanceof Accountant)
			{
				Accountant a = (Accountant) e; // because account is the sub type , so type cast the employee object to fetch the records
				System.out.println("File Name is :- "+a.getFileName());
				a.workingOnFile();
			}
			if(e instanceof Developer)
			{
				Developer d = (Developer) e;
				Project p = d.getProject();
				LocalDate todayDate = LocalDate.now();
				LocalDate projectEndDate = todayDate.plusDays(p.getAllocatedDays());
				
				System.out.println(" Project Name : - "+p.getProjectName());
				System.out.println(" Project Start date  : - "+todayDate);
				System.out.println(" Project End Date  : - "+projectEndDate);
				System.out.println(" Project Execution Days  : - "+p.getAllocatedDays());
				
			}
			if(e instanceof Marketing) {
			Marketing m=(Marketing )e;
			System.out.println("emailId is:-"+m.getemailId());
			m.workingOnemailId();
			
		}
	}
	}
	
	public Employee getEmployeeByID(int searchId)
	{
		if(searchId<100)
			return null;
		else return new Employee();
	}
}