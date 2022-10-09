import java.util.*;
class SumOf2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		System.out.println("Enter two numbers to find sum");
		do
		{
			System.out.println("Enter num1");
			a = sc.nextInt();
			System.out.println("Enter num2");	
			b = sc.nextInt();
			System.out.println("sum = "+(a+b));
			System.out.println("Press 'y' to continue or 'n' to stop");
			ch = sc.next().charAt(0);
			
		} while(ch == 'y' || ch == 'Y');
	}
}