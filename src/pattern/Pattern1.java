package pattern;
import java.util.Scanner;
public class Pattern1 
{

	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number n: ");/* no of rows and columns*/
		int n = scan.nextInt();
	    System.out.print("Printing the pattern \n");
	    for (int i = 1; i <= n; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.print("\n");
	            scan.close();
	 }
	}
}