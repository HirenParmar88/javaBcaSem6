/**
 * @(#)multilevel_inheritance.java
 *
 *
 * @author 
 * @version 1.00 2023/1/10
 */
class A
{
	int i;
	void putd()
	{
		System.out.println("i="+i);
	}	
}
class B extends A
{
	int j;
	void putd2()
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}
class C extends B
{
	int k;
	void putd3()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
			
	}
}
public class multilevel_inheritance 
{

    public static void main (String[] args) 
    {
		C obj=new C();
		obj.i=10;
		obj.j=20;
		obj.k=30;
		
		obj.putd();
		obj.putd2();
		obj.putd3();
    }
    
    
}