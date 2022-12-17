import java.util.Scanner;
final public class Branch {
	int bid;
	String blocation;
	
	Scanner sc=new Scanner(System.in);
	public void setbid() {
		
		System.out.println("Please enter the branch ID");
		bid=sc.nextInt();
	}

	public void getbid() {
		
		System.out.println("Branch ID is :"+bid);

	}
	
	public void setblocation() {
		sc.nextLine();
		System.out.println("Please enter the branch Location");
		blocation=sc.nextLine();
	}

	public void getblocation() {
		
		System.out.println("Branch location is :"+blocation);

	}
	
	final public void input() {
		setbid();
		setblocation();
	}
	
	final public void print() {
		getbid();
		getblocation();
	}
}
