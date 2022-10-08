import java.util.*;
class ReverseNumber{
	public static void main(String[] args)
	{
	int num, r, rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num : ");
	num=sc.nextInt();
	while(num>0)
	{
	r=num%10;
	rev=rev*10+r;
	num=num/10;
	}
	System.out.println("Reverse of Number : "+rev);
	}
}