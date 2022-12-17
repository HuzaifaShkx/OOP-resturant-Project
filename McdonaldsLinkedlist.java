import java.util.Scanner;

public class McdonaldsLinkedlist {

	Nodebranch firstb=null;
	Nodedeal firstd=null;
	Nodeequip firste=null;
	Nodeemployee firstem=null;
	Nodecustomer firstc=null;
	
	//METHODS FOR BRANCH
	public void addBranch() {
		Nodebranch n=new Nodebranch();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter branch data");
		n.data.input();
		
		if(firstb==null) {
			firstb=n;
		}
		else {
			Nodebranch temp=firstb;
			Nodebranch pre=null;
			
			while(temp!=null) {
				if(n.data.bid<temp.data.bid) {
					break;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			if(firstb==temp) {
				n.nextaddress=firstb;
				firstb=n;
			}
			else if(temp==null) {
				pre.nextaddress=n;
			}
			else {
				n.nextaddress=temp;
				pre.nextaddress=n;	
			}			
		}
	}

	public void displaybranch() {
		if(firstb==null) {
			System.out.println("No branch found");
		}
		else{
			Nodebranch temp=firstb;
			while(temp!=null) {
				temp.data.print();
				temp=temp.nextaddress;
			}
		}
		
	}
	public void deletebranch(int v) {
		if(firstb==null) {
			System.out.println("No branch found");	
		}
		else {
			Nodebranch pre=null;
			Nodebranch temp=firstb;
			while(temp!=null) {
				if(temp.data.bid==v) {
					if(pre==null) {
						firstb=firstb.nextaddress;
					}
					else {
						pre.nextaddress=temp.nextaddress;
					}
					return;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
		}
			System.out.println("No branch found");
		
			
	}
	
	public void updatebranch(int b) {
		if(firstb==null) {
			System.out.println("No branch found");
		}
		else {
			Nodebranch temp=firstb;
			while(temp!=null) {
					if(b==temp.data.bid) {
					System.out.println("Update Branch information");
					temp.data.input();
					break;
					}
					else {
						temp=temp.nextaddress;
					}
				}
			System.out.println("Branch with this id does not exist");
		}
		
		}
	
	//Methods for Deals
	public void addDeal() {
		Nodedeal n=new Nodedeal();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Deal data");
		n.data.input();
		
		if(firstd==null) {
			firstd=n;
		}
		else {
			Nodedeal temp=firstd;
			Nodedeal pre=null;
			
			while(temp!=null) {
				if(n.data.dealno<temp.data.dealno) {
					break;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			if(firstd==temp) {
				n.nextaddress=firstd;
				firstd=n;
			}
			else if(temp==null) {
				pre.nextaddress=n;
			}
			else {
				n.nextaddress=temp;
				pre.nextaddress=n;	
			}			
		}
	}
	
	public void displaydeal() {
		if(firstd==null) {
			System.out.println("No deal found");
		}
		else{
			Nodedeal temp=firstd;
			while(temp!=null) {
				temp.data.print();
				temp=temp.nextaddress;
			}
		}
		
	}
	
	public void deletedeal(int v) {
		if(firstd==null) {
			System.out.println("No deal found");	
		}
		else {
			Nodedeal pre=null;
			Nodedeal temp=firstd;
			while(temp!=null) {
				if(temp.data.dealno==v) {
					if(pre==null) {
						firstd=firstd.nextaddress;
					}
					else {
						pre.nextaddress=temp.nextaddress;
					}
					return;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			System.out.println("No deal found");
		}		
	}
	
	public void updatedeal(int d) {
		if(firstd==null) {
			System.out.println("No deal found");
		}
		else {
			Nodedeal temp=firstd;
			while(temp!=null) {
				if(d==temp.data.dealno) {
				System.out.println("Update deal information");
				temp.data.input();
				
				break;
				}
				else {
					temp=temp.nextaddress;
				}
				}
			System.out.println("Deal with this id does not exist");
			}
	}

	
	//METHODS FOR EMPLOYEE
	
	public void addemployee() {
		Nodeemployee n=new Nodeemployee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee data");
		n.data.input();
		
		if(firstem==null) {
			firstem=n;
		}
		else {
			Nodeemployee temp=firstem;
			Nodeemployee pre=null;
			
			while(temp!=null) {
				if(n.data.emp_id<temp.data.emp_id) {
					break;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			if(firstem==temp) {
				n.nextaddress=firstem;
				firstem=n;
			}
			else if(temp==null) {
				pre.nextaddress=n;
			}
			else {
				n.nextaddress=temp;
				pre.nextaddress=n;	
			}			
		}
	}

	public void displayemployee() {
		if(firstem==null) {
			System.out.println("No employee found");
		}
		else{
			Nodeemployee temp=firstem;
			while(temp!=null) {
				temp.data.print();
				temp=temp.nextaddress;
			}
		}
		
	}
	public void deleteemployee(int v) {
		if(firstem==null) {
			System.out.println("No employee found");	
		}
		else {
			Nodeemployee pre=null;
			Nodeemployee temp=firstem;
			while(temp!=null) {
				if(temp.data.emp_id==v) {
					if(pre==null) {
						firstem=firstem.nextaddress;
					}
					else {
						pre.nextaddress=temp.nextaddress;
					}
					return;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			System.out.println("No employee found");
		}
			
	}
	
	public void updateemployee(int b) {
		if(firstem==null) {
			System.out.println("No employee found");
		}
		else {
			Nodeemployee temp=firstem;
			while(temp!=null) {
				if(b==temp.data.emp_id) {
				System.out.println("Update employee information");
				temp.data.input();
				break;
				}
				else {
					temp=temp.nextaddress;
				}
				}
			System.out.println("Employee with this id does not exist");
			}
	}
	
	//METHODS FOR EQUIPMENTS
	
	public void addequip() {
		Nodeequip n=new Nodeequip();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter equipment data");
		n.data.input();
		
		if(firste==null) {
			firste=n;
		}
		else {
			Nodeequip temp=firste;
			Nodeequip pre=null;
			
			while(temp!=null) {
				if(n.data.eqp_id<temp.data.eqp_id) {
					break;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			if(firste==temp) {
				n.nextaddress=firste;
				firste=n;
			}
			else if(temp==null) {
				pre.nextaddress=n;
			}
			else {
				n.nextaddress=temp;
				pre.nextaddress=n;	
			}			
		}
	}

	public void displayequip() {
		if(firste==null) {
			System.out.println("No equipment found");
		}
		else{
			Nodeequip temp=firste;
			while(temp!=null) {
				temp.data.print();
				temp=temp.nextaddress;
			}
		}
		
	}
	public void deleteequip(int v) {
		if(firste==null) {
			System.out.println("No equipment found");	
		}
		else {
			Nodeequip pre=null;
			Nodeequip temp=firste;
			while(temp!=null) {
				if(temp.data.eqp_id==v) {
					if(pre==null) {
						firste=firste.nextaddress;
					}
					else {
						pre.nextaddress=temp.nextaddress;
					}
					return;
				}
				pre=temp;
				temp=temp.nextaddress;
			}
			System.out.println("No equipment found");
		}
			
	}
	
	public void updateequip(int b) {
		if(firste==null) {
			System.out.println("No equipment found");
		}
		else {
			Nodeequip temp=firste;
			while(temp!=null) {
				if(b==temp.data.eqp_id) {
				System.out.println("Update Equipment information");
				temp.data.input();
				break;
				}
				else {
					temp=temp.nextaddress;
				}
				}
			System.out.println("Equipment with this id does not exist");
			}
	}
	
	//METHODS FOR CUSTOMER
		public void addcustomer() {
			Nodecustomer n=new Nodecustomer();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter customer data");
			n.data.input();
			
			if(firstc==null) {
				firstc=n;
			}
			else {
				Nodecustomer temp=firstc;
				Nodecustomer pre=null;
				
				while(temp!=null) {
					if(n.data.cid<temp.data.cid) {
						break;
					}
					pre=temp;
					temp=temp.nextaddress;
				}
				if(firstc==temp) {
					n.nextaddress=firstc;
					firstc=n;
				}
				else if(temp==null) {
					pre.nextaddress=n;
				}
				else {
					n.nextaddress=temp;
					pre.nextaddress=n;	
				}			
			}
		}
		
		public void displaycustomer() {
			if(firstc==null) {
				System.out.println("No customer found");
			}
			else{
				Nodecustomer temp=firstc;
				while(temp!=null) {
					temp.data.print();
					temp=temp.nextaddress;
				}
			}
			
		}
		
		public void deletecustomer(int v) {
			if(firstc==null) {
				System.out.println("No customer found");	
			}
			else {
				Nodecustomer pre=null;
				Nodecustomer temp=firstc;
				while(temp!=null) {
					if(temp.data.cid==v) {
						if(pre==null) {
							firstc=firstc.nextaddress;
						}
						else {
							pre.nextaddress=temp.nextaddress;
						}
						return;
					}
					pre=temp;
					temp=temp.nextaddress;
				}
				System.out.println("No customer found");
			}		
		}
		
		public void updatecustomer(int d) {
			if(firstc==null) {
				System.out.println("No customer found");
			}
			else {
				Nodecustomer temp=firstc;
				while(temp!=null) {
					if(d==temp.data.cid) {
					System.out.println("Update customer information");
					temp.data.input();
					break;
					}
					else {
						temp=temp.nextaddress;
					}
					}
				System.out.println("Customer with this id does not exist");
				}
		}

	
}
