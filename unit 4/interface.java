/**
 * @(#)interface.java
 *
 *
 * @author 
 * @version 1.00 2023/1/23
 */

interface myinterface
{
	int i=10;
	void method1();
	void method2();
}
class mainmethod implements myinterface
{
	public void method1()
	{
	//	i=15;
		System.out.println("this is method1="+i);
	}
	public void method2()				//testing remove
	{
		System.out.println("this is method2");
	}

    public static void main (String[] args) 
    {
		myinterface M=new mainmethod();
		M.method1();		//reference variable
		M.method2();
    }
}  
    
