package pattern;
import java.util.Scanner;
public class TablePrint
{
   public static void main(String[] args)
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to print its table : ");
		n = sc.nextInt();	
		System.out.print("Enter the limit for table : ");
		m = sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			System.out.print("\n"+n);
			System.out.print("*"+i);
			System.out.print(" = "+n*i);
			sc.close();
		}
	}
}
