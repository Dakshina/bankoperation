package bank;

public class Account 
{
	private int balance;
	private String name;
	private int accountno;
	private static int counter=100;
	public  Account(String accname)
	{
		balance=0;
		name=accname;
		counter++;
		accountno=counter;
	}
	public Account(int bal,String accname)
	{
		counter++;
		balance=bal;
		name=accname;
		accountno=counter;
		
	}
	public int withdraw(int wd)
	{
		if(balance>wd && wd>0)
		{
			balance=balance-wd;
			return balance;

		}
		else
		{
			System.out.println("Sorry your balance is low");
			return balance;
		}
	}
	public int deposit(int de)
	{
		if(de>0)
		{
			balance=balance+de;
			return balance;
		}
		else
		{
			System.out.println("Sorry the amount entered is not valid to Deposit");
			return balance;
		}
	}
	public int getBalance()
	{
	return this.balance;
			}
	public String getName()
	{
		return this.name;
	}
	public int getAccountno()
	{
		return this.accountno;
	}

}
