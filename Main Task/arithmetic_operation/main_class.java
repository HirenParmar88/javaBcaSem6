/**
 * @(#)main_class.java
 *
 *
 * @author 
 * @version 1.00 2023/1/17
 */

package arith_pack;

import java.util.Scanner;
public class main_class
{
   public static void main(String[] args)
   {
   		int choice;
   		arithmetic a = new arithmetic();
   		Scanner sc = new Scanner(System.in);
   		do
   		{
   			System.out.println("1 => Addition");
   			System.out.println("2 => Subtraction");
   			System.out.println("3 => Multipication");
   			System.out.println("4 => Division");
   			System.out.println("0 => Exit");
   			
   			System.out.print("Enter Choice : ");
   			choice = sc.nextInt();
   			
   			switch(choice)
   			{
   				case 1:
   						a.get();
   						a.add();
   						a.show();
   						break;
				case 2:
   						a.get();
   						a.sub();
   						a.show();
   						break;
   				case 3:
   						a.get();
   						a.mul();
   						a.show();
   						break;
   				case 4:
   						a.get();
   						a.div();
   						a.show();
   						break;
   				case 0:
   						System.out.println("Good Bye");
   						System.exit(0);
   						break;
   				default:
   						System.out.println("Wrong Choice");
   						break;
   			}
   		}while(choice != 0);
   }
}