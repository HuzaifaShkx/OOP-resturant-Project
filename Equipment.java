import java.util.Scanner;
final public class Equipment {
	
	Scanner sc=new Scanner(System.in);
	
	int eqp_id;
	private String eqp_name;
	
	public void seteqp_id() {
		
		System.out.println("Please enter equipment ID");
		eqp_id=sc.nextInt();
	}
	public void seteqp_name() {
		sc.nextLine();
		System.out.println("Please enter equipment Name");
		eqp_name=sc.nextLine();
	}
	
	public void geteqp_id() {
		System.out.println("Equipment ID is :"+eqp_id);
		
	}

	public void geteqp_name() {
		System.out.println("Equipment Name is :"+eqp_name);
		
	}
	
	final public void input() {
		seteqp_id();
		seteqp_name();
	}

	final public void print() {
		geteqp_id();
		geteqp_name();
	}
}
