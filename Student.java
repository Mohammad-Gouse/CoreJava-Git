import java.util.Scanner;

class Student
{
	public static void main(String[] args)
	{
		int id;
		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id: ");
		id = sc.nextInt();
		System.out.println("Enter student name: ");
		sname = sc.next();
		System.out.println("id: "+id);
		System.out.println("name: "+sname);
	}
}