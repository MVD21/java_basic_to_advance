class Q //Wrong pragram for inter communication
{
	int n;
	synchronized int get()
	{
		System.out.println("Get:- "+n);
		return n;
	}
	synchronized void put(int n)
	{
		this.n=n;
		System.out.println("put:- "+n);
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

class InterCommunicationThreadWrong
{
	public static void main(String args[]){
	Q q=new Q();
	new Producer(q);
	new Consumer(q);

	System.out.println("Press Control+c for stop the exexcution of thread");
}
	
	
}