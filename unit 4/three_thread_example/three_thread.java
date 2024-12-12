/**
 * @(#)three_thread.java
 *
 *
 * @author 
 * @version 1.00 2023/2/13
 */

class th1 implements Runnable
{
	th1(String str)
	{
		Thread t=new Thread(this,str);
		System.out.println(t);
		t.start();
		System.out.println("thread 1 created.");
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread 1 :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class th2 implements Runnable
{
	th2(String str)
	{
		Thread t=new Thread(this,str);
		System.out.println(t);
		t.start();
		System.out.println("thread 2 created.");
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread 2 :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class th3 implements Runnable
{
	th3(String str)
	{
		Thread t=new Thread(this,str);
		System.out.println(t);
		t.start();
		System.out.println("thread 3 created.");
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread 3 :"+i);
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
		new th1("one");
		new th2("two");
		new th3("three");
    }
    
    
}