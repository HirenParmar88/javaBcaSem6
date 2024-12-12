/**
 * @(#)student_marksheet.java
 *
 *
 * @author Parag Chhatbar
 * @version 1.00 2023/1/3
 */

import java.util.Scanner;
class student
{
	int seat;
	String[] subject = {"Java","Oracle","Network Security","Project","EC","FC"};
	int[] mark = new int[6];
	int total=0;
	float per;
	char grade;
	
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Seat no : ");
		seat = sc.nextInt();
		for(int i=0;i<mark.length;i++)
		{
			System.out.print("Marks Of " + subject[i] + " : ");
			mark[i] = sc.nextInt();
		}
	}
	
	student calculateresult(student temp_ext)
	{
		student temp = new student();
		temp.seat=temp_ext.seat;
		temp.total = 0;
		for(int i=0;i<mark.length;i++)
		{
			temp.mark[i] = mark[i] + temp_ext.mark[i];
			temp.total += temp.mark[i];
		}
		temp.per = temp.total/7;
		
		if(temp.per>=70)
			temp.grade='A';
		else if (temp.per>=60)
			temp.grade = 'B';
		else if (temp.per>=50)
			temp.grade = 'C';
		else if(temp.per>=40)
			temp.grade = 'D';
		else
			temp.grade = 'F';
			
		return temp;
	}
	void show()
	{
		System.out.println("-------Student Marksheet--------");
		System.out.println("Seat No : " + seat);
		System.out.println(String.format("%10s","Subject") + "\tTotal Marks");
		System.out.println("---------------------------");
		for(int i=0; i<mark.length;i++)
		{
			System.out.println(String.format("%10s",subject[i]) + "\t" + mark[i]);
		}
		System.out.println("---------------------------");
		System.out.println(String.format("%10s","Grand Total : ") + total);
		System.out.println(String.format("%14s","Per : ") + per);
		System.out.println(String.format("%14s","Grade : ") + grade);
	}
}

public class student_marksheet {
	public static void main(String[] args)
	{
		student internal,external,result;
		
		System.out.println("Enter External Marks (out of 70)");
		external = new student();
		external.getdata();
		
		System.out.println("Enter Internal Marks (out of 30)");
		internal = new student();
		internal.getdata();
		
		result = internal.calculateresult(external); //get internal copy
		
		result.show();
	}
}