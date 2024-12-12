/**
 * @(#)constructor_overloading.java
 *
 *
 * @author 
 * @version 1.00 2023/1/2
 */

class demo
{
	int rollno;
	String name;
	int age;
	demo(int srollno,String sname)
	{
		rollno=srollno;
		name=sname;
	}
	demo(int srollno,String sname,int sage)
	{
		rollno=srollno;
		name=sname;
		age=sage;
	}
	void disp()
	{
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}

public class constructor_overloading 
{
    public static void main (String[] args) 
    {
		demo d=new demo(1,"xyz");
		demo d1=new demo(2,"abc",24);
		d.disp();
		System.out.println("---------------------");
		d1.disp();
    }
    
    
}