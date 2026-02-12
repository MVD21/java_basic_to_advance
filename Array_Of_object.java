import java.util.Scanner;
class Array_Of_object
{
	public static void main(String args[])
	{
		Student s[]=new Student[10];
		int i;
		for(i=0;i<3;i++)
		{
			s[i]=new Student();
			s[i].getData();
			s[i].cal();
		}
		System.out.println("Rollno\t"+"Name\t"+"M1\t"+"M2\t"+"M3\t"+"Total\t"+"Per\t");
		for(i=0;i<3;i++)
		{
			s[i].show();
		}
	}


}

class Student
{
	int rno,m1,m2,m3,total;
	String name;
	float per;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rollno:- ");
		rno=sc.nextInt();
		System.out.println("Enter a name:-  ");
		name=sc.next();
		System.out.println("Enter a marks M1:- ");
		m1=sc.nextInt();
		System.out.println("Enter a marks M2:- ");
		m2=sc.nextInt();
		System.out.println("Enter a marks M3:- ");
		m3=sc.nextInt();
	}
	void cal()
	{
		total=m1+m2+m3;
		per=(float)total/3;
	}

	void show()
	{
		System.out.println(rno+"\t"+name+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+per);
	}
}