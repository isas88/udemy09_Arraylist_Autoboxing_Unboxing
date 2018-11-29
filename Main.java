package udemy09_Arraylist_Autoboxing_Unboxing;

import java.util.ArrayList;

public class Main {

	public Main() {
	}

		//Bank bank = new Bank();
	
		public static void main(String[] args) {
		
		Bank bank = new Bank();
		double initialamt = 200.00; 
		
		//Add branches		
		bank.addbranch("Bank Of America");
		bank.addbranch("Chase");
		
		//add customer
		addcustomer(bank,"Bank Of America","Sasi",initialamt);
		addcustomer(bank,"Bank Of America","Jan",initialamt);
		addcustomer(bank,"Bank Of America","Disha",initialamt);
		addcustomer(bank,"Chase","Disha",initialamt);
		addcustomer(bank,"Bank","Disha",initialamt);

		addtransaction(bank,"Chase","Disha",100000.99);
		addtransaction(bank,"Bank Of America","Sasi",0.00);
		
		System.out.println(" ");
		bank.printall();
		
	}
	
	public static void addcustomer(Bank bank, String name, String custname, double amount) {
		
		if (bank.getBranches(name)!= null) {
			Branches branch = bank.getBranches(name);
			ArrayList<Double> transactions = new ArrayList<Double>();
			transactions.add(amount);
			Customers customer = new Customers(custname,transactions); 
			
			bank.addcustomer(branch, customer);
		}else {
			System.out.println("Incorrect Bank name : " +name);
		}
		
	}
	
	public static void addtransaction(Bank bank, String name,String custname, Double amount) {
	
		if (bank.getBranches(name).getcustomer(custname) != null) {
			bank.getBranches(name).getcustomer(custname).addTransactions(Double.valueOf(amount));
		}else {
			System.out.println("Incorrect Bank/Customer name");
		}
		
		//Branches branch = bank.getBranches(name);
		
	}
	
	
	
	
	
}
