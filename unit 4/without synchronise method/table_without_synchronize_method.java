/**
 * @(#)table.java
 *
 *
 * @author 
 * @version 1.00 2023/2/16
 */
class table
{
	void printable(int n)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n*i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class T1 extends Thread
{
	table t;
	T1(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(5);
	}
}

class T2 extends Thread
{
	table t;
	T2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(5);
	}
}

public class table_without_synchronize_method
{
    public static void main (String[] args) 
    {
		table tb=new table();
		T1 t1=new T1(tb);
		T2 t2=new T2(tb);
		t1.start();
		t2.start();
    }    
}