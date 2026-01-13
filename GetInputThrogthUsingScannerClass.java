import java.util.Scanner;

class GetInputThrogthUsingScannerClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte b;
		int i;
		float f;
		double d;
		char c;
		String s;
		
		System.out.println("Enter a Byte number :- ");
		b = sc.nextByte();
		System.out.println("Enter a Integer number :- ");
		i = sc.nextInt();
		System.out.println("Enter a Float number :- ");
		f = sc.nextFloat();
		System.out.println("Enter a Double number :- ");
		d = sc.nextDouble();
		System.out.println("Enter a Single Character :- ");
		c = sc.next().charAt(0);
		System.out.println("Enter a String :- ");
		s = sc.next();
		System.out.println("Entered a Byte number :- "+b);
		System.out.println("Entered a Interger number:- "+i);
		System.out.println("Entered a Float number :- "+f);
		System.out.println("Entered a Double number :- "+d);
		System.out.println("Entered a Single char  :- "+c);
		System.out.println("Entered a String :- "+s);
		
	}


}
