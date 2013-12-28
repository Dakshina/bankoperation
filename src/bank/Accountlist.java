package bank;

public class Accountlist 
{
private static Account[] acc=new Account[10];
private static int listcounter=0;
public static void addAccount(Account accobj)
{
	if(listcounter<10)
	{
		acc[listcounter]=accobj;
		listcounter++;
	}
}
public static Account getAccount(int accountno)
{
	Account accobj=null;
	for(int i=0;i<10;i++)
	{
		if(acc[i].getAccountno()==accountno)
		{
			accobj=acc[i];
			break;
		}
		else
		{
			continue;
		}
		
	}
	return accobj;
}
}
