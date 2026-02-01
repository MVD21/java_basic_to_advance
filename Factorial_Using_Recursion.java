import java.util.Scanner;

class Factorial_Using_Recursion
{
	public static void main(String args[])
	{
		Factorial_Using_Recursion fr=new Factorial_Using_Recursion();
		fr.getData();
		fr.showResult();
	}

	int n;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:- ");
		n=sc.nextInt();
	}
	void showResult()
	{
		System.out.println("Factorial:- "+fact(n));
	}
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return (n*fact(n-1));

	}
}