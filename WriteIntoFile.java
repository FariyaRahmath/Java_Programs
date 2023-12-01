import java.io.*;
import java.util.*;
public class WriteIntoFile
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file to write: ");
		String fn=sc.next();
		FileWriter fw=new FileWriter(fn);
		PrintWriter pw=new PrintWriter(fw);
		while(true)
		{
			System.out.println("Enter the text to be written to the file: ");
			String s=sc.next();
			if(s.equals("quit"))
			{
				break;
			}
			else
			{
				pw.write(s);
			}
		}
	fw.close();
	}
}