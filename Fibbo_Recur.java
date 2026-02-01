import java.util.Scanner;

class Fibbo_Recur
{
		public static void main(String args[])
		{
			Fibbo_Recur f=new Fibbo_Recur();
			f.getData();
			f.show();
		}


	int n;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Any Number");
		n=sc.nextInt();
	}

	void show()
	{
		int f1=0,f2=1;
		System.out.print("Fibbo series:- "+f1+"\t"+f2);
		fibo(n-2,f1,f2);
	}

	void fibo(int n,int f1,int f2)
	{
		int f3;
		if(n<=0)
			return;
		else
			 f3=f1+f2;
			System.out.print("\t"+f3);
			fibo(n-1,f2,f3);
	}

}