package udemy09_Arraylist_Autoboxing_Unboxing;

import java.util.*;

public class Branches {

	private ArrayList<Customers> customers;
	private String branchname;
	
	public Branches(String branchname) {
		this.customers = new ArrayList<Customers>();
		this.branchname = branchname;
		System.out.println("Branch :" +branchname +" is added !");
	}

	
	public void printallcustomers() {
		
		System.out.println("Branch Name: " +this.branchname);
		
		for (int i=0;i<customers.size();i++) {
			System.out.println("Customer Name - " +this.customers.get(i).getName());
			customers.get(i).printtransactions();
		}
	}
	//private Customers customer;
	
	public void add(Customers customeradd) {
		int idx = getcustomerindex(customeradd);
		
		if (idx == -1) {
			this.customers.add(customeradd);
			System.out.println("Customer added !");
		}
		else {
			System.out.println("Customer name already taken");
		}
		
	}

	public void addtrans(Customers customer, double transactionamount) {
		
		int idx = getcustomerindex(customer);
		
		if (idx >=0 ) {
			this.customers.get(idx).addTransactions(transactionamount);
			System.out.println("Amount added !");
		}else {
			System.out.println("Customer not found");
		}
		
	}
	
	public int getcustomerindex(Customers customer) {
		
		for (int i=0;i<customers.size();i++) {
		
			if (customers.get(i).getName().equals(customer.getName())) {
			return i;
			}
		}
		
		return -1;
	}
	
	public Customers getcustomer(String name) {
		
		for (int i=0;i<customers.size();i++) {
			if (customers.get(i).getName().equals(name)) {
				return customers.get(i);
			}
		}
		return null;
	}
	
	public String getname() {
		return this.branchname;
	}
}






















