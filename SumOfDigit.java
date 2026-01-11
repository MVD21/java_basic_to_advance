class SumOfDigit
{
	public static void main(String args[])
	{
		SumOfDigit s=new SumOfDigit();
		s.Sumofdig(123);
		s.naturalNumberOfSum(10);
		s.avgOfNaturalNumbers(10);
		s.oddNaturalNumberAndSumThat(100);
	}
	
	int n;
	// n=123 sum=1+2+3=6 
	void Sumofdig(int n1)
	{
		int sum=0;
		n=n1;
		for(;n>0;n/=10)
		{
			int digit=n%10;
			sum=sum+digit;
		}
		System.out.println("Sum of digit:- " +sum);
	}

	// sum of natural series numbers n=10 sum=0+1+2+3+4+5+6+7+8+9+10=55
	void naturalNumberOfSum(int n)
	{
		this.n=n;
		int i=0;
		int sum=0;
		while(i<=n)
		{
			System.out.print(" "+i);
			sum=sum+i;
			i++;
		}
		System.out.println();
		System.out.println("Sum of Natural Numbers:- "+sum);
	}

	// sum and avrage of Series Numbers n=10 sum=1+2+3+4+5+6+7+8+9+10=55 avg=sum/n 55/10=5.5000
	void avgOfNaturalNumbers(int n1)
	{
		int i=0;
		int sum=0;
		double avg;
		n=n1;
		do
		{
			System.out.print(i+" ");
			sum=sum+i;
			i++;
		}while(i<=n);
		
		System.out.println();
		System.out.println("Sum of Number:- "+sum);
		avg=sum/n;
		System.out.println("Avg of Natural numbers:- "+avg);

	}
	
	// odd natural number and their sum n=10,odd no=1,3,5,7, sum=1+3+5+7=16  

	void oddNaturalNumberAndSumThat(int n1)
	{
		n=n1;
		int sum=0;
		for(int i=0;i<=n;i++)
		{	
			if(i%2==1)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println(" Sum of Odd Natural Number:- "+sum);
	}

}