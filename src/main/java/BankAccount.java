package bank1;

public class BankAccount {

    private int balance;
    private int minBalance;
    
    /* accepts only balance above minBalance */
    public BankAccount(int balance,int minBalance) {
    	this.balance = balance;
    	this.minBalance = minBalance;
    }
    
    public int getBalance() {
        return balance;
    }

	public int getMinBalance() {
		return minBalance;
	}

	public void setBalance(int balance) {
		if(balance>minBalance) {
			this.balance = balance;
		}
	}
	
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public void deposit(int amount) {
        balance = balance + amount;
    }

    /* return true on success */
     public boolean transfer(BankAccount target, int amount) {
    	        if (withdraw(amount) == false)
    	            return false;
    	        target.deposit(amount);
    		  return true;
     }
     
     public String toString() {
         return "balance: " + balance;
     }

    
}
