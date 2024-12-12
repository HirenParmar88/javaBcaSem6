/**
 * @(#)cmd3.java
 *
 *
 * @author 
 * @version 1.00 2022/12/20
 */

import java.util.*;
public class cmd3 {

    public static void main (String[] args) {
		int total=0;
		int length;
		
		for(int i=0;i<args.length;i++)
		{
			total+=Integer.parseInt(args[i]);
		}
		System.out.println(total);
    }
      
}