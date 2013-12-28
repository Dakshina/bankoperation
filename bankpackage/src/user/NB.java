package user;
import bank.*;

public class NB 
{
private int accountnumber;
private Account accountobj;
public NB(int accountnum)
{
	System.out.println("Net Banking");
	accountnumber=accountnum;
	accountobj=Accountlist.getAccount(accountnumber);
}
public void nbWithdraw(int amt)
{
	accountobj.withdraw(amt);
	System.out.println(accountobj.getName()+"AccountNo:"+accountobj.getAccountno()+"The Amount Withdraw="+amt+"\n"+"Available Balance="+accountobj.getBalance());
}
public void nbDeposit(int amt)
{
	accountobj.deposit(amt);
	System.out.println(accountobj.getName()+"\t"+"AccountNo:"+accountobj.getAccountno()+"\t"+"The Amount depoist="+amt+"\n"+"Available Balance="+accountobj.getBalance());
}
public void nbBalance()
{
	System.out.println(accountobj.getName()+"\t"+"AccountNo:"+accountobj.getAccountno()+"\t"+"Available Balance="+accountobj.getBalance());
}
}
