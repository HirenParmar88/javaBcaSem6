/**
 * @(#)this_keyword_use.java
 *
 *
 * @author 
 * @version 1.00 2022/12/29
 */

class data
{
	int x,y;
	data()
	{
		x=0;
		y=0;
	}
	data(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

public class this_keyword_use {

    public static void main (String[] args) {
		data d=new data(1,2);
		d.disp();
    }
    
    
}