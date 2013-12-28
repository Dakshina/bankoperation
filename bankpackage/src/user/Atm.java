package user;
import bank.*;

public class Atm 
{
private int accountnumber;
private Account accountobj;
public Atm(int accountnum)
{
	System.out.println("Atm operation");
accountnumber=accountnum;
accountobj=Accountlist.getAccount(accountnumber);
}
public void atmWithdraw(int amt)
{
	accountobj.withdraw(amt);
	System.out.println("The Amount Withdraw="+amt+"Available Balance="+accountobj.getBalance());
}
public void atmBalance()
{
	System.out.println("Available Balance="+accountobj.getBalance());
}
}
