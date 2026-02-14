// reference of Interface which can consider only their on methods 

import java.util.Scanner;
interface i5
{
	double pi=3.14; //without final it is final value of this variable
	void area();
	void display();
	void getData();
	void show();
}
abstract class Demo12 implements i5
{
	Scanner sc=new Scanner(System.in);
	double a,r;
	public void getData()
	{
		System.out.println("Enter a Redius:- ");
		r=sc.nextDouble();
		//pi=23.45;
	}

	public void area()
	{
		a=pi*r*r;
	}
	public void show()
	{
		System.out.println("Redius:- "+r);
		System.out.println("Area:- "+a);
	}
}
class Demo13 extends Demo12 
{
	public void display()
	{
		System.out.println("Display method ");
	}
}
class InterFace_Example2_Reference 
{
	public static void main(String args[])
	{
		//Demo11 d11=new Demo11();
		i5 r=new Demo13();
		r.getData();
		r.area();
		r.show();
		r.display();
	}
}