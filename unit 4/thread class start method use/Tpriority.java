/**
 * @(#)Tpriority.java
 *
 *
 * @author 
 * @version 1.00 2023/2/15
 */


public class Tpriority implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
    public static void main (String[] args) 
    {
		Tpriority T=new Tpriority();
		
		Thread t1=new Thread(T,"One");
		Thread t2=new Thread(T,"Two");
		Thread t3=new Thread(T,"Three");
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
    }   
}