import java.util.*;
public class AreaOfScalene
{
	public static void main(String args[])
	{
		double s1, s2, s3, s, area;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 3 sides of a triangle: ");
		s1=sc.nextDouble();
		s2=sc.nextDouble();
		s3=sc.nextDouble();
		s=(s1+s2+s3)/2;
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of Triangle= "+area);
	}
}