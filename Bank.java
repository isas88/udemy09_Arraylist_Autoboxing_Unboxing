package udemy09_Arraylist_Autoboxing_Unboxing;

import java.util.*;


public class Bank {

	private ArrayList<Branches> branches;
	
	public Bank() {
		this.branches = new ArrayList<Branches>();
	}
	
	public void addbranch(String name) {
		this.branches.add(new Branches(name));
		
	}
	
	public void addcustomer(Branches branches, Customers customer) {
		
		int idx = getbranchindex(branches);
		
		if (idx>=0) {
			this.branches.get(idx).add(customer);
		}else {
			System.out.println("Branch name not available");
		}
				
		}
	
	public void addtransactions(Branches branches, Customers customer, double transaction) {
		
		int idx = getbranchindex(branches);
		
		if (idx>=0) {
			this.branches.get(idx).addtrans(customer, transaction);
		}else {
			System.out.println("Branch name not available");
		}
	}
	
	public int getbranchindex(Branches branch) {
		
		for (int i=0;i<branches.size();i++) {
			if (branches.get(i).getname().equals(branch.getname())) {
				return i;
			}
		}
		
		return -1;
	}
	

	public Branches getBranches(String name) {
		
		for (int i=0;i<branches.size();i++) {
			if (branches.get(i).getname().equals(name)) {
				return branches.get(i);
			}
		}
		return null;
	}
		
	
	public void setBranches(ArrayList<Branches> branches) {
		this.branches = branches;
	}
	
	public void printallbranches() {
		
		for (int i=0;i<branches.size();i++) {
			System.out.println(i+1 +" :" +branches.get(i).getname());
		}
	}
	
	public void printall() {
		
		System.out.println("*******  Printing all Bank details ********  ");
		
		for (int i=0;i<branches.size();i++) {
			System.out.println(i+1 +" :" +branches.get(i).getname());
			branches.get(i).printallcustomers();
			System.out.println(" ");
		}
	}
	
	
}





























