/**
 * @(#)accending_name_comm_line.java
 *
 *
 * @author 
 * @version 1.00 2022/12/20
 */


public class accending_name_comm_line {

    public static void main (String[] args) {
		int i=0;
		int no=0;
		int length;
		
		for(i=0;i<=args.length;i++)
		{
			no+=Integer.parseInt(args[i]);
			
		}
		System.out.println(no);
    }
    
    
}