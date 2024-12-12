/**
 * @(#)FtoC.java
 *
 *
 * @author 
 * @version 1.00 2023/1/19
 */

package conversion;
import java.util.Scanner;
public class FtoC
{
	float f,c;
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		
		System.out.print("Enter Fahrenheit : ");
		f=sc.nextFloat();
	}
	void calculateC()
	{
		c = ((f-32)*5)/9;
	}
	void showC()
	{
		System.out.println("Celsius : " + c);
	}
}