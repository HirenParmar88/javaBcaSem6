/**
 * @(#)cmd2.java
 *
 *
 * @author 
 * @version 1.00 2022/12/20
 */

import java.util.*;
public class cmd2 {

    public static void main (String[] args) {
    	int i=0;
    	String str;
    	int length;
    	
    	for(i=0;i<args.length;i++)
    	{
    		Integer.parseInt(args[i]);
    		System.out.println("args["+i+"]:"+args[i]);
    	}
    }
    
    
}