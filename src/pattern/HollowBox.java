package pattern;
import java.util.Scanner;
public class HollowBox 
  {
        public static void main(String[] args) 
	{
		int n, m, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows n: ");
		n = sc.nextInt();	
		System.out.print("Enter Number of columns m: ");
		m = sc.nextInt();		
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= m; j++)
			{
				if(i == 1 || i == n || j == 1 || j == m)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		}	
		}
	}