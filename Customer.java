import java.util.Scanner;

public class Customer {

	int cid;
	String cname;
	String ccontact;
	Scanner sc=new Scanner(System.in);
	public void setcid() {
		System.out.println("Please enter customer id");
		cid=sc.nextInt();
		
	}

	public void getcid() {
	System.out.println("Customer id is :"+cid);
		
	}
	
	public void setcname() {
		sc.nextLine();
		System.out.println("Please enter Customer name");
		cname=sc.nextLine();
	
	}

	public void getcname() {
		
		System.out.println("Customer name is :"+cname);
		
	}

	public void setccontact() {
		sc.nextLine();
		System.out.println("Please enter Customer contact");
		ccontact=sc.nextLine();
	}

	public void getccontact() {
		
		System.out.println("Employee contact is :"+ccontact);
		
	}
	
	public void input() {
		setcid();
		setcname();
		setccontact();
		
	}
	
	public void print() {
		getcid();
		getcname();
		getccontact();
		
	}

}
