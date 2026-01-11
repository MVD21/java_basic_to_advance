//n=153 sum=1^3+5^3+3^3=153 n=sum same then arm 

class Armstrong
{
	public static void main(String args[])
	{
		Armstrong a=new Armstrong();
		a.setData(15);
		a.checkArmstrong(153);
	}
	int n;
	void setData(int n1)
	{
		n=n1;
	}
	void checkArmstrong(int n1)
	{
		int temp=n1;
		n=n1;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			n/=10;
		}
		System.out.println("Sum of Armstrong: "+sum);
		
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}


}