class Reverse
{
	public static void main(String args[])
	{
		Reverse r=new Reverse();
		r.setData(12345);
		r.reverse();
		r.reverseNumberAddition(123);
	}
	int n;
	void setData(int n1)
	{
		n=n1;
	}
	void reverse()
	{
		System.out.println("Reverse Number is: ");
		while(n>0)
		{
			int rev=n%10;
			System.out.print(rev);
			n/=10;
		}
		System.out.println();
	}
	void reverseNumberAddition(int n1)
	{
		this.n=n1;
		int sum=0;
		for(;n>0;n/=10)
		{
			int rev=n%10;
			System.out.print(rev);
			sum=sum+rev;
		}
		System.out.println();
		System.out.println("Sum of Reverse Digit: "+sum);
	}
}