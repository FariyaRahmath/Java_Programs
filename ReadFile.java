import java.io.*;
import java.util.*;
public class ReadFile
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file to read: ");
		String fn=sc.next();
		FileInputStream fis=new FileInputStream(fn);
		int ch;
		while(true)
		{
			ch=fis.read();
			if(ch!=-1)
			{
				System.out.print((char)ch);
			}
			else
			{
				System.out.println("\nFile is empty or does not exist.");
				break;
			}
		}
		fis.close();
	}
}