// Interface extends with the Interface

import java.util.Scanner;
interface i3
{
	double pi=3.14; //without final it is final value of this variable
	void area();
}
interface i4 extends i3
{
	void display();
}
abstract class Demo10 implements i3
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
class Demo11 extends Demo10 implements i4
{
	public void display()
	{
		System.out.println("Display method ");
	}
}
class InterFace_Example2_multiInterface 
{
	public static void main(String args[])
	{
		Demo11 d11=new Demo11();
		d11.getData();
		d11.area();
		d11.show();
		d11.display();
	}
}