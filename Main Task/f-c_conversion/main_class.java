/**
 * @(#)main_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/19
 */

package conversion;
import java.util.Scanner;

public class main_class
{
	public static void main(String[] args)
	{
		FtoC fc = new FtoC();
		CtoF cf = new CtoF();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("1 => Fahrenhit To Celsius");
			System.out.println("2 => Celsius To Fahrenhit");
			System.out.println("0 => Exit");
			
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						fc.get();
						fc.calculateC();
						fc.showC();
						break;
				case 2:
						cf.get();
						cf.calculateF();
						cf.showF();
						break;
				case 0:
						System.exit(0);
						break;
				default:
						System.out.println("Wrong Choice");
						break;
			}
		}while(choice != 0);
	}
}