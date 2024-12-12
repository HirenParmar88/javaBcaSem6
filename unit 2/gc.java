/**
 * @(#)gc.java
 *
 *
 * @author 
 * @version 1.00 2023/1/2
 */


class gcclass
{
	int i;
	
	public void finalize()
	{
		System.out.println("Finalize Executed !!!");
	}
	
    public static void main (String[] args) 
    {
		gcclass g=new gcclass();
		g.i=100;
		System.out.println("g.i="+g.i);
		g=null;
		System.gc();
    }

}