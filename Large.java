import java.util.*;
class Large
{
	public static void main(String[] args)
	{
	int m,n,o;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value for m : ");
	m = sc.nextInt();
	System.out.print("Enter value for n : ");
	n = sc.nextInt();
	System.out.print("Enter value for o : ");
	o = sc.nextInt();

	//finding the largest num

	if(m>n && m>o)
	System.out.println("M is Largest value : "+m);

	else if(n>o && n>m)
	System.out.println("N is Largest value : "+n);

	else
	System.out.println("O is Largest value : "+o);
	
	}
}