abstract class Demo1
{
	void show1()
	{
		System.out.println("Method of the abstract class Demo1 ");
	}

	abstract void display();
	abstract void put();
}

abstract class Demo2 extends Demo1
{
	void show2()
	{
		System.out.println("Method of the abstract class Demo2 ");
	}
	void display()
	{
		System.out.println("display is the demo1 class method that body is defines in the Demo2");
	}

}

class Demo3 extends Demo2
{
	void show3()
	{
		System.out.println("Method of the abstract class Demo3 ");
	}
	void put()
	{
		System.out.println("display is the demo1 class method that body is defines in the Demo2");
	}
}

class Abstract_Example
{
	public static void main(String args[]){
		Demo3 d=new Demo3();
		d.show1();
		d.show2();
		d.display();
		d.show3();
		d.put();
	}
}