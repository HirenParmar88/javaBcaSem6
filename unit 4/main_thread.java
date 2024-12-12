/**
 * @(#)main_thread.java
 *
 *
 * @author 
 * @version 1.00 2023/2/9
 */


public class main_thread 
{
    public static void main (String[] args) 
    {
		Thread t=Thread.currentThread();
		System.out.println("main thread"+t);	//default call method .toString().
		t.setName("hiren");
		System.out.println("main thread"+t);
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("in main thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error Occured as"+e);
		}
    } 
}