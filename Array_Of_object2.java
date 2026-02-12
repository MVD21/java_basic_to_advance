import java.util.Scanner;

class Array_Of_object2
{
	public static void main(String args[])
	{


	}

}

class Student_info
{
	int rno,m1,m2,m3,total;
	String fname,lname,div,class;
	float per;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Student Roll no:- ");
		rno=sc.nextInt();
		System.out.println("Enter a Student first Name:- ");
		fname=sc.next();
		System.out.println("Enter a Student Last Name:- ");
		lname=sc.next();
		System.out.println("Enter a Class :-  ");
		class=sc.next();
		System.out.println("Enter a Division :- ");
		lname=sc.next();
		System.out.println("Enter a Student M1 Marks :- ");
		m1=sc.nextInt();
		System.out.println("Enter a Student M2 Marks  :- ");
		m2=sc.nextInt();
		System.out.println("Enter a Student M3 Marks:- ");
		m3=sc.nextInt();

	}
	void cal()
	{
		total=m1+m2+m3;
		per=(float)total/3.0;
	}
	
	



}