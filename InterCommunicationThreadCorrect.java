class Q //Correct pragram for inter communication
{
	int n;
	boolean flag=false;
	synchronized int get()
	{
		if(!flag) // if true
		{
			try{
			wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println("Interrupted ");
			}
		}
		System.out.println("Get:- "+n+"  When  "+flag);
		flag=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		if(flag) // if false
		{
			try{
			wait(); // wait for excuted another thread
			}
			catch(InterruptedException ie)
			{
				System.out.println("Interrupted ");
			}
		}
		this.n=n;
		System.out.println("put:- "+n+"  When  "+flag);
		flag=true;
		notify(); // give next thread to executed
	}
}

class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	//int i=0;
	public void run()
	{
		while(true){
		q.get();
		}
	}
}

class InterCommunicationThreadCorrect
{
	public static void main(String args[]){
	Q q=new Q();
	new Producer(q);
	new Consumer(q);

	System.out.println("Press Control+c for stop the exexcution of thread");
}
	
	
}