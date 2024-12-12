/**
 * @(#)join_method.java
 *
 *
 * @author 
 * @version 1.00 2023/2/14
 */
 
import java.io.*;
class Threadclass extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<2;i++)
			{
				Thread.sleep(500);
				System.out.println("Child Thread="+Thread.currentThread().getName());
				System.out.print(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

 class join_method 
{

    public static void main (String[] args) 
    {
		Threadclass t1=new Threadclass();
		Threadclass t2=new Threadclass();
		Threadclass t3=new Threadclass();
		
		t1.start();
		try
		{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
			t1.join();		//thread join
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		t2.start();
		try
		{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
			t2.join();		//thread join
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		t3.start();
		try
		{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);
			t3.join();		//thread join
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
     
}