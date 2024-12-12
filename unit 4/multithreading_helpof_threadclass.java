/**
 * @(#)multithreading_helpof_threadclass.java
 *
 *
 * @author 
 * @version 1.00 2023/2/9
 */

class th1 extends Thread
{
	public void Run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("child thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child class exception"+e);
		}
	}
}
public class multithreading_helpof_threadclass 
{

    public static void main (String[] args) 
    {
		th1 t=new th1();
		System.out.println("Is Thread Alive :"+t.isAlive());
		t.start();
		System.out.println("Is Thread Alive :"+t.isAlive());
		try
		{
			for(int i=11;i<20;i++)
			{
				System.out.println("Main Thread :"+i);
				Thread.sleep(5000);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("main exception"+e);
		}
		System.out.println("Is Thread Alive :"+t.isAlive());
		
		try
		{
			for(int i=11;i<20;i++)
			{
				System.out.println("main thread"+i);
				Thread.sleep(5000);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("main exception"+e);
		}
		System.out.println("Is Thread Alive :"+t.isAlive());
    }
     
}