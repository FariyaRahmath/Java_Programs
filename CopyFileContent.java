import java.io.*;
import java.util.*;
public class CopyFileContent
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the source file: ");
		String sf=sc.next();
		System.out.println("Enter the destination file: ");
		String df=sc.next();
		FileInputStream fis = new FileInputStream(sf);
		FileOutputStream fos = new FileOutputStream(df);
			byte[] b=new byte[fis.available()];
				fis.read(b);
				fos.write(b);
				fos.close();
				fis.close();
	}
}