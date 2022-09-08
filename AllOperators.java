class AllOperators
{
	static void arithmeticFun(int a, int b)
	{
		System.out.println("\nArithmetic Operators");
		System.out.println("addition: "+(a+b));
		System.out.println("subtraction: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		System.out.println("division: "+(a/b));
		System.out.println("Modulus: "+(a%b));
	}
	static void relationalFun(int a, int b)
	{
		System.out.println("\nRelational Operators");
		System.out.println("Greater than > : "+(a>b));
		System.out.println("Less than < : "+(a<b));
		System.out.println("Equal to == : "+(a==b));
		System.out.println("Not Equal to != : "+(a!=b));
	}
	static void assignmentFun(int a, int b)
	{
		System.out.println("\nAssignment Operators");
		System.out.println("a before assignment =  "+a);
		a = b;
		System.out.println("a after assignment=  "+a);
	}
	static void compoundFun(int a, int b)
	{
		System.out.println("\nCompound Operators");
		System.out.println("addition and assignment += : "+(a+=b));
		System.out.println("subtraction and assignment -= : "+(a-=b));
		System.out.println("multiplication and assignment *= : "+(a*=b));
		System.out.println("division and assignment /= : "+(a/=b));
		System.out.println("Modulus and assignment %= : "+(a%=b));
	}
	static void logicalFun(int a, int b, int c)
	{
		System.out.println("\nLogical Operators");
		System.out.println("Logical And && operator:"+(a>b && a<c));
		System.out.println("Logical Or || operator: "+(a>b || a<c));
		System.out.println("Logical not ! operator: "+( !(a>b) ) );
	}
	static void bitwiseFun(int a, int b, int c)
	{
		System.out.println("\nBitwise Operators");
		System.out.print("Bitwise & of a, b, c is: "); System.out.println(a&b&c);
		System.out.print("Bitwise | of a, b, c is: "); System.out.println(a|b|c);
		System.out.print("Bitwise ^ of a, b, c is: "); System.out.println(a^b^c);
		System.out.print("Bitwise << of a, c is: "); System.out.println(a<<c);
		System.out.print("Bitwise >> of a, b is: "); System.out.println(a>>b);
		System.out.print("Bitwise ~ c is: ");
		System.out.println(~c);
	}
	public static void main(String[] args)
	{
		arithmeticFun(20, 5);
		relationalFun(15, 35);
		assignmentFun(12, 19);
		compoundFun(4, 5);
		logicalFun(10, 20, 30);
		bitwiseFun(1, 2, 3);
	}
}