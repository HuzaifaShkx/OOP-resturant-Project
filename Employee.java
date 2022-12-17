import java.util.Scanner;
public class Employee {
	
	int emp_id;
	String ename;
	double salary;
	String econtact;
	Scanner sc=new Scanner(System.in);
	public void setemp_id() {
		System.out.println("Please enter employee id");
		emp_id=sc.nextInt();
		
	}

	public void getemp_id() {
	System.out.println("Employee id is :"+emp_id);
		
	}
	
	public void setename() {
		sc.nextLine();
		System.out.println("Please enter employee name");
		ename=sc.nextLine();
	
	}

	public void getename() {
		
		System.out.println("Employee name is :"+ename);
		
	}
	
	public void setsalary() {
		System.out.println("Please enter employee salary");
		salary=sc.nextDouble();
	}

	public void getsalary() {
		
		System.out.println("Employee salary is :"+salary);
		
	}
	
	public void setecontact() {
		sc.nextLine();
		System.out.println("Please enter employee contact");
		econtact=sc.nextLine();
	}

	public void getecontact() {
		
		System.out.println("Employee contact is :"+econtact);
		
	}
	
	public void input() {
		setemp_id();
		setename();
		setsalary();
		setecontact();
		
	}
	
	public void print() {
		getemp_id();
		getename();
		getsalary();
		getecontact();
		
	}
}
