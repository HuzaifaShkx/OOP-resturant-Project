import java.util.Scanner;
public class Deal {

	Scanner sc=new Scanner(System.in);
	int dealno;
	String dealname;
	
	public void setdealno() {
		
		System.out.println("Please enter deal Number");
		dealno=sc.nextInt();
	}
	public void setdealname() {
		sc.nextLine();
		System.out.println("Please enter deal name");
		dealname=sc.nextLine();
	}

	public void getdealno() {
		System.out.println("Deal noumber is :"+dealno);
		
	}
	
	public void getdealname() {
		System.out.println("Deal Name is :"+dealname);
		
	}
	
	final public void input() {
		setdealno();
		setdealname();
	}
	
	final public void print() {
		getdealno();
		getdealname();
	}
}
