import java.io.*;

class Exception_Example2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int temp=0;

		do
		{
			try
			{
				System.out.println("Enter a Temp:- ");
				temp=Integer.parseInt(br.readLine());
				if(temp<=90 || temp>=105)
				{
					NullPointerException err=new NullPointerException("Invaild Range!!");
					throw err;
				}

				System.out.println("Temp:- "+temp);
			}
			catch(NullPointerException ne)
			{
				System.out.println("Invaild Range Re-Enter");
				//continue;
				temp=0;
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Invaild Enter Temp enter a digit 0-9");
			}
		}while(temp==0);

		System.out.println("Bye bye");
	}
	
}