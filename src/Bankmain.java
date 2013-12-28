import bank.*;
import user.*;
public class Bankmain 
{
	public static void main(String[] args)
	{
		Account accobj=new Account(1000,"Dakshina");
		Account accobj1=new Account("Dakshina");
		Accountlist.addAccount(accobj);
		Accountlist.addAccount(accobj1);
		Atm atmobj=new Atm(101);
		atmobj.atmBalance();
		NB nbobj=new NB(102);
		//nbobj.nbDeposit(2000);
		nbobj.nbBalance();
		//System.out.println("Account Details"+Accountlist.getAccount(101));
	}
}
