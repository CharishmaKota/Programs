import java.util.*;
class program
{
	public static void main(String args[])
	{
		System.out.println("enter the base");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		System.out.println("enter the exponent");
		int y=sc.nextInt();
		int z=x;
		for(int i=2; i<(y+1); i++)
		{
			x=(x*z);
		}
		System.out.println(x);
	}
} 