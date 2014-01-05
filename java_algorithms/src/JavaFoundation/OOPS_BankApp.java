/*********************************************************************
 
 Description : demonstrates basic OOP syntax
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

	class BankAccount{
	
	private double balance;   // private member variable
	
	// methods in a class
	public BankAccount(double openingBalance) // constructor
		{
			balance = openingBalance;
			}
	
	public void deposit(double amount) // makes deposit
		{ 
			balance = balance + amount; 
			} 
	
	public void withdraw(double amount) // makes withdrawal
		{ 
			balance = balance - amount; 
			}
	
	public void display()		// displays balance
		{
			System.out.println("balance=" + balance);
			}
	} // end class BankAccount
	
	
	
	class OOPS_BankApp
	{
	public static void main (String[] args) {
	
		BankAccount acc1 = new BankAccount(100.00); // create acct
	
		System.out.print("Before transaction: ");
		acc1.display();			// display balance
		
		System.out.println();
	
		acc1.deposit(74.35);			// make deposit
	
		acc1.withdraw(20.00);	// make withdrawal	
		
		System.out.print("After transaction: ");
	
		acc1.display();		// display balance
	
		} // end main()
	} // end class BankApp