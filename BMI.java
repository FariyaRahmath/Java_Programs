import java.util.*;
public class BMI
{
	public static void main(String args[])
	{
		System.out.print("Enter your height and weight:");
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		int weight=sc.nextInt();
		double a=height*height;
		if ((weight/a)<19)
			System.out.println("You are Underweight.");
		else if ((weight/a)>=19 && ((weight/a)<=25))
			System.out.println("You are Healthy.");
		else if ((weight/a)>25)
			System.out.println("You are Overweight.");
		else
			System.out.println("Invalid Value Entered.");
	}
}