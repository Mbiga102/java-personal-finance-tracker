package financetracker;
public class Transaction{
	public String type, description;
	public double amount;
	
	public Transaction(String type, double amount, String description){
		this.type = type;
		this.description = description;
		this.amount = amount;
	}
	
}