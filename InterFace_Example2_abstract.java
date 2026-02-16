// when we want does not define the body of method in class which are implaments then we can just abstract that class and entends this class with other

import java.util.Scanner;
interface i2
{
	double pi=3.14; //without final it is final value of this variable
	void area();
	void display();
}
abstract class Demo8 implements i2
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
class Demo9 extends Demo8
{
	public void display()
	{
		System.out.println("Display method ");
	}
}
class InterFace_Example2_abstract 
{
	public static void main(String args[])
	{
		Demo9 d9=new Demo9();
		d9.getData();
		d9.area();
		d9.show();
		d9.display();
	}
}