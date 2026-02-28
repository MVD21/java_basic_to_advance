class SampleThread2
{
	void show(String s)
	{
		System.out.print("[ "+s);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted ");
		}

		System.out.print("]");
		System.out.println();
	}
		
}

class SampaleSynch1 implements Runnable
{
	String s;
	Thread t;
	SampleThread2 obj1;
	SampaleSynch1(SampleThread2 obj11,String s1)
	{
		s=s1;
		obj1=obj11;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
			obj1.show(s);   
	}
}

class WithOutSynchronize    
{
	public static void main(String args[])
	{
		SampleThread2 obj12=new SampleThread2();
		SampaleSynch1 obj1=new SampaleSynch1(obj12,"Welcome ");
		SampaleSynch1 obj2=new SampaleSynch1(obj12," To ");
		SampaleSynch1 obj3=new SampaleSynch1(obj12,"Java Programming  ");
		try
		{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted ");
		}
	}
}