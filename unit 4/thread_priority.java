/**
 * @(#)thread_priority.java
 *
 *
 * @author 
 * @version 1.00 2023/2/15
 */


public class thread_priority extends Thread
{
	public void run()
	{
		System.out.println("Inside Run");
	}
    public static void main (String[] args) 
    {
		thread_priority t1=new thread_priority();
		thread_priority t2=new thread_priority();
		thread_priority t3=new thread_priority();
		
		System.out.println("Thread 1 Priority "+t1.getPriority());
		System.out.println("Thread 2 Priority "+t2.getPriority());
		System.out.println("Thread 3 Priority "+t3.getPriority());
		
		t1.setPriority(1);	//MIN_PRIORITY
		t2.setPriority(5);	//NORM_PRIORITY
		t3.setPriority(10);	//MAX_PRIORITY
		
		System.out.println("Thread 1 Priority"+t1.getPriority());
		System.out.println("Thread 2 Priority"+t2.getPriority());
		System.out.println("Thread 3 Priority"+t3.getPriority());
		
		System.out.println("Main Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Priority "+Thread.currentThread().getPriority());
    }
}