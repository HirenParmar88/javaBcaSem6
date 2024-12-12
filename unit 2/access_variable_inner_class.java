/**
 * @(#)access_variable_inner_class.java
 *
 *
 * @author 
 * @version 1.00 2022/12/29
 */


class outer
{
		int x=100;
		void test()
		{
			Inner i=new Inner();
			i.y=200;
			i.disp();
		}
		class Inner
		{
			int y;
			void disp()
			{
				System.out.println("x="+x);
				System.out.println("y="+y);
			}
		}
}

public class access_variable_inner_class {

    public static void main (String[] args) {
		outer o=new outer();
		o.test();
    }
    
    
}