import financetracker.Transaction;
import java.util.ArrayList;
import java.util.Scanner;
public class FinanceTracker{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Transaction>transactions = new ArrayList<>();	
		
		System.out.print("Enter your First name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Surname: ");
		String surname = sc.nextLine();
		System.out.println();
		
		System.out.println("Welcome to your Financial Tracker Buddy, " + name.toUpperCase() + " " + surname.toUpperCase());
		System.out.println("Choose an option");
		while(true){
		
		//System.out.println();
		System.out.println("\n === Personal Finance Tracker ===");
		System.out.println("1. Add Income");
		System.out.println("2. Add Expense");
		System.out.println("3. View balance");
		System.out.println("4. View Transaction");
		System.out.println("5. Exit ");
		
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice == 1){
			System.out.print("Add your monthly income: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Enter the description: ");
			String description = sc.nextLine();
			sc.nextLine();
			
			transactions.add(new Transaction("income", amount, description));
			System.out.println("Income Added");
		}
		else if(choice == 2){
			System.out.print("Add your expenses: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Enter the description: ");
			String description = sc.nextLine();
			sc.nextLine();
			
			transactions.add(new Transaction("expense", amount, description));
			System.out.println("Expenses Added");
		}
		else if(choice == 3){
			double balance = 0;
			for(Transaction t: transactions){
				if(t.type.equals("income")){
					balance += t.amount;
				}else{
					balance -= t.amount;
				System.out.println("Current Balance R" + balance);
				}
			}
		}
		else if(choice == 4){
			if(transactions.isEmpty()){
				System.out.println("No Transaction was made");
			}else{
				for(Transaction t: transactions){
					System.out.println(t.type.toUpperCase() + "| R" + t.amount + "|" + t.description.toUpperCase());
				}
			}
		}
		else if(choice == 5){
			System.out.println("Goodbye " + name + "!!!");
			break;
		}else{
			System.out.println("Invalid option");
		}
		
	}
	sc.close();
}
}