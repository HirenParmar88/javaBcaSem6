/**
 * @(#)three_thread.java
 *
 *
 * @author 
 * @version 1.00 2023/2/14
 */

class threadclass implements Runnable
{
	String str;
	Thread t;
	threadclass(String thnm)
	{
		str=thnm;
		t=new Thread(this,str);
		System.out.println("Thread Name="+t);	//thread name variable
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
}

public class three_thread 
{

    public static void main (String[] args) 
    {
		new threadclass("One");
		new threadclass("Two");
		new threadclass("Three");
		try
		{
			Thread.sleep(20000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }    
    
}