package udemy09_Arraylist_Autoboxing_Unboxing;

import java.util.*;

public class Customers {

	private ArrayList<Double> transactions = new ArrayList<Double>();
	private String name;
	
	public Customers(String name, ArrayList<Double> transactions) {
		this.name = name;
		this.transactions = transactions;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void addTransactions(Double transactions) {
		if (transactions.doubleValue() == 0 ) {
			System.out.println("0 is an invalid amount, please enter correct transaction amount ");
		}else {
			this.transactions.add(transactions);
			System.out.println("Transaction $" +transactions.doubleValue() +" is added !");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printtransactions() {
		for (int i=0;i<transactions.size();i++) {
			System.out.println("Transaction " +i+1 +": " +transactions.get(i).doubleValue()); 
		}
	}
	
	 
}
