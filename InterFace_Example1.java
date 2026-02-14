import java.util.Scanner;
interface i1
{
	double pi=3.14; //without final it is final value of this variable
	void area();
}
class Demo8 implements i1
{
	Scanner sc=new Scanner(System.in);
	double a,r;
	void getData()
	{
		System.out.println("Enter a Redius:- ");
		r=sc.nextDouble();
		//pi=23.45;
	}

	public void area()
	{
		a=pi*r*r;
	}
	void show()
	{
		System.out.println("Redius:- "+r);
		System.out.println("Area:- "+a);
	}
}

class InterFace_Example1
{
	public static void main(String args[])
	{
		Demo8 d8=new Demo8();
		d8.getData();
		d8.area();
		d8.show();
	}
}