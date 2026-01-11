class Table
{
	public static void main(String args[])
	{
		Table t=new Table();	
		t.setData(12);
		t.oneTableOnly();
		t.nTables(7);
		t.squareOfNaturalNumbers(10);
		t.cubeOfNaturalNumbers(10);
	}
	int n;
	void setData(int n1)
	{
		n=n1;
	}
	// intput n=2 logic:-n*i output:- 2*1=2,2*2=4,2*3=6,2*4=8,2*5=10,2*6=12,2*7=14,2*8=16,2*9=18,2*10=20
	void oneTableOnly()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

	//Write a program in C to display the multipliaction table vertically from 1 to n all table 1 to 10 in the form table

	void nTables(int n1)
	{
		n=n1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	// square of input numbers 1 to n, n=5 means squares 1*1=1,2*2=4,3*3=9,4*4=16,5*5=25 
	void squareOfNaturalNumbers(int n1)
	{
		n=n1;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Number is: "+i+" And Square of the "+i+" is "+(i*i));
		}
		System.out.println();
	}
	void cubeOfNaturalNumbers(int n1)
	{
		n=n1;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Number is: "+i+" And cube of the "+i+" is "+(i*i*i));
		}
	}
}
	