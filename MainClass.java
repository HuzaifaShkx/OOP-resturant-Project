import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		McdonaldsLinkedlist a=new McdonaldsLinkedlist();
		Scanner s=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Enter 1 to insert Branch");
			System.out.println("Enter 2 to display Branch");
			System.out.println("Enter 3 to update Branch");
			System.out.println("Enter 4 to delete Branch");
			System.out.println("Enter 5 to insert Customer");
			System.out.println("Enter 6 to display Customer");
			System.out.println("Enter 7 to update Customer");
			System.out.println("Enter 8 to delete Customer");
			System.out.println("Enter 9 to insert Deal");
			System.out.println("Enter 10 to display Deal");
			System.out.println("Enter 11 to update Deal");
			System.out.println("Enter 12 to delete Deal");
			System.out.println("Enter 13 to insert Employee");
			System.out.println("Enter 14 to display Employee");
			System.out.println("Enter 15 to update Employee");
			System.out.println("Enter 16 to delete Employee");
			System.out.println("Enter 17 to insert Equipment");
			System.out.println("Enter 18 to display Equipment");
			System.out.println("Enter 19 to update Equipment");
			System.out.println("Enter 20 to delete Equipment");
			System.out.println("Enter 21 to exit");
			
			choice=s.nextInt();
			
			if(choice==1) {
				a.addBranch();
				
			}
			if(choice==2) {
						a.displaybranch();
					}
			
			if(choice==3) {
				int bid;
				System.out.println("Enter id to Update");
				bid=s.nextInt();
				a.updatebranch(bid);
			}
			if(choice==4) {
				int bid;
				System.out.println("Enter id to Delete");
				bid=s.nextInt();
				a.deletebranch(bid);
			}
			if(choice==5) {
				a.addcustomer();
				
			}
			if(choice==6) {
						a.displaycustomer();
					}
			
			if(choice==7) {
				int cid;
				System.out.println("Enter id to Update");
				cid=s.nextInt();
				a.updatecustomer(cid);
			}
			if(choice==8) {
				int cid;
				System.out.println("Enter id to Delete");
				cid=s.nextInt();
				a.deletecustomer(cid);
			}
			if(choice==9) {
				a.addDeal();
				
			}
			if(choice==10) {
						a.displaydeal();
					}
			
			if(choice==11) {
				int did;
				System.out.println("Enter id to Update");
				did=s.nextInt();
				a.updatedeal(did);
			}
			if(choice==12) {
				int did;
				System.out.println("Enter id to Delete");
				did=s.nextInt();
				a.deletedeal(did);
			}
			if(choice==13) {
				a.addemployee();
				
			}
			if(choice==14) {
						a.displayemployee();
					}
			
			if(choice==15) {
				int eid;
				System.out.println("Enter id to Update");
				eid=s.nextInt();
				a.updateemployee(eid);
			}
			if(choice==16) {
				int eid;
				System.out.println("Enter id to Delete");
				eid=s.nextInt();
				a.deleteemployee(eid);
			}
			if(choice==17) {
				a.addequip();
				
			}
			if(choice==18) {
						a.displayequip();
					}
			
			if(choice==19) {
				int eqid;
				System.out.println("Enter id to Update");
				eqid=s.nextInt();
				a.updateequip(eqid);
			}
			if(choice==20) {
				int eqid;
				System.out.println("Enter id to Delete");
				eqid=s.nextInt();
				a.deleteequip(eqid);
			}
		
		}while(choice!=21);
	}
}
