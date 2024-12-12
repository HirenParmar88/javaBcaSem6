/**
 * @(#)CtoF.java
 *
 *
 * @author 
 * @version 1.00 2023/1/19
 */

/**
 * @(#)FtoC.java
 *
 *
 * @author 
 * @version 1.00 2023/1/19
 */

package conversion;
import java.util.Scanner;

public class CtoF
{
	float f,c;
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		System.out.print("Enter Celsius : ");
		c=sc.nextFloat();
	}
	void calculateF()
	{
		f = ((c*9)/5) + 32;
	}
	void showF()
	{
		System.out.println("Fahrenhit : " + f);
	}    
}