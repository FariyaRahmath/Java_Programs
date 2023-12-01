public class PerfectSquare
{
	public static void main(String args[])
	{
		for (int i=32; i<=99; i++)
		{
			int ps=i*i;
			int d1=(ps/100)/10;
			int d2=(ps/100)%10;
			int d3=(ps%100)/10;
			int d4=(ps%100)%10;
			if (d1==d2 && d3==d4)
			{
				System.out.println("Perfect Square Number: "+ps);
			}
		}
	}
}