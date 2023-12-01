import java.io.*;
import java.util.*;
public class FileOrDirectory
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a file: ");
		String fn=sc.next();
		File f=new File(fn);
		if (f.isFile())
			System.out.println("It is a file.");
		else
			System.out.println("It is NOT a File.");
		if (f.isDirectory())
			System.out.println("It is a Directory.");
		else
			System.out.println("It is NOT a Directory.");
	}
}