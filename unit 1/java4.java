/**
 * @(#)java4.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2022/12/22
 */


public class java4 {
	public static void main(String[] a)
	{
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] r:arr)
		{
			for(int c:r)
			{
				System.out.print(c + " ");
			}
			System.out.println("");
		}
	}
}