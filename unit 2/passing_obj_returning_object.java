/**
 * @(#)passing_obj_returning_object.java
 *
 *
 * @author 
 * @version 1.00 2022/12/28
 */


class test
{
	int a;
	test()
	{
		a=0;
	}
	test(int aa)
	{
		a=aa;
	}
	test sum(test tt)
	{
		test t=new test(0);
		t.a=a + tt.a;
		return t;
	}
	void disp()
	{
		System.out.println("a="+a);
	}
}

public class passing_obj_returning_object {

    public static void main (String[] args) 
	{
		test t1,t2,t3;
		
		t1=new test(40);
		t2=new test(20);
		t3=t1.sum(t2);
		
		t1.disp();
		t2.disp();
		t3.disp();
    }
    
    
}